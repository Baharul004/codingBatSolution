package oop;

public class real_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car myCar = new car();
		
		myCar.fuelCapacity = 20;
		myCar.ammountOfFuel = 10;
		myCar.addGas(2);
		System.out.println("TOTAL AMOUNT of Fuel " + myCar.ammountOfFuel);
		myCar.milage = 5;
		myCar.drive(1);
		myCar.getFuelLevel();

	}
}	
	class car{
		double milage;
		double ammountOfFuel ;
		double fuelCapacity ;
		
		public void drive(double distance) {
			double fuelNeed = distance / milage;
			if(ammountOfFuel >= fuelNeed){
				ammountOfFuel = ammountOfFuel -fuelNeed;
				System.out.println("You Travel " + distance + " kilometers" );
				
			}else {
				System.out.println("You don't have enough fuel");
			}
			
			
			
		}
		public void addGas(double amount) {
			double emptySpace = fuelCapacity - ammountOfFuel;
			if(amount < emptySpace) {
			ammountOfFuel = ammountOfFuel + amount;
			System.out.println(amount + " Liters was added");
			}
			else {
				ammountOfFuel = fuelCapacity;
				System.out.println("Fuel capacity is full");
				
			}
			
		}
		public void getFuelLevel() {
			
			
		}
	}


