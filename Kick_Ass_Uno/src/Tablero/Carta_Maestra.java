/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tablero;

/**
 *
 * @author Jacob Ramirez
 */
public class Carta_Maestra {

    public enum Color {NEGRO,VERDE,PURPURA,ROJO}

    protected Color TipodeColor;
    protected int NumerodeCarta;

    public Carta_Maestra(Color A, int B){
        TipodeColor = A;
        NumerodeCarta = B;
    }

    public Color Cual_Color(){
        return TipodeColor;
    }

    public int Cual_Numero(){
        return NumerodeCarta;
    }

    public String Cual_Carta(){
        String Cual = "";

        if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==0){
            Cual = "N0";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==1){
            Cual = "N1";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==2){
            Cual = "N2";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==3){
            Cual = "N3";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==4){
            Cual = "N4";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==5){
            Cual = "N5";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==6){
            Cual = "N6";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==7){
            Cual = "N7";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==8){
            Cual = "N8";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==9){
            Cual = "N9";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==10){
            Cual = "NR";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==11){
            Cual = "NS";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==12){
            Cual = "NT2";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==13){
            Cual = "NT4";
        }else if(TipodeColor.compareTo(Color.NEGRO)==0 && NumerodeCarta==14){
            Cual = "NC";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==0){
            Cual = "VO";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==1){
            Cual = "V1";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==2){
            Cual = "V2";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==3){
            Cual = "V3";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==4){
            Cual = "V4";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==5){
            Cual = "V5";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==6){
            Cual = "V6";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==7){
            Cual = "V7";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==8){
            Cual = "V8";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==9){
            Cual = "V9";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==10){
            Cual = "VR";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==11){
            Cual = "VS";
        }else if(TipodeColor.compareTo(Color.VERDE)==0 && NumerodeCarta==12){
            Cual = "VT2";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==0){
            Cual = "P0";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==1){
            Cual = "P1";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==2){
            Cual = "P2";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==3){
            Cual = "P3";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==4){
            Cual = "P4";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==5){
            Cual = "P5";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==6){
            Cual = "P6";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==7){
            Cual = "P7";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==8){
            Cual = "P8";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==9){
            Cual = "P9";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==10){
            Cual = "PR";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==11){
            Cual = "PS";
        }else if(TipodeColor.compareTo(Color.PURPURA)==0 && NumerodeCarta==12){
            Cual = "PT2";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==0){
            Cual = "R0";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==1){
            Cual = "R1";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==2){
            Cual = "R2";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==3){
            Cual = "R3";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==4){
            Cual = "R4";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==5){
            Cual = "R5";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==6){
            Cual = "R6";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==7){
            Cual = "R7";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==8){
            Cual = "R8";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==9){
            Cual = "R9";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==10){
            Cual = "RR";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==11){
            Cual = "RS";
        }else if(TipodeColor.compareTo(Color.ROJO)==0 && NumerodeCarta==12){
            Cual = "RT2";
        }else if(TipodeColor.compareTo(null)==0 && NumerodeCarta==12){
            Cual = "";
        }

        return Cual;
    }

    public int Puntaje(){
        if(NumerodeCarta>=0&&NumerodeCarta<=9){
            return NumerodeCarta;
        }else{
            int Valor = 0;

            if(NumerodeCarta==10||NumerodeCarta==11||NumerodeCarta==12){
                Valor = 20;
            }else if(NumerodeCarta==13 || NumerodeCarta==14){
                Valor = 50;
            }

            return Valor;
            }
    }

}
