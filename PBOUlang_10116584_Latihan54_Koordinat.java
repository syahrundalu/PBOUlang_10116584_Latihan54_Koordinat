/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan54_koordinat;

/**
 *
 * @author
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan54_Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int x = 10;
        int y = 4;
        String warna = "Jingga";
        
        WarnaKoordinat j = new WarnaKoordinat(x, y, warna);
        
        j.setNamaWarna(warna);
        j.setX(x);
        j.setY(y);
        
        System.out.println("Warna Koodinat : "+j.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+j.getX()+", y : "+j.getY());
        
    
    }
    
}
