package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> registrosBS = new ArrayList<>();
        Requerimiento_2 registroBS = null;

        String sql= " SELECT  mc.ID_MaterialConstruccion as id,mc.Nombre_Material as N ,c.Cantidad ,mc.Precio_Unidad ," 
       +" c.Cantidad * mc.Precio_Unidad as Precio_Total "
        +"from  MaterialConstruccion mc natural join Compra c natural join Proyecto p" 
       +" WHERE  p.ID_Proyecto in (10, 14, 23, 24, 38, 50, 29)"
       + "and  mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion "
      +"  ORDER  by p.ID_Proyecto  ASC ,mc.Precio_Unidad DESC ;";
    // String sql="Select  p.ID_Proyecto as id ,p.Ciudad as N,p.Clasificacion as M"
    // +"from Proyecto p "; 
 
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                registroBS = new Requerimiento_2();
                registroBS.setID_MaterialConstruccion(rs.getInt("id"));
                registroBS.setNombreMaterial(rs.getString("N"));
                registroBS.setCantidad(rs.getInt("Cantidad"));
                registroBS.setPrecioU(rs.getInt("Precio_Unidad"));
                registroBS.setPrecioT(rs.getInt("Precio_Total"));

      

                registrosBS.add(registroBS);
            }
        } 

        return registrosBS;

    }
}