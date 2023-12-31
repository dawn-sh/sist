package day0627;

//같은 패키지 안에 같은 클래스 이름이면 에러
class Student{
	
	private String name; //null
	private int age; //0
	
	
	//setter_method
	//instance 변수에 저장된 데이터를 수정할 목적(set변수명)_수정할 인자값이 있다
	//저장수정용도이므로 return값(결과값)이 없다(void)
	public void setName(String name)
	{
		this.name=name; //this.클래스에 있는 name=setName 인자값에 있는 name
	}
	
	public void setAge(int age) //=>인자값이 클래스 변수명과 동일한 필요x
	{
		this.age=age; //this.클래스에 있는 age=setAge 인자값에 있는 age
	}
	
	//getter_method
	//instance변수에 저장된 데이터를 조회(나중에 SQL에서 select)할 목적(get 변수명)
	//데이터를 얻는 목적이므로 호출 데이터를 넘겨줄 필요가 없으므로 인자값(파라메터값)이 없다
	//실행결과를 돌려주므로 "return 결과값" 으로 지정
	public String getName()
	{
		return name; //=>set메서드에서 this.name에서 ~~.name
	}

	public int getAge()
	{
		return age;
	}
}


/////////////////////////////////////////////////////
public class SetGetMethod_07 {

	public static void main(String[] args) {
		
		//생성 -> 수정 -> 
		
		//1.객체생성
		Student stu1=new Student(); //디폴트 생성자
		
		//2.참조변수명으로 set메서드 호출
		stu1.setName("최지우");
		stu1.setAge(33);
		
		//3.get메서드를 통한 값얻기
		String name=stu1.getName(); //같은 class가 아니라서 참조변수명 name 써도 무관
		int age=stu1.getAge();
		
		//출력
		System.out.println(name+""+age);
		
		
		//2번째 생성 및 출력
		Student stu2=new Student();
		
		stu2.setName("츄");
		stu2.setAge(25);
		
		System.out.println(stu2.getName()+" "+stu2.getAge());
		

	}

}
