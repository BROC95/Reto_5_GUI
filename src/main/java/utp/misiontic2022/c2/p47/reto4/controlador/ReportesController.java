package utp.misiontic2022.c2.p47.reto4.controlador;



import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.ComprasDeLiderDao;
// import co.edu.misiontic2022.c2.p48.reto4.model.dao.PagadoPorProyectoDao;
// import co.edu.misiontic2022.c2.p48.reto4.model.dao.ProyectoBancoDao;

// im
import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasDeLiderVo;
// import co.edu.misiontic2022.c2.p48.reto4.model.vo.PagadoPorProyectoVo;
// import co.edu.misiontic2022.c2.p48.reto4.model.vo.ProyectoBancoVo;

public class ReportesController {
    private final ComprasDeLiderDao comprasDeLiderDao;
    // private final PagadoPorProyectoDao pagadoPorProyectoDao;
    // private final ProyectoBancoDao proyectoBancoDao;


     
  
        public ReportesController(){
        this.comprasDeLiderDao = new ComprasDeLiderDao();
        // this.pagadoPorProyectoDao = new PagadoPorProyectoDao();
        // this.proyectoBancoDao = new ProyectoBancoDao();
       

    }
    public ArrayList<ComprasDeLiderVo> consultarComprasDeLiderDao(String Banco) throws SQLException {
        // Su código
        return comprasDeLiderDao.comprasDeLiderDaos(Banco);   
    }

    // public ArrayList<PagadoPorProyectoVo> consultarPagadoPorProyectoDao() throws SQLException {
    //     // Su código
    //     return pagadoPorProyectoDao.requerimiento2();  
    // }

    // public ArrayList<ProyectoBancoVo> consultarProyectoBancoDao() throws SQLException {
    //     // Su código
    //     // return proyectoBancoDao.requerimiento3();  
    // }
}






