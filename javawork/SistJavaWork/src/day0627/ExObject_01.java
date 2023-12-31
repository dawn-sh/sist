package day0627;

import javax.print.attribute.standard.Media;

public class ExObject_01 {
	
	
	String name; //instance 변수선언하면 instance변수로만 사용 가능//일반 instance 멤버변수는 객체 생성후 각각 다른 값을 가질 수 있다
				 //초기값을 안주면 (=null) 생략 되있음
	
	
	//ExObject_01() 엔터하면 안보이지만 생성이 됨
	
	
	public ExObject_01() {
		// TODO Auto-generated constructor stub
	}
	
	//static 멤버변수는 주로 상수로 선언할 때 사용하며 instance변수 없이 class명으로 접근가능
	//생성하지 않아도 호출 가능 ex)ExObject_01.MESSAGE - new없어도 부르면 바로 사용 가능
						   //클래스명.변수이름
	//수정 불가능
	//여러 객체가 같은 값을 가져야 할 경우 주로 static으로 선언하다
	//final - static을 더 고정해주는 것
	//static 변수로 크기 지정 가능
	static final String MESSAGE="Haapy Day!!!"; //주로 상수에 많이 옴(static final) 공유하기 위해서 /상수는 올 대문자
	

	public static void main(String[] args) {

		//다른 클래스에서는 호출 불가능
		System.out.println("static변수는 new로 생성없이 호출가능");
		System.out.println(ExObject_01.MESSAGE);
		System.out.println(MESSAGE);
		//MESSAGE="Nice Day!!!"; //수정 불가능(오류) //final이라 값 변경 불가능
		
		//클래스명 참조변수명=new 클래스명();
		//클래스 = 메서드 호출 역할
		//ex1(참조변수)은 호출 역할
		//생성 없이 사용 불가능
		ExObject_01 ex1=new ExObject_01(); //default생성자는 ()처럼 값이 빈 것
										   //ExObject_01() 엔터하면 안보이지만 생성이 됨 <=이게 없다면 생성 불가능
		System.out.println(ex1.name); // 값을 안줘서 기본값 null출력
		
		ex1.name="김철수"; //객체생성
		System.out.println(ex1.name);
		
		ExObject_01 ex2=new ExObject_01();
		ex2.name="홍길동";
		System.out.println(ex2.name);
		
		ExObject_01 cho=new ExObject_01();
		cho.name="졸려";
		System.out.println(cho.name);
		
		System.out.println("다 같이 사용하는 메세지: "+MESSAGE);
		
		
	}

}
