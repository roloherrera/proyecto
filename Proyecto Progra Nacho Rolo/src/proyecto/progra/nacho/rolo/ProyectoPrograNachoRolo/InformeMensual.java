package proyecto.progra.nacho.rolo.ProyectoPrograNachoRolo;


public class InformeMensual {
    private String MesInforme;
    private String PacientesIngresados;
    private String PacientesSalen;
    private int CuposDisponibles;

    public void setMesInforme(String MesInforme) {
        this.MesInforme = MesInforme;
    }

    public void setPacientesIngresados(String PacientesIngresados) {
        this.PacientesIngresados = PacientesIngresados;
    }

    public void setPacientesSalen(String PacientesSalen) {
        this.PacientesSalen = PacientesSalen;
    }

    public void setCuposDisponibles(int CuposDisponibles) {
        this.CuposDisponibles = CuposDisponibles;
    }
    
    
    public String getMesInforme() {
        return MesInforme;
    }

    public String getPacientesIngresados() {
        return PacientesIngresados;
    }

    public String getPacientesSalen() {
        return PacientesSalen;
    }

    public int getCuposDisponibles() {
        return CuposDisponibles;
    }
    
}
