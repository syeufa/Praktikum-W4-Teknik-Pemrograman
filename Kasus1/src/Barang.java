
/** KASUS 1 - PRAKTIKUM W4 TEKNIK PEMROGRAMAN
 * Class Barang berfungsi untuk mendefiniskan struktur data yang diperlukan  
 * oleh Objek Barang
 * 
 * Author: SYIFA KHAIRINA - 211524063
 * Tanggal: 26 FEBRUARI 2022
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    //class constructor
    public Barang(String kode, String nama, int stok) {
        kode_barang = kode;
        nama_barang = nama;
        this.stok = stok;
    }
    
    public void setStok(int stok){
    this.stok = stok;
    }
    //acessor untuk dapat mengakses nilai stok yang private
    public int getStok(){
      return this.stok; 
    }
    
    // method untuk menambah stock
    public void addStok(int tambahanStok){
       stok = stok += tambahanStok;
    }
    
}
