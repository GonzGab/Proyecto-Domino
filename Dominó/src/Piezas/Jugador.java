package Piezas;

import java.util.Random;

public class Jugador {
    Random rnd = new Random();
<<<<<<< HEAD
    private int maxFichas;
    private Ficha[] mano;
=======
    int maxFichasArray;
    Ficha[] mano;
>>>>>>> origin/master
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
        
<<<<<<< HEAD
        while(mano[i] != null && i < maxFichas){
            toret.append(mano[i].TEMPtoString());
            toret.append( "\n");
=======
        for(int i = 0; i < numFichas; i++){
            toret.append(mano[i].TEMPtoString() + "\n");
>>>>>>> origin/master
            i++;
        }
        return toret.toString();
    }
}