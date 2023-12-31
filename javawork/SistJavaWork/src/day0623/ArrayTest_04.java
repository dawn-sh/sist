package day0623;

public class ArrayTest_04 {

	public static void main(String[] args) {
		// 기본형 배열은 객체로 인식
		
		int[] arr1,arr2; //arr1 이라는 배열과 arr2라는 배열 선언
		arr1=new int[3]; //[]안에 갯수를 주어줘야 메모리 할당 가능
		//==int[] arr1= new int[3];
		arr2=new int[5]; //할당만 되도 각 index값은 0으로 초기화됨
		//==int arr2[]=new int[5];
		
		//arr1 배열에 값을 넣는다
		//arr1 index0~index2까지 값을 넣어줌
		arr1[0]=10;
		arr1[1]=5;
		arr1[2]=20;
		
		//배열의 갯수
		System.out.println(arr1.length);//길이3(index0~2)
		System.out.println(arr2.length);//길이5(index0~4)
		
		System.out.println("arr1 출력");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		System.out.println("for문으로 arr1출력");
		for(int i=0;i<3;i++)
		{
			System.out.println(arr1[i]); //i는 배열의 index값
		}
		
		System.out.println("for문으로 arr1출력_범위를 변수화");
		for(int i=0;i<arr1.length;i++) //배열의 index 0~x 는 배열의 길이보다 작다
		{
			System.out.println(arr1[i]);
		}
		
		//arr2 를 출력해보는데 범위를 변수화한 for문으로 출력해보세요
		System.out.println("for문으로 arr2출력_범위를 변수화");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		//for~each 무작정 출력
		//아래 수식은 배열 안에 값을 다 뽑아냄
		//foreach(배열변수자료형 임의의이름 : 배열변수명)
		System.out.println("for each_arr1");
		for(int a1:arr1) //int a1:arr1 arr1이라는 배열을 a1에 대입할게
		{
			System.out.println(a1);
		}
		
		
		System.out.println("for each_arr2");
		for(int s2:arr2)
		{
			System.out.println(s2);
		}

	}

}
