/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.StringTokenizer;
import model.Torneio;

/**
 *
 * @author Guilherme Antunes
 */
public class ControllerTextoTorneio extends ControllerArquivoTexto {
    
    private ArrayList<Torneio> t = new ArrayList();
    private String aux = "";
    
    public ArrayList getT(){
        return this.t;
    }
    
    public void lerTorneio(){
        
        aux = getTexto();
        
        StringTokenizer string = new StringTokenizer(aux, ";");
       
        t.clear();
        
        while (string.hasMoreTokens() == true) { 
            Torneio torneio = new Torneio();
            torneio.setNome(string.nextToken());
            torneio.setClubes(Integer.parseInt(string.nextToken()));
            torneio.setPais(string.nextToken());
            t.add(torneio);
        }
        
    }
    
    public void escreverTorneio(){
        StringBuilder sb = new StringBuilder();
        
        for (Torneio to : t) {
         sb.append(to.getNome()).append(";");
         sb.append(to.getClubes()).append(";");
         sb.append(to.getPais()).append(";");
      }
        
        setTexto(sb.toString());
    }
    
    public void adicionar(Torneio to){
        t.add(to);
        setTexto(" Nome: " + to.getNome() + "\n Quantidade de clubes: " + String.valueOf(to.getClubes()) + " \n País: " + to.getPais());
    }
    
    public void excluir(int indice){
        if(indice == 0){
            t.remove(indice);
            setTexto("");
        } else if(indice < 0) {
            setTexto("");
        } else {
            t.remove(indice);
            setTexto(" Nome: " + t.get(indice - 1).getNome() + "\n Quantidade de clubes: " + String.valueOf(t.get(indice - 1).getClubes()) + " \n País: " + t.get(indice - 1).getPais());
        }
    }
    
    public void editar(int indice, Torneio to ){
        t.get(indice).setNome(to.getNome());
        t.get(indice).setClubes(to.getClubes());
        t.get(indice).setPais(to.getPais());
        setTexto(" Nome: " + t.get(indice).getNome() + "\n Quantidade de clubes: " + String.valueOf(t.get(indice).getClubes()) + " \n País: " + t.get(indice).getPais());
    }
    
    public void proximo(int indice){
        setTexto(" Nome: " + t.get(indice).getNome() + "\n Quantidade de clubes: " + String.valueOf(t.get(indice).getClubes()) + " \n País: " + t.get(indice).getPais());
    }
    
    public void anterior(int indice){
        setTexto(" Nome: " + t.get(indice - 1).getNome() + "\n Quantidade de clubes: " + String.valueOf(t.get(indice - 1).getClubes()) + " \n País: " + t.get(indice - 1).getPais());
    }
}
