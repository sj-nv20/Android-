package JavaExam;

public class exam05 {
	static int var = 100;
	
	static int addFunction(int num1, int num2) {
		int hap;
		hap = num2 + var;
		
		hap = minusFunction(hap, num1);
		
		return hap;
	}
	
	// (함수)메서드 형식
	static void addFunction1(int num1, int num2) {	// 반환값 없고 매개변수 있는타입
	}

	static void addFunction2() {		// 반환값 없고 매개변수 없는 타입
	}

	static int minusFunction1() {	//반환값 있고 매개변수 없는 타입
		return var;	
	}
	
	// -----------------------------------------------------
	
	static int minusFunction(int num1, int num2) {
		return num1 - num2;
	}
	
	// -----------------------------------------------------
	
	public static void main(String[] args) {
		
		int var = 0;
		System.out.println(var);
		
		int sum = addFunction(10, 20);
		System.out.println(sum);

	}
}
