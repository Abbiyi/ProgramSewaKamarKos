
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abbiyi Qobus Syamsid
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        Kost kost = new Kost(5);
        LoginUser loginUser = new LoginUser("abi", "123");
        
        System.out.println("=====Sistem Sewa Kamar Kost=====");
       
    //login
       boolean loggedIn = false;
       while(!loggedIn) {
           System.out.println("\nMenu");
           System.out.println("1. Login");
           System.out.println("2. Register");
           System.out.println("0. Keluar");
           System.out.println("Pilihan anda: ");
           int pilihanLogin = scanner.nextInt();
           scanner.nextLine();
           
           switch(pilihanLogin) {
               case 1:
                   System.out.println("Masukkan nama pengguna: ");
                   String username = scanner.nextLine();
                   System.out.println("Masukkan kata sandi: ");
                   String password = scanner.nextLine();
                   loggedIn = loginUser.login(username, password);
                   break;
               case 2:
                   System.out.println("Masukkan bama pengguna baru: ");
                   String newUsername = scanner.nextLine();
                   System.out.println("Masukkan kata sandi baru: ");
                   String newPassword = scanner.nextLine();
                   loginUser.register(newUsername, newPassword);
                   break;
               case 0:
                   System.out.println("Terima kasih \n===========================");
                   scanner.close();
                   return;
                default:
                    System.out.println("Pilihan tidak valid");
           }
           
           
       }
       int pilihan;
       do{
          System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Kamar");
            System.out.println("2. Sewa Kamar");
            System.out.println("3. Kosongkan Kamar");
            System.out.println("4. Ubah Harga Kamar");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt(); 
            
            switch (pilihan) {
                case 1:
                    kost.tampilkanKamar();
                    break;
                case 2:
                    System.out.println("Masukkan nomor kamar yang ingin disewa");
                      int nomorSewa = scanner.nextInt();
                      kost.sewaKamar(nomorSewa);
                      break;
                case 3:
                    System.out.println("Masukkan nomor kamar yang ingin dikosongkan");
                    int nomorKosong = scanner.nextInt();
                    kost.kosongkanKamar(nomorKosong);
                    break;
                case 4:
                    System.out.println("Masukkan nomor kamar yang ingin diubah harga nya: ");
                    int nomorUbah = scanner.nextInt();
                    System.out.println("Masukkan harga baru: ");
                    double hargaBaru = scanner.nextDouble();
                    kost.setHargaKamar(nomorUbah, hargaBaru);
                    break;
                case 0:
                    System.out.println("\nTerima kasih \n=======================");
                    break;
                 default:
                     System.out.println("Pilihan tidak valid: ");
                               
       }     
    } while (pilihan != 0);

        scanner.close();
    }
}
       
