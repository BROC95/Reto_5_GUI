package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            // Su código
            ArrayList<Requerimiento_1> re = controlador.consultarRequerimiento1(); 
            // System.out.println(re.toString());
            for(int i = 0; i < re.size(); i++) {
                System.out.println(re.get(i).getNombre()+" "+re.get(i).getCargo()+" "+re.get(i).getProyectosN());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            // Su código
            // System.out.println("Requirimiento 1");
            ArrayList<Requerimiento_2> re = controlador.consultarRequerimiento2(); 
            // System.out.println(re.toString());
            for(int i = 0; i < re.size(); i++) {
                // ID_MaterialConstruccion+" "+ NombreMaterial+" "+Cantidad+" "+PrecioU+" "+PrecioT+"\n";
                System.out.println(re.get(i).getID_MaterialConstruccion()+" "+re.get(i).getNombreMaterial()+" "+re.get(i).getCantidad()+" "+re.get(i).getPrecioU()+" "+re.get(i).getPrecioT());
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            // Su código
            ArrayList<Requerimiento_3> re = controlador.consultarRequerimiento3();
            System.out.println(re.toString());
            // ID_Proyecto+" "+Ciudad+" "+clasificacion+" "+CostoP+"\n";
            for(int i = 0; i < re.size(); i++) {
                // ID_MaterialConstruccion+" "+ NombreMaterial+" "+Cantidad+" "+PrecioU+" "+PrecioT+"\n";
                System.out.println(re.get(i).getID_Proyecto()+" "+re.get(i).getCiudad()+" "+re.get(i).getClasificacion()+" "+re.get(i).getCostoP());
            }
 
        } catch (Exception e) {
            System.err.println(e);
        }
    }    
}
