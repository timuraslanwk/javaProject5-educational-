package task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _03_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENÜ ---");
            System.out.println("1. Eleman Ekle");
            System.out.println("2. En Üst Indexli Elemanı Kaldır");
            System.out.println("3. En Üst Indexli Elemanı Görüntüle");
            System.out.println("4. Elemanları Sırala");
            System.out.println("5. Elemanları Ters Çevir");
            System.out.println("6. Dizideki Eleman Sayısı");
            System.out.println("7. Belirli Bir Elemanın Sayısı");
            System.out.println("8. Belirli Bir Elemanın İndeksleri");
            System.out.println("9. Dizinin Kopyasını Al");
            System.out.println("10. Belirli Bir Elemanı Kaldır");
            System.out.println("11. Belirli Bir Aralıktaki Elemanları Filtrele");
            System.out.println("12. Güncel Elemanları Listele");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Eklemek istediğiniz elemanı girin: ");
                    dizi.add(scanner.next());
                    break;

                case 2:

                    if (!dizi.isEmpty()) {
                        dizi.remove(dizi.size() - 1);
                        System.out.println("En üst eleman kaldırıldı.");
                    } else {
                        System.out.println("Yığın boş.");
                    }
                    break;

                case 3:

                    if (!dizi.isEmpty()) {
                        System.out.println("En üst eleman: " + dizi.get((dizi.size()) - 1));
                    } else System.out.println("Yığın Boş.");
                    break;

                case 4:

                    Collections.sort(dizi);
                    System.out.println("Elemanlar sıralandı.");
                    break;

                case 5:

                    Collections.reverse(dizi);
                    System.out.println("Elemanların sırası tersine çevrildi.");
                    break;

                case 6:

                    System.out.println("Dizideki eleman sayısı= " + dizi.size());
                    break;

                case 7:
                    System.out.print("Sayısını öğrenmek istediğiniz elemanı giriniz: ");
                    String istenilenOge = scanner.nextLine();
                    int sayac = 0;

                    if (dizi.contains(istenilenOge)) {
                        for (int i = 0; i < dizi.size(); i++) {

                            if (dizi.get(i).equals(istenilenOge)) {
                                sayac++;
                            }
                        }

                        System.out.println(istenilenOge + " dizideki sayısı= " + sayac);

                    } else System.out.println("Böyle bir öge dizide mevcut değil.");
                    break;

                case 8:

                    System.out.print("Öğrenmek istediğiniz elemanı giriniz: ");
                    String istenilenOgeler = scanner.nextLine();

                    if (dizi.contains(istenilenOgeler)) {

                        boolean bulunduMu = false;

                        for (int i = 0; i < dizi.size(); i++) {

                            if (dizi.get(i).equals(istenilenOgeler)) {
                                System.out.print("\n" + i + ", ");
                                bulunduMu = true;
                            }

                        }
                    } else System.out.println("Böyle bir eleman dizide bulunmuyor.");
                    break;

                case 9:

                    ArrayList<String> kopyaDizi = new ArrayList<>(dizi);
                    System.out.println("Dizinin kopyası: " + kopyaDizi);
                    break;

                case 10:

                    System.out.print("Kaldırmak istediğiniz elemanı giriniz: ");
                    String kaldirilacakEleman = scanner.nextLine();

                    if (dizi.contains(kaldirilacakEleman)) {

                        dizi.remove(kaldirilacakEleman);
                        System.out.println(kaldirilacakEleman + " elemanı kaldırıldı.");

                    } else System.out.println("Böyle bir eleman dizide yer almıyor.");
                    break;

                case 11:
                    System.out.print("Filtrelemek istediğiniz giriş değerini veriniz= ");
                    String baslangicDegeri = scanner.nextLine();
                    System.out.print("Bitiş değerini giriniz= ");
                    String bitisDegeri = scanner.nextLine();


                    ArrayList<String> filtrelenmisListe = new ArrayList<>();

                    for (int i = Integer.parseInt(baslangicDegeri); i <= Integer.parseInt(bitisDegeri); i++) {

                        if ((Integer.parseInt(baslangicDegeri) >= 0 && (Integer.parseInt(bitisDegeri)) <= dizi.size())) {

                            if ((Integer.parseInt(baslangicDegeri)) < Integer.parseInt(bitisDegeri)) {
                                filtrelenmisListe.add(dizi.get(i));
                            }
                        }
                    }

                    if (filtrelenmisListe.isEmpty()) {
                        System.out.println("Verilen aralıkta öğe bulunamadı.");
                    } else System.out.println("Filtelenmiş liste: " + filtrelenmisListe);
                    break;

                case 12:

                    listCurrentElements();
                    break;

                case 0:

                    exit = true;
                    System.out.println("Programdan çıkılıyor.");
                    break;

                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                    break;

            }

            if (choice != 12)
                listCurrentElements();

        }
    }

    private static void listCurrentElements() {
        System.out.println("Güncel Elemanlar: " + dizi);

    }

    private static ArrayList<String> dizi = new ArrayList<>();
}
