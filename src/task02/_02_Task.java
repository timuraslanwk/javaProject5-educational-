package task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secim;

        do {

            anaMenuyuGoster();
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    sifreEkle();
                    break;
                case 2:
                    sifreGoster();
                    break;
                default:
                    System.out.println("\n Lütfen geçerli bir tuşlama yapınız.\n");
            }
        } while (secim != 3);

        System.out.println("\n Program sonlandırılmıştır...");

    }

    private static void anaMenuyuGoster() {

        System.out.println("Ana Menü");
        System.out.println("1. Şifre Ekle");
        System.out.println("2. Şifre Göster");
        System.out.println("3. Çıkış");
        System.out.print("Seçiminizi yapın: ");

    }

    private static void sifreEkle() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nHesabınızın adını giriniz: ");
        String hesapAdi = scanner.nextLine().toLowerCase();

        System.out.print("Kullanıcı adını giriniz: ");
        String kullaniciAdi = scanner.nextLine().toLowerCase();

        System.out.print("Şifrenizi giriniz: ");
        String sifre = scanner.nextLine();

        Map<String, String> bilgiler = new HashMap<>();
        bilgiler.put(kullaniciAdi, sifre);
        veriDeposu.put(hesapAdi, bilgiler);

        System.out.println("\n Şifreniz kaydedilmiştir. \n");

    }

    private static void sifreGoster() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nHesap adını giriniz: ");
        String hesapAdi = scanner.nextLine().toLowerCase();

        if (veriDeposu.containsKey(hesapAdi)) {
            Map<String, String> kullaniciBilgileri = veriDeposu.get(hesapAdi);

            for (Map.Entry<String, String> giris : kullaniciBilgileri.entrySet()) {
                System.out.println("\nKullanıcı Adı: " + giris.getKey());
                System.out.println("Şifre: " + giris.getValue()+ "\n");
            }
        } else {
            System.out.println("\n Böyle bir kaydınız yoktur.\n");
        }

    }

    private static Map<String, Map<String, String>> veriDeposu = new HashMap<>();


}
