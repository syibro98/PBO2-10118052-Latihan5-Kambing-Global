/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan5.kambing.global;

/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Latihan ini bertujuan untuk membuat class dan menampilkan
 * dan menambahkan kambing
 */
public class PBO210118052Latihan5KambingGlobal {

    // Variabel jumlahKambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method untuk menampilakn jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + 
                            jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210118052Latihan5KambingGlobal kambingSusu = 
                new PBO210118052Latihan5KambingGlobal();
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menmapilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
