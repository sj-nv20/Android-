package JavaExam;

public class exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ݺ���
		
		// for��
		int[] one = new int[3];
		
		for(int i = 0; i < one.length; i++) {
			one[i] = 10 * i;
		}
		String two[] = {"�ϳ�", "��", "��"};
		for(String str : two) {
			System.out.println(str);
		}
		
		//while��
		int j = 0;
		while(j < one.length) {
			System.out.println(one[j]);
			j++;
		}
	}

}
