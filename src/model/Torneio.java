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
public class Torneio {
    
    private String nome;
    private String pais;
    private int clubes;
    
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
    
    public int getClubes(){
        return this.clubes;
    }
    
    public void setClubes(int clubes){
        this.clubes = clubes;
    }
      
}
