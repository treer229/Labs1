import kr.or.bit.Airplane;

/*
  비행기 생산하는 설계도(class)를 작성하려고 합니다
요구사항  
 1. 비행기 이름과 번호를 부여
 2. 비행기가 생산되면 이름과 번호가 맞게 부여되었는지 확인 (정보 출력)
 3. 비행기가 출고 될때마다 비행기의 누적대수를 확인할 수 있습니다 count++
 4. 지금까지 배운 코드만 사용하세용
 
 */


public class Ex06_Static_airplane {
	public static void main(String[] args) {
		
		Airplane a1 = new Airplane(1, "sj");
		a1.airCheck();
		System.out.println(a1.sellCheck());
		
		Airplane a2 = new Airplane(2, "sj");
		a2.airCheck();
		System.out.println(a2.sellCheck());
		
		Airplane a3 = new Airplane(3, "sj");
		a3.airCheck();
		System.out.println(a3.sellCheck());
		
	}
}
