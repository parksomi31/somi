package Day5;

public class PaySerach {

	// 필드(인스턴스 변수)
	private String rank; // 직급
	private int workYear; // 연차
	private String contractWoker; // 계약직여부
	private int overtimePay; // 초과근무시간

	private int basePay;
	private int rankPay;
	private int overPay; // 3만원
	private int total;

	private Pay a = new Pay();

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getWorkYear() {
		return workYear;
	}

	public void setWorkYear(int workYear) {
		this.workYear = workYear;
	}

	public String getContractWoker() {
		return contractWoker;
	}

	public void setContractWoker(String contractWoker) {
		this.contractWoker = contractWoker;
	}

	public int getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(int overtimePay) {
		this.overtimePay = overtimePay;
	}

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public int getRankPay() {
		return rankPay;
	}

	public void setRankPay(int rankPay) {
		this.rankPay = rankPay;
	}

	public int getOverPay() {
		return overPay;
	}

	public void setOverPay(int overPay) {
		this.overPay = overPay;
	}

	public Pay getA() {
		return a;
	}

	public void setA(Pay a) {
		this.a = a;
	}

	
	//생성자
	public PaySerach(String rank, int workYear, String contractWorker, int overtimePay) {
		this.rankPay = a.getRankPay();
		this.basePay = a.getBasePay();
		this.overPay = a.getOverPay(); //3만원
		this.rank = rank;
		this.workYear = workYear;
		this.contractWoker = contractWorker;
		this.overtimePay = overtimePay; //초과근무시간
	}

	public PaySerach() {
		// TODO Auto-generated constructor stub
	}

	//급여계산 함수
	public int result() {
//     	if (rank == null) {
//			return 0;
		if (rank.equals("L0")) {
			basePay *= 2;
		} else if (rank.equals("L1")) {
			basePay *= 3;
		} else {
			basePay *= 4;
		}
		
		System.out.println(overtimePay);
		return total = basePay + (rankPay*workYear) + (overPay*overtimePay);
	}
	
}

// 메서드
