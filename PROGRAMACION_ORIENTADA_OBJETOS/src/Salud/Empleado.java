package Salud;


public class Empleado extends Persona {

    private String cargo; 
    private double valorHora; 
    private int horasTrabajadas; 
    private String departamento;
    
       
    public Empleado( String tipoDoc, int numDoc,String nombre,String apellido,double peso,double estatura,int edad,String sexo,String cargo,double valorHora,int horasTrabajadas,String departamento){
    
    super(tipoDoc,numDoc,nombre,apellido,peso,estatura,edad,sexo);

    this.cargo=cargo;
    this.valorHora=valorHora;
    this.horasTrabajadas=horasTrabajadas;
    this.departamento=departamento;
    }
    public void calcularHonorarios(){
        double totalApagar;
        
        totalApagar = valorHora*horasTrabajadas;
        
        totalApagar = ((totalApagar) - (0.966/100));
        
        }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    

    }
    
    