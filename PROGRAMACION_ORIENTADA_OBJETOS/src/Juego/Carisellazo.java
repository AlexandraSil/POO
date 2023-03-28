package Juego;

import java.util.Scanner;

public class Carisellazo implements Juego{

    private int tiroAleatorio;
    private String nombre;
    private int resultado;
   

    Scanner captura = new Scanner(System.in);

    public void iniciar() {
       System.out.println("ingrese el nombre de quien va a jugar"); 
       nombre=captura.next();
    }

    public void jugar() {
       System.out.println( nombre + " realice su eleccion  1:cara  2:sello"); 
       tiroAleatorio=captura.nextInt();
      
       resultado=(int) (Math.random()*2)+1;
       
    }  
    public void finalizar() {
        if(resultado==1 && tiroAleatorio==1){
            System.out.println("La maquina saco "+resultado + " y "  +nombre + " saco " +tiroAleatorio +  " salio cara han empatado ");
        }
        else if(resultado==2 && tiroAleatorio==2){
            System.out.println("La maquina saco "+resultado + " y "  +nombre + " saco " +tiroAleatorio + " salio sello has ganado  "  );
        }
        else if(resultado==1 && tiroAleatorio==2){
            System.out.println("La maquina saco "+resultado + " y "  +nombre + " saco " +tiroAleatorio + " salio cara ha perdido " );
        }
        else if(resultado==2 && tiroAleatorio==1){
            System.out.println("La maquina saco "+resultado + " y "  +nombre + " saco " +tiroAleatorio +" salio sello ha perdido  ");
        
        }
         
        System.out.println();
        System.out.println("¡¡Gracias por jugar!!");
        System.out.println();
    }
    
}
