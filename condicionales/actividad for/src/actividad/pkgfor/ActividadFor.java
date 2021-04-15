/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkgfor;
import java.util.Scanner;
/**
 *
 * @author pc09
 */
public class ActividadFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese el numeruwu");
        Scanner tecladou = new Scanner(System.in);
        int a = tecladou.nextInt ();
        for (int i=0; i<a; i++){
        System.out.println(i);
    }
    }
    
}
