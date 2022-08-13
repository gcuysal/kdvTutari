import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int price;

        Scanner value = new Scanner(System.in);

        System.out.print("Ürünün fiyatını giriniz: ");
        price = value.nextInt();

        int taxedPrice = (int) (price + price*0.18);
        System.out.println("KDV dahil fiyat: " + taxedPrice);

        System.out.println("Vergi tutarı: " + (taxedPrice - price));
    }
}
