package AssignmentCybertek02;
import java.util.*;

public class ZombieAttack {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int day =0;
	    
	    
	    for (int i=0; i < inhabitants; i++) {
			inhabitants = inhabitants/2; //yada inhabitants/=2;
		      System.out.println("Day " + day++ + "[" + inhabitants + "]" + "\n---- EXTINCT ----" );
	}
	    
	   
//		for (int i=0; i < inhabitants; i++) {
	    //burda niye toplama yaptin anlamadim sonra ikiye bolmussun biz sadece yariya indirmek istyoruz deger
//			inhabitants = inhabitants/2;
	    
	    //								yukarda zaten degeri yariladigimiz icin burda tekrardan islem yapmamiza gerek yok
//		      System.out.println("Day " + day++ + "[" + inhabitants/2 + "]" + "\n---- EXTINCT ----" );
//	}

}
}