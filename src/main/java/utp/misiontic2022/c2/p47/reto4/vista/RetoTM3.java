/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto4.vista;

//import java.awt.List;
import java.util.ArrayList;
//import java.util.HashSet;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;


/**
 *
 * @author ASUS
 */


public class RetoTM3  extends AbstractTableModel{
private ArrayList<Requerimiento_3> requerimiento3;
//private List<Requerimiento_1> requeri;
//private Requerimiento_1 requerimiento1;

    public RetoTM3(){
    this(new ArrayList<>());
    
}
     public RetoTM3(ArrayList<Requerimiento_3> requerimiento3){
    this.requerimiento3=requerimiento3;
}
    @Override
    public String getColumnName(int column){
          switch (column){
        case 0:
            return "ID_Proyecto";
        case 1:
            return "Ciudad";
        case 2:
            return "Clasificación";
        case 3:
            return "Costo_Proyecto";
   
           
    }
    return null;
    }
    
    @Override
    public int getRowCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return requerimiento3.size();
    }

    @Override
    public int getColumnCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    Requerimiento_3 requerimiento = requerimiento3.get(row);
    
    switch (column){
        case 0:
            return requerimiento.getID_Proyecto();
        case 1:
            return requerimiento.getCiudad();
        case 2:
            return requerimiento.getClasificacion();
        case 3:
            return requerimiento.getCostoP();
    
           
    }
    return null;
    }

    

}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

