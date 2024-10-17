// SOAL: BUATLAH PROGRAM UNTUK KONVERSI NILAI A, B, C, D, DAN E DENGAN KRITERIA
// A. JIKA NILAI LEBIH DARI 85
// B. JIKA NILAI LEBIH DARI 75 DAN KURANG DARI 85
// C. JIKA NILAI LEBIH DARI 65 DAN KURANG DARI 75
// D. JIKA NILAI LEBIH DARI 55
// SISANYA E



package tugasPercabangan;
import java.util.Scanner;

public class tugasJv3 {
    public static void main(String[] args) {
        
        int nomer;
        String huruf;
        Scanner j = new Scanner(System.in);
        System.out.println("masukan nilai: ");
        nomer = j.nextInt();

        if (nomer >=85) {
            huruf = "A";
        }
        else if (nomer >=75) {
            huruf = "B";
        }
        else if (nomer >= 65) {
            huruf = "C";
        }
        else if (nomer >= 55) {
            huruf = "D";
        }
        else{
            huruf = "E";
        }
        System.out.println("grade: " + huruf);
        j.close();

        // CONTOH OUTPUT: grade: 85 A
                    //    grade: 75 B
    }
}
