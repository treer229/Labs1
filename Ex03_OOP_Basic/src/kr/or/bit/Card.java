package kr.or.bit;
/*
 우리 회사는 카드를 만들어서 판매하는 회사 Card c1 = new Card();
 고갱의 요청에 따라 카드 53장 제작
 요구사항 
 1. 카드 각각 카드 번호를 가지고 있다. feild
 2. 각각 모양도 가지고 있다. feild
 3. 카드는 크기를 가지고 있다.(높이, 너비) feild
 4. 카드의 정보를 확인하는 기능을 가지고 있다.
 
 
 모든 소프트웨어는 변화한다
 요구사항은 항상 변한다.... 대응하는....
 */



public class Card {
	public int num;
	public String kind;
	
	
	//모든 카드의 크기는 고정
	public static int h=50;
	public static int w=20;

	public void cardInfo() {
		System.out.println(num);
		System.out.println(kind);
		System.out.println(h);
		System.out.println(w);
	}
}
