/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author pc09
 */
public class ActividadWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese un numeruwu");
        Scanner tecladou = new Scanner(System.in);
        int a = tecladou.nextInt ();
        int i=1;
        while(i<=a){
            System.out.println(i);
            i++;
        }
    }
    
}
