package kr.or.bit;
/*
 ������ : �Ǽ���
 ������ : 
 ������ : 2019-02-08
 ���ϸ� : Emp.java(�������)
 
 class ���赵�̴�
 ���赵�� �⺻���� ������Ҵ� (����, �������� + ��������)
 			     �Ӽ�(����)field + ���(�Լ�)method
 */


public class Emp {
	public int empno; //���(���� > ���� > member field(instance variable)
	public String ename;
	public String job;
	private int sal; //�޿�
	private int phonenum;
	
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public void setsal(int sal) {
		if(sal <0) {
			System.out.println("MISTAKE");
		} else {
			this.sal = sal;	
		}
	}
	public int getsal() {
		return sal;
	}
	
	public String getEmpInfo() {
		return empno + "/" + ename + "/" + job+ "/" + sal;
	}
}
