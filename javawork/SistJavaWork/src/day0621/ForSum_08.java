package day0621;

public class ForSum_08 {

	public static void main(String[] args) {
		
		//for문으로 합계구하기
		//1~10까지 합
		int sum=0; //합계 구하는 변수
		
		for(int i=1;i<=10;i++)
		{
			sum+=i; //i를 합계변수(sum)에 누적해준다//sum=sum+i;
			/* i=1 sum=1
			 * i=2 sum=3
			 * i=3 sum=6
			 * ...*/
		}
		
		System.out.println("1부터 10(=i-1)까지의 합은 "+sum+"입니다");
		
		int tot=0;
		int i=1;
		
		while(i<=10)
		{
			tot=tot+i;
			i++;
		}
		
		System.out.println("1부터 10까지의 합은 "+tot+"입니다");
		
		//결과 출력시 1~10까지의 합은 55입니다
		
		int total=0;
		int a=1;
		for(;a<=5000;a++)
			total+=a;
		System.out.println("1에서 "+(a-1)+"까지의 합은 "+total);
		
	}

}
