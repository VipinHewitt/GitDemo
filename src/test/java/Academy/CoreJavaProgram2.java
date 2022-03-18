package Academy;

import java.util.ArrayList;

public class CoreJavaProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,6,7,8,12,14,16};
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 != 0){
		
				System.out.println(arr[i]);
			}
			
		}
		
		ArrayList al = new ArrayList();
		
		System.out.println(al.isEmpty());

	}

}
