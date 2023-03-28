package Figuras;

public class Triangulo extends Figura{
    private float base1;
    private float altura1;
    
    
        public Triangulo (float base2, float altura2) {
    }

        public void cuadrado (float base1,float altura1) {
            this.base1=base1;
            this.altura1=altura1;
        }

    public float getBase() {
            return base1;
        }

        public void setBase(float base) {
            this.base1 = base;
        }

        public float getAltura() {
            return altura1;
        }

        public void setAltura(float altura) {
            this.altura1 = altura;
        }

    public void calcularArea(){

        double area=0;
        area=((base1*altura1)/2);
    
        System.out.println("la base del triangulo es " + base1 + " la altura es " + altura1 + " y el area es " + area);
   } 
}