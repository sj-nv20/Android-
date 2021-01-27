package JavaExam;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문
		// if문 조건
		int count = 45;
		
		if(count >= 90) {
			System.out.println("if문 : 합격(장학생)");
		}else if(count >= 60) {
			System.out.println("if문 : 합격");
		}else {
			System.out.println("if문 : 불합격");
		}
		
		int jumsu = (count / 10) * 10;
		
		// switch문 조건
		switch(jumsu) {
		case 100:
			System.out.println("if문 : 축합격(장학생)");
			break;
		case 90:
			System.out.println("if문 : 합격(장학생)");
			break;
		case 80:
		case 70:
		case 60:
			System.out.println("if문 : 합격");
			break;
			default :
				System.out.println("if문 : 불합격");
		}
	}
}