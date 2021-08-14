package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// import jdk.nashorn.internal.ir.ReturnNode;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> registrosBS = new ArrayList<>();
        Requerimiento_3 registroBS = null;

        // SELECT p.ID_Proyecto ,p.Ciudad ,p.Clasificacion ,sum(c.Cantidad * mc.Precio_Unidad ) as  Costo_Proyecto
        String sql= " SELECT  P.ID_Proyecto as id,p.Ciudad as Ci, p.Clasificacion as Cl ,sum(c.Cantidad * mc.Precio_Unidad ) as  Costo_Proyecto" 
         +" from  MaterialConstruccion mc natural join Compra c natural join Proyecto p " 
        +" WHERE p.Ciudad in ('Monteria','Santa Marta')"
        +"GROUP  BY p.ID_Proyecto "
        +"having Costo_Proyecto >70000 "
        +"ORDER  BY p.Ciudad ,p.Clasificacion";
        // ;
        // 

    try (
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
    ) {
        while (rs.next()) {
            registroBS = new Requerimiento_3();

            registroBS.setID_Proyecto(rs.getInt("id"));
            registroBS.setCiudad(rs.getString("Ci"));
            registroBS.setClasificacion(rs.getString("Cl"));
            registroBS.setCostoP(rs.getInt("Costo_Proyecto"));

    

            registrosBS.add(registroBS);
        }
    } 

    return registrosBS;
    }
    
}