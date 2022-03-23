import java.util.Scanner;
// contoh membaca integer menggunakan Class Scanner

public class BacaData{
    public static void main (String[] args){
        int a;
        Scanner masukan;
        //program
        System.out.print("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan=new Scanner(System.in);
        a=masukan.nextInt();
        System.out.print("Nilai yang dibaca : "+a);
        
    }
}