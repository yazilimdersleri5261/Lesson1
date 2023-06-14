import java.util.Scanner;

public class Diziler {
	public static void main(String[] args) {
		String kelime1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen kelimeyi giriniz ... ");
		kelime1 = scan.nextLine();
		String[] harfDizisi = kelime1.split("");
		boolean polindrom = true;
		for(int i = 0 ; i <= (harfDizisi.length/2); i++) {
			if(!harfDizisi[i].equals(harfDizisi[harfDizisi.length-1-i])) {
				polindrom = false;
				break;
			}
		}
		if(polindrom) {
			System.out.print("polindrom");
		}else {
			System.out.print("polindrom değil");
		}
	}
}
