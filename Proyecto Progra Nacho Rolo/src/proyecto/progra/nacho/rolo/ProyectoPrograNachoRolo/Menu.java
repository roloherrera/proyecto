
package proyecto.progra.nacho.rolo.ProyectoPrograNachoRolo;
import javax.swing.JOptionPane;

public class Menu {
    Procesos p=new Procesos();
       public void Display(){
     int opc=0;  
     while(opc!=12){  
       opc=Integer.parseInt(JOptionPane.showInputDialog(null,
              "---MENÚ PRINCIPAL---\n\n"
                      + "1.Ver Personal\n"
                      + "2.Buscar Personal\n"
                      + "3.Ingresar Personal\n\n"
                      
                      + "4.Ver visitas\n"
                      + "5.Ingresar Visitas\n\n"
                      
                      +"6.Ingresar Paciente\n"
                      +"7.Ver Pacientes\n"
                      +"8.Buscar Pacientes\n\n"
                      
                      +"9.Ingresar Residente\n"
                      +"10.Ver Residentes\n"
                      +"11.Buscar Residente\n\n"
                      
                      +"12.Ver Inventario\n"
                      +"13.Llenar Inventario\n"
                      +"14.Ver Informe Mensual\n"
                      +"15.Llenar informe\n\n"
                      
                      +"16.Programar cita\n"
                      +"17.Ver citas \n\n"
                      
                      + "18.Salir\n\n"
                      + "Digite su opción:"));
      switch(opc){
          case 1:{
             JOptionPane.showMessageDialog(null,"1.Ver Personal");
             p.VerPersonal();
             break;
          } 
          case 2:{
             JOptionPane.showMessageDialog(null,"2.Buscar Personal");
             p.BuscarPersonal();
             break;
          }
          case 3:{
             JOptionPane.showMessageDialog(null,"3.Ingresar Personal");
                     p.IngresarDoctor();
             break;
          }
          case 4:{
             JOptionPane.showMessageDialog(null,"4.Ver visitas");
             p.VerVisitas();
             break;
          }
          case 5:{
             JOptionPane.showMessageDialog(null,"5.Ingresar Visitas");
             p.IngresarVisitas();
             break;
          }
          case 6:{
             JOptionPane.showMessageDialog(null,"6.Ingresar Paciente");
             p.IngresarPacientes();
             break;
          }
          case 7:{
             JOptionPane.showMessageDialog(null,"7.Ver Pacientes");
             p.VerPacientes();
             break;
          }
          case 8:{
             JOptionPane.showMessageDialog(null,"8.Buscar Pacientes");
             p.BuscarPacientes();
             break;
          }
          case 9:{
             JOptionPane.showMessageDialog(null,"9.Ingresar Residente");
             p.IngresarResidentes();
             break;
          }
          case 10:{
             JOptionPane.showMessageDialog(null,"10.Ver Residentes");
             p.VerResidentes();
             break;
          }
          case 11:{
             JOptionPane.showMessageDialog(null,"11.Buscar Residente");
             p.BuscarResidentes();
             break;
          }
          case 12:{
             JOptionPane.showMessageDialog(null,"12.Ver Inventario");
             p.verInventario();
             break;
          }
          case 13:{
             JOptionPane.showMessageDialog(null,"13.Llenar Inventario");
             p.llenarInventario();
             break;
          }
          case 14:{
             JOptionPane.showMessageDialog(null,"14.Ver Informe Mensual");
             p.verInforme();
             break;
          }
          case 15:{
             JOptionPane.showMessageDialog(null,"15.Llenar informe");
             p.llenarInforme();
             break;
          }
          case 16:{
              JOptionPane.showMessageDialog(null,"16.Progrmar cita");
              p.programarCita();
              break;
          }
          case 17:{
              JOptionPane.showMessageDialog(null,"17.Ver citas");
              p.verCitas();
              break;
          }
          case 18:{
             System.exit(0);
             break;
          }
          default:{
             JOptionPane.showMessageDialog(null,
                     "Opción incorrecta, por favor ingrese una opcion válida");
          }
      }
     } 
   }
}
