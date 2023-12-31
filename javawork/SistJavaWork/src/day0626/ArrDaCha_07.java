package day0626;

import java.util.Scanner;

public class ArrDaCha_07 {

	public static void main(String[] args) {
		
		//행마다 열 갯수가 다른 경우
		int arr[][]= {
				{22,33},
				{11,22,33},
				{10,20,30,40}
				};
		
		System.out.println("총 행 갯수: "+arr.length);
		System.out.println("0번행의 열갯수: "+arr[0].length);//0행의 열갯수
		System.out.println("0번행의 열갯수: "+arr[1].length);//1행의 열갯수
		System.out.println("0번행의 열갯수: "+arr[2].length);//2행의 열갯수
		
		//for문으로 출력
		for(int i=0;i<arr.length;i++) //행
		{
			for(int j=0;j<arr[i].length;j++) //열
			{
				System.out.printf("%d,%d=%2d\t",i,j,arr[i][j]);
			}
			System.out.println(); //0, 1, 2 행 내려갈 때마다 줄 내려줌
		}

	}

}
