package Piezas;

import static Constantes.Constantes.*;

public class TodasLasFichas {
    private int numMaxFichas;
    private Ficha[] todas;
    private int numFichas;
    public TodasLasFichas(){
        int k=0;
        for (int i = 0; i < MAX_VALOR_FICHAS; i++) {
            for (int j = i; j < MAX_VALOR_FICHAS; j++) {
                k++;
            }
        }
        System.out.println("k = " + k);
        todas= new Ficha[k];
        numMaxFichas=k;
        k = 0;
        for(int i = 0; i < MAX_VALOR_FICHAS; i++){
            for(int j = i; j < MAX_VALOR_FICHAS; j++){
                todas[k] = new Ficha(i, j);
                k++;
            }
        }
        numFichas=k;
    }
    
    public Ficha[] getTodas(){
        return todas;
    }
    
    public Ficha getUnaFicha(int i){
        return todas[i];
    }
    
    public int getNumMaxFichas(){
        return numMaxFichas;
    }
    
    public int getNumFichas(){
        return numFichas;
    }
    
    public void eliminar(int pos){
        for (int i = pos; i < numFichas-1; i++) {
            todas[i] = todas[i+1];
        }
        numFichas--;
    }
    
    @Override
    public String toString(){
        StringBuilder toret = new StringBuilder();
        for (int i = 0; i < numFichas; i++) {
            toret.append((1+i));
            toret.append("-> ");
            toret.append(todas[i].TEMPtoString());
            toret.append("\n");
        }
        return toret.toString();
    }
}
