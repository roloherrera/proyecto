
package proyecto.progra.nacho.rolo.ProyectoPrograNachoRolo;

import javax.swing.JOptionPane;
public class Procesos {
   
    
    private String sp = "";
    private String sh = "";
    private String sc = "";
    private String sv = "";
    private String si = "";
    private String sm = "";
    private String sx= "";
    private String sy= "";
    Visitantes listavisitas[]=new Visitantes[5];
    Paciente listapaciente[]=new Paciente[25];
    Residente listaresidente[]=new Residente[25];
    Doctor listadoctores[]=new Doctor[9];
    Enfermerxs listaenfermerxs[]=new Enfermerxs[12];
    PersonalCuido listacuidadores[]=new PersonalCuido[12];
    Medicamentos inventario[]=new Medicamentos[20];
    InformeMensual informe[]=new InformeMensual[12];
    Citas listacitas[]=new Citas[20];
    
//1
    public void VerPersonal(){
    int x;
       for(x=0;x<1;x++){
           sp=sp+listadoctores[x].getNombre()+" "+
                   listadoctores[x].getApellido1()+" "+
                   listadoctores[x].getApellido2()+" - "+
                   listadoctores[x].getCedula()+"\n|Antiguedad: "+
                   listadoctores[x].getAntiguedad()+" turno: "+
                   listadoctores[x].getTurnos()+"|\n";
       }
       for(x=0;x<1;x++){
           sp=sp+listaenfermerxs[x].getNombre()+" "+
                   listaenfermerxs[x].getApellido1()+" "+
                   listaenfermerxs[x].getApellido2()+" - "+
                   listaenfermerxs[x].getCedula()+"\n|Antiguedad: "+
                   listaenfermerxs[x].getAntiguedad()+" turno: "+
                   listaenfermerxs[x].getTurnos()+"|\n";
       }
       for(x=0;x<1;x++){
           sp=sp+listacuidadores[x].getNombre()+" "+
                   listacuidadores[x].getApellido1()+" "+
                   listacuidadores[x].getApellido2()+" - "+
                   listacuidadores[x].getCedula()+"\n|Antiguedad: "+
                   listacuidadores[x].getAntiguedad()+" turno: "+
                   listacuidadores[x].getTurnos()+" pacientes asignados: "+
                   listacuidadores[x].getPacientesAsignados()+"|\n";
       }
       JOptionPane.showMessageDialog(null,"La lista de personal es \n"+sp);
    }   
//2 
    public void BuscarPersonal(){
    String nombre;
      int x;
      nombre=JOptionPane.showInputDialog(null,
              "Digite el nombre del personal:");
      for(x=0;x<1;x++){
        
           if(nombre.equals(listadoctores[x].getNombre())){
              JOptionPane.showMessageDialog(null, "Mostrando datos de  "+listadoctores[x].getNombre()+" "+listadoctores[x].getApellido1()+" "+listadoctores[x].getApellido2()+"\n Cédula: "+listadoctores[x].getCedula()+
                      "\n DOCTOR \n"+
              "\n|Antiguedad: "+listadoctores[x].getAntiguedad()+" turno: "+listadoctores[x].getTurnos()+"|\n"
              ); 
        }
           if(nombre.equals(listaenfermerxs[x].getNombre())){
              JOptionPane.showMessageDialog(null, "Mostrando datos de  "+listaenfermerxs[x].getNombre()+" "+listaenfermerxs[x].getApellido1()+" "+listaenfermerxs[x].getApellido2()+"\n Cédula: "+listaenfermerxs[x].getCedula()+
                      "\n ENFERMER@ \n"+
              "\n|Antiguedad: "+listaenfermerxs[x].getAntiguedad()+" turno: "+listaenfermerxs[x].getTurnos()+"|\n"
              ); 
        }
           if(nombre.equals(listacuidadores[x].getNombre())){
              JOptionPane.showMessageDialog(null, "Mostrando datos de  "+listacuidadores[x].getNombre()+" "+listacuidadores[x].getApellido1()+" "+listacuidadores[x].getApellido2()+"\n Cédula: "+listacuidadores[x].getCedula()+
                      "\n CUIDADOR \n"+
              "\n|Antiguedad: "+listacuidadores[x].getAntiguedad()+" turno: "+listacuidadores[x].getTurnos()+" pacientes asignados: "+listacuidadores[x].getPacientesAsignados()+"|\n"
              ); 
        }
           
      }
    }
//3
    public void IngresarDoctor(){
    int x;
         JOptionPane.showMessageDialog(null,"ingrese los doctores");
        for (x = 0; x < 1; x++) {
            Doctor e = new Doctor();
            e.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre:"));
            e.setApellido1(JOptionPane.showInputDialog(null, "Digite el primer apellido"));
            e.setApellido2(JOptionPane.showInputDialog(null, "Digite el segundo apellido"));
            e.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cédula(sin dejar espacios)")));
            e.setAntiguedad(JOptionPane.showInputDialog(null, "Ingrese la antiguedad"));
            e.setTurnos(JOptionPane.showInputDialog(null, "Ingrese los turnos"));
            listadoctores[x]=e;
    }
         JOptionPane.showMessageDialog(null,"ingrese lxs enfermerxs");
        for (x = 0; x < 1; x++) {
            Enfermerxs f = new Enfermerxs();
            f.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre:"));
            f.setApellido1(JOptionPane.showInputDialog(null, "Digite el primer apellido"));
            f.setApellido2(JOptionPane.showInputDialog(null, "Digite el segundo apellido"));
            f.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cédula(sin dejar espacios)")));
            f.setAntiguedad(JOptionPane.showInputDialog(null, "Ingrese la antiguedad"));
            f.setTurnos(JOptionPane.showInputDialog(null, "Ingrese los turnos"));
            listaenfermerxs[x]=f;
    }
         JOptionPane.showMessageDialog(null,"ingrese los cuidadoress");
        for (x = 0; x < 1; x++) {
            PersonalCuido g = new PersonalCuido();
            g.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre:"));
            g.setApellido1(JOptionPane.showInputDialog(null, "Digite el primer apellido"));
            g.setApellido2(JOptionPane.showInputDialog(null, "Digite el segundo apellido"));
            g.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cédula(sin dejar espacios)")));
            g.setAntiguedad(JOptionPane.showInputDialog(null, "Ingrese la antiguedad"));
            g.setTurnos(JOptionPane.showInputDialog(null, "Ingrese los turnos"));
            g.setPacientesAsignados(JOptionPane.showInputDialog(null, "Ingrese los pacientes asignados"));
            listacuidadores[x]=g;
    }
    }

