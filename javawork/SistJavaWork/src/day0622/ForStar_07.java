package day0622;

public class ForStar_07 {

	public static void main(String[] args) {
		
		System.out.println("중첩(다중)for문으로 별모양 찍기");
		
		for(int i=1;i<=5;i++)//행 갯수(row)
		{
			for(int j=1;j<=5;j++)//열 갯수(column)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++) //행갯수
		{
			for(int j=1;j<i+1;j++) //조건식 j<=i랑 같다 ..열갯수(i만큼만 반복)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=5;i>=1;i--) // for(int i=1;i<=5;i++) 행갯수
		{
			for(int j=1;j<i+1;j++) // for(int j=5;j>=i;j--) 열갯수(i가 1일때 5번, 2일때 4번... 5일때 1번)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
