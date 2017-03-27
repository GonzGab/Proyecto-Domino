package Piezas;

import java.util.Random;

public class Jugador {
    Random rnd = new Random();
    int maxFichasArray;
    Ficha[] mano;
    private int numFichas;
    
    public Jugador(int maxFichas, TodasLasFichas todas){
        mano = new Ficha[maxFichas];
        this.maxFichasArray = maxFichas;
        numFichas = 7;
        int cont = 0;
        
        for(int i = 0; i < 7; i++){
            cont = rnd.nextInt(todas.getNumFichas());
                mano[i] = todas.getUnaFicha(cont);
                todas.eliminar(cont);
        }
    }
    
    /**@deprecated*/
    public String TEMPtoString(){
        StringBuilder toret = new StringBuilder();
        
        for(int i = 0; i < numFichas; i++){
            toret.append(mano[i].TEMPtoString() + "\n");
            i++;
        }
        return toret.toString();
    }
}