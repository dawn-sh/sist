package day0623;

public class StringMethod_08 {

	public static void main(String[] args) {
		
		String str1="Have a Nice Day";
		String str2="    Happy Day      ";
		
		System.out.println("str2의 길이: "+str2.length());
		System.out.println("str2의 앞뒤 공백 제거 후 길이: "+str2.trim().length());
														   //trim 앞뒤 공백 제거.길이
		System.out.println("*"+str2+"*");
		System.out.println("*"+str2.trim()+"*");
		
		//indexOf
		System.out.println("str1에서 H의 인덱스: "+str1.indexOf('H'));
													//indesOf(문자열에서 찾는 문자가 몇 번째 index에 있는지
		System.out.println("str1에서 D의 인덱스: "+str1.indexOf('D'));
		
		System.out.println("str1에서 Nice추출: "+str1.substring(7, 11));
	
		
		//replace
		System.out.println("문자열 일부를 변경");
		System.out.println(str1.replace('a', '*')); //문자열이름.replace(바꿀 문자,새로운 문자)
		System.out.println(str1.replace("Nice", "Good"));
		
		//숫자를 문자로 바꿈
		String b1=12.5+" ";
		System.out.println(b1);
		
		String b2=100+""; //숫자를 문자로 바꿈
		System.out.println(b2);
		
		String b3=String.valueOf(100); //int ==> String
		String b4=String.valueOf(12.6); //double ==> String
		
		System.out.println(b3);
		System.out.println(b4);
		
		
		//문자열 분리하는 메서드 split
		String str3="red,blue,green,gray,white"; //하나의 문자이므로 분리하기 위해서는 배열이 필요
		System.out.println(str3);
		
		System.out.println(",로 분리하여 출력하기");
		
		String[] arr=str3.split(","); //,를 기준으로 잘라서 배열로 나눠줌
		System.out.println("분리된 색상 갯수: "+arr.length);
		
		//출력
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		for(String color:arr)
			System.out.println(color);
		
		
		
	}

}
