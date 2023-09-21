package Juego;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
//import java.awt.event.KeyEvent;

public class Meta {
    
    static public int nivel=1;
    
    public Meta(){
        
    }
    
    public void paint(Graphics grafico, int fila, int columna){
        grafico.setColor(Color.red);
        grafico.fillRect(columna*40, fila*40, 40, 40);
        grafico.setColor(Color.black);
        grafico.drawRect(columna*40, fila*40, 40, 40);
    }
    
    public void Evento(){
        nivel++;
        if(nivel >= 5){
            System.exit(0);
        }
    }
    
    public int Nivel(){
        return nivel;
    }
}
