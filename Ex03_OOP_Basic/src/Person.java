//class == type(big type) == 설계도
//설계도의 기본 구성 요소 : 속성 + 행위
//속성(변수 1.고유변수 2.상태변수 3.객채변수) + 행위(함수)
//**주의** 속성이 하나의 값으로 표현되지 않는다면 > 클래스 타입으로...

public class Person {
	private String name;
	private int age;
	private char sex;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getSex() {
		return sex;
	}
	

	public void setSex(char sex) {
		this.sex = sex;
	}



	public void print() {//method (call 호출에 의해서 동작)
		System.out.println(name + "/" + age);
	}
}
