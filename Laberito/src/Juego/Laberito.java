package Juego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

public class Laberito {
    
    private int fila=0;
    private int columna=0;
    private final int numeroFilas=13;
    private final int numeroColumnas=23;
    private final int altobloque=40;
    private final int anchobloque=40;
    Meta meta=new Meta();
    
    public Laberito(){
        
    }
    
    //Construccion de la paredes, posibidad de pasarlo a una clase aparte
    public void paint (Graphics2D g){
        int[][]laberito=obtieneLaberito();
        ImageIcon escenario=new ImageIcon(getClass().getResource("/Imagenes/escenario.jpeg"));
        
        for(fila=0;fila<numeroFilas;fila++){//for que recorre las columnas
            for(columna=0;columna<numeroColumnas;columna++){//for que recorre las filas
                if (laberito[fila][columna]==1){//condicional que coloca paredes en la posicion asignada
                    g.drawImage(escenario.getImage(), columna*40, fila*40, anchobloque, altobloque, null);
                }else if(laberito[fila][columna]==2){
                    meta.paint(g, fila, columna);
                }
            }
        }
        
    }
    
    //Asignacion del laberito, los 1 son las parede y los 0 espacion vacios
    public int[][] obtieneLaberito(){
        int lab[][]=new int[13][23];
        
        switch (meta.Nivel()){
            case 1:
                int level1[][]={{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,1,1,0,1,0,0,0,1,1,0,0,0,0,1,0,0,0,1},
                {1,1,1,1,0,0,0,0,1,0,1,0,0,1,0,1,1,0,0,0,1,1,1},
                {1,1,0,0,0,1,1,1,1,0,1,1,1,1,0,0,1,0,1,0,0,0,1},
                {1,0,0,1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,0,1,1,1},
                {1,1,0,0,0,0,0,1,1,1,1,1,0,1,0,0,0,1,0,0,0,0,1},
                {1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1,0,1,1,0,1},
                {1,0,0,1,0,1,0,0,0,0,1,1,0,1,1,1,0,1,1,1,1,0,1},
                {1,0,1,1,0,1,0,1,1,0,0,1,0,1,0,0,0,0,1,0,0,0,1},
                {1,0,0,1,0,0,0,1,1,1,0,0,0,1,0,1,0,1,1,0,1,1,1},
                {1,0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,0,0,1,0,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,2,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
               };
                lab=level1;
                break;
            case 2:
                int [][] level2 =
                {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                 {1,0,1,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,1,0,1,0,1},
                 {1,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,0,1},
                 {1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,0,1},
                 {1,0,0,0,0,0,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1},
                 {1,0,1,1,1,1,1,1,1,0,1,0,0,0,0,1,0,0,0,1,1,0,1},
                 {1,0,1,0,1,0,0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,0,1},
                 {1,0,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
                 {1,0,1,0,0,0,1,0,1,0,1,1,0,1,1,1,0,1,0,1,1,1,1},
                 {1,0,1,0,1,0,0,0,1,0,1,0,0,1,0,1,0,1,0,0,0,0,1},
                 {1,0,1,1,1,1,1,1,1,0,1,0,1,1,0,1,0,1,1,1,1,1,1},
                 {1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,2,1},
                 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                };
                lab=level2;
                break;
            case 3:
                int [][] level3 =
                {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                 {1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                 {1,0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,0,1},
                 {1,0,0,0,0,0,0,1,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1},
                 {1,0,1,1,0,1,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1},
                 {1,0,1,0,0,1,0,0,0,0,0,1,1,1,1,1,0,1,1,0,1,1,1},
                 {1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1},
                 {1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                 {1,0,1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,1,0,1,0,1},
                 {1,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,1},
                 {1,0,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1},
                 {1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1},
                 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                };
                lab=level3;
                break;
            case 4:
                int [][] level4 =
                {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                 {1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,0,0,1},
                 {1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,1},
                 {1,0,1,0,1,0,1,0,0,0,1,0,1,0,1,1,1,1,1,0,1,0,1},
                 {1,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,0,0,0,1,0,1},
                 {1,0,1,0,1,0,0,0,0,0,0,0,1,1,1,0,1,1,1,1,1,0,1},
                 {1,0,1,0,1,1,1,1,1,1,0,1,1,0,0,0,1,0,0,0,0,0,1},
                 {1,0,1,0,1,0,0,0,0,0,0,1,1,1,1,0,1,0,1,1,0,1,1},
                 {1,0,1,0,1,0,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,0,1},
                 {1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,0,1,0,1,1,1,1,1},
                 {1,0,1,1,1,1,1,0,0,0,1,0,0,0,1,1,1,0,1,0,0,0,1},
                 {1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,1,2,1},
                 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                };
                lab=level4;
                break;
                
        }
            

        return lab;
    }
}
