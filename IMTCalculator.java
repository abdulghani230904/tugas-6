import java.util.Scanner;

public class IMTCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (m): ");
        String tinggiBadanInput = input.next(); // Read input as String
        tinggiBadanInput = tinggiBadanInput.replace(",", "."); // Replace comma with period
        double tinggiBadan = Double.parseDouble(tinggiBadanInput); // Convert to double

        double imt = beratBadan / (tinggiBadan * tinggiBadan);

       String kriteria;
        if (imt <= 18.4) {
            kriteria = "Berat Badan Kurang";
        } else if (imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        System.out.println("Nilai IMT: " + imt);
        System.out.println("Kriteria: " + kriteria);
    }
}
