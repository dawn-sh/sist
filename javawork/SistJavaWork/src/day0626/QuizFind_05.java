package day0626;

import java.util.Scanner;

public class QuizFind_05 {

	public static void main(String[] args) {
		
		/* 숫자를 입력 받아서 배열의 몇번째에 있는지 출력하고 없을 경우 없습니다 라고 출력
		 * (0이면 종료)
		 * 입력값: 11
		 * 		11은 2번째에 있어요!
		 * 입력값: 100
		 * 		100은 없습니다
		 * 입력값: 0
		 * 		종료합니다(프로그램종료)*/
		
		Scanner sc= new Scanner(System.in);
		
		int [] arrNums= {1,64,72,18,39,546,27,95,101,30,50};
		
		int num;
		boolean flag;
		
		while(true)
		{
			System.out.print("입력값: ");
			num=sc.nextInt();
			
			if(num==0)
			{
				System.out.println("\t종료합니다(프로그램종료)");
				break;
			}
			
			flag=false; //반복문안에서 찾았을 경우 true로 변경해줄것
			
			//배열개수만큼 반복해서 입력한 숫자 찾기
			for(int i=0;i<arrNums.length;i++)
			{
				if(num==arrNums[i])
				{
					flag=true;
					System.out.println("\t"+num+"은 "+(i+1)+"번째에 있어요!");
				}
			}
			
			if(!flag)
				System.out.println("\t"+num+"은 없습니다");
		}

	}

}
