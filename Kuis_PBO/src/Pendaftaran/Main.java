/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendaftaran;
import Seleksi.InputNilai;
import Seleksi.Android;
import Seleksi.Web;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
      try{
        Scanner input = new Scanner(System.in);
        System.out.println("Pelamaran Lowongan Pekerjaan");
        System.out.println(" 1. Android Development");
        System.out.println(" 2. Web Development");
        System.out.print(" Pilih Jenis Pekerjaan : ");
        int pilihDivisi = input.nextInt();
        System.out.println(" ");
        
        System.out.println("=== FORMULIR PELAMAR ===");
        Scanner data= new Scanner(System.in);
        System.out.print("NIK   : ");
        int NIK = data.nextInt();
        data.nextLine();
        System.out.print("Nama Lengkap : ");
        String nama = data.nextLine();
        
        if (pilihDivisi == 1){
            System.out.print("Input Nilai Tulis : ");
            int nilaiTulis = data.nextInt();
            System.out.print("Input Nilai Coding : ");
            int nilaiCoding = data.nextInt();
            System.out.print("Input Nilai Wawancara : ");
            int nilaiWawancara = data.nextInt();
            System.out.println("========================");
            Android android = new Android(NIK,nama,nilaiTulis,nilaiCoding,nilaiWawancara);
            do{
                System.out.println("Menu");
                System.out.println(" 1. Edit NIlai");
                System.out.println(" 2. Tampilkan Hasil");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih Menu : ");
                int pilihMenu = input.nextInt();
                if (pilihMenu == 1){
                    System.out.print("Input Nilai Tulis : ");
                    android.inputNilaiTulis(input.nextInt());
                    System.out.print("Input Nilai Coding : ");
                    android.inputNilaiCoding(input.nextInt());
                    System.out.print("Input Nilai Wawancara : ");
                    android.inputNilaiWawancara(input.nextInt());
                }
                else if (pilihMenu == 2){
                    System.out.println("Nilai Akhir : " + android.NilaiTotal());
                    System.out.println("Keterangan : " + android.Keterangan());
                }
                else {
                    System.out.println("Terimakasih");
                    break;
                }
            }while(true);
        }
        else if (pilihDivisi == 2){
            System.out.print("Input Nilai Tulis : ");
            int nilaiTulis = data.nextInt();
            System.out.print("Input Nilai Coding : ");
            int nilaiCoding = data.nextInt();
            System.out.print("Input Nilai Wawancara : ");
            int nilaiWawancara = data.nextInt();
            System.out.println("========================");
            Web web = new Web(NIK,nama,nilaiTulis,nilaiCoding,nilaiWawancara);
            do{
                System.out.println("Menu");
                System.out.println(" 1. Edit NIlai");
                System.out.println(" 2. Tampilkan Hasil");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih Menu : ");
                int pilihMenu = input.nextInt();
                if (pilihMenu == 1){
                    System.out.print("Input Nilai Tulis : ");
                    web.inputNilaiTulis(input.nextInt());
                    System.out.print("Input Nilai Coding : ");
                    web.inputNilaiCoding(input.nextInt());
                    System.out.print("Input Nilai Wawancara : ");
                    web.inputNilaiWawancara(input.nextInt());
                }
                else if (pilihMenu == 2){
                    System.out.println("Nilai Akhir : " + web.NilaiTotal());
                    System.out.println("Keterangan : " + web.Keterangan());
                }
                else {
                    System.out.println("Terimakasih");
                    break;
                }
            }while(true);
        }
        else{
            System.out.println("Input SALAH");
            System.out.println("(Mohon Input Ulang)");
        }
       }
       catch(Exception error){
            System.out.println("Error karena " + error.getMessage());
       }
    }
}