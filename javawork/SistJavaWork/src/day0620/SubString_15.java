package day0620;

public class SubString_15 {

	public static void main(String[] args) {
		
		String str="나는 쌍용에서 자바를 공부중입니다";
		
		char ch=str.charAt(3);
		String word1=str.substring(8); //index 8번이후(index 9번)부터 끝까지 출력
		//자바를 공부중입니다
		String word2=str.substring(8, 11); //index 8번이후(index 9번)부터 11번까지 출력
		//자바를
		//substring 종류가 위 두가지있음 구분 필수
		int i=str.length(); //총 길이,갯수(공백포함)0~17 18
		
		System.out.println(ch);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(i);

	}

}
