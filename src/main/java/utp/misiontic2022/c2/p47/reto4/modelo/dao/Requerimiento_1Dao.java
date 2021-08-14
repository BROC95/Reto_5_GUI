package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> registrosBS = new ArrayList<>();
        Requerimiento_1 registroBS = null;

        String sql = "SELECT l.Nombre || ''|| l.Primer_Apellido as Lider, l.Cargo as 'Cargo',COUNT(p.ID_Lider) as 'Proyectos' "
                    +" from Lider l inner join Proyecto p"
                    +"  WHERE p.Constructora ='Arquitectura S.A.' "
                    +"  and p.ID_Lider =l.ID_Lider "
                    +"   and p.ID_Lider =l.ID_Lider"
                    +"  GROUP  by p.ID_Lider "
                    +" order by l.Cargo,Lider ;";
        // String sql = "SELECT ID_Proyecto from Compra WHERE ID_Proyecto in (1,2,3,4);";
        // String banco="Davivienda";
        // String sql = "SELECT p.ID_Proyecto as 'ID', p.Constructora, p.Ciudad, p.Clasificacion, t.Estrato,(l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido) AS \"LIDER\""
        // + " FROM Proyecto p"
        // + " INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo"
        // + " INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider"
        // + " WHERE p.Banco_Vinculado = "+"'"+banco+"'"
        // + " ORDER BY p.Fecha_Inicio DESC , p.Ciudad ASC , p.Constructora;";
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                registroBS = new Requerimiento_1();

                // registroBS.setNombre(rs.getString("l.Nombre"));
                // registroBS.setNombre(rs.getString("ID_Proyecto"));
                registroBS.setNombre(rs.getString("Lider"));
                // registroBS.setApellido(rs.getString("l.Primer_Apellido"));
                registroBS.setCargo(rs.getString("Cargo"));
                registroBS.setProyectosN(rs.getInt("Proyectos"));

                registrosBS.add(registroBS);
            }
        } 

        return registrosBS;

    }
}