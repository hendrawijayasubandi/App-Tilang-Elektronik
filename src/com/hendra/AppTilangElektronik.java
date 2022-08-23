/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendra;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.math3.stat.StatUtils;

/**
 *
 * @author HP
 */
public class AppTilangElektronik {

    public static Scanner keyboard = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fungsiInputMasyarakat();
    }
    
    public static void fungsiInputMasyarakat(){
        String nama, pekerjaan, alamat, nomor_polisi, jenis_pelanggaran;
        double tahun_lahir;
        double usia, jumlah_yang_dilanggar;
        String jenis_kelamin, pernah_melanggar;
        boolean jenis_kelamin1, pernah_melanggar1 = false;
        double angka1, angka2;
        double hasil = 0;
        String fungsi;
        
        System.out.println("======================");
        System.out.println("App Tilang Elektronik");
        System.out.println("======================");
        
        System.out.print("Nama                      : ");  
        nama = keyboard.nextLine();
        System.out.print("Pekerjaan                 : ");
        pekerjaan = keyboard.nextLine();
        System.out.print("Alamat                    : ");
        alamat = keyboard.nextLine();
        System.out.print("Nomor Polisi              : ");
        nomor_polisi = keyboard.nextLine();
        System.out.print("Jenis Pelanggaran         : ");
        jenis_pelanggaran = keyboard.nextLine();
        System.out.print("Jenis Kelamin (L/P)       : ");
        jenis_kelamin = keyboard.nextLine();
        if (jenis_kelamin.equals("l") || jenis_kelamin.equals("L")){
            jenis_kelamin1 = true;
        }   else if (jenis_kelamin.equals("p") || jenis_kelamin.equals("P")) {
            jenis_kelamin1 = false;
        }   else {
            System.out.println("Input salah");
        }
        System.out.print("Usia                      : ");
        angka1 = Double.parseDouble(keyboard.nextLine());
        System.out.print("Berapa kali dilanggar     : ");
        angka2 = Double.parseDouble(keyboard.nextLine());
        System.out.println("ketik 'y' untuk melanjutkan");
        System.out.print("");
        fungsi = keyboard.nextLine();
        
        if (fungsi.equals("y")) {
            hasil = 729540 + (angka1 * angka2) + 15000 ;
        }   else {
            System.out.println("Data yang dimasukan salah");
        }
        
        try {
            System.out.println("Mohon tunggu, proses perhitungan data sedang berlangsung... ");
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AppTilangElektronik.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Bukti Tilang Yang Harus Dibayar");
        System.out.println("=================================");
        System.out.println("Nama                            : " + nama);
        System.out.println("Pekerjaan                       : " + pekerjaan);
        System.out.println("Alamat : " + alamat);
        System.out.println("Nomor Polisi                    : " + nomor_polisi);
        System.out.println("Jenis Pelanggaran               : " + pekerjaan);
        System.out.println("Jenis Kelamin (L/P)             : " + jenis_kelamin);
        System.out.println("Usia : " + angka1);
        System.out.println("Berapa kali dilanggar           : " + angka2);
        System.out.println("Total Denda yang harus di bayar : " + "Rp. " + hasil);
        System.out.println("");
        System.out.println("Silahkan ke bagian pembayaran, terima kasih!");
    }
}