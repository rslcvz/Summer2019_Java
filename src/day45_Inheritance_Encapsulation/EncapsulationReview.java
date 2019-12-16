package day45_Inheritance_Encapsulation;
class credentials{
	 private String userName;  // admin
	 private String passWord;  // 123
     
     public credentials() {
    	 setuserName("admin");
             	 
     }
     
     public String getuserName() {
    	 return userName;
     }
     public String getpassWord() {
    	 return passWord;
    	 
     }
  // setter = we generated from username.
     public void setuserName(String userName) {
    	this.userName = userName;
     }
     public void setpassWord(String passWord) {
    	 this.passWord = passWord;
     }
}
	
public class EncapsulationReview {

	public static void main(String[] args) {
		credentials Zlfy = new credentials();
//		            obj.userName = "Zlfy";
//		            obj.passWord = "12334";
		            
                System.out.println(Zlfy.getuserName());
                System.out.println(Zlfy.getpassWord());
                
                credentials Nurzat = new credentials();
                System.out.println(Nurzat.getuserName());
                System.out.println(Nurzat.getpassWord());
	
	}
}



