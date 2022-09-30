/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.StringTokenizer;
import model.Jogador;

/**
 *
 * @author Guilherme Antunes
 */
public class ControllerTextoJogador extends ControllerArquivoTexto {
    
    private ArrayList<Jogador> j = new ArrayList();
    private String aux = "";
    
    public void lerJogador(){
        
        aux = getTexto();
        
        StringTokenizer string = new StringTokenizer(aux, ";");
        
        
    }
    
}
