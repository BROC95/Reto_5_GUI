package utp.misiontic2022.c2.p47.reto4.modelo.vo;


public class Requerimiento_1 {
    // Su código
    private String Nombre;
    private String Apellido;
    private String Cargo;
    private String Constructora;
    private Integer ProyectosN;

    public Requerimiento_1(){

    }
    public Requerimiento_1(String nombre, String apellido, String cargo, String constructora) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Cargo = cargo;
        this.Constructora=constructora;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }
    

    public Integer getProyectosN() {
        return ProyectosN;
    }
    public void setProyectosN(Integer proyectosN) {
        ProyectosN = proyectosN;
    }
//     @Override
//     public String toString()
//     {
//   return Nombre;
    
// }
@Override
public String toString() {
    return Nombre+" "+Cargo+""+ " "+ProyectosN+"\n";
}

  
}
