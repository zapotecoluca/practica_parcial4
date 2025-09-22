/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_parcial4;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numeros ={22,25,33,45,28,23};
        int objetivo = 45;
        int posicion = busquedaSecuencial(numeros, objetivo);
        
        if (posicion != -1) {
            System.out.println("Encontrado en posicion " + (posicion+1));
        } else {
            System.out.println("No se encontro" );
        }
    }
    
    public static int busquedaSecuencial(int[] numeros, int objetivo) {
        
        for(int i = 0; i < numeros.length; i++) {
        if (numeros[i] == objetivo) {
            return i;
            }
        }
        return -1;
    }
    
}
