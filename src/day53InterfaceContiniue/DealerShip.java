package day53InterfaceContiniue;

public class DealerShip {

	public static void main(String[] args) {

		TeslaModel3  obj1 = new TeslaModel3();
		obj1.start();
		obj1.Charge();
		
		Jeep_Wragler obj2 = new Jeep_Wragler();
		obj2.start();
		obj2.PumpGas();
		
		ToyotaHybrid  obj3  = new ToyotaHybrid();
		obj3.PumpGas();
	
	}

}
