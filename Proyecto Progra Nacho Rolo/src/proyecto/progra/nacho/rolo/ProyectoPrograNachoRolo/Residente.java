package proyecto.progra.nacho.rolo.ProyectoPrograNachoRolo;

public class Residente {
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private int Cedula;
    private String Gruposanguineo;
    private String Alergias;
    private String Medicamentos;
    private String HorarioMedicamento;
    private String HistorialMedico;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setGruposanguineo(String Gruposanguineo) {
        this.Gruposanguineo = Gruposanguineo;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public void setMedicamentos(String Medicamentos) {
        this.Medicamentos = Medicamentos;
    }

    public void setHorarioMedicamento(String HorarioMedicamento) {
        this.HorarioMedicamento = HorarioMedicamento;
    }

    public void setHistorialMedico(String HistorialMedico) {
        this.HistorialMedico = HistorialMedico;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public int getCedula() {
        return Cedula;
    }

    public String getGruposanguineo() {
        return Gruposanguineo;
    }

    public String getAlergias() {
        return Alergias;
    }

    public String getMedicamentos() {
        return Medicamentos;
    }

    public String getHorarioMedicamento() {
        return HorarioMedicamento;
    }

    public String getHistorialMedico() {
        return HistorialMedico;
    }
}
