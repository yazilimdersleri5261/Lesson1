import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        int birinciNot;
	        int ikinciNot;
	        float ortalama;
	        //test
	        String ilkMesaj = "Hoşgeldiz.";
	        String birinciNotMesaji = "Lütfen 1. notunuzu giriniz : ";
	        String ikinciNotMesaji = "Lütfen 2. notunuzu giriniz : ";
	        String ortalamaMesaji = "Ortalamanız = ";
	        
	        System.out.println(ilkMesaj);
	        System.out.println("Merhaba Dünya!");
	        
	        System.out.println(birinciNotMesaji);
	        birinciNot = scan.nextInt();
	        
	        System.out.println(ikinciNotMesaji);
	        ikinciNot = scan.nextInt();
	        
	        ortalama = (birinciNot + ikinciNot) / 2 ;
	        System.out.println(ortalamaMesaji + ortalama);
	}

}
