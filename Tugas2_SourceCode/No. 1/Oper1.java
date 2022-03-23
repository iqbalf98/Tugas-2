//NIM          : 13020200004
//Nama         : M. Iqbal Firmansyah
//Hari/Tanggal : Senin, 21 Maret 2022

//pemakaian beberapa operator terhadap bit
public class Oper1{
    public static void main(String[] args){
        //kamus
        int n = 10; /* 1010 */
        int x = 1; /* 1 */
        int y = 2; /* 10 */

        //program
        System.out.println ("n = "+ n);
        System.out.println ("x = "+ x);
        System.out.println ("y = "+ y);
        System.out.println ("n & 8 = "+ (n & 8)); //1010 AND 1000 //0111
        System.out.println ("y << 2 = "+ (y << 2)); /* 10 ==>1000 = 8 */
        System.out.println ("y >> 3 = "+ (y >>3)); /* 10 ==>0000 = 0 */
    }
}