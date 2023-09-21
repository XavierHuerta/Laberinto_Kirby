package Juego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Personaje {
    
    Laberito lab=new Laberito();
    private int x=40;
    private int y=40;
    private final int ancho=40;
    private final int alto=40;
    private final int movimiento=40;
    Meta meta=new Meta();
    
    public Personaje(){
        
    }
            
    //Construccion grafico del personaje
    public void paint(Graphics2D g){
        ImageIcon kirby=new ImageIcon(getClass().getResource("/Imagenes/personaje1.jpeg"));
        g.drawImage(kirby.getImage(), x, y, ancho, alto, null);
    }
    
    //Asignacion de los movimientos del personaje
    //Idea, dar la posibilidad al usuario de cambiar las teclas por las que el desee
    public void teclaPresionada(KeyEvent evento, JFrame miventana){//37,38,39,40 son el valor de teclado de la flechas
        int [][]laberito=lab.obtieneLaberito();
        if(evento.getKeyCode()==37){//flecha izquierda
            if(laberito[y/40][(x/40)-1]!=1){
                x=x-movimiento;
                if(laberito[y/40][(x/40)]==2){
                    meta.Evento();
                    x=40;
                    y=40;
                }
            }
        }
        
        if(evento.getKeyCode()==39){//flecha derecha
            if(laberito[y/40][(x/40)+1]!=1){
                x=x+movimiento;
                if(laberito[y/40][(x/40)]==2){
                    meta.Evento();
                    x=40;
                    y=40;
                }
            }
        }
        
        if(evento.getKeyCode()==40){//flecha abajo
            if(laberito[(y/40)+1][x/40]!=1){
                y=y+movimiento;
                if(laberito[(y/40)][x/40]==2){
                    meta.Evento();
                    x=40;
                    y=40;
                }
            }
        }
        
        if(evento.getKeyCode()==38){//flecha arriba
            if(laberito[(y/40)-1][x/40]!=1){
                y=y-movimiento;
                if(laberito[(y/40)][x/40]==2){
                    meta.Evento();
                    x=40;
                    y=40;                
                }
            }
        }
        
    }
}
