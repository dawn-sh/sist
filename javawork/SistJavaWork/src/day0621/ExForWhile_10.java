package day0621;

public class ExForWhile_10 {
	
	public static void test1() {
		//for문으로 1~5까지 합구하기
		int sum=0;
		
		for(int i=1;i<=5;i++)
		{
			sum+=i;
		}
		System.out.println("총 합계는 "+sum);
	}
	
	public static void test2() {
		//1~10까지의 홀수합_for
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				continue;
			sum+=i;
		}
		System.out.println("총 합계는 "+sum);
		
	}
	
	public static void test3(){
		//100까지의 합은 5050	100은 변수로 처리해서 출력하시오...for
		int sum=0;
		int i=1;
		
		for(;i<=100;i++)
			sum+=i;
		System.out.println((i-1)+"까지의 합은 "+sum);
		
	}
	
	//main메서드는	 클래스의 시작과 끝을 담당
	public static void main(String[] args) {
		
		test1(); //위에 만든 메서드를 호출하는 것
		test2();
		test3();

	}

}
