package day0622;

public class QuizForWhile_01 {
	
	//같은 이름의 메소드가 여러개 있어도 인자가 다르면 사용가능
	//=>오버로딩
	public static void quiz1(){
		//가로로 출력 _ for _ 1 2 3 4 5 그리고 다음 줄에 종료 라고 출력하시오
		for(int i=1;i<=5;i++)
			System.out.print(i+" "); //숫자+문자=문자
		System.out.println();
		System.out.print("종료");//종료 앞에 \n도 가능
	}
	
	public static void quiz2(){
		//가로로 출력_for_1 2 4 5 7 8 10 _continue 사용
		for(int i=1;i<=10;i++)
		{
			if(i%3==0)
				continue;
			System.out.print(i+" ");
		}
	}
	
	public static void quiz3(){
		//안녕   을 가로로 3번 출력하시오
		for(int i=1;i<=3;i++)
			System.out.print("안녕 ");
	}

	public static void quiz4(){
		//1부터 10까지 중 짝수만 가로로 출력
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
	}

	public static void quiz5(){
		//1부터 10까지의 합은 55입니다
		int sum=0;
		int i=1;
		for(;i<=10;i++) //for(int i=1;i<=10;i++)의 int i의 for문의 지역변수라 for문 밖에서는 사용x
			sum+=i;
		System.out.print("1부터 "+(i-1)+"까지의 합은 "+sum+"입니다");
	
	}

	public static void main(String[] args) {

		//quiz1();
		//quiz2();
		//quiz3();
		//quiz4();
		quiz5();
	}

}
