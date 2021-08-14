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
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;


/**
 *
 * @author ASUS
 */


public class RetoTM2  extends AbstractTableModel{
private ArrayList<Requerimiento_2> requerimiento2;
//private List<Requerimiento_1> requeri;
//private Requerimiento_1 requerimiento1;

    public RetoTM2(){
    this(new ArrayList<>());
}
     public RetoTM2(ArrayList<Requerimiento_2> requerimiento2){
    this.requerimiento2=requerimiento2;
}
    @Override
    public String getColumnName(int column){
          switch (column){
        case 0:
            return "ID_MaterialConstrucción";
        case 1:
            return "Nombre_Material";
        case 2:
            return "Cantidad";
        case 3:
            return "Precio_Unidad";
        case 4:
            return "Precio_Total";
           
    }
    return null;
    }
    
    @Override
    public int getRowCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return requerimiento2.size();
    }

    @Override
    public int getColumnCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    Requerimiento_2 requerimiento = requerimiento2.get(row);
    
    switch (column){
        case 0:
            return requerimiento.getID_MaterialConstruccion();
        case 1:
            return requerimiento.getNombreMaterial();
        case 2:
            return requerimiento.getCantidad();
        case 3:
            return requerimiento.getPrecioU();
        case 4:
            return requerimiento.getPrecioT();
           
    }
    return null;
    }
    
    

}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

