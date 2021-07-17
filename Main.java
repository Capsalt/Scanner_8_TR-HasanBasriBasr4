import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
	
	int sayi = scan.nextInt();
	
	if (100<=sayi && sayi<=999){
		
		int birler = sayi%10;
		int onlar = (sayi/10) %10;
		int yuzler = sayi/100;
		
		System.out.println("Verilen tamsayının rakamları toplamı " + (birler + onlar + yuzler) + "'dur.");
		
	}else {
		System.out.println("Girilen sayı 3 basamaklı değil");
	}
 
   }
}