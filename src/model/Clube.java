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
public class Clube {
    
    private String nome;
    private String pais;
    private int fundacao;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getPais(){
        return this.pais;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }
    
    public int getFundacao(){
        return this.fundacao;
    }
    
    public void setFundacao(int fundacao){
        this.fundacao = fundacao;
    }
    
}
