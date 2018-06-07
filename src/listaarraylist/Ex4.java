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
    
    String numero1 = "";
    for (int i = 0; i < numeros.size(); i++) {
   
        numero1 += numeros.get(i) + "\n";
        
    }
    numeros.remove(3);
    JOptionPane.showMessageDialog(null, numero1);
    
    
    
    String numero2 = "";
    for (int i = 0; i < numeros.size(); i++) {
   
        numero2 += numeros.get(i) + "\n";
        
    }
    numeros.remove(4);
    JOptionPane.showMessageDialog(null, numero1);
    
    
    
    
    
}
}
