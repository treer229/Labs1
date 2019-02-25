/*
 Today Point : [��Ӱ���]���� override: ��Ӱ��迡���� �޼��� ������ 
 -��Ӱ��迡�� �ڽ�Ŭ������ �θ�Ŭ������ �޼����� ������
 -������: �Լ��� ���´� ��ȭ�� ����(return || parameter) .... ���븸 �ٲ�� ��
 	  : Ʋ�� ��ȭ�� �ƴ϶� ������ ��ȭ
����)
1.�θ��Լ��� �̸��� ����
2.�θ��Լ��� param ����
3.�θ��Լ��� return type ����\
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
	//������ �����ϴ� ���
	//@Override : ������ �˻� ... �����Ϸ��� ������ ���� ����
	@Override
	String getPosition() {
		return "x:" + this.x + "Y:" + this.y + "z: " + this.z;
	}
}

public class Ex04_Inherit_override {
	Point3D point = new Point3D();
}
