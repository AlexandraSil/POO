package Figuras;

public class Circulo extends Figura {

    private float radio;

    
        public Circulo(float radio) {
    }
        public void cuadrado (float radio) {
            this.radio=radio;
        }
       
        public float getRadio() {
            return radio;
        }
        public void setRadio(float radio) {
            this.radio = radio;
        }
        public void calcularArea(){


            double area=0;
            area=radio*radio;
            area = area*0.14;

            System.out.println(" el area del circulo es de " + area);
    }
    }