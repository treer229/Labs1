package kr.or.bit;
/*
 �츮 ȸ��� ī�带 ���� �Ǹ��ϴ� ȸ�� Card c1 = new Card();
 ���� ��û�� ���� ī�� 53�� ����
 �䱸���� 
 1. ī�� ���� ī�� ��ȣ�� ������ �ִ�. feild
 2. ���� ��絵 ������ �ִ�. feild
 3. ī��� ũ�⸦ ������ �ִ�.(����, �ʺ�) feild
 4. ī���� ������ Ȯ���ϴ� ����� ������ �ִ�.
 
 
 ��� ����Ʈ����� ��ȭ�Ѵ�
 �䱸������ �׻� ���Ѵ�.... �����ϴ�....
 */



public class Card {
	public int num;
	public String kind;
	
	
	//��� ī���� ũ��� ����
	public static int h=50;
	public static int w=20;

	public void cardInfo() {
		System.out.println(num);
		System.out.println(kind);
		System.out.println(h);
		System.out.println(w);
	}
}
