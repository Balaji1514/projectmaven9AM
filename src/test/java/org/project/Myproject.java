package org.project;

public class Myproject {
public void merge(String a, String b ) {
 String c = a.concat(b);
 System.out.println(c); 
}
	public static void main(String[] args) {
		String s1 = "Greens ";
        String s2 = "greens";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1.compareTo(s2));
        int i = System.identityHashCode(s3);
        System.out.println(i);
        String s4="how are you";
        String[] split = s4.split(" ", 3);
		for(String x:split)
        System.out.println(x);
		String substring = s3.substring(7, 13);
		System.out.println(substring);
		Myproject m =new Myproject();
		m.merge("name", "name");
		
		char c = s1.charAt(3);
		System.out.println(c);
	}

}
   