package day0627;

public class Info_08 {
	
	String stuName;
	int age;
	String addr;
	
	//생성자
	public Info_08()
	{
		
	}
	
	
	
	
	//명시적 생성자...생성과 동시에 멤버초기화
	//생성만을 위해서 태어난 생성자
	//명시적 생성자를 setter처럼 사용했음
	public Info_08(String name, int age, String addr) {
		
		//명시적 생성자에서는 이렇게 3개가 있으면 3개 같이 있을때만 사용가능
		stuName=name;
		this.age=age;
		this.addr=addr;
	}
	
	//getter메서드
	public String getStuName()
	{
		return stuName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getAddr()
	{
		return addr;
	}

}
