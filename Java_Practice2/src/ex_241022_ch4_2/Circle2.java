package ex_241022_ch4_2;

public class Circle2 {
	int radius;
	String name;
//	생성자 이름은
//	클래스 이름과 동일

	// 기본생성자
	public Circle2() { // 매개 변수 없는 생성자
		radius = 1;
		name = ""; // radius의 초기값은 1
	}

	// 매개변수 2개인 생성자
	public Circle2(int r, String n) { // 매개 변수를 가진 생성자
		radius = r;
		name = n;
	}
	
	// 나중에, 생성자, get/set 메서드들을 쉽게 만들어서 사용할 예정. 
	// lombok 라이브러리 이용해서, 메모리상에 , 해당 생성자, 메서드 등을 미리 만들어서 이용함. 

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		//
		// 생성자는 리턴
		// 타입 없음
		// 결론, 인스턴스를 생성시, 생성자를 이용한다. 포인트. 
		Circle2 pizza = new Circle2(10, "자바피자"); // Circle 객체 생성, 반지름 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		
		Circle2 donut = new Circle2(); // Circle 객체 생성, 반지름 1
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
