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
        
        
        for(int i = 0; i < 5; i++) {
            nomes.add(JOptionPane.showInputDialog("Digite um nome"));
        }
        
        
       String totalNomes = "";
        for (int i = 0; i < nomes.size(); i++) {
            totalNomes += nomes.get(i) + "\n";
            
        }
        JOptionPane.showMessageDialog(null, totalNomes);
        
        
        
        String maiorNome = "";
        for (int i = 0; i < nomes.size(); i++) {
           if(nomes.get(i).length() > maiorNome.length()) {
               maiorNome = nomes.get(i);
           }          
        }
        JOptionPane.showMessageDialog(null, maiorNome);
        
        String menorNome = "";
        for (int i = 0; i < nomes.size(); i++) {
             if(nomes.get(i).length() > menorNome.length()) {
               menorNome = nomes.get(i);
           }
        } 
            for (int j = 0; j < nomes.size(); j++){
               if(nomes.get(j).length() < menorNome.length()) {
               menorNome = nomes.get(j);
           }  
        }
        
        JOptionPane.showMessageDialog(null, menorNome);
        
        int quantPaulo = 0;
        
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).contains("Paulo")) {
                quantPaulo++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidad de Paulo é: " + quantPaulo);
        
        int quantAna = 0;
        
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).contains("Ana")) {
                quantPaulo++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidad de Paulo é: " + quantAna);
       
        
    }
    
}

