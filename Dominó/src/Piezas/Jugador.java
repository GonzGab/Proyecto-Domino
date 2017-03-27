package Piezas;
//import Piezas.Ficha;
import java.util.Random;

public class Jugador {
    Random rnd = new Random();
    int maxFichas;
    Ficha[] mano;
    
    public Jugador(int maxFichas, TodasLasFichas todas){
        mano = new Ficha[maxFichas];
        this.maxFichas = maxFichas;
        int cont = 0;
        
        for(int i = 0; i < 7; i++){
            cont = rnd.nextInt(todas.getTodas().length);
            if(todas.getUnaFicha(cont) != null){
                mano[i] = todas.getUnaFicha(cont);
                todas.setUnaFichatoNull(cont);
            }else{
                i--;
            }
        }
    }
    
    /**@deprecated*/
    public String TEMPtoString(){
        StringBuilder toret = new StringBuilder();
        int i = 0;
        
        while(mano[i] != null && i < maxFichas){
            toret.append(mano[i].TEMPtoString() + "\n");
            i++;
        }
        return toret.toString();
    }
}