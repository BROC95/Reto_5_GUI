package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_3 {
    // Su código
    private Integer ID_Proyecto;
    private String Ciudad;
    private String clasificacion;
    private Integer CostoP;

    
    public Requerimiento_3() {
    }
    
    public Requerimiento_3(Integer iD_Proyecto, String ciudad, String clasificacion, Integer costoP) {
        this.ID_Proyecto = iD_Proyecto;
        this.Ciudad = ciudad;
        this.clasificacion = clasificacion;
        this.CostoP = costoP;
    }

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(Integer iD_Proyecto) {
        this.ID_Proyecto = iD_Proyecto;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
       this.Ciudad = ciudad;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public Integer getCostoP() {
        return CostoP;
    }
    public void setCostoP(Integer costoP) {
        this.CostoP = costoP;
    }
    public String toString(){
        return ID_Proyecto+" "+Ciudad+" "+clasificacion+" "+CostoP+"\n";
        // return ID_Proyecto+"\n";
    }
}
