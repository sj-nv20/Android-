package JavaExam;

public class exam05 {
	static int var = 100;
	
	static int addFunction(int num1, int num2) {
		int hap;
		hap = num2 + var;
		
		hap = minusFunction(hap, num1);
		
		return hap;
	}
	
	// (�Լ�)�޼��� ����
	static void addFunction1(int num1, int num2) {	// ��ȯ�� ���� �Ű����� �ִ�Ÿ��
	}

	static void addFunction2() {		// ��ȯ�� ���� �Ű����� ���� Ÿ��
	}

	static int minusFunction1() {	//��ȯ�� �ְ� �Ű����� ���� Ÿ��
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
