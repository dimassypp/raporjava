/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DYPe
 */


import java.util.Scanner;


public class perbaikanpas {

 
    public static void main(String[] args) {
        int tugas,pemahaman,uts,pas;
        double nilaiPelajaran,jumlahNilai,total;
        boolean running = true;
        Scanner input = new Scanner (System.in);
        String jawab;
       
        while (running) {
           System.out.println("Dimas Yoga P.8 XR3/11");
           System.out.println("Nilai Tugas : ");
           tugas=input.nextInt();
           System.out.println("Nilai Pemahaman : ");
           pemahaman=input.nextInt();
           System.out.println("Nilai Pts : ");
           uts=input.nextInt();
           System.out.println("Nilai Pas : ");
           pas=input.nextInt();
           
          
           total=4;
           jumlahNilai=(tugas+pemahaman+uts+pas)/total;
           if (jumlahNilai>75){
               System.out.println("Anda memenuhi KKM, SELAMAT");
               System.out.println("Rata-Rata Nilai Anda adalah = "+jumlahNilai);
               
           }
           else {
               System.out.println("Anda tidak memenuhi KKM, mohon mengulang");
               System.out.println("Rata-Rata Nilai Anda adalah ="+jumlahNilai);
           }   
           
                     
           System.out.println("Apakah anda ingin mengulang? [Jawab" + " ya/tidak]");
           jawab = input.next();
           if (jawab.equalsIgnoreCase("ya")){
               running = true;
                       
           }
           if (jawab.equalsIgnoreCase("tidak")){
               running = false;
           }
               
               
               

    }
    }    
}
