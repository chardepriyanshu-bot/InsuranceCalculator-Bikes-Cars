package lab.com;

import java.util.Scanner;

class vehicleShowroom{
	private String vehicleNo;
	private String model;
	private String type;
	private double price;
	private double insuranceAmount;
	final static double CARS=8.0;
	final static double BIKES=5.0;
	
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	
	public double getInsuranceAmount() {
		if (this.type.equalsIgnoreCase("Car")) {
			return this.price*(CARS/(100.0));
		}
		else if(this.type.equalsIgnoreCase("Bike")){
			return this.price*(BIKES/(100.0));
		}
		else {
			System.out.println("Vehcile type is invalid.Please try (Car/Bike)!");
			return 0;
		}
	}
	public void displayDetails() {
		System.out.println("Your details is here: ");
		System.out.println("Vehicle no is:"+this.vehicleNo);
		System.out.println("Vehicle model is: "+this.model);
		System.out.println("Vehicle type is:"+this.type);
		System.out.println("Vehicle price is: "+this.price);
		System.out.println("Vehicle insurance is :"+getInsuranceAmount());
	}
}

public class Vehicle {

	public static void main(String[] args) {
		vehicleShowroom v=new vehicleShowroom();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Vehicle No: ");
		v.setVehicleNo(sc.nextLine());
		System.out.println("Enter the Vehicle model: ");
		v.setModel(sc.nextLine());
		System.out.println("Enter the Vehicle type: ");
		v.setType(sc.nextLine());
		System.out.println("Enter the Vehicle price: ");
		v.setPrice(sc.nextDouble());
		v.displayDetails();
		
		sc.close();
	}

}
