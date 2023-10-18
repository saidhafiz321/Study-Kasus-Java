 
import java.util.Scanner;
 //Implementasi If
public class Suhu {
    public static void main(String[] args) {
        /* contoh pemakaian IF tiga kasus : wujud air */
  
        int T;
 
        /*Program*/
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Suhu (der. C) = ");
 
        //scanner untuk masukan suhu air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); //masukan suhu air dengan tipe int
 
        //proses pengecekan dengan if
        if (T < 0) {
            System.out.println("Wujud air beku " + T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Wujud air cair " + T);
        } else if (T > 100) {
            System.out.println("Wujud air uap/gas " + T);
        }
        
    }
}