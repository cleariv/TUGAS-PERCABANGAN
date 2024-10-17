// SOAL: BUATLAH PROGRAM UNTUK MENGHITUNG PECAHAN UANG (100 RIBUAN, 50 RIBUAN, 20 RIBUAN, 10 RIBUAN, 5 RIBUAN, 2 RIBUAN 1 RIBUAN, 500, 200, DAN 100)

package tugasPercabangan;

import java.util.Scanner;

public class tugasJv4 {
    public static void main(String[] args) {

        int A, B, C, D, E;  
       
        Scanner j = new Scanner(System.in);
        System.out.println("masukan jumlah duit:");

        A = j.nextInt();

        C = A / 75000;
        B = A % 75000;
        if (C > 0) {
            System.out.println(C + " lembar 50 ribuan ");
        }

        D = A / 75000;
        B = A % 75000;
        if (D > 0){
            System.out.println(D + " lembar 20 ribuan ");

        E = A / 75000;
        B = A % 75000;
        if (E > 0) {
            System.out.println(E + " lembar 5  ribuan ");
        }
        else{
            System.out.println("ERROR");
        }   

        // OUTPUT: masukan jumlah duit:
             //    75000
             //    1 lembar 50 ribuan
             //    1 lembar 20 ribuan
             //    1 lembar 5  ribuan  

        }
    }    
}
