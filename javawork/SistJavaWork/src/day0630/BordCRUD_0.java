package day0630;

import java.util.Scanner;

interface Board{
	public void process();
}
//////////////////////////////////////////////////
class Insert implements Board{

	@Override
	public void process() {
		System.out.println("게시판에 게시물을 추가합니다");
	}
	
}
//////////////////////////////////////////////////
class Select implements Board{

	@Override
	public void process() {
		System.out.println("게시판에 게시물을 조회합니다");
	}
	
}
//////////////////////////////////////////////////
class Update implements Board{

	@Override
	public void process() {
		System.out.println("게시판에 게시물을 수정합니다");
	}
}
//////////////////////////////////////////////////
class Delete implements Board{

	@Override
	public void process() {
		System.out.println("게시판에 게시물을 삭제합니다");
	}
	
}
//////////////////////////////////////////////////
public class BordCRUD_0 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Board board=null;
		int n; //입력할 숫자
		
		while(true)
		{
			System.out.println("1.추가  2.조회  3.수정 4.삭제");
			System.out.println("=================================");
			n=Integer.parseInt(sc.nextLine());
			
			switch(n)
			{
			case 1:
				board=new Insert();
				break;
			case 2:
				board=new Select();
				break;
			case 3:
				board=new Update();
				break;
			case 4:
				board=new Delete();
				break;
			case 9:
				System.out.println("종료합니다");
				System.exit(0); //강제종료
			default:
				System.out.println("**잘못입력했어요**");
				break;
			}
			if(n<=4)
				board.process();
		}
	}

}
