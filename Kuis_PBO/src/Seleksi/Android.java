/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seleksi;
import Pendaftaran.Perhitungan;
/**
 *
 * @author Lenovo
 */
public class Android extends InputNilai implements Perhitungan {
   public Android (int NIK, String nama, int nilaiTulis, int nilaiCoding, int nilaiWawancara){
        super(NIK, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
    }
    
    public void inputNilaiTulis(int nilaiTulis) {
        this.nilaiTulis = nilaiTulis;
    }

     public void inputNilaiCoding(int nilaiCoding) {
        this.nilaiCoding = nilaiCoding;
    }

     public void inputNilaiWawancara(int nilaiWawancara) {
        this.nilaiWawancara = nilaiWawancara;
    }
     
    @Override
    public double NilaiTotal() {
         return (0.2 * super.nilaiTulis) + (0.5 * super.nilaiCoding) + (0.3 * super.nilaiWawancara);
    }
    
    @Override
    public String Keterangan() {
        if(this.NilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " dengan NIK " + this.NIK + " telah DITERIMA pada divisi Android Development\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " dengan NIK " + this.NIK + " telah DITOLAK pada divisi Android Development\n";
    }
    
}