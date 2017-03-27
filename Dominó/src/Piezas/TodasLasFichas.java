package Piezas;

public class TodasLasFichas {
    public final int MAX_FICHAS = 7;
    private int numMaxFichas;
    private Ficha[] todas;
    private int numFichas;
    public TodasLasFichas(){
        int k=0;
        for (int i = 0; i < MAX_FICHAS; i++) {
            for (int j = 0; j < MAX_FICHAS; j++) {
                k++;
            }
        }
        todas= new Ficha[k];
        numMaxFichas=k;
        k = 0;
        for(int i = 0; i < MAX_FICHAS; i++){
            for(int j = i; j < MAX_FICHAS; j++){
                todas[k] = new Ficha(i, j);
                k++;
            }
        }
        numFichas=k;
    }
    
    
    
    public int getNumMaxFichas(){
        return numMaxFichas;
    }
    
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
    
    public Ficha[] getTodas(){
        return todas;
    }
    
    public Ficha getUnaFicha(int i){
        return todas[i];
    }
    
    public void setUnaFichatoNull(int i){
        todas[i] = null;
    }
    
}
