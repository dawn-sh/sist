package day0627;

//메서드 만드는 class
class ObTestA{
	
	//private 붙이는 순간 에러...메서드로 접근해야함
	//private 붙여서 호출
	private int x; //메인에서 ObTestA oa1=new ObTestA(); 이걸로 호출 불가능
	private static int y; //메인에서 ObTestA.y 이걸로 호출 불가능
	
	
	
	//x에 대한 set get 메서드
	
	//private x set 메서드
	//void만 올 수 있음
	public void setX(int xx) //=>수정을 목적으로 하기 때문에 인자값 필수
	{
		//this.x=xx; //this는 멤버 자기자신
		x=xx; //private과 이 setX(인자값)의 인자값과 이름이 틀릴때 this생략하여 사용
	}
	
	//무조건 private x get 메서드 ()안 인자값x
	//void 말고도 올 수 있음 => 그럴땐 return값 받아야지만 사용가능
	public void getX() //=>set으로 설정한걸 get으로 받아옴
	{
		System.out.println("x="+this.x);
	}
	
	
	
	
	//y의 set get
	
	public static void setY(int yy)
	{
		
		//this.y=yy; private static에서는 this 사용 불가능
		//static에서는 일반멤버변수 호출 불가능...static변수만 호출가능
		ObTestA.y=yy; // private static은 이렇게 접근 // 같은 클래스라면 y=yy; 접근 가능
		
	}
	
	public static void getY()
	{
		System.out.println("y= "+ObTestA.y);
	}
	
} 





//////////////////////////////////////////////////////
public class ExObTest_06 {

	public static void main(String[] args) {
		
		/*x는 생성 ..private 붙이는 순간 에러...메서드로 접근해야함
		ObTestA oa1=new ObTestA();
		System.out.println(oa1.x);
		
		//y는 클래스명으로 호출
		System.out.println(ObTestA.y);*/
		
		
		//private변수이므로 메서드 만들어서 호출 가능..변수에 직접 접근안됨 set/get 사용
		ObTestA oa1=new ObTestA();
		oa1.setX(20); //->()값 수정
		oa1.getX(); // set으로 설정한걸 get으로 받아옴
		
		ObTestA oa2=new ObTestA();
		oa2.setX(50);
		oa2.getX();
		
		//ObTestA.y=200; private라서 이렇게 접근하면 오류발생
		//y호출...클래스명으로 호출
		ObTestA.setY(50);
		ObTestA.getY();

	}

}
