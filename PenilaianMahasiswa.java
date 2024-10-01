import java.util.Scanner;

public class PenilaianMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM: ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = input.nextLine();

        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);

        String grade;
        String keterangan;

        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else {
            grade = "A";
            keterangan = "ISTIMEWA";
        }

   System.out.println("\n--- Tampilan Output ---");
        System.out.println("NPM: " + npm);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
