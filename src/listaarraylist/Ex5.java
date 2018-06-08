/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaarraylist;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class Ex5 {
    
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add(JOptionPane.showInputDialog("Digite um nome ai meu querido"));
        nomes.add(JOptionPane.showInputDialog("Digite um nome ai meu querido"));
        nomes.add(JOptionPane.showInputDialog("Digite um nome ai meu querido"));
        nomes.add(JOptionPane.showInputDialog("Digite um nome ai meu querido"));
        
        String quintoNome = JOptionPane.showInputDialog("Verifique se o nome está na lista");
        
        
       
            if (nomes.contains(quintoNome)) {
                JOptionPane.showMessageDialog(null, "este nome contém na lista");
        } else {
                JOptionPane.showMessageDialog(null, "este nome não contém na lista");
            }
        
            
        
        
        
    }
    
}
