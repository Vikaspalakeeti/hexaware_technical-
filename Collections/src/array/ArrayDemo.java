package array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5}; //int[] arr or int []arr
		System.out.println(arr[0]);
		System.out.println(arr.length);
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		int age[]=new int[5];
		age[0]=21;
		age[1]=22;
		age[2]=2;
		age[3]=10;
		age[4]=8;
		for (int ac: age) {
			System.out.println(ac);
		
			
		}
		
		
		

	}

}
