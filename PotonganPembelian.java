import java.util.Scanner;

public class PotonganPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pembelian: Rp. ");
        double totalPembelian = input.nextDouble();

        double potongan = 0;

        if (totalPembelian < 50000) {
            potongan = 0.05 * totalPembelian;
        } else {
            potongan = 0.20 * totalPembelian;
        }

        double jumlahBayar = totalPembelian - potongan;

        System.out.println("Total pembelian: Rp. " + totalPembelian);
        System.out.println("Besarnya potongan: Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan: Rp. " + jumlahBayar);
    }
}
