package utp.misiontic2022.c2.p47.reto4.modelo.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.sql.PreparedStatement;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasDeLiderVo;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;
public class ComprasDeLiderDao {
    public ArrayList<ComprasDeLiderVo> comprasDeLiderDaos(String Banco) throws SQLException {
        // Su código
        ArrayList<ComprasDeLiderVo> respuestas = new ArrayList<>();
        ComprasDeLiderVo respuesta = null;

        // var conn = JDBCUtilities.getConnection();
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rset = null; 


        String query = "SELECT p.ID_Proyecto as ID, p.Constructora as Co, p.Ciudad as Ci, p.Clasificacion as Cl, t.Estrato as Es ,(l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido) AS LIDER"
        + " FROM Proyecto p"
        + " INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo"
        + " INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider"
        + " WHERE p.Banco_Vinculado = (?)"
        + " ORDER BY p.Fecha_Inicio DESC , p.Ciudad ASC , p.Constructora";
     
        try {
         
            
    
            stmt = conn.prepareStatement(query);
            stmt.setString(1,Banco);
            rset = stmt.executeQuery();  
          
            rset = stmt.executeQuery();    
            while (rset.next()) {
                respuesta = new ComprasDeLiderVo();
                respuesta.setNproyecto(rset.getInt("ID"));
                respuesta.setConstructora(rset.getString("Co"));
                respuesta.setCiudad(rset.getString("Ci"));
                respuesta.setClasificacion(rset.getString("Cl"));
                respuesta.setEstrato(rset.getInt("Es"));
                respuesta.setLider(rset.getString("LIDER"));
                respuestas.add(respuesta);
            }
        } 
        finally {
            if (rset != null) {
                rset.close();
            }
            if  (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return respuestas; 
    

    }
}

