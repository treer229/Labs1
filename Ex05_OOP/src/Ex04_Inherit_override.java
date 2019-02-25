/*
 Today Point : [상속관계]에서 override: 상속관계에서의 메서드 재정의 
 -상속관계에서 자식클래스가 부모클래스의 메서드의 재정의
 -재정의: 함수의 형태는 변화가 읍다(return || parameter) .... 내용만 바뀌는 것
 	  : 틀의 변화가 아니라 내용의 변화
문법)
1.부모함수의 이름과 동일
2.부모함수의 param 동일
3.부모함수의 return type 동일\
 */

class Point2 {
	int x = 4;
	int y = 5;
	String getPosition(){
		return "x:" + this.x + "Y:" + this.y;
	}
}


class Point3D extends Point2 {
	int z = 6;
	//재정의 강제하는 방법
	//@Override : 재정의 검사 ... 컴파일러나 툴에게 정보 전달
	@Override
	String getPosition() {
		return "x:" + this.x + "Y:" + this.y + "z: " + this.z;
	}
}

public class Ex04_Inherit_override {
	Point3D point = new Point3D();
}
