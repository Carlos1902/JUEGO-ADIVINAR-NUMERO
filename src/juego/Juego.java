
package juego;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Juego {

    
    public static void main(String[] args) {
        Adivinar();
        
    }
    public static void Adivinar(){
         int numsecr =(int)(Math.random()*100);
        int num1=0,num2=0;
        int intentos1=4;
        int intentos2=4;
         int desea;
         System.out.println("objeto \n moto");
         System.out.println("precio"+numsecr);
        
         num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor jugador 1 "));
         if(num1==numsecr&&intentos1<=4){
              JOptionPane.showMessageDialog(null,"el numero es correcto jugador 1:  ");
         }
         else{
              num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor jugador 2 "));
                   if(num2==numsecr&&intentos2<=4) {
                       JOptionPane.showMessageDialog(null,"el numero es correcto jugador 2:  ");
             
         }}
         while  (num1!=numsecr&&intentos1>=1){
             intentos1--;
             if(num1>numsecr){
              JOptionPane.showMessageDialog(null,"el numero no es jugador 1,es menor:  "+intentos1+"\n intentos");
             }
             else 
                 if(num1<numsecr){
                     JOptionPane.showMessageDialog(null,"el numero no es jugador 1,es mayor:  "+intentos1+"\n intentos");
                 }
              num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor jugador 1 "));
              if(num2!=numsecr&&intentos2>=1){
                  intentos2--;
                  if(num2>numsecr){
                      JOptionPane.showMessageDialog(null,"el numero no es jugador 2,es menor:  "+intentos2+"\n intentos");
                  }
                  else
                      if(num2<numsecr){
                          JOptionPane.showMessageDialog(null,"el numero no es jugador 2,es mayor:  "+intentos2+"\n intentos");
                          
                      }
                          
              num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor jugador 2"));
              }
              if(num1==numsecr&&intentos1<4){
                   JOptionPane.showMessageDialog(null,"felicidades lograste encontar el numero jugador 1:  "+intentos1+"\n intentos"); 
                  
                   JOptionPane.showMessageDialog(null,"desea jugar de nuevo");
                    desea = Integer.parseInt(JOptionPane.showInputDialog("1.si\n 0.no"));
                  
                   
              }
              
              
              else
                  if(num2==numsecr&&intentos2<4){
                      JOptionPane.showMessageDialog(null,"felicidades lograste encontar el numero jugador2:  "+intentos2+"\n intentos");  
                       JOptionPane.showMessageDialog(null,"desea jugar de nuevo");
                    desea = Integer.parseInt(JOptionPane.showInputDialog("1.si\n 0.no"));
                  }
              else
                      
                  if(num1!=numsecr&&intentos1==0 && num2!=numsecr&&intentos1==0 ){
                       JOptionPane.showMessageDialog(null,"perdieron el numero era:\n"+numsecr );
                  }
                  
                           
         }
        
    }
}

  
