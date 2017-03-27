package dominó;
import Piezas.*;
import java.util.Scanner;
//PENDIENTE: guardar las fichas dadas a los jugadores en otro array (vaciando el montón original), y rellenar todos los huecos libres en el array donde están las fichas
//añadir variable con número de fichas restantes en el montón de fichas general, no en el cada jugador
//comer penes

public class Dominó {
   /* static final int MAX_FICHAS = 7;
    static final int TOTAL_FICHAS = 28;*/

    public static void main(String[] args) {
        Ficha[] fichas = new Ficha[28];
        TodasLasFichas todas=new TodasLasFichas();
        inicializarFichas(fichas);
        int numJ = intrJugadores();
        Jugador[] jugadores = new Jugador[numJ];
        TEMPprintFichas(fichas);
        giveFichas(jugadores, numJ, fichas);
        TEMPtoStringFichasPlayer(numJ, jugadores);
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
    
    public static void giveFichas(Jugador[] jugadores, int numJ, Ficha[] fichas){   //cambiar
        System.out.println("Repartiendo fichas a los jugadores...");
        int maxFichas = calcMaxFichas(numJ);
        for(int i = 0; i < numJ; i++){
            jugadores[i] = new Jugador(maxFichas, fichas);
        }
        System.out.println("¡Fichas repartidas!");
    }
    
    public static int calcMaxFichas(int numJ){
        int toret = 28;
        
        if(numJ == 2){
            toret = 21;
        }else if(numJ == 3){
            toret = 14;
        }else{
            toret = 7;
        }
        return toret;
    }
    
    
    public static void TEMPprintFichas(Ficha[] fichas){     //cambiar
        for(int i = 0; i < TOTAL_FICHAS; i++){
            System.out.println(i + ": " + fichas[i].TEMPtoString());
        }
    }
    
    public static void TEMPtoStringFichasPlayer(int numJ, Jugador[] jugadores){     //posiblemente cambiar también xdlol
        for (int i = 0; i < numJ; i++) {
            System.out.println(jugadores[i].TEMPtoString());
        }
    }
}