package day0621;

public class ExWhile_04 {

	public static void main(String[] args) {
		//while 조건문 true문 비교
		
		int i=1;
		
		while(i<10)
		{
			System.out.println("Java"+i);
			i++;
		}
		
		System.out.println("종료");
		
		i=1;
		while(true)
		{
			System.out.println("Java"+i);
			i++;
			
			//break
			if(i==10)
				break;
		}

	}

}
