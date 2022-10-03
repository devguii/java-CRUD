/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.StringTokenizer;
import model.Clube;

/**
 *
 * @author Guilherme Antunes
 */
public class ControllerTextoClube extends ControllerArquivoTexto {
    
    private ArrayList<Clube> c = new ArrayList();
    private String aux = "";
    
    public ArrayList getC(){
        return this.c;
    }
    
    public void lerClube(){
        
        aux = getTexto();
        
        StringTokenizer string = new StringTokenizer(aux, ";");
       
        c.clear();
        
        while (string.hasMoreTokens() == true) { 
            Clube clube = new Clube();
            clube.setNome(string.nextToken());
            clube.setFundacao(Integer.parseInt(string.nextToken()));
            clube.setPais(string.nextToken());
            c.add(clube);
        }
        
    }
    
    public void escreverClube(){
        StringBuilder sb = new StringBuilder();
        
        for (Clube cl : c) {
         sb.append(cl.getNome()).append(";");
         sb.append(cl.getFundacao()).append(";");
         sb.append(cl.getPais()).append(";");
      }
        
        setTexto(sb.toString());
    }
    
    public void adicionar(Clube cl){
        c.add(cl);
        setTexto(" Nome: " + cl.getNome() + "\n Ano de Fundação: " + String.valueOf(cl.getFundacao()) + " \n País: " + cl.getPais());
    }
    
    public void excluir(int indice){
        if(indice == 0){
            c.remove(indice);
            setTexto("");
        } else if(indice < 0) {
            setTexto("");
        } else {
            c.remove(indice);
            setTexto(" Nome: " + c.get(indice - 1).getNome() + "\n Ano de Fundação: " + String.valueOf(c.get(indice - 1).getFundacao()) + " \n País: " + c.get(indice - 1).getPais());
        }
    }
    
    public void editar(int indice, Clube cl ){
        c.get(indice).setNome(cl.getNome());
        c.get(indice).setFundacao(cl.getFundacao());
        c.get(indice).setPais(cl.getPais());
        setTexto(" Nome: " + c.get(indice).getNome() + "\n Ano de Fundação: " + String.valueOf(c.get(indice).getFundacao()) + " \n País: " + c.get(indice).getPais());
    }
    
    public void proximo(int indice){
        setTexto(" Nome: " + c.get(indice).getNome() + "\n Ano de Fundação: " + String.valueOf(c.get(indice).getFundacao()) + " \n País: " + c.get(indice).getPais());
    }
    
    public void anterior(int indice){
        setTexto(" Nome: " + c.get(indice - 1).getNome() + "\n Ano de Fundação: " + String.valueOf(c.get(indice - 1).getFundacao()) + " \n País: " + c.get(indice - 1).getPais());
    }
}
