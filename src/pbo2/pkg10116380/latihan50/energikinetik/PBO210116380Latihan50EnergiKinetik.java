/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan50.energikinetik;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang Menghitung jumlah energi kinetik
 */
public class PBO210116380Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BaseBall ball = new BaseBall();
        ball.setMassa(145);
        ball.setKecepatan(25);
        System.out.println("sebuah bola baseball dengan massa = " + ball.getMassa() + " g");
        System.out.println("baseball dilempar dengan kecepatan = " + ball.getKecepatan() + " m/s");
        
        double massa = ball.getMassa();
        double kecepatan = ball.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + ball.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + ball.usaha());
        System.out.println("Catatan : Nilai usaha tetap, karena dimulai dari keadaan diam");
        
    }
    
}
