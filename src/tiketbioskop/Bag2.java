/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketbioskop;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Bag2 {
    static Scanner I = new Scanner(System.in);//Scanner
    static int pilB;            //
    static int totalPrice1=0;   //
    static int totalPrice2=0;   //Deklarasi variabel static
    static int totalPrice3=0;   //
    static int b;               //
        
    static void daftar(){//method static yang berisi perulangan untuk menampilkan daftar film
        System.out.println("<<<<Selamat datang di Golden theater>>>>\n");
        System.out.println("=>>Daftaar harga");
        String[] film = {"","The captain 2019","Black Window","The conjuring 3"};
        int [] harga ={0,30000,25000,35000};
        for (int i=1;i<harga.length;i++){
            System.out.println(i+" . "+film[i]+"\t: "+harga[i]);
        }
    }
    
    static void pilihan(){//method static yang berisi inputan pilihan user dan percabangan
        System.out.print("\nMasukkan jumlah tiket => ");
        b = I.nextInt();
        System.out.print("Masukkan pilihan anda => ");
        pilB = I.nextInt();
        
        switch(pilB){
            case 1:
                totalPrice1 += b*30000;
                System.out.println("Film Pilihan anda\t: The captain 2019");
                System.out.println("Uang yang harus dibayar\t: "+totalPrice1);
                //System.out.println("\nMasukkan uang anda");
                break;
            case 2:
                totalPrice2 += b*25000;
                System.out.println("Film Pilihan anda\t: Black window");
                System.out.println("Uang yang harus dibayar\t: "+totalPrice2);
                break;
            case 3:
                totalPrice3 += b*35000;
                System.out.println("Film Pilihan anda\t: The conjuring 3");
                System.out.println("Uang yang harus dibayar\t: "+totalPrice3);
            default:
                System.out.println("Tidak Tersedia");
        }
    }
    
    static void bayar(){//method static yang digunakan untuk proses pembayaran
        System.out.println("\n====PROSES PEMBAYARAN===");
        if (pilB == 1){
            System.out.print("Masukkan uang anda >> ");
            int byr = I.nextInt();
            if(byr>totalPrice1){
                System.out.println("Kembalian anda = "+ (byr - totalPrice1)+"\nTerima Kasih\nSilakan tunggu jam tayang");
            }else if(byr==totalPrice1){
                System.out.println("Uang Anda Pas \nTerima Kasih\nSilakan tunggu jam tayang");
            }else{
                System.out.println("Mohon maaf uang anda kurang "+ (totalPrice1-byr));
            }
        }else if(pilB == 2){
            System.out.print("Masukkan uang anda >> ");
            int byr = I.nextInt();
            if(byr>totalPrice2){
                System.out.println("Kembalian anda = "+ (byr - totalPrice2)+"\nTerima Kasih\nSilakan tunggu jam tayang");
            }else if(byr==totalPrice2){
                System.out.println("Uang Anda Pas \nTerima Kasih\nSilakan tunggu jam tayang");
            }else{
                System.out.println("Mohon maaf uang anda kurang "+ (totalPrice2-byr));
            }
        }else if(pilB == 3){
            System.out.print("Masukkan uang anda >> ");
            int byr = I.nextInt();
            if(byr>totalPrice3){
                System.out.println("Kembalian anda = "+ (byr - totalPrice3)+"\nTerima Kasih\nSilakan tunggu jam tayang");
            }else if(byr==totalPrice3){
                System.out.println("Uang Anda Pas \nTerima Kasih\nSilakan tunggu jam tayang");
            }else{
                System.out.println("Mohon maaf uang anda kurang "+ (totalPrice3-byr));
            }
        }else{
            System.out.println("ERROR");
        }
    }
}
