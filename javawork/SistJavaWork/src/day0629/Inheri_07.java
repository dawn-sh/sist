package day0629;

class Person{
	
	String name;
	String buseo;
	
	public void getPerson()
	{
		System.out.println("**부모변수출력**");
		System.out.println("이름: "+this.name);
		System.out.println("부서: "+this.buseo);
	}
}

////////////////////////////////////////////////////
class My extends Person{
	
	int age;
	
	//extends로 받았기 때문에 부모클래스의 변수도 this.로 사용가능
	public My(String name, String buseo, int age) {
		this.name=name;
		this.buseo=buseo;
		this.age=age;
	}
	
	
	public void write() {
		
		System.out.println("사원명: "+this.name);
		System.out.println("부서: "+buseo);
		System.out.println("나이: "+age);
	}
	
	//오버라이드
	@Override
	public void getPerson() {
		super.getPerson();
		System.out.println("나이: "+this.age);
	}
	
}

////////////////////////////////////////////////////
public class Inheri_07 {
	
	public static void main(String[] args) {
		
		My my1=new My("이미나", "교육부", 30);
		my1.write();
		System.out.println();
		System.out.println("**오버라이드 통한 메서드 출력**");
		my1.getPerson();

	}

}
