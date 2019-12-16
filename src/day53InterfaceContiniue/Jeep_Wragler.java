package day53InterfaceContiniue;

public class Jeep_Wragler implements Cars, GasVehicles{

	@Override
	public void PumpGas() {
		System.out.println("Pumping Gas");
		
	}

	@Override
	public void start() {
		System.out.println("Call Mechanic ");
		System.out.println("Oil change");
		System.out.println("Jump Start");
		
		
	}
	
	public void SelfParking() {
		System.out.println("Self Parking Mode");
	}
	    

}
