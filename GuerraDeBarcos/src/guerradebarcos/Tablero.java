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
    private static char[][] matrizTablero = new char[10][10];
    private static char barco;

    public Tablero() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizTablero[i][j] = CASILLAAGUA;
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
                System.out.print(Tablero.matrizTablero[i][j] + " ");
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

    public static boolean comprobarPosiciones(int fila, int col, int posBarcoVH, int tamanioBarco) {
        boolean posicionValida = false;
        
        if ((fila - 1) >= 0 && (col - 1) >= 0) {
            if (posBarcoVH == 0 && tamanioBarco == 5) {
                //barco 'e' Horizontal
                if (matrizTablero[fila - 1][col - 1] == CASILLAAGUA && matrizTablero[fila - 1][col] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 1] == CASILLAAGUA && matrizTablero[fila - 1][col + 2] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 3] == CASILLAAGUA && matrizTablero[fila - 1][col + 4] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 5] == CASILLAAGUA && matrizTablero[fila][col + 5] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 5] == CASILLAAGUA && matrizTablero[fila + 1][col + 4] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 3] == CASILLAAGUA && matrizTablero[fila + 1][col + 2] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 1] == CASILLAAGUA && matrizTablero[fila + 1][col] == CASILLAAGUA
                        && matrizTablero[fila + 1][col - 1] == CASILLAAGUA && matrizTablero[fila][col - 1] == CASILLAAGUA) {
                    posicionValida = true;
                }
            } else if (posBarcoVH == 1 && tamanioBarco == 5) {
                //barco 'e' Vertical
                if (matrizTablero[fila - 1][col - 1] == CASILLAAGUA && matrizTablero[fila - 1][col] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 1] == CASILLAAGUA && matrizTablero[fila][col + 1] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 1] == CASILLAAGUA && matrizTablero[fila + 2][col + 1] == CASILLAAGUA
                        && matrizTablero[fila + 3][col + 1] == CASILLAAGUA && matrizTablero[fila + 4][col + 1] == CASILLAAGUA
                        && matrizTablero[fila + 5][col + 1] == CASILLAAGUA && matrizTablero[fila + 5][col] == CASILLAAGUA
                        && matrizTablero[fila + 5][col - 1] == CASILLAAGUA && matrizTablero[fila + 4][col - 1] == CASILLAAGUA
                        && matrizTablero[fila + 3][col - 1] == CASILLAAGUA && matrizTablero[fila + 2][col - 1] == CASILLAAGUA
                        && matrizTablero[fila + 1][col - 1] == CASILLAAGUA && matrizTablero[fila][col - 1] == CASILLAAGUA) {
                    posicionValida = true;
                }
            }
            if (posBarcoVH == 0 && tamanioBarco == 4) {
                //barco 'g' Horizontal
                if (matrizTablero[fila - 1][col - 1] == CASILLAAGUA && matrizTablero[fila - 1][col] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 1] == CASILLAAGUA && matrizTablero[fila - 1][col + 2] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 3] == CASILLAAGUA && matrizTablero[fila - 1][col + 4] == CASILLAAGUA
                        && matrizTablero[fila][col + 4] == CASILLAAGUA && matrizTablero[fila + 1][col + 4] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 3] == CASILLAAGUA && matrizTablero[fila + 1][col + 2] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 1] == CASILLAAGUA && matrizTablero[fila + 1][col] == CASILLAAGUA
                        && matrizTablero[fila + 1][col - 1] == CASILLAAGUA && matrizTablero[fila][col - 1] == CASILLAAGUA) {
                    posicionValida = true;
                }
            } else if (posBarcoVH == 1 && tamanioBarco == 4) {
                //barco 'g' Vertical
                if (matrizTablero[fila - 1][col - 1] == CASILLAAGUA && matrizTablero[fila - 1][col] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 1] == CASILLAAGUA && matrizTablero[fila][col + 1] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 1] == CASILLAAGUA && matrizTablero[fila + 2][col + 1] == CASILLAAGUA
                        && matrizTablero[fila + 3][col + 1] == CASILLAAGUA && matrizTablero[fila + 4][col + 1] == CASILLAAGUA
                        && matrizTablero[fila + 4][col] == CASILLAAGUA && matrizTablero[fila + 4][col - 1] == CASILLAAGUA
                        && matrizTablero[fila + 3][col - 1] == CASILLAAGUA && matrizTablero[fila + 2][col - 1] == CASILLAAGUA
                        && matrizTablero[fila + 1][col - 1] == CASILLAAGUA && matrizTablero[fila][col - 1] == CASILLAAGUA) {
                    posicionValida = true;
                }
            }
            if (posBarcoVH == 0 && tamanioBarco == 3) {
                //barco 'm' Horizontal
                if (matrizTablero[fila - 1][col - 1] == CASILLAAGUA && matrizTablero[fila - 1][col] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 1] == CASILLAAGUA && matrizTablero[fila - 1][col + 2] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 3] == CASILLAAGUA && matrizTablero[fila][col + 3] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 3] == CASILLAAGUA && matrizTablero[fila + 1][col + 2] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 1] == CASILLAAGUA && matrizTablero[fila + 1][col] == CASILLAAGUA
                        && matrizTablero[fila + 1][col - 1] == CASILLAAGUA && matrizTablero[fila][col - 1] == CASILLAAGUA) {
                    posicionValida = true;
                }
            } else if (posBarcoVH == 1 && tamanioBarco == 3) {
                //barco 'm' Vertical
                if (matrizTablero[fila - 1][col - 1] == CASILLAAGUA && matrizTablero[fila - 1][col] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 1] == CASILLAAGUA && matrizTablero[fila][col + 1] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 1] == CASILLAAGUA && matrizTablero[fila + 2][col + 1] == CASILLAAGUA
                        && matrizTablero[fila + 3][col + 1] == CASILLAAGUA && matrizTablero[fila + 3][col] == CASILLAAGUA
                        && matrizTablero[fila + 3][col - 1] == CASILLAAGUA && matrizTablero[fila + 2][col - 1] == CASILLAAGUA
                        && matrizTablero[fila + 1][col - 1] == CASILLAAGUA && matrizTablero[fila][col - 1] == CASILLAAGUA) {
                    posicionValida = true;
                }
            }
            if (posBarcoVH == 0 && tamanioBarco == 2) {
                // barco 'p' horizontal
                if (matrizTablero[fila - 1][col - 1] == CASILLAAGUA && matrizTablero[fila - 1][col] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 1] == CASILLAAGUA && matrizTablero[fila - 1][col + 2] == CASILLAAGUA
                        && matrizTablero[fila][col + 2] == CASILLAAGUA && matrizTablero[fila + 1][col + 2] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 1] == CASILLAAGUA && matrizTablero[fila + 1][col] == CASILLAAGUA
                        && matrizTablero[fila + 1][col - 1] == CASILLAAGUA && matrizTablero[fila][col - 1] == CASILLAAGUA) {
                    posicionValida = true;
                }
            } else if (posBarcoVH == 1 && tamanioBarco == 2) {
                //barco 'p' Vertical
                if (matrizTablero[fila - 1][col - 1] == CASILLAAGUA && matrizTablero[fila - 1][col] == CASILLAAGUA
                        && matrizTablero[fila - 1][col + 1] == CASILLAAGUA && matrizTablero[fila][col + 1] == CASILLAAGUA
                        && matrizTablero[fila + 1][col + 1] == CASILLAAGUA && matrizTablero[fila + 2][col + 1] == CASILLAAGUA
                        && matrizTablero[fila + 2][col] == CASILLAAGUA && matrizTablero[fila + 2][col - 1] == CASILLAAGUA
                        && matrizTablero[fila + 1][col - 1] == CASILLAAGUA && matrizTablero[fila][col - 1] == CASILLAAGUA) {
                    posicionValida = true;
                }
            }
        }
        return posicionValida;
    }

    public static void posicionarBarco(int fila, int columna, int posVH, char barco, int tamanioBarco) {
        if (comprobarPosiciones(fila, columna, posVH, tamanioBarco) == true) {
            //posicionar los barcos en el tablero
            if ((fila >= 0 && fila <= 4) && (columna >= 0 && columna <= 4) && (matrizTablero[fila][columna] == '~')) {
                matrizTablero[fila][columna] = barco;
                if (posVH == 0) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        columna++;
                        if (matrizTablero[fila][columna] == '~') {
                            matrizTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                } else if (posVH == 1) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        fila++;
                        if (matrizTablero[fila][columna] == '~') {
                            matrizTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                }
            } else if ((fila >= 0 && fila <= 4) && (columna >= 5 && columna <= 9) && (matrizTablero[fila][columna] == '~')) {
                matrizTablero[fila][columna] = barco;
                if (posVH == 0) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        columna--;
                        if (matrizTablero[fila][columna] == '~') {
                            matrizTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                } else if (posVH == 1) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        fila++;
                        if (matrizTablero[fila][columna] == '~') {
                            matrizTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                }
            } else if ((fila >= 5 && fila <= 9) && (columna >= 5 && columna <= 9) && (matrizTablero[fila][columna] == '~')) {
                matrizTablero[fila][columna] = barco;
                if (posVH == 0) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        columna--;
                        if (matrizTablero[fila][columna] == '~') {
                            matrizTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                } else if (posVH == 1) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        fila--;
                        if (matrizTablero[fila][columna] == '~') {
                            matrizTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                }
            } else if ((fila >= 5 && fila <= 9) && (columna >= 0 && columna <= 4) && (matrizTablero[fila][columna] == '~')) {
                matrizTablero[fila][columna] = barco;
                if (posVH == 0) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        columna++;
                        if (matrizTablero[fila][columna] == '~') {
                            matrizTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                } else if (posVH == 1) {
                    for (int j = 1; j < tamanioBarco; j++) {
                        fila--;
                        if (matrizTablero[fila][columna] == '~') {
                            matrizTablero[fila][columna] = barco;
                        } else {
                            break;
                        }
                    }
                }
            }
        }

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

            posicionarBarco(fila, columna, posVH, barco, tamanioBarco);

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

    public static void bomba(int fila, int columna) {
        int contadorBarcoE = 0;
        int contadorBarcoG = 0;
        int contadorBarcoM = 0;
        int contadorBarcoP = 0;
        if (matrizTablero[fila][columna] == '~') {
            System.out.println("AGUA!!");
        } else if (matrizTablero[fila][columna] == 'e' || matrizTablero[fila][columna] == 'g' || matrizTablero[fila][columna] == 'm'
                || matrizTablero[fila][columna] == 'p') {
            System.out.println("TOCADO!!");
            if (matrizTablero[fila][columna] == 'e') {
                contadorBarcoE++;
            } else if (matrizTablero[fila][columna] == 'g') {
                contadorBarcoG++;
            } else if (matrizTablero[fila][columna] == 'm') {
                contadorBarcoM++;
            } else if (matrizTablero[fila][columna] == 'p') {
                contadorBarcoP++;
            }
        } else {
            System.out.println("Posición incorrecta! Estás fuera de los límites del tablero.");
        }

    }
    
    public static void jugar(){
        
    }

    public static char[][] getDimensionesTablero() {

        return matrizTablero;
    }

    public static void setDimensionesTablero(char[][] dimensionesTablero) {
        Tablero.matrizTablero = dimensionesTablero;
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
