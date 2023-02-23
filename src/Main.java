import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("KDV Hesabı için para değeri giriniz: ");
        Scanner oku= new Scanner(System.in);
        int para=oku.nextInt();

        double kdv1=0.18;
        double kdv2=0.08;

        double tutar = 0;

        if (para<=1000 && para>0){
            tutar+=para*kdv1;
        } else if (para>1000) {
            tutar+=para*kdv2;
        }else {
            System.out.println("Hatali bir miktar girdiniz!");
            System.exit(1);
        }

        System.out.println("KDV'li fiyat = "+(para+tutar));
        System.out.println("KDV miktari = "+ tutar);





    }
}