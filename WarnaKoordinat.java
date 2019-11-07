/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan54_koordinat;

/**
 *
 * @author syhar
 */
public class WarnaKoordinat extends Koordinat{
    
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna){
        this.namaWarna = namaWarna;
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
    
    
}
