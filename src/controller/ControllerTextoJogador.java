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
    
    public ArrayList getJ(){
        return this.j;
    }
    
    public void lerJogador(){
        
        aux = getTexto();
        
        StringTokenizer string = new StringTokenizer(aux, ";");
        
        while (string.hasMoreTokens() == true) { 
            Jogador jogador = new Jogador();
            jogador.setNome(string.nextToken());
            jogador.setIdade(Integer.parseInt(string.nextToken()));
            jogador.setPosicao(string.nextToken());;
            j.add(jogador);
        }
        
    }
    
    public void adicionar(Jogador jo){
        j.add(jo);
        setTexto(" Nome: " + jo.getNome() + "\n Idade: " + String.valueOf(jo.getIdade()) + " \n Posição: " + jo.getPosicao());
    }
    
}
