package day55_Polymorphisim;

abstract class ScrumTeam{
	
	public String Name, JobTitle;
	public double salary;
	
	public abstract void DailyStandup();
	public abstract void Demo();
	
	public void getEmployeeInfoo() {
		System.out.println("Employess Name " + Name);
		System.out.println("Job title " + JobTitle);
		System.out.println("Salary " + salary);
	}
	
}

class Testers extends ScrumTeam{
	
	public Testers (String Name, String JobTitle, double salary) {
		this.Name = Name;
		this.JobTitle = JobTitle;
		this.salary = salary;
		
		
	}
	
	@Override
	public void DailyStandup() {
		System.out.println("Tester " + Name + " is talking");
		
	}
	
	@Override
	public void Demo() {
		System.out.println("Tester " + Name + " is doing demo");
		
	}
	
}

public class BOA {
	public static void main(String[] args) {
		
		Testers  Madina  = new Testers("Maina", "SDET", 130000);
		Madina.DailyStandup();
		Madina.getEmployeeInfoo();
	}
	
	

}
