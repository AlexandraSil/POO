package Principal;


import java.util.Scanner;
import Salud.Empleado;
import Salud.Persona;

public class Inicio {
    

    public static void main(String[] args) {
        double resultado;
    
        String cargo; 
        double valorHora; 
        int horasTrabajadas; 
        String departamento;
        String tipoDoc;
        int numDoc;
        String nombre;
        String apellido;
        double peso;
        double estatura;
        int edad;
        String sexo;


     //Persona persona1=new Persona();


     Scanner captura=new Scanner(System.in);

     

     System.out.println("Digite El Tipó Del Documento De La Persona");
    tipoDoc=captura.next();
    System.out.println("Digite El Número De Documento De La Persona");
    numDoc=captura.nextInt();
    System.out.println("Digite El Nombre De La Persona");
    nombre=captura.next(); 
    System.out.println("Digite El Apellido De La Persona");
    apellido=captura.next();
    System.out.println("Digite El Peso De La Persona ");
    peso=captura.nextDouble();
    System.out.println("Digite La Estatura De La Persona En cm");
    estatura=captura.nextDouble();
    System.out.println("Digite La Edad De La Persona");
    edad=captura.nextInt();
    System.out.println("Digite El Genero De La Persona");
    sexo=captura.next();
    System.out.println();
    System.out.println("Digite El Cargo Del Empleado");
    cargo=captura.next();
    System.out.println();
    System.out.println("Digite El Valor A Pagar Por Hora");
    valorHora=captura.nextInt();
    System.out.println();
    System.out.println("Digite El Total De Horas Trabajadas Por El Empleado");
    horasTrabajadas=captura.nextInt();
    System.out.println();
    System.out.println("Digite El Departamento Del Empleado");
    departamento=captura.next();
    
    
    

    Empleado favorito=new Empleado(tipoDoc, numDoc, nombre, apellido, peso, estatura, edad, sexo, cargo, valorHora, horasTrabajadas, departamento);
     favorito.calcularHonorarios();
    System.out.println("El Tipo De Documento Es: "+favorito.getTipoDoc());
    System.out.println();
    System.out.println("El Numero De Documento Es: "+favorito.getNumDoc());
    System.out.println();
    System.out.println("El Nombre De La Persona Es: "+favorito.getNombre());
    System.out.println();
    System.out.println("El Apellido De "+favorito.getNombre()+" Es: "+favorito.getApellido());
    System.out.println();
    System.out.println("El Peso De "+favorito.getNombre()+" Es: "+favorito.getPeso());
    System.out.println();
    System.out.println("La Estatura De "+favorito.getNombre()+" Es: "+favorito.getEstatura());
    System.out.println();
    System.out.println("La Edad De "+favorito.getNombre()+" Es: "+favorito.getEdad());
    System.out.println();
    System.out.println("El Genero De "+favorito.getNombre()+" Es: "+favorito.getSexo());
    System.out.println();

   

    /*System.out.println("Digite El Peso De La Persona");
     peso=captura.nextDouble();
     System.out.println("Digite La Estatura De La Persona En cm");
     estatura=captura.nextDouble();*/
    
     //favorito.pedirDatos();
    /*favorito.mostrarDatos();
     favorito.calcularImc();*/

     /*resultado=favorito.calcularImc(peso, estatura);
     
     if (resultado < 20) {

        System.out.println();
        System.out.println("PESOBAJO: "+resultado);
        System.out.println();

    } else if (resultado >= 20 && result <= 25) {
        
        System.out.println();
        System.out.println("PESOIDEAL: "+resultado);
        System.out.println();



    } else if (resultado > 25) {
        
        System.out.println();
        System.out.println("SOBREPESO: "+resultado);
        System.out.println();

    }
    /*
    
    favorito.calcularImc();

    favorito.mayorEdad();*/


     captura.close();
    }

    }

       


