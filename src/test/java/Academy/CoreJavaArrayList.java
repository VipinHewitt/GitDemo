package Academy;

import java.util.ArrayList;

public class CoreJavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println(al.isEmpty());
		
		al.add("Test1");
		al.add("Test2");
		al.add("Java");
		al.add("Java1");
		
		System.out.println(al);

		al.remove(2);
		
		System.out.println(al);

		al.add(1, "Java Examples");

		System.out.println(al.get(1));
		
		System.out.println(al.size());
		
		String s = "String Java Example";
		
		String[] splitstr = s.split(" ");
		
		for(String str1: splitstr)
		{
			System.out.println(str1);
		}
			
	}

}
