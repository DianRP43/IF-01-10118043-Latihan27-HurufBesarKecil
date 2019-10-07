/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan27.hurufbesarkecil;

import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        System.out.print("Masukan Kalimat : ");
        Scanner scanner= new Scanner(System.in);
        nama = scanner.nextLine();
        System.out.println("");
        System.out.println("Hasil Formating");
        System.out.println("Huruf Besar :"+ nama.toUpperCase());
        System.out.println("Huruf Kecil :"+ nama.toLowerCase());
    }
    
}
