/*
 상속관계 >> 은 ~이다
 포함관계 >> 은 ~을 가지고 있다

예를 들면
원, 사각/형, 삼각형 만드는 설계를 작성하고 싶어요


원이 무엇인가?
한점, 반지름
사각형이 무엇인가?
점4
삼각형은 무엇인가?
점3

점이란?
x축과 y축을 삐로로 한것

원은 도형이다.
삼각형도 도형이다.
사각형은 도형이다.

도형 : (일반화, 추상화) 분모 : 색상, 그리다
원(구체화, 특수화) => 점, 반지름

 */
//추상화, 일반화
class Shape{
	String color ="gold";
	void drow() {
		System.out.println("도형을 그립니다.");
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(1, 2);
	}
	
	Point(int x, int y) {
		this.x =x;
		this.y =y;
	}
}

class Circle extends Shape {
	Point center; //member feild(부품)
	int r; // member feild (특수성)
	
	public Circle() {
		this(new Point(), 10);
	}
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
}

class Triangle extends Shape {
	Point[] pointArray;

	
	public Triangle() {
		this(new Point[] {new Point(1,2), new Point(3,4), new Point(5,6)});
	}
	public Triangle(Point[] pointArray) {
		this.pointArray = pointArray;

	}
	
	void drow() {
		for(Point point : pointArray) {
			System.out.println("좌표 :" + point.x + "," + point.y);
		}
		System.out.println("3개의 점들이 이어졌습니다.");
	}
}


public class Ex02_Inherit_Composite {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.drow();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x);
		System.out.println(c.center.y);
		
		Triangle tri = new Triangle();
		tri.drow();
	}
}
