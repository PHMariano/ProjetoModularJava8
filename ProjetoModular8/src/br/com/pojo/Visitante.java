/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.pojo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Paulo H
 */
@Entity
public class Visitante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String documentoIdentidade;
    private String emailVisitante;
    private String setor;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVisita;
    private String responsavelSetor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentoIdentidade() {
        return documentoIdentidade;
    }

    public void setDocumentoIdentidade(String documentoIdentidade) {
        this.documentoIdentidade = documentoIdentidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Date getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(Date dataVisita) {
        this.dataVisita = dataVisita;
    }

    public String getResponsavelSetor() {
        return responsavelSetor;
    }

    public void setResponsavelSetor(String responsavelSetor) {
        this.responsavelSetor = responsavelSetor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailVisitante() {
        return emailVisitante;
    }

    public void setEmailVisitante(String telefoneVisitante) {
        this.emailVisitante = telefoneVisitante;
    }

    
}
