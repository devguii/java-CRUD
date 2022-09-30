/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Guilherme Antunes
 */
public class Jogador {
    
    private String nome;
    private String posicao;
    private int idade;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getPosicao(){
        return this.nome;
    }
    
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    
}
