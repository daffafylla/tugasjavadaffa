import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MenuApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Login System
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        System.out.print("Pin: ");
        String pin = sc.nextLine();

        if (!nama.equals("Administrator") || password.length() <=5 || !pin.equals("123456789")) {
            System.out.println("Login gagal! Silakan coba lagi.");
            return;
        }

        System.out.println("===Silahkan Pilih Menu===");
        while (true) {
            System.out.println("1. Bangun Ruang/Datar\n2. Konversi\n3. Secret Menu\n4. Exit");
            System.out.print("Pilihan: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    bangunRuangDatar(sc);
                    break;
                case 2:
                    konversi(sc);
                    break;
                case 3:
                    secretMenu(sc);
                    break;
                case 4:
                    System.out.println("Terima kasih Anda telah mengunjungi program kami!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void bangunRuangDatar(Scanner sc) {
        while (true) {
            System.out.println("<==Bangun Ruang Datar==>");
            System.out.println("1. Luas (Meter Kuadrat)\n2. Volume (Liter)\n3. Exit");
            System.out.print("Pilihan: ");
            int submenu = sc.nextInt();

            switch (submenu) {
                case 1:
                    System.out.println ("1. Persegi Panjang\n2. Persegi\n3. Segitiga\n4. Lingkaran\n5. Exit");
                    System.out.print("Pilihan: ");
                    int luasMenu = sc.nextInt();
                    hitungLuas(sc, luasMenu);
                    break;
                case 2:
                    System.out.println("1. Balok\n2. Kubus\n3. Bola\n4. Exit");
                    System.out.print("Pilihan: ");
                    int volumeMenu = sc.nextInt();
                    hitungVolume(sc, volumeMenu);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void hitungLuas(Scanner sc, int pilihan) {
        switch (pilihan) {
            case 1: // Persegi Panjang
                System.out.print("Masukkan panjang: ");
                double panjang = sc.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = sc.nextDouble();
                System.out.println("Luas Persegi Panjang: " + (panjang * lebar));
                break;
            case 2: // Persegi
                System.out.print("Masukkan sisi: ");
                double sisi = sc.nextDouble();
                System.out.println("Luas Persegi: " + (sisi * sisi));
                break;
            case 3: // Segitiga
                System.out.print("Masukkan alas: ");
                double alas = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = sc.nextDouble();
                System.out.println("Luas Segitiga: " + (0.5 * alas * tinggi));
                break;
            case 4: // Lingkaran
                System.out.print("Masukkan jari-jari: ");
                double radius = sc.nextDouble();
                System.out.println("Luas Lingkaran: " + (Math.PI * radius * radius));
                break;
            case 5:
                return;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    public static void hitungVolume(Scanner sc, int pilihan) {
        switch (pilihan) {
            case 1: // Balok
                System.out.print("Masukkan panjang: ");
                double panjang = sc.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = sc.nextDouble();
                System.out.println("Volume Balok: " + (panjang * lebar * tinggi));
                break;
            case 2: // Kubus
                System.out.print("Masukkan sisi: ");
                double sisi = sc.nextDouble();
                System.out.println("Volume Kubus: " + (Math.pow(sisi, 3)));
                break;
            case 3: // Bola
                System.out.print("Masukkan jari-jari: ");
                double radius = sc.nextDouble();
                System.out.println("Volume Bola: " + ((4 / 3.0) * Math.PI * Math.pow(radius, 3)));
                break;
            case 4:
                return;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    public static void konversi(Scanner sc) {
        while (true) {
            System.out.println("Pilih Menu di bawah ini:");
            System.out.println("1. Derajat\n2. Panjang (meter)\n3. Berat (gram)\n4. Exit");
            System.out.print("Pilihan: ");
            int konversiMenu = sc.nextInt();

            switch (konversiMenu) {
                case 1:
                    konversiDerajat(sc);
                    break;
                case 2:
                    konversiPanjang(sc);
                    break;
                case 3:
                    konversiBerat(sc);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void konversiDerajat(Scanner sc) {
        while (true) {
            System.out.println("Derajat:");
            System.out.println("1. Celcius\n2. Farenhait\n3. Reamur\n4. Exit");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan suhu dalam Celcius: ");
                    double celcius = sc.nextDouble();
                    System.out.println("1. Celcius ke Farenhait: " + (celcius * 9 / 5 + 32));
                    System.out.println("2. Celcius ke Reamur: " + (celcius * 4 / 5));
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void konversiPanjang(Scanner scanner) {
        System.out.println("Panjang");
        System.out.println("Silahkan Pilih :");
        System.out.println(" 1. Kilometer\n 2. Hektometer\n 3. Dekameter\n 4. Desimeter\n 5. Sentimeter\n 6. Milimeter\n 7. Exit");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();
        System.out.print("Masukkan nilai dalam meter: ");
        double meter = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Hasil: " + (meter / 1000) + " km");
                break;
            case 2:
                System.out.println("Hasil: " + (meter / 100) + " hm");
                break;
            case 3:
                System.out.println("Hasil: " + (meter / 10) + " dam");
                break;
            case 4:
                System.out.println("Hasil: " + (meter * 10) + " dm");
                break;
            case 5:
                System.out.println("Hasil: " + (meter * 100) + " cm");
                break;
            case 6:
                System.out.println("Hasil: " + (meter * 1000) + " mm");
                break;
            case 7:
                System.out.println("Keluar dari konversi panjang");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    public static void konversiBerat(Scanner scanner) {
        System.out.println("Berat");
        System.out.println("Silahkan Pilih :");
        System.out.println(" 1. Kilogram\n 2. Hektogram\n 3. Dekagram\n 4. Desigram\n 5. Centigram\n 6. Milligram\n 7. Exit");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();
        System.out.print("Masukkan nilai dalam gram: ");
        double gram = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Hasil: " + (gram / 1000) + " kg");
                break;
            case 2:
                System.out.println("Hasil: " + (gram / 100) + " hg");
                break;
            case 3:
                System.out.println("Hasil: " + (gram / 10) + " dag");
                break;
            case 4:
                System.out.println("Hasil: " + (gram * 10) + " dg");
                break;
            case 5:
                System.out.println("Hasil: " + (gram * 100) + " cg");
                break;
            case 6:
                System.out.println("Hasil: " + (gram * 1000) + " mg");
                break;
            case 7:
                System.out.println("Keluar dari konversi berat");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
            }
        }
    public static void secretMenu(Scanner sc) {
        System.out.print("Masukkan kode unik (1-10): ");
        int kode = sc.nextInt();

        if (kode == 7) { // Kode unik VIP
            System.out.println("Selamat Datang VIP!!");
            while (true) {
                System.out.println("Silahkan Pilih Menu Rahasia");
                System.out.println("1. Uppercase\n2. Lowercase\n3. Reverse\n4. Exit");
                System.out.print("Pilihan: ");
                int secretMenu = sc.nextInt();

                switch (secretMenu) {
                    case 1:
                        sc.nextLine(); // Clear buffer
                        System.out.print("Masukkan teks: ");
                        String teks = sc.nextLine();
                        System.out.println("Uppercase: " + teks.toUpperCase());
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("Masukkan teks: ");
                        teks = sc.nextLine();
                        System.out.println("Lowercase: " + teks.toLowerCase());
                        break;
                        case 3:
                                        System.out.println("Reverse \n Merubah Susunan Huruf menjadi Terbalik");
                                        sc.nextLine();
                                        String dataInput;
                                        System.out.println("Masukkan Data : ");
                                        dataInput = sc.nextLine();
                                        System.out.println("Hasil : ");
                                        List<String> unik = Arrays.asList(dataInput.split(" "));
                                        Collections.reverse(unik);
                                        System.out.println(
                                                String.join(" ", unik));
                                        break;
                        
                    
                    case 4:
                        return;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            }
        } else {
            System.out.println("Kode unik salah!");
        }
    }
}
