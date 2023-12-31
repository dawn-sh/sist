package day0621;

import java.util.Scanner;

public class QuizWhileTrue_13 {

	public static void main(String[] args) {
		/*
		 * 점수를 반복해서 입력하다가 q나 Q를 입력하면
		 * while문을 빠져나온 뒤 총 갯수, 총점, 평균을 출력하시오
		 * 평균은 소수점 1자리
		 * */
		Scanner sc=new Scanner(System.in);
		int count=0,total=0;
		double avg=0;
		String score;
		
		while(true)
		{	
			System.out.println("점수를 입력하세요(q or Q 종료)");
			score=sc.nextLine();
			
			//종료
			//if(score.equals("q")||score.equals("Q"))
			//if(score.equalsIgnoreCase("q")) //equals종류는 q만 적어야
			if(score.charAt(0)=='q' || score.charAt(0)=='Q') //charAt은 q+다른문자 여도 작동
				break;
			
			total+=Integer.parseInt(score); //정수로 변환 후 합계변수에 누적가능 //+=누적이라고 생각하면 이해도 높아짐	
			count++;
		}
		avg=(double)total/count; //둘 다 정수이므로 double로 형변
		System.out.println("입력한 수의 총 합: "+total);
		System.out.println("입력한 갯수: "+count);
		System.out.printf("총 합의 평균: %.1f",avg);
	}

}
