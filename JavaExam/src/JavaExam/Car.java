package JavaExam;

public class Car {
	int max_speed_ = 0;	// �ְ�ӵ�
	int cur_speed_ = 0;	// ����ӵ�
	String color_ = "";	// �� ��
	String name_= "";
	private int min_speed_ = 40;
	static int car_count_ = 0;
	
	public int getMinSpeed() {
		return min_speed_;
	}
	
	public void setMinSpeed(int value) {
		min_speed_ = value;
	}
	
	public Car(String name, int max_speed, int cur_speed, String color) {	// ������ ����
		max_speed_ = max_speed;
		cur_speed_ = cur_speed;
		color_ = color;
		name_ = name;
		
		car_count_++;
		
		System.out.println("--" + name_ + "--");
		System.out.println("�ְ�ӵ� : " + max_speed_);
		System.out.println("����ӵ� : " + cur_speed_);
		System.out.println("��   �� : " + color_);
	}
	
	static int getCount() {
		return car_count_;
	}
	
	void IncreseSpeed(int value) {		// �ӵ��� �����ִ� �Լ�
		if(cur_speed_ + value >= max_speed_ ) {
			cur_speed_ = max_speed_;
		}else {
			cur_speed_ = cur_speed_ + value;
		}
	}
	
	void DecreseSpeed(int value) {		// �ӵ��� �ٿ��ִ� �Լ�
		if(cur_speed_ + value <= 0 ) {
			cur_speed_ = 0;
		}else {
			cur_speed_ = cur_speed_ - value;
		}
	}
}
