/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abbiyi Qobus Syamsid
 */
public class Kost {
    private TempatKost[] kamar;

    public Kost(int jumlahKamar) {
        kamar = new TempatKost[jumlahKamar];
        for (int i = 0; i < jumlahKamar; i++) {
            if (i % 3 == 0) {
                kamar[i] = new KamarStandar(i + 1, 100.0); 
            } else if (i % 3 == 1) {
                kamar[i] = new KamarElite(i + 1, 150.0); 
            } else {
                kamar[i] = new KamarPremium(i + 1, 200.0); 
            }
        }
        
    }
    
public void setHargaKamar(int nomorKamar, double hargaBaru) {
   if (nomorKamar >= 1 && nomorKamar <= kamar.length) {
       kamar[nomorKamar - 1].setBiaya(hargaBaru);
       System.out.println("Harga kamar nomor" + nomorKamar + "berhasil diubah menjadi" + hargaBaru);
   } else {
       System.out.println("Nomor kamar salah");
   }
}

public void tampilkanKamar() {
    for(TempatKost k : kamar) {
        String jenisKamar = "";
        if(k instanceof KamarStandar) {
            jenisKamar = "Standar";
        } else if(k instanceof KamarElite) {
            jenisKamar = "Elite";
        } else if (k instanceof KamarPremium) {
            jenisKamar = "Premium";
        }
        System.out.println("Nomor kamar " + k.getNomor() + ",tipe " + jenisKamar + " Harga " +k.getBiaya() + " Tersedia: " + k.isTersedia());
    }
        
    }



public void sewaKamar(int nomorKamar) {
        if (nomorKamar >= 1 && nomorKamar <= kamar.length) {
            TempatKost kamarTersewa = kamar[nomorKamar - 1];
            if (kamarTersewa.isTersedia()) {
                kamarTersewa.setTersedia(false);
                System.out.println("\nKamar nomor " + nomorKamar + " berhasil disewa.");
                System.out.println("Harga sewa kamar: " + kamarTersewa.getBiaya() + "\nTerimakasih telah menyewa");
            } else {
                System.out.println("Kamar nomor " + nomorKamar + " sudah tidak tersedia.");
            }
        } else {
            System.out.println("Nomor kamar tidak valid.");
        }
    }

public void kosongkanKamar(int nomorKamar) {
  if(nomorKamar >= 1 && nomorKamar <= kamar.length) {  
      if (!kamar[nomorKamar - 1].isTersedia()) {
      kamar[nomorKamar - 1].setTersedia(true);
      System.out.println("Kamar nomor" + nomorKamar + "berhasil dikosongkan");
  } else {
          System.out.println("Kamar nomor" + nomorKamar + "sudah kosong");
      }
} else {
      System.out.println("Nomor kamar tidak valid");
  }
    
}
}
