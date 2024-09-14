/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.torrehanoi;

/**
 *
 * @author pedrizquierdo
 */
public class TorreHanoi {

        // Método recursivo para mover los discos de una torre a otra
        static void moverDiscos(int n, String inicio, String destino, String auxiliar) {
            if(n == 0){ // Caso base: si no hay discos que mover, se termina la recursión
            return; // Termina la ejecución si n es 0
        }
            // Mueve n-1 discos de la torre de inicio a la torre auxiliar
        moverDiscos(n-1, inicio, auxiliar, destino);
        
            // Muestra el movimiento actual: mover el disco n de la torre inicio a la torre destino
            System.out.println("Mover disco " + n + " desde: " + inicio + " hacia: " +  destino);
            
             // Mueve los n-1 discos desde la torre auxiliar a la torre destino
            moverDiscos(n - 1, auxiliar, destino, inicio);
                }
        
        // Método principal del programa
        public static void main(String args[])
    {
        int N = 4;  // Número de discos a mover en la Torre de Hanói

        // A, B y C son los nombres de las torres
        moverDiscos(N, "A", "B", "C");          // Llama al método para mover N discos de la torre A a la B, usando C como auxiliar
        
        
    }
    }




    

