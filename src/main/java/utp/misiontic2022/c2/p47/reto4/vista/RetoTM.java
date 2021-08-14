/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto4.vista;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;


/**
 *
 * @author ASUS
 */


public class RetoTM  extends AbstractTableModel{
private ArrayList<Requerimiento_1> requerimiento1;
//private List<Requerimiento_1> requeri;
//private Requerimiento_1 requerimiento1;

    public RetoTM(){
    this(new ArrayList<>());
}
     public RetoTM(ArrayList<Requerimiento_1> requerimiento1){
    this.requerimiento1=requerimiento1;
}
    @Override
    public String getColumnName(int column){
          switch (column){
        case 0:
            return "Lider";
        case 1:
            return "Cargo";
        case 2:
            return "# Proyectos";
           
    }
    return null;
    }
    
    @Override
    public int getRowCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return requerimiento1.size();
    }

    @Override
    public int getColumnCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    Requerimiento_1 requerimiento = requerimiento1.get(row);
    
    switch (column){
        case 0:
            return requerimiento.getNombre();
        case 1:
            return requerimiento.getCargo();
        case 2:
            return requerimiento.getProyectosN();
           
    }
    return null;
    }
    
    

}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

