//  TUGAS: BUATLAH PROGRAM UNTUK MENENTUKAN LULUS ATAU TIDAK LULUS DENGAN KRITERIA
//         LULUS JIKA NILAI LEBIH DARI 75.

package tugasPercabangan;

import java.util.Scanner;

public class tugasJv2 {
    public static void main(String[] args) {
        
        int angka;
        String nilai;

        System.out.println("masukna angka: ");
        Scanner masukanNilai = new Scanner(System.in);

        angka = masukanNilai.nextInt();

        if(angka >= 75){
            System.out.println("NILAI ANDA: " + angka + ", ANDA LULUS");
        }

        else{
            System.out.println("NILAI ANDA: " + angka + ", MAKA ANDA TIDAK LULUS!");
        }

        masukanNilai.close();

        // CONTOH OUTPUT: NILAI ANDA: 80, ANDA LULUS
        // CONTOH OUTPUT: NILAI ANDA: 65, MAKA ANDA TIDAK LULUS!
    }
}
