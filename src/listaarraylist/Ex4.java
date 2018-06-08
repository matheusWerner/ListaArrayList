package listaarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Ex4 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
            for (int i = 0; i < 10; i++) {
                
                numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero")));
            }
            
   String olha = ""; 
   for (int i = 0; i < numeros.size(); i++) {
        
       olha += numeros.get(i) + "\n";
        
    }
   JOptionPane.showMessageDialog(null, olha);
   
   
    numeros.remove(3);
    String numero1 = "";
    for (int i = 0; i < numeros.size(); i++) {
   
        numero1 += numeros.get(i) + "\n";
        
    }
    
    JOptionPane.showMessageDialog(null, numero1);
    
    
    
    numeros.remove(4);
    String numero2 = "";
    for (int i = 0; i < numeros.size(); i++) {
   
        numero2 += numeros.get(i) + "\n";
        
    }
    
    JOptionPane.showMessageDialog(null,"numeros sem a posicao 4 e posicao 5" + numero2 + "\nquantidade de numeros que restaram: " + numeros.size());
    
    
    
    
    
    
}
}
