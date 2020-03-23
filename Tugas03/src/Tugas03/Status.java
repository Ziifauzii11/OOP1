/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas03;

/**
 *
 * @author Dwi Fauzi
 */
public class Status {
    public static void main(String[] args) {
        Anjing anjing = new Anjing();
        Ikan ikan = new Ikan();
        
        anjing.statusSuntikRabies = false;
        ikan.statusGantiAir = true;
        
        if (anjing.status() == false) {
            System.out.println("Anjing Belum Suntik Rabies");
        }else{
            System.out.println("Anjing Sudah Suntik Rabies");
        }
        
        if (ikan.status() == false) {
            System.out.println("Ikan Belum Ganti Air");
        }else{
            System.out.println("Ikan Sudah Ganti Air");
        }
    }
}
