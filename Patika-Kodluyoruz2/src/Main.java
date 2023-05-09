/*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18
tutar 1000 TL'den büyük ise
 KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final double KDV_ORANI_YUZDE_18 = 0.18;
        final double KDV_ORANI_YUZDE_8 = 0.08;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen para değerini girin: ");
        double para = scanner.nextDouble();

        double kdvTutari = para * (para > 1000 ? KDV_ORANI_YUZDE_8 : KDV_ORANI_YUZDE_18);
        double kdvliFiyat = para + kdvTutari;
        double kdvSizFiyat = kdvliFiyat - kdvTutari;

        System.out.println("KDV oranı: %" + ((para > 1000) ? 8 : 18));
        System.out.println("KDV'siz fiyat: " + kdvSizFiyat);
        System.out.println("KDV'li fiyat: " + kdvliFiyat);
        System.out.println("KDV tutarı: " + kdvTutari);
    }

}



