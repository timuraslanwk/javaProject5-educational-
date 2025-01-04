package task01;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_Task {
    public static void main(String[] args) {

        Scanner scnInt = new Scanner(System.in);
        Scanner scnStr = new Scanner(System.in);

        ArrayList<String> kitapAdlari = new ArrayList<>();
        ArrayList<String> yazarAdlari = new ArrayList<>();

        int secim;



        do {

            System.out.println("\n 1-Kitapları görüntüle.\n 2-Kitap ekle. \n 3-Kitap sil. \n 4-Çıkış.");
            System.out.print("Seçiminizi yapınız(1-4): ");
            secim = scnInt.nextInt();


            switch (secim) {
                case 1:
                    if (kitapAdlari.isEmpty()) {
                        System.out.println("\n Kütüphaneniz boş.");
                    } else for (int i = 0; i < kitapAdlari.size(); i++) {
                        System.out.println(kitapAdlari.get(i) + ": " + yazarAdlari.get(i));
                    } break;
                case 2:
                    System.out.print("\nKitabın adı: ");
                    String kitapAdi = scnStr.nextLine();
                    System.out.print("Kitabın yazarı: ");
                    String yazarAdi = scnStr.nextLine();

                    kitapAdlari.add(kitapAdi);
                    yazarAdlari.add(yazarAdi);
                    break;

                case 3:
                    System.out.print("Silmek istediğiniz kitabın adını yazınız: ");
                    String silinecekKitap = scnStr.nextLine();

                    boolean bulunduMu = false;

                    for (int i = 0; i < kitapAdlari.size(); i++) {
                        if (kitapAdlari.get(i).equalsIgnoreCase(silinecekKitap)) {
                            kitapAdlari.remove(i);
                            bulunduMu = true;
                            break;
                        }
                    }

                    if (bulunduMu) {
                        System.out.println(silinecekKitap + " kütüphanenizden kaldırılmıştır.\n");
                    } else System.out.println("Girmiş olduğunuz kitap kütüphanede bulunmamaktadır.\n");
                    break;

                default:
                    System.out.println("Geçerli bir seçim yapınız.");

            }

        }while (secim!=4);
        System.out.println("\nProgram sonlandırılmıştır...");

    }
}
