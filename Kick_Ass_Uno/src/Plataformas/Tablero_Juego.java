/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tablero_Juego.java
 *
 * Created on 16-may-2011, 4:39:33
 */
package Plataformas;

import Tablero.Carta_Maestra;
import Tablero.Carta_Maestra.Color;
import Tablero.Cartas_Especiales;
import Tablero.Cartas_Numericas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Jacob Ramirez
 */
public class Tablero_Juego extends javax.swing.JPanel {

    protected Carta_Maestra[] BTemporal;
    protected static Carta_Maestra[] BarajaInicial, BarajaFinal, CJugador1, CJugador2;
    private Carta_Maestra Baraja = new Carta_Maestra(Color.NEGRO,0);
    private Cartas_Numericas BarajaNumerica = new Cartas_Numericas(Color.NEGRO,0);
    private Cartas_Especiales BarajaEspecial = new Cartas_Especiales(Color.NEGRO,0);
    private int Inicio_BarajaInicial = 0, Inicio_BarajaFinal = 0, Fin_BJ1 = 0, Fin_BJ2 = 0, Comp1=0, Comp2=0;
    private boolean ActivoJugador1 = false;
    private String Nom = "Hola";

    /** Creates new form Tablero_Juego */
    public Tablero_Juego() {
        initComponents();
        this.setSize(900,540);
        jLabel13.setText("Robe o descarte una carta");
        jLabel11.setText("Puntaje : ");
        jLabel12.setText("Carta12");
        jLabel14.setText("Carta14");
        jLabel15.setText("Descarte");
        list1.setEnabled(false);
        BTemporal = new Carta_Maestra[108];
        BarajaInicial = new Carta_Maestra[108];
        BarajaFinal = new Carta_Maestra[108];
        CJugador1 = new Carta_Maestra[108];
        CJugador2 = new Carta_Maestra[108];
        BarajaInicial = BarajaNumerica.Almacenar_Barajas(0, BTemporal,0).clone();
        BarajaInicial = BarajaEspecial.Almacenar_Barajas(0, BTemporal,76).clone();
        Barajear_TiroRobar();
        Barajear_Inicio();
        Barajear_Jugadores();

        if(ActivoJugador1==true){
            Publicar_Cartas(1);
        }else{
            Publicar_Cartas(2);
        }

        Imprimir_Puntajes();
        Imprimir_CJ();
        Publicar_Jugador();
        this.repaint();

    }

    public void paintComponent(Graphics g){
       Dimension Scale = getSize();
       ImageIcon Back = new ImageIcon((getClass().getResource("/Imagenes/Tablero_Juego.jpg")));
       g.drawImage(Back.getImage(),0,0,Scale.width,Scale.height,null);
       setOpaque(false);
       super.paintComponent(g);
    }

    public void Barajear_TiroRobar(){
        Carta_Maestra[] Temporal = new Carta_Maestra[108];
        Temporal = BarajaInicial.clone();
        Random Al = new Random();
        int Valor;

        for(int A=0; A<Temporal.length; A++){
            Valor = Al.nextInt(108);
            BarajaInicial[A] = Temporal[Valor];
        }
    }

    private void Barajear_Inicio(){
        CJugador1[Inicio_BarajaInicial] = BarajaInicial[Inicio_BarajaInicial];
        BarajaInicial[Inicio_BarajaInicial] = null;
        Comp1 += CJugador1[Inicio_BarajaInicial].Puntaje();

        ++Inicio_BarajaInicial;
        CJugador2[Inicio_BarajaInicial] = BarajaInicial[Inicio_BarajaInicial];
        BarajaInicial[Inicio_BarajaInicial] = null;
        Comp2 += CJugador2[Inicio_BarajaInicial].Puntaje();

        ++Inicio_BarajaInicial;

        if(Comp1==Comp2){
            Barajear_Inicio();
        }else{
            if(Comp1>Comp2)
                ActivoJugador1 = true;
        }

        BarajaFinal[Inicio_BarajaFinal] = BarajaInicial[Inicio_BarajaInicial];
        list1.add(BarajaFinal[Inicio_BarajaFinal].Cual_Carta());

        return;
    }

