import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz : ");
        int d = inp.nextInt();

        System.out.println(d<5   ? "Kayak Yapabilirsin"    :
                           d<10 ? "Sinemaya Gidebilirsin"   :
                           d<=15 && d>=10 ? "Sinemaya Gidebilirsin \nPiknik Yapabilirsin"  :
                           d<=25 ? "Piknik Yapabilirsin"   : "Yüzmeye Gidebilirsin");
    }
}
