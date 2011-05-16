/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tablero;

/**
 *
 * @author Jacob Ramirez
 */
public class Cartas_Numericas extends Carta_Maestra{

    public Cartas_Numericas(Color A, int B){
        super(A,B);
    }

    public Carta_Maestra[] Almacenar_Barajas(int Volatil, Carta_Maestra[] BarajaInicial, int Posi){
        if(Volatil < 10){
            if(Volatil==0){
                BarajaInicial[Posi]=new Cartas_Numericas(Color.NEGRO,Volatil);
                ++Posi;
                BarajaInicial[Posi]=new Cartas_Numericas(Color.VERDE,Volatil);
                ++Posi;
                BarajaInicial[Posi]=new Cartas_Numericas(Color.PURPURA,Volatil);
                ++Posi;
                BarajaInicial[Posi]=new Cartas_Numericas(Color.ROJO,Volatil);
                Almacenar_Barajas(++Volatil, BarajaInicial,++Posi);
            }else{
                BarajaInicial[Posi]=new Cartas_Numericas(Color.NEGRO,Volatil);
                ++Posi;
                BarajaInicial[Posi]=new Cartas_Numericas(Color.NEGRO,Volatil);
                ++Posi;
                BarajaInicial[Posi]=new Cartas_Numericas(Color.VERDE,Volatil);
                ++Posi;
                BarajaInicial[Posi]=new Cartas_Numericas(Color.VERDE,Volatil);
                ++Posi;
                BarajaInicial[Posi]=new Cartas_Numericas(Color.PURPURA,Volatil);
                ++Posi;
                BarajaInicial[Posi]=new Cartas_Numericas(Color.PURPURA,Volatil);
                ++Posi;
                BarajaInicial[Posi]=new Cartas_Numericas(Color.ROJO,Volatil);
                ++Posi;
                BarajaInicial[Posi]=new Cartas_Numericas(Color.ROJO,Volatil);
                Almacenar_Barajas(++Volatil, BarajaInicial,++Posi);
            }
        }

        return BarajaInicial;
    }

}
