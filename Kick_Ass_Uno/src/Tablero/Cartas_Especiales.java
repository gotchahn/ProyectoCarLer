/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tablero;

/**
 *
 * @author Jacob Ramirez
 */
public class Cartas_Especiales extends Carta_Maestra{

    public Cartas_Especiales(Color A, int B){
        super(A,B);
    }

     public Carta_Maestra[] Almacenar_Barajas(int Volatil, Carta_Maestra[] BarajaInicial, int Posi){
         if(Volatil<4){
             if(Volatil==0){
                 for(int A=0; A<2; A++){
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.NEGRO,10);
                     ++Posi;
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.VERDE,10);
                     ++Posi;
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.PURPURA,10);
                     ++Posi;
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.ROJO,10);
                     ++Posi;
                 }
                 return Almacenar_Barajas(++Volatil, BarajaInicial, Posi);
             }

             if(Volatil==1){
                 for(int A=0; A<2; A++){
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.NEGRO,11);
                     ++Posi;
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.VERDE,11);
                     ++Posi;
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.PURPURA,11);
                     ++Posi;
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.ROJO,11);
                     ++Posi;
                 }
                 return Almacenar_Barajas(++Volatil, BarajaInicial, Posi);
             }

             if(Volatil==2){
                 for(int A=0; A<2; A++){
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.NEGRO,12);
                     ++Posi;
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.VERDE,12);
                     ++Posi;
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.PURPURA,12);
                     ++Posi;
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.ROJO,12);
                     ++Posi;
                 }
                 return Almacenar_Barajas(++Volatil, BarajaInicial, Posi);
             }

             if(Volatil==3){
                 for(int A=0; A<4; A++){
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.NEGRO,13);
                     ++Posi;
                     BarajaInicial[Posi]=new Cartas_Especiales(Color.NEGRO,14);
                     ++Posi;
                 }
                 return Almacenar_Barajas(++Volatil, BarajaInicial, Posi);
             }

         }

         return BarajaInicial;
         
    }
}
