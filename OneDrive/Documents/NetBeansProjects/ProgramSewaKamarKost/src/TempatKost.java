/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abbiyi Qobus Syamsid
 */
public abstract class TempatKost implements Pembayaran{
    protected int nomor;
    protected boolean tersedia;
    protected double biaya;
    
    @Override
    public abstract double hitungOngkos();
    
    
    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
    
        public int getNomor() {
        return nomor;
    }

    public double getBiaya() {
        return biaya;
    }

    public TempatKost(int nomor, double biaya) {
        this.nomor = nomor;
        this.tersedia = true;
        this.biaya = biaya;
    }
    
    
}





