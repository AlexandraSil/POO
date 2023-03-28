package Juego;

public class Ejecucion1 {
    
    public static void main(String[] args) {
        
        Carisellazo juego1 = new Carisellazo();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        Piedra_papel_tijera elije = new Piedra_papel_tijera();
        elije.iniciar();
        elije.jugar();
        elije.finalizar();
    }
    
}
