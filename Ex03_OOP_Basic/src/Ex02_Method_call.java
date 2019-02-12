import kr.or.bit.FunctionClass;
import kr.or.bit.Tv;

public class Ex02_Method_call {
	public static void main(String[] args) {
		FunctionClass fc = new FunctionClass();
		fc.getChNum();
		fc.getChNum2(1);
		int i = fc.getChNum3();
		System.out.println(i);
		int s = fc.getChNUm4(100);
		System.out.println(s);
		int result = fc.sum(100);
		System.out.println(result);
		int result2 = fc.sum2(1, 2, 3);
		System.out.println(result2);
		
		
		//Quiz
		
		int rs = fc.max(120, 200);
		System.out.println(rs);
		
		
		Tv tv = new Tv();
		tv.brandName = "SS";
		fc.call(tv);
				
	}
}
