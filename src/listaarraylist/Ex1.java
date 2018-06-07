
package listaarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ex1 {

  
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();   
        
        for (int i = 0; i < 15; i++) {
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número")));
        }
        
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i) );
        }
        
        
    }
    
}

