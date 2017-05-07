/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import br.com.pojo.Visitante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Paulo H
 */
public class TableModelVisitante extends AbstractTableModel {
    
    private List<Visitante> listaVisitante = new ArrayList<>();
    private final String[] nomeColuna = {"Nome", "Doc. Identificação", "Setor Visitado",
        "Data da Visita", "E-Mail"};
    
    private GenericDAO<Visitante> daoVisitante;
    
    public TableModelVisitante(){
    
        addVisitante();
    }
    
    public void addVisitante() {
        
        daoVisitante = new GenericDAO<>();
        Visitante visita = new Visitante();
        this.listaVisitante = daoVisitante.selecionaTodos(visita);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return listaVisitante.size();
    }
    
    @Override
    public int getColumnCount() {
        return nomeColuna.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            
            case 0:
                return this.listaVisitante.get(rowIndex).getNome();
            case 1:
                return this.listaVisitante.get(rowIndex).getDocumentoIdentidade();
            case 2:
                return this.listaVisitante.get(rowIndex).getSetor();
            case 3:
                return this.listaVisitante.get(rowIndex).getDataVisita();
            case 4:
                return this.listaVisitante.get(rowIndex).getEmailVisitante();
            default:
                return this.listaVisitante.get(rowIndex);
            
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
    
        return this.nomeColuna[columnIndex];
    }
    
}
