package JavaExam;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ������
		
		int a = 10;
		float b = 10.1f;
		double c = 10.2;
		char d = '��';
		String e = "�ȵ���̵�";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		int var1 = 15;
		int sum = a + var1;
		
		System.out.println(sum);
		
		String result = a + e;
		System.out.println(result);
		
		// var�� ����ϸ� ����������(int,float ��)�� ������൵ �ȴ�. ������ �� �Ȼ���ϴ°� ����
		var f = 10;
		var g = "�ȵ���̵�";
		var h = f + g;
		System.out.println(h);
		
		
		//�迭 ���� - ��,���� - ��
		
		// ����� ���ÿ� �� �Է�
		int[] array1 = {10, 20, 30, 40};	// 1���� �迭 - 4��1��
		
		// ���� �� �� �Է�
		int[] array = new int[4];	// �� ���̶� ���� ����� ����
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		
		
	}

}
