package javapro;

import java.util.Arrays;
import java.util.List;

public class secondpro {
	public static void main(String[] args) {
		List<String> li=Arrays.asList("Karur","Coimbatore","Chennai","Trichy","Erode");
//		li.forEach(s ->System.out.println(s));
//      li.forEach(System.out::println);
      li.stream()
      .filter(s ->s.startsWith("C"))
      .map(s ->s.toUpperCase())
      .forEach(System.out::println);
      
		
	}

}
