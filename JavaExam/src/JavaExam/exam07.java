package JavaExam;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Car car1 = new Car();	// Ŭ���� ����
		car1.max_speed_ = 200;
		car1.cur_speed_ = 0;
		car1.color_ = "red";
		
		Car car2 = new Car();	// Ŭ���� ����
		car2.max_speed_ = 150;
		car2.cur_speed_ = 0;
		car2.color_ = "blue";
		
		Car car3 = new Car();	// Ŭ���� ����
		car3.max_speed_ = 300;
		car3.cur_speed_ = 0;
		car3.color_ = "yellow";
		
		System.out.println("--�ڵ���1--");
		System.out.println("�ְ�ӵ� : " + car1.max_speed_);
		System.out.println("����ӵ� : " + car1.cur_speed_);
		System.out.println("��   �� : " + car1.color_);
		
		System.out.println("--�ڵ���2--");
		System.out.println("�ְ�ӵ� : " + car2.max_speed_);
		System.out.println("����ӵ� : " + car2.cur_speed_);
		System.out.println("��   �� : " + car2.color_);
		
		System.out.println("--�ڵ���3--");
		System.out.println("�ְ�ӵ� : " + car3.max_speed_);
		System.out.println("����ӵ� : " + car3.cur_speed_);
		System.out.println("��   �� : " + car3.color_);
		*/
		
		Car car1 = new Car("������",200, 0, "red");
		Car car2 = new Car("���",150, 0, "blue");
		Car car3 = new Car("���������",300, 0, "yellow");
		
		int count = Car.car_count_;
		System.out.println("�� ���귮 = " + count);
		
		System.out.println("�� ���귮 = " + Car.getCount());
		
		Truck truck1 = new Truck("����", 150, 0, "white");
		Truck truck2 = new Truck("����", 150, 0, "white", 2000);
		
		truck1.IncreaseSpeed(300);
		System.out.println("�ִ�ӵ� : " + truck1.max_speed_);
		
		car1.setMinSpeed(400);
		
		int min_speed = car1.getMinSpeed();
		System.out.println("�����ӵ� : " + min_speed);
	}

}
