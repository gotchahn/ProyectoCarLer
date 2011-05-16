/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tablero;

import java.util.Scanner;

/**
 *
 * @author Jacob Ramirez
 */
public class Jugadores {

    protected String Nombre;
    protected int Edad;
    protected char Genero;
    protected boolean Activo;
    protected int Puntaje;
    protected static Scanner Leer = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));

    public Jugadores(String A, int B, char C){

        while(A.compareTo(" ")==0){
            System.out.print("\n\tIngrese el Nombre Correctamente = ");
            Nombre = Leer.next();
        }

        while(B>99 || B<7){
            System.out.print("\n\tIngrese la Edad Correctamente = ");
            Edad = Leer.nextInt();
        }

        while(C!='M' || C!='F'){
            System.out.print("\n\tIngrese el Genero Correctamente = ");
            Genero = Leer.next().charAt(0);
        }

        Activo = true;
        Puntaje = 0;

    }

}
