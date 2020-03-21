/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Dwi Fauzi
 */
public class Mahasiswa {
    String nama,nim,kelas;
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Dwi Febi Fauzi";
        mhs.nim = "18090125";
        mhs.kelas = "4B";
        
        System.out.println("Nama = "+mhs.nama);
        System.out.println("NIM = "+mhs.nim);
        System.out.println("Kelas = "+mhs.kelas);
    }
}
