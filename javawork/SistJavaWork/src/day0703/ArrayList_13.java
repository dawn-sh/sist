package day0703;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayList_13 {
	
	//반복될 것 같아서 미리 출력문 만들어 놓음
	public static void write(String title,List<String> list)
	{
		System.out.println("***"+title+"***");
		
		//모든 데이터 싹 뽑는 것
		for(int i=0;i<list.size();i++)
			System.out.println(i+":"+list.get(i));
		System.out.println();
	}

	public static void main(String[] args) {
		// List 의 메서드 확인,연습
		
		String data[]= {"영준","순영","연주","진평"};
		
		//배열의 데이터를 list에 넣기
		List<String> list=new ArrayList<String>();
		
		for(String d:data)
			list.add(d); //data 배열을 list에 넣음
		write("초기에 배열데이터 add 후 출력", list);
		
		/////////////////////////////////////////////
		System.out.println("1번 index 삭제하기");
		list.remove(1);
		write("1번 삭제 후 결과", list); //-> 순영삭제
		/////////////////////////////////////////////
		System.out.println("현규 추가하기");
		list.add("현규");
		write("현규 추가 후 출력", list);
		///////////////////////////////////////////////
		System.out.println("값변경");
		list.set(0, "영환");
		write("0번 index 변경 후 출력", list);
		/////////////////////////////////////////////
		System.out.println("전체삭제");
		list.clear();
		System.out.println("삭제후 사이즈: "+list.size());
	}

}
