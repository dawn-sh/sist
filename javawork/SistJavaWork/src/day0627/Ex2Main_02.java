package day0627;
//public은 1페이지에 단 1개만 가능


public class Ex2Main_02 {

	public static void main(String[] args) {

		
		//static
		
		//값을 안줘서 0출력
		System.out.println(Ex2Object_02.width);
		System.out.println(Ex2Object_02.height);
		
		
		//클래스변수
		Ex2Object_02.width=10;
		Ex2Object_02.height=20;
		
		//값을 줘서 값 출력
		System.out.println(Ex2Object_02.width);
		System.out.println(Ex2Object_02.height);
		
		
		
		
		
		
		//instance
		
		//instance 생성 후 변수 호출 가능
		Ex2Object_02 card1=new Ex2Object_02();
		
		//2개 다 값을 안줘서 null/0 출력
		System.out.println(card1.kind); //null
		System.out.println(card1.number); //0
		
		//값 주기
		card1.kind="Heart";
		card1.number=4;
		
		//값을 주어서 값 출력
		System.out.println(card1.kind);
		System.out.println(card1.number);
		
		
		//instance 변수 다시 생성 후 멤버값 변경 후 출력
		Ex2Object_02 again=new Ex2Object_02();
		again.kind="Clover";
		again.number=10;
		
		System.out.println(again.kind);
		System.out.println(again.number);
	}

}
