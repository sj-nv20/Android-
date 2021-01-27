package JavaExam;

public class exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문
		
		// for문
		int[] one = new int[3];
		
		for(int i = 0; i < one.length; i++) {
			one[i] = 10 * i;
		}
		String two[] = {"하나", "둘", "셋"};
		for(String str : two) {
			System.out.println(str);
		}
		
		//while문
		int j = 0;
		while(j < one.length) {
			System.out.println(one[j]);
			j++;
		}
	}

}
