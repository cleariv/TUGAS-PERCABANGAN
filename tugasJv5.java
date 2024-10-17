// SOAL: berapa rupiah yang harus anda bayar, jika harga jeruk: 
// kalo beli 1 buah harganya 3000
// kalo beli 2 buah harganya 5000
// kalo beli 5 harganya 10000

package tugasPercabangan;
import java.util.Scanner;

public class tugasJv5 {
    public static void main(String[] args) {
        
     Scanner jv = new Scanner(System.in);
     System.out.println("jumlah jeruk: " );
     
     int jumlah = jv.nextInt();
     int totalCost = 0;

     System.out.println("jeruk yg di input: " + jumlah);

     totalCost += (jumlah / 5) * 10000;
     jumlah %= 5; 
     
     totalCost += (jumlah / 2) * 5000;
     jumlah %= 2; 

     totalCost += jumlah * 3000;

     System.out.println("Total Cost: " + totalCost);
        jv.close();
    } 
}

// OUTPUT:                   
// jumlah jeruk: 
// 1
// jeruk yg di input: 1
// Total Cost: 3000

// OUTPUT: 
// jumlah jeruk: 
// 2
// jeruk yg di input: 2
// Total Cost: 5000

// OUTPUT: 
// 5
// jeruk yg di input: 5
// Total Cost: 10000