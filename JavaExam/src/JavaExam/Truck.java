package JavaExam;

public class Truck extends Car{		// ��ӹ޴� Ŭ����
	int max_weight_ = 0;
	
	public Truck(String name, int max_speed, int cur_speed, String color) {
		super(name, max_speed, cur_speed, color);
	}
	
	public Truck(String name, int max_speed, int cur_speed, String color, int max_weight) {
		super(name, max_speed, cur_speed, color);
		max_weight_ = max_weight;
		System.out.println("�ִ��߷� : " + max_weight_);
	}
	
	void IncreaseSpeed(int value) {
		cur_speed_ = cur_speed_ + value;
		super.max_speed_ = cur_speed_;		// super ��� ����ϱ� -> ���� �����
	}
}