    //4
    public void VerVisitas(){
        int x; 
        for(x=0;x<1;x++){
            sv=sv+listavisitas[x].getNombre()+" "+
                   listavisitas[x].getApellido1()+" "+
                   listavisitas[x].getApellido2()+" - "+
                   listavisitas[x].getCedula()+"\n |hora de ingreso: "+
                    listavisitas[x].getHoraIngreso()+"|hora de salida: "+
                    listavisitas[x].getHoraSalida()+"|\n";
        }
    }
    //5
    public void IngresarVisitas(){
    int x;
        for (x = 0; x < 5; x++) {
        Visitantes c= new Visitantes();
        c.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre:"));
        c.setApellido1(JOptionPane.showInputDialog(null,"Digite el primer apellido"));
        c.setApellido2(JOptionPane.showInputDialog(null,"Digite el segundo apellido"));
        c.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cédula(sin dejar espacios)")));
        c.setPacienteVisitado(JOptionPane.showInputDialog(null,"Ingrese el paciente que vino a visitar"));
        c.setHoraIngreso(JOptionPane.showInputDialog(null,"Ingrese la hora de ingreso"));
        c.setHoraSalida(JOptionPane.showInputDialog(null,"Ingrese la hora de salida"));
        }
    }
    //6
    public void IngresarPacientes(){
         int x;
        for (x = 0; x < 1; x++) {
            Paciente a = new Paciente();
            a.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre:"));
            a.setApellido1(JOptionPane.showInputDialog(null,"Digite el primer apellido"));
            a.setApellido2(JOptionPane.showInputDialog(null,"Digite el segundo apellido"));
            a.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cédula(sin dejar espacios)")));
            a.setGruposanguineo(JOptionPane.showInputDialog(null,"Ingrese el grupo sanguineo del paciente  "));
            a.setAlergias(JOptionPane.showInputDialog(null,"Ingrese las alergias del paciente"));
            a.setMedicamentos(JOptionPane.showInputDialog(null,"Ingrese los medicamentos que toma el paciente"));
            a.setHoraDeIngreso(JOptionPane.showInputDialog(null,"Ingrese la hora de ingreso a las instalaciones"));
            a.setCondicion(JOptionPane.showInputDialog(null,"Ingrese la condición en la que ingresó el paciente"));
            a.setDrACargo(JOptionPane.showInputDialog(null,"Ingrese el Doctor/a a cargo del paciente"));
            listapaciente[x]=a;
        }
    }
    //7
    public void VerPacientes(){
        int x;
           for(x=0;x<1;x++){
           sh=sh+listapaciente[x].getNombre()+" "+
                   listapaciente[x].getApellido1()+" "+
                   listapaciente[x].getApellido2()+" - "+
                   listapaciente[x].getCedula()+"\n|Tipo de sangre: "+
                   listapaciente[x].getGruposanguineo()+"|Alergias: "+
                   listapaciente[x].getAlergias()+"|Toma medicamentos: "+
                   listapaciente[x].getMedicamentos()+" |\n|Hora de ingreso: "+
                   listapaciente[x].getHoraDeIngreso()+"|Condicion del paciente: "+
                   listapaciente[x].getCondicion()+"|Doctor a cargo: "+
                   listapaciente[x].getDrACargo()+"|\n";
       }
       JOptionPane.showMessageDialog(null,"La lista de pacientes es \n"+sh);
    }
    //8
    public void BuscarPacientes(){
    String nombre;
      int x;
      nombre=JOptionPane.showInputDialog(null,
              "Digite el nombre del paciente:");
      for(x=0;x<1;x++){
          if(nombre.equals(listapaciente[x].getNombre())){
              JOptionPane.showMessageDialog(null, "Mostrando datos de  "+listapaciente[x].getNombre()+" "+listapaciente[x].getApellido1()+" "+listapaciente[x].getApellido2()+"\n Cédula: "+listapaciente[x].getCedula()+
              "\n PACIENTE \n"+
              "\n|Tipo de sangre: "+
              listapaciente[x].getGruposanguineo()+"|Alergias: "+listapaciente[x].getAlergias()+"|Toma medicamentos: "+listapaciente[x].getMedicamentos()+
              " |\n|Hora de ingreso: "+listapaciente[x].getHoraDeIngreso()+"|Condicion del paciente: "+listapaciente[x].getCondicion()+"|Doctor a cargo: "+listapaciente[x].getDrACargo()+"|\n"
              ); 
          }
      }
    }
    //9
    public void IngresarResidentes(){
        int x;
            for (x = 0; x < 1; x++) {
            Residente b = new Residente();
            b.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre:"));
            b.setApellido1(JOptionPane.showInputDialog(null,"Digite el primer apellido"));
            b.setApellido2(JOptionPane.showInputDialog(null,"Digite el segundo apellido"));
            b.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cédula(sin dejar espacios)")));
            b.setGruposanguineo(JOptionPane.showInputDialog(null,"Ingrese el grupo sanguineo del residente  "));
            b.setAlergias(JOptionPane.showInputDialog(null,"Ingrese las alergias del residente"));
            b.setMedicamentos(JOptionPane.showInputDialog(null,"Ingrese los medicamentos que toma el residente"));
            b.setHorarioMedicamento(JOptionPane.showInputDialog(null,"Ingrese el horario de toma de medicamentos"));
            b.setHistorialMedico(JOptionPane.showInputDialog(null,"Ingrese el historial médico del residente"));
            listaresidente[x]=b;
    }
    }
    //10
    public void VerResidentes(){
    int x;
           for(x=0;x<1;x++){
           sc=sc+listaresidente[x].getNombre()+" "+
                   listaresidente[x].getApellido1()+" "+
                   listaresidente[x].getApellido2()+" - "+
                   listaresidente[x].getCedula()+"\n|Tipo de sangre: "+
                   listaresidente[x].getGruposanguineo()+"|Alergias: "+
                   listaresidente[x].getAlergias()+"|Toma medicamentos: "+
                   listaresidente[x].getMedicamentos()+" |\n|Hora de toma de medicamentos: "+
                   listaresidente[x].getHorarioMedicamento()+"|Historial medico: "+
                   listaresidente[x].getHistorialMedico()+"|\n";
                   
       }
       JOptionPane.showMessageDialog(null,"La lista de residentes es \n"+sc);
    }
    //11
    public void BuscarResidentes(){
    String nombre;
      int x;
      nombre=JOptionPane.showInputDialog(null,
              "Digite el nombre del residente:");
      for(x=0;x<1;x++){
          if(nombre.equals(listaresidente[x].getNombre())){
              JOptionPane.showMessageDialog(null, "Mostrando datos de  "+listaresidente[x].getNombre()+" "+listaresidente[x].getApellido1()+" "+listaresidente[x].getApellido2()+"\n Cédula: "+listaresidente[x].getCedula()+
              "\n RESIDENTE \n"+
              "\n|Tipo de sangre: "+listaresidente[x].getGruposanguineo()+"|Alergias: "+listaresidente[x].getAlergias()+"|Toma medicamentos: "+listaresidente[x].getMedicamentos()+
              " |\n|Hora de toma de medicamentos: "+listaresidente[x].getHorarioMedicamento()+"|Historial medico: "+listaresidente[x].getHistorialMedico()+"|\n"
              ); 
          }
      }
    }
    //12
    public void verInventario(){
    int x;
           for(x=0;x<1;x++){
           si=si+inventario[x].getNombre()+"\n Función: "+
                   inventario[x].getFuncion()+"\n cantidad en inventario: "+
                   inventario[x].getInventario()+"\n |pacientes que consumen: "+
                   inventario[x].getConsumoPacientes()+"| pacientes que dependen: "+
                   inventario[x].getDependenciaPacientes()+"|";}
           JOptionPane.showMessageDialog(null,"El inventario es: \n"+si);
    }
    //13
    public void llenarInventario(){
    int x;
            for (x = 0; x < 1; x++) {
            Medicamentos k = new Medicamentos();
            k.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre:"));
            k.setFuncion(JOptionPane.showInputDialog(null,"Digite la función del medicamento:"));
            k.setInventario(JOptionPane.showInputDialog(null,"Digite la cantidad de este emdicamento en inventario:"));
            k.setConsumoPacientes(JOptionPane.showInputDialog(null,"Ingrese los pacientes que consumen este mdeicamento:"));
            k.setDependenciaPacientes(JOptionPane.showInputDialog(null,"Ingrese los pacientes que requieren de este mdeicamento:"));
            inventario[x]=k;
            
            }}
    //14
    public void verInforme(){
    int x;
           for(x=0;x<1;x++){
               sm=sm+informe[x].getMesInforme()+"\n |Pacientes que ingresaron: "+
                       informe[x].getPacientesIngresados()+"|Pacientes que salieron:"+
                       informe[x].getPacientesSalen()+"| \n cupos disponibles: "+
                       informe[x].getCuposDisponibles()+"\n";
               
               
}
    }
    //15
    public void llenarInforme(){
    int x;
            for (x = 0; x < 1; x++) {
            InformeMensual l = new InformeMensual();
            l.setMesInforme(JOptionPane.showInputDialog(null,"Digite el mes del informe"));
            l.setPacientesIngresados(JOptionPane.showInputDialog(null,"Digite los pacientes que entraron "));
            l.setPacientesSalen(JOptionPane.showInputDialog(null,"Digite los pacientes que salieron "));
            l.setCuposDisponibles(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cupos disponibles")));
            informe[x]=l;
            
            }}
    //16
    public void programarCita(){
      int cedula;
      int x, y;
      cedula=(Integer.parseInt(JOptionPane.showInputDialog(null,
              "Digite la cédula del paciente:")));
      for(x=0;x<1;x++){
          if(cedula==(listapaciente[x].getCedula())){
              JOptionPane.showMessageDialog(null,"Usted va a programar una cita para "+listapaciente[x].getNombre()+" "+listapaciente[x].getApellido1()+" "+listapaciente[x].getApellido2());
              Citas m=new Citas();
              for(y=0;y<1;y++){
              m.setPaciente(listapaciente[x].getNombre()+" "+listapaciente[x].getApellido1()+" "+listapaciente[x].getApellido2());
              m.setDoctor(JOptionPane.showInputDialog(null,"Ingrese el doctor a cargo de la cita: "));
              m.setHora(JOptionPane.showInputDialog(null,"Ingrese la hora de la cita: "));
              listacitas[y]=m;}
          }
       }
    }
    //17
    public void verCitas(){
        int x;
           for(x=0;x<1;x++){
           sy=sy+"paciente: "+listacitas[x].getPaciente()+" | Doctor: "+listacitas[x].getDoctor()+" | Hora: "+listacitas[x].getHora()+"| \n\n";}
           JOptionPane.showMessageDialog(null,"Las citas programadas son: \n"+sy);
    }
    //end
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    



