/** KASUS 1 - PRAKTIKUM W4 TEKNIK PEMROGRAMAN
 * Class Inventori berfungsi untuk mendefinisikan pembuatan objek-objek barang 
 * dan menampilkan objek barang yang telah dibuat dan pengadaan barang baru
 * untuk menambah stok barang.Class inventori juga adalah Main Class program ini.
 * 
 * Author: SYIFA KHAIRINA - 211524063
 * Tanggal: 26 FEBRUARI 2022
 */

public class Inventori {
 Barang[] barangs;
 

void initBarang() {
barangs = new Barang[2];
barangs[0] = new Barang("001", "Baju", 10);
barangs[1] = new Barang("002", "Celana", 20);
}

//menampilkan nama barang dan stok (menggunakan acessor)
void showBarang() {
System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
}
    
void pengadaan() {
initBarang();
barangs[0].addStok(20); //menambah stok Baju
barangs[1].addStok(13); //menambah stok Celana

showBarang();
}

public static void main(String[] args) {
Inventori beli = new Inventori();
beli.pengadaan();
}
}
   

