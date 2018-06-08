/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Ex6 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 15; i++){
            
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número")));
        }
        
        
        String apresenta = "";
        for (int i = 0; i < numeros.size(); i++) {
            apresenta += numeros.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, apresenta);
        
    }
    
}
