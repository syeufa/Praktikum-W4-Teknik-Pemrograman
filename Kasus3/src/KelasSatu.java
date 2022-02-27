
/** KASUS 3 - PRAKTIKUM W4 TEKNIK PEMROGRAMAN
 * Author: SYIFA KHAIRINA - 211524063
 * Tanggal: 26 FEBRUARI 2022
 */
public class KelasSatu 
{ 
    
    {
        System.out.println(11);
    }
    //dieksekusi pertama saat creating objek KelasSatu
    static
    {
        System.out.println(2);
    }
    //dieksekusi saat objek yang di-create menggunakan parameter
    public KelasSatu(int i)
    {
        System.out.println(3);
    }
    //dieksekusi saat objek yang di-create tidak ada parameternya (no arg)
    public KelasSatu()
    {
        System.out.println(4);
    }
}  

