# Matrices. Guerra de barcos.
Crear una clase Tablero, debe contener una matriz de 10x10 que simboliza un tablero.
Al inicializase la clase (constructor) debe crearse la matriz y alojar aleatoriamente 5 barcos: 2 de de 2x1, 1 de 3x1, 1 de 4x1 y 1 de 5x1. Dos barcos no pueden ocupar la misma posición y deben estar completamente dentro del tablero. Tampoco pueden estar adyacentes, es decir, que alrededor de cada barco debe haber agua o nada, pero nunca otro barco. Los barcos estarán en horizontal o vertical (aleatoriamente) pero nunca en diagonal.
La clase Tablero tendrá todos los métodos necesarios para controlar la posición de los barcos, su estado etc..

También tendrá un método __bomba__(fila, columna) que devolverá:
- 0 si agua
- 1 si tocado
- 2 si hundido
- -1 si la fila o la columna exceden del tablero.

### Reglas:
- Los barcos se posicionan de manera aleatoria
- El jugador irá dando posiciones por teclado (A1, B8 ...) como en el típico juego. donde la letra es la __fila__ y el número la __columna__.
- El programa responderá al usuario agua, tocado o hundido.
- El juego acaba cuando el jugador se rinde, mediante el input 00 (‘cero cero’) o cuando se hunde todos los barcos.
- Al finalizar el programa siempre indicará el número de jugadas realizadas por el jugador.