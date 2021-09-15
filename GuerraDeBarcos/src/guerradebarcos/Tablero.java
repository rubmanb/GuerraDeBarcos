/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerradebarcos;

/**
 *
 * @author Ruben
 */
public class Tablero {

    private static final char CASILLA = '_';
    private static char dimensionesTablero[][] = new char[10][10];

    public Tablero() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                dimensionesTablero[i][j] = CASILLA;
            }
        }
        //ponerBarcos();
    }

    public static void mostrarTablero(Object tablero) {
        
        //numeros de arriba
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+i);
        }
        System.out.println("");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + pasarALetras(i) + "|");
            for (int j = 0; j < 10; j++) {
                
                
                System.out.print("|");
            }
            System.out.print(pasarALetras(i) + "\n");
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println("");

    }

    public static char pasarALetras(int n) {
        String letras = "ABCDEFGHIJ";
        char letra = letras.charAt(n);
        return letra;
    }

    public static void ponerBarcos() {
        for (int i = 1; i < 6; i++) {
            switch (i) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                default:

            }

        }
    
    
    }

    public static char[][] getDimensionesTablero() {
        return dimensionesTablero;
    }

    public static void setDimensionesTablero(char[][] dimensionesTablero) {
        Tablero.dimensionesTablero = dimensionesTablero;
    }
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Tablero tab = new Tablero();
        
        mostrarTablero(tab);
    }

}
