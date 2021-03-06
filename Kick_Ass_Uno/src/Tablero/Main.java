/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on 04-may-2011, 8:47:27
 */

package Tablero;

import Plataformas.Menu_Jugar;
import Plataformas.Plataforma_Cargando;
import Plataformas.Plataforma_Menu;
import Plataformas.Plataforma_Presentacion;
import Plataformas.Tablero_Juego;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

/**
 *
 * @author Jacob Ramirez
 */
public class Main extends javax.swing.JFrame implements Runnable{

    /** Creates new form Main */
    Plataforma_Presentacion Presentacion = new Plataforma_Presentacion();
    Plataforma_Cargando Cargando;
    Plataforma_Menu Menu;
    Menu_Jugar MJugar;
    Tablero_Juego Tablero;
    private int Segundos;
    Thread crono;

    public Main() {
        initComponents();
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        Presentacion.setVisible(true);
        this.add(Presentacion,BorderLayout.CENTER);
        this.pack();
        this.setIconImage (new ImageIcon((getClass().getResource("/Imagenes/danger.png"))).getImage());
        this.setTitle("Iniciando carga de archivos...");
        crono = new Thread(this);
        crono.start();

    }

     public void run(){
        try{
            for(;;){

                if(Segundos==11){
                   this.getContentPane().removeAll();
                   this.getContentPane().add(Cargando = new Plataforma_Cargando(),0);
                   this.repaint();
                   this.setTitle("Finalizando carga de archivos...");
                }

                if(Segundos==15){
                    this.getContentPane().removeAll();
                    this.getContentPane().add(Menu = new Plataforma_Menu(),0);
                    this.repaint();
                    this.setTitle("Kick Ass UNO - Ingeniería en Sistemas Computacionales");
                }

                if(Menu != null){
                    if(Menu.Cambio_JugarMenu()==1){
                        Menu.Cambiar_BJugarMenu();
                        this.getContentPane().removeAll();
                        this.getContentPane().add(MJugar = new Menu_Jugar(),0);
                        this.repaint();
                    }
                }

                if(MJugar != null){
                    if(MJugar.Cambio_Jugar()==1){
                        MJugar.Cambiar_BJugar();
                        this.getContentPane().removeAll();
                        this.getContentPane().add(Tablero = new Tablero_Juego(),0);
                        this.repaint();
                    }
                }

                Segundos++;

                crono.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loading program files... Just wait a minutes");
        setMinimumSize(new java.awt.Dimension(900, 540));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }   
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
