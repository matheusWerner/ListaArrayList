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
public class Ex7 {
    
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        
        
        for(int i = 0; i < 25; i++) {
            nomes.add(JOptionPane.showInputDialog("Digite um nome"));
        }
        
        
        String totalNomes = "";
        for (int i = 0; i < nomes.size(); i++) {
            totalNomes = nomes.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, totalNomes);
        
        
        String maiorNome = "";
        for (int i = 0; i < nomes.size(); i++) {
            
            
            
           
        }
        
        
    }
    
}

