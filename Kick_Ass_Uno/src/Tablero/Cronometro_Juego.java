/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tablero;

/**
 *
 * @author Huésped
 */
public class Cronometro_Juego implements Runnable{

    private int Segundos;
    private int Tiempo_Carga;
    Thread crono;

    public Cronometro_Juego(){
        crono = new Thread(this);
        crono.start();
    }

    public void run(){
        try{
            for(;;){
                if(Segundos==59){
                    Segundos=0;
                }

                if(Segundos==2){
                    Tiempo_Carga = Segundos;
                }

                Segundos++;

                crono.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}
