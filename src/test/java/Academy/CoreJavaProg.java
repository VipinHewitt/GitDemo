package Academy;


public class CoreJavaProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Vipin Purwar";
		String r = "";
		for(int i=s1.length()-1; i>=0; i--)
		{
			System.out.println(s1.charAt(i));
			r = r + s1.charAt(i);
		}
		System.out.println(r);
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(arr[4]);
		
		int[] arr1 = {0,1,3,5,7,8,9};
		
		System.out.println(arr1[5]);
		
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		String[] str = {"vipin", "purwar","java"};
		
		System.out.println(str[2]);
		
		for(String s: str)
		{
			System.out.println(s);
		}
				
	}

}
