//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022
import java.util.Scanner;
public class Program{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;

		System.out.print("Masukkan Nilai yang ingin Dikonversi ke waktu : ");
		totalDetik = input.nextInt();

		detikSekarang=totalDetik%60;
		totalMenit=totalDetik/60;
		menitSekarang=totalMenit%60;
		totalJam=totalMenit/60;
		jamSekarang = totalJam%24;

		System.out.println("konversi dari nilai : "+ totalDetik + " ke waktu, adalah : ");
		System.out.println("("+jamSekarang+":"+menitSekarang+":"+detikSekarang+")");	
	}
}