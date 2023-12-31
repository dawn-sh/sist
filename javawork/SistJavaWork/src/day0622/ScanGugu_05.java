package day0622;

import java.util.Scanner;

public class ScanGugu_05 {

	public static void main(String[] args) {
		//단을 입력해서 해당단 출력하기
		//0을 입력시 종료
		Scanner sc=new Scanner(System.in);
		int dan;
		
		while(true)
		{
			System.out.println("단을 입력하세요(종료:0)");
			dan=sc.nextInt();
			
			//종료
			if(dan==0)
			{
				System.out.println("종료합니다");
				break;
			}
			
			//2~9단까지만 입력가능
			if(dan>9 || dan<2)
			{
				System.out.println("잘 못 적었어요");
				continue;
			}
			
			//구구단 출력
			System.out.println("["+dan+"]");
			for(int n=1;n<=9;n++)
			{
				//System.out.println(dan+"x"+n+"="+dan*n);
				System.out.printf("%d x %d = %2d\n",dan,n,dan*n);
			}
			System.out.println();
		}

	}

}
