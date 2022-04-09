package com.constructors;

public class CopyCostructCar {
	
	int model;
	String brand;

	
	public CopyCostructCar(int model, String brand) {
		
		this.model=model;
		this.brand=brand;
		
	}
	
	
	//a copy construcctor with refrence of class
	
	public CopyCostructCar(CopyCostructCar copycar) {
		
		model = copycar.model;
		brand = copycar.brand;
		
		
	}
	
	public int showmodel() {
		
		return model;
		
	}
	
	
	public String showbrand() {
		
		return brand;
		
	}
	
	
	public static void main(String[] args) {
		
		CopyCostructCar car1 = new CopyCostructCar(2020,"BMW");
		System.out.println("car model is "  + car1.showmodel());
		System.out.println("car brand is "  + car1.showbrand());
		
		CopyCostructCar  car2 = new CopyCostructCar(car1);
		System.out.println("car model in copy construct "  + car2.showmodel());
		System.out.println("car brand in copy construct "  + car2.showbrand());
		

	}

}
