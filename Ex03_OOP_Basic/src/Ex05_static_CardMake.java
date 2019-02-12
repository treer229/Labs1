import kr.or.bit.Card;

public class Ex05_static_CardMake {

	public static void main(String[] args) {
		
		//53카드 생성
		
		Card c = new Card();
		
		c.h = 500;
		c.w = 200;
		c.num = 1;
		c.kind = "heart";
		c.cardInfo();
		
		
		Card c2 = new Card();
		c.num = 2;
		c.kind = "square";
		c.cardInfo();
	
	
	}

}
