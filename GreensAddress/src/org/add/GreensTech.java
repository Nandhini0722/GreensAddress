package org.add;

public class GreensTech {
	public void greensOmr(String name,String street,String city) {
		System.out.println(name+" "+street+" "+city);
	}
	public void greensOmr(String name,int floorNum) {
		System.out.println(name+" "+floorNum);
	}
	public void greensOmr(String name,int floor,String street) {
		System.out.println(name+" "+floor+" "+street);
	}
	public void greensOmr(String name,int floor,double income) {
		System.out.println(name+" "+income+" "+floor);
	}
	
        System.out.println("This is for Method Overloading");

	public static void main(String[] args) {
		GreensTech obj=new GreensTech();
		obj.greensOmr("Greens","OMR","Chennai");
		obj.greensOmr("Greens",2,"OMR");
		obj.greensOmr("Greens",2);
		obj.greensOmr("Greens",2,500000.9);

		
	}

}
