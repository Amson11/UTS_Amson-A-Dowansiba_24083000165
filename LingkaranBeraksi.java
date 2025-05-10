/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class LingkaranBeraksi {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        double r = 11.78;

        double luas = lingkaran.hitungLuas(r);
        
        // Menampilkan hasil dalam berbagai bentuk
        System.out.println("Luas Lingkaran (pecahan): " + luas);
        System.out.println("Luas Lingkaran (bulat): " + (int) luas); // type-casting ke bilangan bulat
        System.out.println("Luas Lingkaran (pembulatan): " + Math.round(luas)); // pembulatan
    }
}