    private void Imprimir_Puntajes(){
        String Puntos = "";

        if(ActivoJugador1==true){
            Puntos += Comp1;
            jLabel12.setText(Puntos);
        }else{
            Puntos += Comp2;
            jLabel12.setText(Puntos);
        }
    }

    private void Imprimir_CJ(){
         System.out.println("/nCJugador1");
        for(Carta_Maestra dato : CJugador1){
            if(dato!=null){
                System.out.println("Carta = "+dato.Cual_Carta());
            }
        }

        System.out.println("/nCJugador2");

        for(Carta_Maestra dato : CJugador2){
            if(dato!=null){
                System.out.println("Carta = "+dato.Cual_Carta());
            }
        }
    }

    private void Barajear_Jugador1(int Contador){
        if(Contador<7){
            CJugador1[Inicio_BarajaInicial] = BarajaInicial[Inicio_BarajaInicial];
            BarajaInicial[Inicio_BarajaInicial] = null;
            ++Inicio_BarajaInicial;
            Barajear_Jugador1(++Contador);
        }
    }

    private void Barajear_Jugador2(int Contador){
        if(Contador<7){
            CJugador2[Inicio_BarajaInicial] = BarajaInicial[Inicio_BarajaInicial];
            BarajaInicial[Inicio_BarajaInicial] = null;
            ++Inicio_BarajaInicial;
            Barajear_Jugador2(++Contador);
        }
    }

    private void Barajear_Jugadores(){
        if(ActivoJugador1==true){
            Barajear_Jugador1(0);
            Barajear_Jugador2(0);
        }else{
            Barajear_Jugador2(0);
            Barajear_Jugador1(0);
        }
    }

    private void Publicar_Jugador(){
        if(ActivoJugador1==true){
            jLabel14.setText("Jugador No. 1");
        }else{
            jLabel14.setText("Jugador No. 2");
        }
        jLabel14.repaint();
    }

    private void Publicar_Cartas(int Jugador){

        if(Jugador==1){
            for(int A=0; A<CJugador1.length; A++){
                if(CJugador1[A]!=null)
                    list2.add(CJugador1[A].Cual_Carta());
            }
        }else{
            for(int A=0; A<CJugador2.length; A++){
                if(CJugador2[A]!=null)
                    list2.add(CJugador2[A].Cual_Carta());
            }
        }

    }

    private void Verificar_BarajaInicial(){
        for(int A=0; A<BarajaInicial.length; A++){
            if(BarajaInicial[A]!=null){
                return;
            }
        }

        BarajaInicial = BarajaNumerica.Almacenar_Barajas(0, BTemporal,0).clone();
        BarajaInicial = BarajaEspecial.Almacenar_Barajas(0, BTemporal,76).clone();
        Barajear_TiroRobar();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        list2 = new java.awt.List();
        jButton4 = new javax.swing.JButton();

        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(900, 540));
        setMinimumSize(new java.awt.Dimension(900, 540));

        jButton1.setEnabled(false);

        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jButton3.setText("Robo");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel15.setText("jLabel15");

        list1.setEnabled(false);

        jButton4.setText("Descartar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(210, 210, 210)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel11)
                .addGap(75, 75, 75)
                .addComponent(jLabel12)
                .addContainerGap(706, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel14)
                .addContainerGap(750, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(560, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(600, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(260, 260, 260))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel14)
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addGap(90, 90, 90)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(78, 78, 78))))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Verificar_BarajaInicial();

        if(ActivoJugador1==true){
            CJugador1[Inicio_BarajaInicial]=BarajaInicial[Inicio_BarajaInicial];
            BarajaInicial[Inicio_BarajaInicial]=null;
            ActivoJugador1=false;
        }else{
            CJugador2[Inicio_BarajaInicial]=BarajaInicial[Inicio_BarajaInicial];
            BarajaInicial[Inicio_BarajaInicial]=null;
            ActivoJugador1=true;
        }

        list2.removeAll();

        ++Inicio_BarajaInicial;
        if(ActivoJugador1==true){
            Publicar_Cartas(1);
        }else{
            Publicar_Cartas(2);
        }
        Publicar_Jugador();
        Imprimir_Puntajes();
        Imprimir_CJ();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

    }//GEN-LAST:event_jButton4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private java.awt.List list1;
    private java.awt.List list2;
    // End of variables declaration//GEN-END:variables

}
