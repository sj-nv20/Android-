package JavaExam;

public class exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예외처리
		int num1 = 100;
		int num2 = 0;
		try {
			System.out.println(num1 / num2);
		}
		catch(java.lang.ArithmeticException e) {
			System.out.println("계산에 문제가 있습니다.");
		}
	}
}

