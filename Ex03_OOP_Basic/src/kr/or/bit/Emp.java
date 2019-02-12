package kr.or.bit;
/*
 만든이 : 권순조
 수정이 : 
 생성일 : 2019-02-08
 파일명 : Emp.java(사원정보)
 
 class 설계도이다
 설계도의 기본적인 구성요소는 (상태, 고유정보 + 행위정보)
 			     속성(변수)field + 기능(함수)method
 */


public class Emp {
	public int empno; //사번(정보 > 변수 > member field(instance variable)
	public String ename;
	public String job;
	private int sal; //급여
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
