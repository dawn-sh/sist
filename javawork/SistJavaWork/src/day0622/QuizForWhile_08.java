package day0622;

import java.util.Scanner;

public class QuizForWhile_08 {

	public static void quiz1() {
		/*
		 * 나이를 반복해서 입력받는다
		 * 0이되면 빠져나와서 출력한다
		 * 나이가 50이상일 경우 a변수 증가
		 * 나이가 30이상일 경우 b변수 증가
		 * 그 나머지는 c변수 증가
		 * 
		 * ===========================
		 * 50세이상: 3명
		 * 30세이상 50세미만: 2명
		 * 그이외: 1명*/
		
		Scanner sc=new Scanner(System.in);
		
		int age,a=0,b=0,c=0;
		
		while(true)
		{
			System.out.println("나이를 입력해주세요");
			age=sc.nextInt();
			
			if(age==0)
			{
				System.out.println("종료합니다");
				break;
			}
			
			if(age>=50)
				a++;
			else if(age>=30)
				b++;
			else
				c++;
		}
		System.out.println("50세이상: "+a+"명");
		System.out.println("30세이상 50세미만: "+b+"명");
		System.out.println("그이외: "+c+"명");
		
	}
	
	public static void quiz2() {
		//Q. 총 10개의 다양한 숫자(양수,음수)를 입력받아 양수의 갯수와 음수의 갯수를 구하시오
		/*
		 * 1: 45
		 * 2: -23
		 * 3: 0
		 * 
		 * 
		 * ======================
		 * 양수 갯수:6
		 * 음수 갯수:3
		 * */
		
		Scanner sc=new Scanner(System.in);
		int num;
		int plus=0,minu=0;

		for(int i=1;i<=10;i++)
		{
			System.out.print(i+": ");
			num=sc.nextInt();
			
			if(num==0)
			{
				System.out.println("다시 입력해주세요");
				i--;
				continue;
			}
			
			if(num>0)
				plus++;
			else
				minu++;
				
		}
		System.out.println("================");
		System.out.println("양수 갯수: "+plus);
		System.out.println("음수 갯수: "+minu);
	}
	
	public static void main(String[] args) {
		
		//quiz1();
		quiz2();

	}

}
