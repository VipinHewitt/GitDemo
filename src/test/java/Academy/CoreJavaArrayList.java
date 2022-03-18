package Academy;

import java.util.ArrayList;

import javax.swing.plaf.SliderUI;

public class CoreJavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println(al.isEmpty());
		
		al.add("Vipin");
		al.add("Purwar");
		al.add("Java");
		
		System.out.println(al);

		al.remove(2);
		
		System.out.println(al);

		al.add(1, "Java Example");

		System.out.println(al.get(1));
		
		System.out.println(al.size());
		
		String s = "Vipin Purwar Java Example";
		
		String[] splitstr = s.split(" ");
		
		for(String str1: splitstr)
		{
			System.out.println(str1);
		}
			
	}

}
