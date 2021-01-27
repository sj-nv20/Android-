package JavaExam;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수와 데이터
		
		int a = 10;
		float b = 10.1f;
		double c = 10.2;
		char d = '안';
		String e = "안드로이드";
		
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
		
		// var를 사용하면 데이터형식(int,float 등)을 안잡아줘도 된다. 하지만 잘 안사용하는게 좋음
		var f = 10;
		var g = "안드로이드";
		var h = f + g;
		System.out.println(h);
		
		
		//배열 가로 - 행,세로 - 열
		
		// 선언과 동시에 갑 입력
		int[] array1 = {10, 20, 30, 40};	// 1차원 배열 - 4행1열
		
		// 선언 후 값 입력
		int[] array = new int[4];	// 위 식이랑 같은 결과가 나옴
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		
		
	}

}
