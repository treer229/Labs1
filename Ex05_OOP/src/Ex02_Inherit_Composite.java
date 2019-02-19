/*
 ��Ӱ��� >> �� ~�̴�
 ���԰��� >> �� ~�� ������ �ִ�

���� ���
��, �簢/��, �ﰢ�� ����� ���踦 �ۼ��ϰ� �;��


���� �����ΰ�?
����, ������
�簢���� �����ΰ�?
��4
�ﰢ���� �����ΰ�?
��3

���̶�?
x��� y���� �߷η� �Ѱ�

���� �����̴�.
�ﰢ���� �����̴�.
�簢���� �����̴�.

���� : (�Ϲ�ȭ, �߻�ȭ) �и� : ����, �׸���
��(��üȭ, Ư��ȭ) => ��, ������

 */
//�߻�ȭ, �Ϲ�ȭ
class Shape{
	String color ="gold";
	void drow() {
		System.out.println("������ �׸��ϴ�.");
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
	Point center; //member feild(��ǰ)
	int r; // member feild (Ư����)
	
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
			System.out.println("��ǥ :" + point.x + "," + point.y);
		}
		System.out.println("3���� ������ �̾������ϴ�.");
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
