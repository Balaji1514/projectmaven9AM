package org.project;

public class Myproject {
private void details(String name, String number) {
        System.out.println("Name ="+name+"  "+"Number ="+number);
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
		Myproject m = new Myproject();
		m.details("balaji", "9677593594");
		
	}

}
   