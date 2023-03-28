package Figuras;

public class Cuadrado extends Figura {

private int lado;
private float area=0;

    public Cuadrado(int lado2) {
}
    public void cuadrado (int lado) {
        this.lado=lado;
    }
   
    
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public void calcularArea(){
        
        area=lado*lado;
        
    }
    
}

