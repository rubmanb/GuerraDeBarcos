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

    private static final char CASILLAAGUA = '~';
    private static char dimensionesTablero[][] = new char[10][10];
    private static char barco;

    public Tablero() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                dimensionesTablero[i][j] = CASILLAAGUA;
            }
        }
        ponerBarcos();
    }

    public static void mostrarTablero(Object tablero) {

        //numeros de arriba
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print(" ");
            }
            System.out.print(" " + i);
        }
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.print(pasarALetras(i) + "|");
            for (int j = 0; j < 10; j++) {
                System.out.print(Tablero.dimensionesTablero[i][j] + " ");
            }
            System.out.print("|" + pasarALetras(i) + "\n");
        }
        //numeros de bajo del tablero
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print(" ");
            }
            System.out.print(" " + i);
        }
        System.out.println("");

    }

    public static char pasarALetras(int n) {
        String letras = "ABCDEFGHIJ";
        char letra = letras.charAt(n);
        return letra;
    }

    public static void ponerBarcos() {
        int fila;
        int columna;
        int posVH; //1 = vertical, 0 = horizontal
        int tamanioBarco;
        for (int i = 1; i < 6; i++) {
            fila = (int) Math.floor(Math.random() * (9 - 0));
            columna = (int) Math.floor(Math.random() * (9 - 0));
            posVH = (int) Math.floor(Math.random() * (1 - 0 + 1));
            if (i == 1) {
                barco = 'e'; // e -> Barco enorme
                tamanioBarco = 5;
            } else if (i == 2) {
                barco = 'g'; // g -> Barco grande
                tamanioBarco = 4;
            } else if (i == 3) {
                barco = 'm'; //m -> Barco mediano
                tamanioBarco = 3;
            } else {
                barco = 'p'; //p -> Barco pequeño
                tamanioBarco = 2;
            }

            //posicionar los barcos en el tablero
            if ((fila >= 0 && fila <= 4) && (columna >= 0 && columna <= 4) && (dimensionesTablero[fila][columna] == '~')) {
                dimensionesTablero[fila][columna] = barco;
                if (posVH == 0) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        columna++;
                        if (dimensionesTablero[fila][columna] == '~') {
                            dimensionesTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                } else if (posVH == 1) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        fila++;
                        if (dimensionesTablero[fila][columna] == '~') {
                            dimensionesTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                }
            } else if ((fila >= 0 && fila <= 4) && (columna >= 5 && columna <= 9) && (dimensionesTablero[fila][columna] == '~')) {
                dimensionesTablero[fila][columna] = barco;
                if (posVH == 0) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        columna--;
                        if (dimensionesTablero[fila][columna] == '~') {
                            dimensionesTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                } else if (posVH == 1) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        fila++;
                        if (dimensionesTablero[fila][columna] == '~') {
                            dimensionesTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                }
            } else if ((fila >= 5 && fila <= 9) && (columna >= 5 && columna <= 9) && (dimensionesTablero[fila][columna] == '~')) {
                dimensionesTablero[fila][columna] = barco;
                if (posVH == 0) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        columna--;
                        if (dimensionesTablero[fila][columna] == '~') {
                            dimensionesTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                } else if (posVH == 1) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        fila--;
                        if (dimensionesTablero[fila][columna] == '~') {
                            dimensionesTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                }
            } else if ((fila >= 5 && fila <= 9) && (columna >= 0 && columna <= 4) && (dimensionesTablero[fila][columna] == '~')) {
                dimensionesTablero[fila][columna] = barco;
                if (posVH == 0) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        columna++;
                        if (dimensionesTablero[fila][columna] == '~') {
                            dimensionesTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                } else if (posVH == 1) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        fila--;
                        if (dimensionesTablero[fila][columna] == '~') {
                            dimensionesTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void lineaTitulo(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void tituloJuego(String s) {
        lineaTitulo(s.length(), '*');
        System.out.println(s);
        lineaTitulo(s.length(), '*');
        System.out.println();
    }
    
    public static void bomba(int fila, int columna){
        int contadorBarcoE = 0;
        int contadorBarcoG = 0;
        int contadorBarcoM = 0;
        int contadorBarcoP = 0;
        if(dimensionesTablero[fila][columna] == '~'){
            System.out.println("AGUA!!");
        }else if(dimensionesTablero[fila][columna] == 'e' || dimensionesTablero[fila][columna] == 'g' || dimensionesTablero[fila][columna] == 'm'
                || dimensionesTablero[fila][columna] == 'p'){
                System.out.println("TOCADO!!");
                if(dimensionesTablero[fila][columna] == 'e'){
                    contadorBarcoE++;
                }else if(dimensionesTablero[fila][columna] == 'g'){
                    contadorBarcoG++;
                }else if(dimensionesTablero[fila][columna] == 'm'){
                    contadorBarcoM++;
                }else if(dimensionesTablero[fila][columna] == 'p'){
                    contadorBarcoP++;
                }
        }else{
            System.out.println("Posición incorrecta! Estás fuera de los límites del tablero.");
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
        tituloJuego("HUNDIR LA FLOTA");
        mostrarTablero(tab);
    }

}
