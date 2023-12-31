package day0621;

import java.util.Scanner;

public class ExWhile_02 {

	public static void main(String[] args) {
		//while문으로 1부터 10까지출력
		
		int n=0;
		
		while(n<10)
		{
			n++;
			System.out.printf("%4d",n);
		}
		
		System.out.println();
		
		//다른 방법
		
		n=0; //위에 이미 int n 선언했기에 n을 다시 초기화
		
		while(n<10)
		{
			System.out.printf("%4d",++n); //n++과 결과값이 다름 ++n은 증가시키고 출력/n++은 출력하고 증가
		}
		//첫번째 while과 같은 식
		
		System.out.println();
		
		n=0;
		
		while(true)
		{
			System.out.printf("%4d",++n);
			
			//무한루프에 빠지므로 반드시 break문을 주어야 한다
			if(n==10)
				break;
		}
		
		System.out.println();
		
		n=0;
		
		while(++n<=10)
		{
			System.out.printf("%4d",n);
		}
	}

}
