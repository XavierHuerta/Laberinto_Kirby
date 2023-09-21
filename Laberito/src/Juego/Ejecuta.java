package Juego;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Ejecuta {
    public static void main(String []args){
        
        JFrame miventana=new JFrame("Proyecto Laberito");
        Juego game= new Juego(miventana);
        
        for(int i=0;i<5;i++){
            game.inicial();
        }
////        JPanel panel = new JPanel();
//        miventana.add(game);
//
//
//
//        //Construccion de la ventana
//        miventana.setSize(937, 560);
//        miventana.setLocation(300, 200);
//        miventana.setVisible(true);
//
//
//        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//
//
//        while(true){
//            try{
//                Thread.sleep(10);//retraso del movimiento y el personaje
//            } catch(InterruptedException ex){
//                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, game);//Excepciones que claramente se que hacen
//            }
//            miventana.repaint();//repintado para mover la pelota a su nueva posicion y borrar la anterior
//        }
    }
}
