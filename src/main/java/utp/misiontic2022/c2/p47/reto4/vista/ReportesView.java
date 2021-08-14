package utp.misiontic2022.c2.p47.reto4.vista;
import utp.misiontic2022.c2.p47.reto4.controlador.ReportesController;

// import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasDeLiderVo;
// // import co.edu.misiontic2022.c2.p48.reto4.model.vo.PagadoPorProyectoVo;
// // import co.edu.misiontic2022.c2.p48.reto4.model.vo.ProyectoBancoVo;




public class ReportesView {

    public static final ReportesController controlador = new ReportesController();

    private String repitaCaracter(Character caracter, Integer veces) {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
        respuesta += caracter;
        }
        return respuesta;
        }

        public void proyectosFinanciadosPorBanco(String banco){
        System.out.println(repitaCaracter('=', 36) + " LISTADO DE PROYECTOS POR BANCO "
        + repitaCaracter('=', 37));
       
        try {
            if (banco != null && !banco.isBlank()) {
                System.out.println(String.format("%3s %-25s %-20s %-15s %-7s %-30s",
                "ID", "CONSTRUCTORA", "CIUDAD", "CLASIFICACION", "ESTRATO", "LIDER"));
                System.out.println(repitaCaracter('-', 105));
                ArrayList<ComprasDeLiderVo> re = controlador.consultarComprasDeLiderDao(banco); 
                // System.out.println(re.toString());
                for(int i = 0; i < re.size(); i++) {
                System.out.println(re.get(i).getNproyecto()+" "+re.get(i).getConstructora()+" "+re.get(i).getCiudad()
                +" "+re.get(i).getClasificacion()+" "+re.get(i).getEstrato()+" "+re.get(i).getLider());
                }
        
                }
        } catch (Exception e) {
            //TODO: handle exception
            System.err.println(e);
        }
     

        }
        // public void totalPagadoPorProyectosSuperioresALimite(Double limiteInferior) {
        // System.out.println(repitaCaracter('=', 1) + " TOTAL PAGADO POR PROYECTO "
        // + repitaCaracter('=', 1));
        // if (limiteInferior != null) {
        // System.out.println(String.format("%3s %15s", "ID", "VALOR "));
        // System.out.println(repitaCaracter('-', 29));
        // //
        // }
        // }

        // public void lideresQueMenosGastan() {
        // System.out.println(repitaCaracter('=', 5) + " 10 LIDERES MENOS COMPRADORES "
        // + repitaCaracter('=', 6));
        // System.out.println(String.format("%-25s %15s", "LIDER", "VALOR "));
        // System.out.println(repitaCaracter('-', 41));
        // //
        // }
}
