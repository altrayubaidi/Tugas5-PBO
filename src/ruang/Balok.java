/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

import bidang.Persegi;
/**
 *
 * @author Acer
 */
public class Balok extends Persegi implements MenghitungRuang {
    private double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public Balok(){
        super();
        tinggi = 0;
    }
    
    @Override
    public double volume(){
        return super.luas()*tinggi;
    }
    
    @Override
    public double luasPermukaan(){
        return 2*super.luas() + 2*super.getLebar()*tinggi +2*super.getPanjang()*tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
