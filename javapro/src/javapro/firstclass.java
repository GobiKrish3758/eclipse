package javapro;

import java.util.List;

public class firstclass {
	static List<String> places=new List<>();
	public static List getPlaces() {
		places.add("TamilNadu,Chennai");
		places.add("TamilNadu,Coimbatore");
		places.add("TamilNadu,Tiruppur");
		places.add("TamilNadu,Erode");
				

	return places
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             List<String> myPlaces=getPlaces();
             System.out.println("Places from TamilNadu");
             myPlaces.stream();
             myPlaces.filter(p)->p.startWith("TamilNadu");
             myPlaces.map((p)->p.toUpperCase());
             myPlaces.sorted();
             myPlaces.forEach((p)->System.out.println(p));
             
	}

}
