package Figuras;

import java.util.Scanner;

public class Ejecucion {

    public static void main(String[] args) {

        float radio;
        int base;
        int altura;
        float base1,altura1;
        int elijeFigura ,lado;
        int area=0;
        double area1=0;


        Scanner captura = new Scanner(System.in);
        System.out.println("<3 EN ESTE PROGRAMA VAMOS A CALCULAR EL AREA DE LA FIGURA QUE USTED ELIJA A CONTINUACION <3");

        System.out.println("Elija una figura 1:cuadrado, 2:circulo, 3:rectangulo, 4:triangulo");
        elijeFigura=captura.nextInt();

        if(elijeFigura==1){
            System.out.println(" vamos a calcular el are de un cuadrado ");
            System.out.println(" ingrese el valor de los lados ");
            lado=captura.nextInt();
            Cuadrado cuadrado1 =new Cuadrado(lado);
            cuadrado1.calcularArea();
            area=lado*lado;
            System.out.println(" cada lado del cuadrado mide " + lado + " y el area del cuadrado es de " + area);
        }
        else if(elijeFigura==2){
            System.out.println("vamos a calcular el area de un circulo ");
            System.out.println(" ingrese el valor del radio");
            radio=captura.nextFloat();
            Circulo circulo1 = new Circulo(radio);
            area1=radio*radio;
            area1 = area*0.14;
            System.out.println(" el area del circulo es de " + area1);
            circulo1.calcularArea();

        }
        else if(elijeFigura==3){
            System.out.println("vamos a calcular el area de un rectangulo");
            System.out.println(" ingrese el valor de la base");
            base=captura.nextInt();
            System.out.println(" ingrese el valor de la altura");
            altura=captura.nextInt();
            Rectangulo rectangulo1 = new Rectangulo (base,altura);
            area = (int) (base * altura);
            System.out.println("la base del rectangulo es " + base + " la altura es " + altura + " y el area es " + area);
            rectangulo1.calcularArea();

        }
        else if(elijeFigura==4){
            System.out.println("vamos a calcular el area de un triangulo");
            System.out.println(" ingrese el valor de la base");
            base1=captura.nextFloat();
            System.out.println(" ingrese el valor de la altura");
            altura1=captura.nextFloat();
            Triangulo triangulo1 = new Triangulo(base1, altura1);
            area1=((base1*altura1)/2);
            System.out.println("la base del triangulo es " + base1 + " la altura es " + altura1 + " y el area es " + area1);
            triangulo1.calcularArea();
        }
        System.out.println(" gracias por utilizar nuestro sistema ");
        
        captura.close();
    }
    }