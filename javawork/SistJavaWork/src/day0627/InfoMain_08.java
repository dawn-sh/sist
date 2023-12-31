package day0627;

public class InfoMain_08 {

	public static void main(String[] args) {

		
		//명시적 생성자
		//명시적 생성자를 setter처럼 만들어서 따로 안만들어줘도 됐음
		Info_08 in1=new Info_08("이수진", 22, "서울시 강남구"); //초기값 지정
		
		//getMethod 변수지정
		String name=in1.getStuName();
		int age=in1.getAge();
		String addr=in1.getAddr();
		
		System.out.println("이름은 "+name+"이고 나이는 "+age+"세 이며 주소는 "+addr+"입니다");
		
		
		//getMethod 직접 입력
		Info_08 in2=new Info_08("김영", 22, "서울시 은평구");
		System.out.println("이름은 "+in2.getStuName()+"이고 나이는 "+in2.getAge()+"세 이며 주소는 "+in2.getAddr());
		
		
		
		//디폴트 생성자로 생성 - 불러올 수는 있지만 초기값 따로 지정 해줘야함
		Info_08 in3=new Info_08();
		//in3.stuName="dd"; -> 초기값 지정
		System.out.println("이름: "+in3.getStuName()+"\n나이: "+in3.getAge()+"\n주소: "+in3.getAddr());
		
	}

}
