/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;
import java.util.Scanner;
/**
 *
 * @author pc09
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecladou = new Scanner(System.in);
        int a=1;
        int b=1;
        System.out.println("ingrese dos numeruwus que sean distintos");
        do{
            a = tecladou.nextInt ();
            b = tecladou.nextInt (); 
            if (a==b){
                System.out.println("los nuemeros deben ser distintos, ingreselos de nuevo");
            }
        }while(a==b);
        int mayor;
        int menor;
        if (a>b){
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        }
        System.out.println("el numero mas grande es "+mayor+" y el menor es "+menor+"");
    }
    
}
