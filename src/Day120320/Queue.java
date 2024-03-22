package Day120320;

import java.util.Scanner;

public class Queue {

    private int[] queue; // 큐를 저장하는 배열
    private int front; // 큐의 첫 번째 요소의 인덱스
    private int rear; // 큐의 마지막 요소의 인덱스
    private int maxSize; // 큐의 최대 크기

    
    // 생성자 - 큐 객체 생성 시 초기화 작업 수행
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize]; // 큐 배열의 크기를 maxSize로 초기화
        front = 0; // front를 0으로 초기화
        rear = -1; // rear를 -1로 초기화  - 왜냐면 rear는 마지막 요소의 인덱스를 나타내기 때문에 
    }

    // 큐에 요소를 추가하는 메서드
    public void enqueue(int num) {
        if (isFull()) { // 큐가 가득 찬 경우
            System.out.println("큐배열에 가득 차있습니다. 더 이상 숫자를 입력할 수 없습니다.");
            return;
        } else {
        queue[++rear] = num; // rear를 증가시키고 해당 위치에 데이터를 추가
        System.out.println("입력한 수: " + num); // 새로운 데이터를 출력
        display(); // 현재 큐의 상태를 출력
    }
    }

    // 큐에서 요소를 제거하는 메서드
    public void dequeue() {
        if (isEmpty()) { // 큐가 비어 있는 경우
            System.out.println("큐배열에 모두 비어있습니다. 더 이상 비울 수 없습니다.");
            return; //return을 통해 이 메서드를 호출한 곳으로 돌아감
        }
        int num = queue[front++]; // front 위치의 요소를 제거하고 front를 증가시킴
        System.out.println("제거된 수: " + num); // 제거된 데이터를 출력
        display(); // 현재 큐의 상태를 출력
    }

    // 사용자로부터 요소를 입력받아 큐에 추가하는 메서드
    public void inputEnqueue(Scanner scanner) {
        System.out.print("배열에 추가할 수를 입력해주세요: ");
        int num = scanner.nextInt(); // 사용자로부터 요소 입력 받음
        enqueue(num); // 입력 받은 요소를 enqueue 메서드를 통해 큐에 추가
    }

    // 큐가 가득 찼는지 확인하는 메서드
    private boolean isFull() {  
        return rear == maxSize - 1; // rear가 배열의 마지막 인덱스와 같으면 true 반환
    }

    // 큐가 비어 있는지 확인하는 메서드
    private boolean isEmpty() {
        return front > rear; // front가 rear보다 크면 true 반환
    }

    // 현재 큐의 상태를 출력하는 메서드
    private void display() {
        System.out.print("배열에 있는 수: ");
        for (int i = front; i <= rear; i++) { // front부터 rear까지 요소를 출력
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // 쉬프트 기능을 수행하는 메서드
    public void shift() {
        if (isEmpty()) { // 큐가 비어 있는 경우
            System.out.println("큐가 비어있습니다. 쉬프트를 수행할 수 없습니다.");
            return;
        }
        System.out.println("쉬프트 작업을 수행합니다.");
        for (int i = front; i < rear; i++) { // front부터 rear-1까지 반복하면서
            queue[i] = queue[i + 1]; // 다음 요소를 현재 위치로 이동시킴
        }
        queue[rear--] = 0; // 맨 끝 요소를 삭제하고 rear를 감소시킴
        display(); // 현재 큐의 상태를 출력
    }

    // main 메서드에서 큐를 테스트하기 위한 예시 코드
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue(5); // 크기가 5인 큐 객체 생성
        int choice;
        do {
        	System.out.println("선형큐 테스트입니다. 어떤 작업을 수행하시겠어요?");
            System.out.println("1. Enqueu");
            System.out.println("2. Dequeue");
            System.out.println("3. Shift");
            System.out.println("4. 끝내기");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (!queue.isFull()) {
                        queue.inputEnqueue(scanner); // 사용자로부터 요소 입력 받아 enqueue
                    } else {
                        System.out.println("큐배열에 가득 차있습니다. 더 이상 숫자를 입력할 수 없습니다.");
                    }
                    break;
                case 2:
                    queue.dequeue(); // 요소 제거
                    break;
                case 3:
                    queue.shift(); // 쉬프트 기능 수행
                    break;
                case 4:
                    System.out.println("종료합니다");
                    break;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다. 확인하고 다시 입력해주세요");
            }
        } while (choice != 4);
    }
}