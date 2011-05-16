/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tablero;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jacob Ramirez
 */
public class Cartas_Jugadores extends Carta_Maestra{

    public Cartas_Jugadores(Color A, int B){
        super(A,B);
    }

     public void Almacenar_Barajas(int Volatil, ArrayList BarajaInicial){

     }

    public boolean Vacia_Baraja(int Jugador){
        boolean Veri = false;

        return Veri;
    }

    private String Tipo_Color(){
        return TipodeColor.toString();
    }

    public int Numero_Carta(){
        return NumerodeCarta;
    }

}
