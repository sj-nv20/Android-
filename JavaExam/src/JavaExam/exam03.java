package JavaExam;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ǹ�
		// if�� ����
		int count = 45;
		
		if(count >= 90) {
			System.out.println("if�� : �հ�(���л�)");
		}else if(count >= 60) {
			System.out.println("if�� : �հ�");
		}else {
			System.out.println("if�� : ���հ�");
		}
		
		int jumsu = (count / 10) * 10;
		
		// switch�� ����
		switch(jumsu) {
		case 100:
			System.out.println("if�� : ���հ�(���л�)");
			break;
		case 90:
			System.out.println("if�� : �հ�(���л�)");
			break;
		case 80:
		case 70:
		case 60:
			System.out.println("if�� : �հ�");
			break;
			default :
				System.out.println("if�� : ���հ�");
		}
	}
}