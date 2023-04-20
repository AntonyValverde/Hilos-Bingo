
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antony
 */
public class Productor extends Thread{
     
    private Buffer buffer; 
    //private final String letras = "1234567890";
    private final int numero = 77;
    public Productor (Buffer buf){
        
        this.buffer = buf; 
    }
    
    public void run(){
        
        
        while(true){
            try {
                
                int numero = (int) (Math.random() * 77 );
                String palabra = Integer.toString(numero);

                buffer.pruductor(palabra);
                System.out.println("La pelota "+palabra+"."); 
                sleep ((int) (Math.random() * 4000));
              
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
