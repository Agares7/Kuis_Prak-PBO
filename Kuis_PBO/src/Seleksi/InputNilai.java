/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seleksi;

/**
 *
 * @author Lenovo
 */
public class InputNilai {
    int NIK;
    String nama;
    int nilaiTulis;
    int nilaiCoding;
    int nilaiWawancara;

    public InputNilai(int NIK, String nama, int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        this.NIK = NIK;
        this.nama = nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
}

