package day0623;

import java.util.Scanner;

public class ArrayintFind_12 {

	public static void main(String[] args) {
		//숫자를 입력해서 그 숫자가 몇 번째 있는지 찾기
		//없으면 없다고, 있으면 그 숫자가 몇 번째 있는지 찾기
		//0입력 시 종료: while(true)
		
		Scanner sc=new Scanner(System.in);
		int su; //입력할 수
		int [] data= {43,63,47,4326,16,9,3,72,89,106};
		boolean flag; //있다 없다가 중요해서 먼저 선언

		while(true)
		{
			System.out.println("검색할 숫자 입력하세요");
			su=sc.nextInt();
			
			//break...0입력시 종료
			if(su==0)
			{
				System.out.println("종료합니다");
				break;
			}
			
			//있다 없다 초기값
			flag=false; //찾으면 true로 변경 //여기서 flase 초기값 준 것
			
			//값 찾기
			for(int i=0;i<data.length;i++)
			{
				if(su==data[i])
				{
					flag=true; //찾은 경우
					System.out.println((i+1)+"번째에서 검색");
					
				}
			}
			
			if(!flag) //flag==false //flag는 찾은 것 !flag는 못 찾은 것
				System.out.println(su+"는 데이타에 없습니다");
			
		}
	}

}
