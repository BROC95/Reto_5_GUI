/**
 * No se debe modificar
 */
package utp.misiontic2022.c2.p47.reto4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";
    // private String DB=DATABASE_LOCATION;



    public static String getDatabaseLocation() {
        return DATABASE_LOCATION;
    }



    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}