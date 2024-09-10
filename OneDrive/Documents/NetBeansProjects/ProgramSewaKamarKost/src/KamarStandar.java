/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abbiyi Qobus Syamsid
 */
public class KamarStandar extends TempatKost{
    @Override
    public double hitungOngkos() {
      return biaya;
    }
    
    public KamarStandar(int nomor, double biaya) {
        super(nomor, biaya);
    }

    


    
}
