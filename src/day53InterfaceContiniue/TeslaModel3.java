package day53InterfaceContiniue;

public class TeslaModel3 implements Cars, ElectricVehicles {
	
    public void start() {
    	System.out.println(" Voice Control \"Tesla start\" ");
    }
    
    public void Charge() {
    	System.out.println("Tesla can charge");
    	
    }
    
    public void SelfDrive() {
    	System.out.println("Self Driving Mode");
    }

}
