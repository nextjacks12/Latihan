package com.tutorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class latihan1 {
    
    static ArrayList listMobil = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void showMenu() throws IOException {
        System.out.println("----------Menu----------");
        System.out.println("[1] List semua Mobil");
        System.out.println("[2] Masukkan data mobil");
        System.out.println("[3] Edit nama mobil");
        System.out.println("[4] Hapus nama mobil");
        System.out.println("[5] Keluar");
        System.out.println("PILIH MENU >> ");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch (selectedMenu) {
            case 1 :
                 semuaMobil();
                 break;
            case 2 :
                 inputMobil();
                 break;
            case 3 :
                 editMobil();
                 break;
            case 4 :
                 deleteMobil();
                 break;
            case 5 :
                 System.exit(0);
                 break;
            default :
                 System.out.println("Pilih yang bener setang!!");
                 break;
        
        
           
            
        }
        
    }

    static void semuaMobil() {
        if(listMobil.isEmpty()){
            System.out.println("Data belum ada");
        }
        else {
            for(int i = 0; i < listMobil.size(); i++){
                System.out.println(String.format("[%d] %s", i, listMobil.get(i)));
            }
        }

    }
    static void inputMobil() throws IOException{

        System.out.println("Nama Mobil : ");
        String namaMobil = input.readLine();
         listMobil.add(namaMobil);
    }
    static void editMobil() throws IOException {

        semuaMobil();
        System.out.println("Pilih Nomor Mobil : ");
        int indexMobil = Integer.valueOf(input.readLine());

        System.out.println("Nama Baru : ");
        String namaBaru = input.readLine();

        listMobil.set(indexMobil, namaBaru);


    }
    static void deleteMobil() throws IOException{
        semuaMobil();
        System.out.println("Pilih nomor mobil : ");
        int indexMobil = Integer.valueOf(input.readLine());
        listMobil.remove(indexMobil);
    }
    public static void main(String[] args) throws IOException {
        do {
            showMenu();
        } while (isRunning);
        } 
    
}

