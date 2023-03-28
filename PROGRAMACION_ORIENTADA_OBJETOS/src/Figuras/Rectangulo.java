package Figuras;

public class Rectangulo extends Figura {

        private int base;
        private int  altura;
        
            public Rectangulo(int base2,int altura2) {
        }


            public void cuadrado (int base,int altura) {
                this.base=base;
                this.altura=altura;
            }
       
      
        public float getBase() {
            return base;
        }

        public void setBase(int base) {
            this.base = base;
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }


        public void calcularArea() {
            int area=0;
            area = (int) (base * altura);
        
            System.out.println("la base del rectangulo es " + base + " la altura es " + altura + " y el area es " + area);
    }
}