package day0626;

public class ArrNumsChange_02 {

	public static void main(String[] args) {
		
		int [] arr= {5,22,64,72,4,3,16,85,93,45};
		
		//출력
		System.out.println("원래 데이터");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		
		//데이터 거꾸로 변경하기
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1]; // 0일때 9번과 바꾸고 //1일때 8과 바꾸고 .....
			arr[arr.length-i-1]=temp;
		}
		
		//출력
		System.out.println("순서 바꾼 후 데이터");
				
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		
		//selection sort(오름차순 정렬)
		//Arrays.sort(arr):배열 arr을 정렬한다
		//선택정렬: 가장 작은 숫자를 앞으로 보내자 -> 중첩for문
		//int [] arr= {5,22,64,72,4,3,16,85,93,45};
					//i ={5,22,64,72,4,3,16,85,93} 기준 데이터는 길이-1 까지만 비교
					//j ={22,64,72,4,3,16,85,93,45}	비교 데이터는 2번째부터 마지막까지 비교
		
		//기준데이터는 0부터 끝에서 두번째까지
		for(int i=0;i<arr.length-1;i++)
		{
			//비교하는 데이터는 기준값 다음부터 끝까지
			// j:비교하는 값이기에 i보다 하나 더 커야함
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("오름차순 정렬 후 데이터");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
