package JavaExam;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Car car1 = new Car();	// 클래스 선언
		car1.max_speed_ = 200;
		car1.cur_speed_ = 0;
		car1.color_ = "red";
		
		Car car2 = new Car();	// 클래스 선언
		car2.max_speed_ = 150;
		car2.cur_speed_ = 0;
		car2.color_ = "blue";
		
		Car car3 = new Car();	// 클래스 선언
		car3.max_speed_ = 300;
		car3.cur_speed_ = 0;
		car3.color_ = "yellow";
		
		System.out.println("--자동차1--");
		System.out.println("최고속도 : " + car1.max_speed_);
		System.out.println("현재속도 : " + car1.cur_speed_);
		System.out.println("색   상 : " + car1.color_);
		
		System.out.println("--자동차2--");
		System.out.println("최고속도 : " + car2.max_speed_);
		System.out.println("현재속도 : " + car2.cur_speed_);
		System.out.println("색   상 : " + car2.color_);
		
		System.out.println("--자동차3--");
		System.out.println("최고속도 : " + car3.max_speed_);
		System.out.println("현재속도 : " + car3.cur_speed_);
		System.out.println("색   상 : " + car3.color_);
		*/
		
		Car car1 = new Car("포르쉐",200, 0, "red");
		Car car2 = new Car("페라리",150, 0, "blue");
		Car car3 = new Car("람보르기니",300, 0, "yellow");
		
		int count = Car.car_count_;
		System.out.println("총 생산량 = " + count);
		
		System.out.println("총 생산량 = " + Car.getCount());
		
		Truck truck1 = new Truck("포터", 150, 0, "white");
		Truck truck2 = new Truck("덤프", 150, 0, "white", 2000);
		
		truck1.IncreaseSpeed(300);
		System.out.println("최대속도 : " + truck1.max_speed_);
		
		car1.setMinSpeed(400);
		
		int min_speed = car1.getMinSpeed();
		System.out.println("최저속도 : " + min_speed);
	}

}
