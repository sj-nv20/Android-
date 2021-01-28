package JavaExam;

public class Truck extends Car{		// 상속받는 클래스
	int max_weight_ = 0;
	
	public Truck(String name, int max_speed, int cur_speed, String color) {
		super(name, max_speed, cur_speed, color);
	}
	
	public Truck(String name, int max_speed, int cur_speed, String color, int max_weight) {
		super(name, max_speed, cur_speed, color);
		max_weight_ = max_weight;
		System.out.println("최대중량 : " + max_weight_);
	}
	
	void IncreaseSpeed(int value) {
		cur_speed_ = cur_speed_ + value;
		super.max_speed_ = cur_speed_;		// super 용어 기억하기 -> 많이 사용함
	}
}
