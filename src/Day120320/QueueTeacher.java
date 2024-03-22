package Day120320;

public class QueueTeacher {
	
	int []data; // 배열 선언
	int front; // 맨 앞의 수를 저장할 수 있는 배열 선언
	int rear; // 맨 뒤의 수를 저장할 수 있는 배열 선언
	
	//생성자
	public QueueTeacher( ) {   //
		data = new int [5];  //5칸짜리의 배열로 초기화
		front = rear = 0; //front와 rear를 0으로 초기화
	}

	//EnQueue메서드
	public void EnQueue(int num) {
		if(front !=0 && rear == 5) { //이러한 조건이면 
			shift();  //쉬프트를 할건데 메서드 필요
		
			data[rear++] = num;
		}
	}
}
