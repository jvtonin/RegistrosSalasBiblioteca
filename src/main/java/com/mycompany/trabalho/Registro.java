/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;
import java.io.Serializable;

/**
 *
 * @author jvton
 */
public class Registro implements Serializable{


    private String nome;
    private String matricula;
    private String andar;
    private String sala;
    private String data;
    private String entrada;
    private String saida;
    
    
    public Registro(){
        
    }
    
    public Registro(String nome, String matricula, String andar, String sala, String data, String entrada, String saida) {
        this.nome = nome;
        this.matricula = matricula;
        this.andar = andar;
        this.sala = sala;
        this.data = data;
        this.entrada = entrada;
        this.saida = saida;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }
    
}

  