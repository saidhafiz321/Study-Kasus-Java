import java.util.Scanner;
//Implementasi OOP
// Definisi class PersegiPanjang
class PersegiPanjang {
    int luas(int panjang, int lebar) {
        return panjang * lebar;
    }

    int keliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }
}

// Definisi class SegitigaSiku
class SegitigaSiku {
    double luas(int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }

    double keliling(int alas, int tinggi) {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}

// Definisi class Lingkaran
class Lingkaran {
    double luas(int jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    double keliling(int jariJari) {
        return 2 * Math.PI * jariJari;
    }
}

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang opersegi = new PersegiPanjang();
        SegitigaSiku osegitiga = new SegitigaSiku();
        Lingkaran olingkaran = new Lingkaran();
        int s1, s2, r;

        mainMenu();

        switch (pilihan) {
            case '1':
                System.out.print("Masukkan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1, s2));
                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1, s2));
                break;

            case '2':
                System.out.print("Masukkan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + osegitiga.luas(s1, s2));
                System.out.println("Keliling segitiga: " + osegitiga.keliling(s1, s2));
                break;

            case '3':
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));
                break;

            default:
                System.out.println("Tidak ada pilihan yang valid.");
        }
    }

    private static void mainMenu() {
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
