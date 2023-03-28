package Juego;

import java.util.Random;
import java.util.Scanner;

public class Piedra_papel_tijera implements Juego{

    private int eleccion;
    private String nombre;
    private int resultado;
   
    Scanner captura = new Scanner(System.in);
     
    
     
    public void iniciar() {
        System.out.println("ingrese el nombre de quien va a jugar"); 
        nombre=captura.next();
    }

    public void jugar() {
        System.out.println( nombre + " realice su eleccion  1:piedra  2:papel  3:tijera"); 
       resultado=captura.nextInt();
       Random aleatorio = new Random();
       eleccion=(int) (Math.random()*3)+1; 
}
    
    public void finalizar() {
        if(eleccion==1 && resultado==1){
            System.out.println("respuesta piedra");
            System.out.println("empate");
        }
        else if(eleccion==2 && resultado==1){
            System.out.println("respuesta piedra");
            System.out.println( nombre+" has perdido la respuesta de la maquina es: "+ eleccion + " tu respuesta es: " + resultado );
        }
        else if(eleccion==3 && resultado==1){
            System.out.println("respuesta es piedra");
            System.out.println( nombre+" has ganado la respuesta de la maquina es: "+ eleccion +" tu respuesta es: " + resultado );
        }
        else if(eleccion==2 && resultado==2){
            System.out.println("respuesta papel");
            System.out.println("empate");
        }
        else if(eleccion==1 && resultado==2){
            System.out.println("respuesta papel");
            System.out.println( nombre+" has ganado la respuesta de la maquina es: "+ eleccion +"tu respuesta es: " + resultado );
        }
        else if(eleccion==3 && resultado==2){
            System.out.println("respuesta papel");
            System.out.println( nombre+" has perdido la respuesta de la maquina es: "+ eleccion +"tu respuesta es: " + resultado );
        }
        else if(eleccion==3 && resultado==3){
            System.out.println("respuesta tijera");
            System.out.println( "empate");
        }
        else if(eleccion==2 && resultado==3){
            System.out.println("respuesta tijera");
            System.out.println( nombre+" has ganado la respuesta de la maquina es: "+ eleccion +"tu respuesta es: " + resultado );
        }
        else if(eleccion==1 && resultado==3){
            System.out.println( nombre+" has perdido la respuesta de la maquina es: "+ eleccion +"tu respuesta es: " + resultado );
        }
        System.out.println(" gracias por jugar ");
    }

    }
    

