/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bidang.Persegi;
import ruang.Balok;
/**
 *
 * @author Acer
 */
public class View extends JFrame implements ActionListener {
     JLabel judul            = new JLabel("KALKULATOR BALOK");
     JLabel hasil            = new JLabel("Hasil :");
     JTextField fpanjang     = new JTextField(10);
     JLabel lpanjang         = new JLabel("Panjang");
     JTextField flebar       = new JTextField(10);
     JLabel llebar           = new JLabel("Lebar");
     JTextField ftinggi      = new JTextField(10);
     JLabel ltinggi          = new JLabel("Tinggi ");
     JLabel lluasPersegi     = new JLabel (" Luas Persegi          :");
     JLabel lkelilingPersegi = new JLabel (" Keliling Persegi      :");
     JLabel lvolumeBalok     = new JLabel (" Volume Balok          :");
     JLabel lluasBalok       = new JLabel (" Luas Permukaan Balok  :"); 
     JLabel lhasilLP         = new JLabel ();    
     JLabel lhasilKP         = new JLabel ();
     JLabel lhasilVB         = new JLabel ();    
     JLabel lhasilLB         = new JLabel ();
     JButton bReset          = new JButton("Reset");
     JButton bHitung         = new JButton("Hitung");

     public View(){
         setTitle ("Kalkulator Balok");
         setSize(500,500);
         
         setLayout(null);
         add(judul);
         add(lpanjang);
         add(fpanjang);
         add(llebar);
         add(flebar);
         add(ltinggi);
         add(ftinggi);
         add(hasil);
         add(bHitung);
         add(bReset);
         
         
         judul.setBounds(170, 10, 150, 20);
         lpanjang.setBounds(80, 50, 170, 20);
         fpanjang.setBounds(200, 50, 150, 20);
         llebar.setBounds(80, 110, 150, 20);
         flebar.setBounds(200, 110, 150, 20);
         ltinggi.setBounds(80, 170, 150, 20);
         ftinggi.setBounds(200, 170, 150, 20);
         hasil.setBounds(200, 230, 150, 20);
         lhasilLP.setBounds(80, 270, 250, 20);
         lhasilKP.setBounds(80, 300, 250, 20);
         lhasilVB.setBounds(80, 330, 250, 20);
         lhasilLB.setBounds(80, 360, 250, 20);
         bHitung.setBounds(120, 400, 100, 20);
         bReset.setBounds(240, 400, 100, 20);
         
         setVisible(true);
         bHitung.addActionListener(this); 
         bReset.addActionListener(this);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
     }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bHitung) {
             
            if(getFpanjang().equals("")|| getFlebar().equals("")|| getFtinggi().equals("")){
            JOptionPane.showMessageDialog(null,"  Terdapat Field Kosong!");
        }
        else {
                try{
                 double panjang = Double.parseDouble(getFpanjang());
                 double lebar = Double.parseDouble(getFlebar());
                 double tinggi = Double.parseDouble(getFtinggi());
             
                 Balok balok    = new Balok(tinggi, panjang, lebar);
                 add(lluasPersegi);
                 add(lkelilingPersegi);
                 add(lvolumeBalok);
                 add(lluasBalok);
                 add(lhasilLP);
                 add(lhasilKP);
                 add(lhasilVB);
                 add(lhasilLB);
                 
                String hasilLP = String.valueOf(balok.luas());
                String hasilKP = String.valueOf(balok.keliling());
                String hasilVB = String.valueOf(balok.volume());
                String hasilLB = String.valueOf(balok.luasPermukaan());
                
                lhasilLP.setText("Luas Persegi                       : " + hasilLP);
                lhasilKP.setText("Keliling Persegi                  : " + hasilKP);
                lhasilVB.setText("Volume Balok                      : " + hasilVB);
                lhasilLB.setText("Luas Permukaan Balok      : " + hasilLB);
            
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"        Kesalahan Input!");
                 }
             }
        
         }
          if (e.getSource() == bReset) {
              fpanjang.setText("");
              flebar.setText("");
              ftinggi.setText("");
              lluasPersegi.setText("");
              lkelilingPersegi.setText("");
              lluasBalok.setText("");
              lvolumeBalok.setText("");
              lhasilLP.setText("");
              lhasilKP.setText("");
              lhasilLB.setText("");
              lhasilVB.setText("");
              
          }
          
    }
    
    public String getFpanjang() {
        return fpanjang.getText();
    }

    public String getFlebar() {
        return flebar.getText();
    }

    public String getFtinggi() {
        return ftinggi.getText();
    }
    
}
