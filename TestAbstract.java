package tw.aaa.myproject.OOP.Abstract;

abstract class company {
	public abstract void CalFuel();

	public abstract void CalDistance();

	public static void xxx(company corp) {
		corp.CalFuel();
		corp.CalDistance();
	}
}

class truck extends company {

	public void CalFuel() {
		System.out.println("Truck calculates Fuel.");
	}

	@Override
	public void CalDistance() {
		System.out.println("Truck calculates Distance.");
	}
}

class ship extends company {

	public void CalFuel() {
		System.out.println("ship calculates Fuel.");
	}

	@Override
	public void CalDistance() {
		System.out.println("ship calculates Distance.");
	}
}

public class TestAbstract {

	public static void main(String[] args) {

		// Truck toyota = new Truck();
		// toyota.calFuel();
		// toyota.calDistance();
		//
		// Ship cargoShip = new Ship();
		// cargoShip.calFuel();
		// cargoShip.calDistance();

		// Company corp;
		//
		// corp = new Truck();
		// corp.calFuel();
		// corp.calDistance();
		//
		// corp = new Ship();
		// corp.calFuel();
		// corp.calDistance();

		company.xxx(new truck());
		company.xxx(new ship());

	}

}
