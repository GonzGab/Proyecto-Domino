package dominó;
import static Constantes.Constantes.MAX_NUM_FICHAS_MANO;
import Piezas.*;
import java.util.Scanner;
//PENDIENTE: guardar las fichas dadas a los jugadores en otro array (vaciando el montón original), y rellenar todos los huecos libres en el array donde están las fichas
//añadir variable con número de fichas restantes en el montón de fichas general, no en el cada jugador
//comer penes

public class Dominó {

    public static void main(String[] args) {
        TodasLasFichas todas = new TodasLasFichas();
        int numJ = intrJugadores();
        Jugador[] jugadores = new Jugador[numJ];
        giveFichas(jugadores, numJ, todas);
        TEMPtoStringFichasPlayer(numJ, jugadores);
        System.out.println(todas);
    }
    
    public static int intrJugadores(){
        Scanner s = new Scanner(System.in);
        int numJ = 0;
        boolean correct = false;
        
        System.out.print("Introduce el número de jugadores que habrá en la partida (entre 2 y 4): ");
        do{
            try{
                numJ = Integer.parseInt(s.nextLine());
                correct = true;
            }catch(NumberFormatException exc){
                System.err.println("ERROR: " + exc.getMessage());
                correct = false;
            }catch(Exception exc){
                System.err.println("ERROR: " + exc.getMessage());
                correct = false;
            }
            if(numJ > 4 || numJ < 2){
                System.out.print("Por favor, vuelve a introducir de manera correcta: ");
                correct = false;
            }
        }while(!correct);
        
        return numJ;
    }
    
    /*
    public static void giveFichas(Jugador[] jugadores, int numJ, TodasLasFichas todas){
        System.out.println("Repartiendo fichas a los jugadores...");
        int maxFichasJ = calcMaxFichas(numJ, todas.getNumMaxFichas());
        for(int i = 0; i < numJ; i++){
            jugadores[i] = new Jugador(maxFichasJ, todas);
        }
        System.out.println("¡Fichas repartidas!");
    }
    
<<<<<<< HEAD
    public static int calcMaxFichas(int numJ, int maxFichas){//sin acabar
        int toret = maxFichas;
        
        if(numJ == 2){
            toret = 0;
        }else if(numJ == 3){
            toret = 14;
=======
    public static int calcMaxFichas(int numJ, int maxFichasTotal){
        int toret = maxFichasTotal - MAX_NUM_FICHAS_MANO;
        
        if(numJ == 3){
            toret = maxFichasTotal - MAX_NUM_FICHAS_MANO * 2;
>>>>>>> origin/master
        }else{
            toret = maxFichasTotal - MAX_NUM_FICHAS_MANO * 3;
        }
        return toret;
    }
    */
    
    
    public static void TEMPtoStringFichasPlayer(int numJ, Jugador[] jugadores){
        for (int i = 0; i < numJ; i++) {
            System.out.println(jugadores[i].TEMPtoString());
        }
    }
}