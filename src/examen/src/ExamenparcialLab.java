import java.util.ArrayList;
import java.io.*
import java.util.*
class Persona{
    String nombre;
    String DNI;
    String Fechanac;
    public Persona(String nombre, String DNI, String Fechanac){
        this.nombre= nombre;
        this.DNI = DNI;
        this.Fechanac= Fechanac;
    }
    }
class Doctor extends Persona{
   private String especialidad;
   public Doctor(String nombre, String DNI, String Fechanac, String especialidad){
       super(nombre, DNI, Fechanac);
       this.especialidad = especialidad;
   }
}
interface Informacion {
    void verHistorialDeEventos();
}
class Paciente extends Persona implements Informacion{
    private int nrotel;
    private int tiposang
    private List<String> historialmedico;
    public Paciente(String nombre, String DNI, String Fechanac, int nrotel, int tiposang, ){
        super(nombre, DNI, Fechanac);
        this.nrotel=nrotel;
        this.tiposang=tiposang;
        this.historialmedico=new ArrayList<>();
    }
     @Override
    public void verHistorialDeEventos(){

         for (String evento : historialmedico) {
             System.out.println(evento);
         }
     }
     }
}

public class Hospital{
    private static List<Doctor> doctor = new ArrayList <>();
    private static List<Paciente> paciente = new ArrayList <>();
    Cargarpruebadoctor();
    Cargarpruebapaciente();

    Scanner scannner =new Scanner(System.in);
    public static void main(String[] args){
        int opcion
                do{ System.out.println("Menú:");
                    System.out.println("1. Listar Doctores");
                    System.out.println("2. Registrar nuevo paciente.");
                    System.out.println("3. Actualizar informacion persnal de un paciente");
                    System.out.println("4. Consultar el historial médic de un paciente.");
                    System.out.println("5. Nuev Hisotiral para un paciente");
                    System.out.println("6. Guardar historial de pacientes en archivo");
                    System.out.println("7. Cargar historial de pacientes desde archivo");
                    System.out.println("8. Salir.");
                    System.out.print("Elija una opción: ");
                    opcion = Scanner.nextInt();
                  switch(opcion){
                      case 1: doctor.();
                      break;
                  }
                    case 2:
                        System.out.println("Ingrese nombre del paciente");
                        String nombre=Scanner.nextLine();
                        System.out.println("Ingrese DNI del paciente");
                        String DNI=Scanner.nextLine();
                        System.out.println("Ingrese Fecha de nacimient del paciente");
                        String fechanac=Scanner.nextLine();
                        System.out.println("Ingrese nro de telofono del paciente");
                        int nrotel=Scanner.nextLine();
                        System.out.println("Ingrese tipo de sangre del paciente");
                        int tiposang=Scanner.nextLine();
                        Paciente nuevoPaciente = new Paciente(nombre, DNI, fechanac, nrotel, tiposang)
                        break;
                } case 3:
                    System.out.print("ingrese dni del paciente");
                    String dnibus = Scanner.nextLine();
                    Paciente paciente = buscarpaciendni(dnibus);
                    if(paciente != null){
                        System.out.println("paciente encontrado:");



                    }
                   break;
    }case 4:
            System.out.println("ingrese dni del paciente");
    String dnibus = Scanner.nextLine();
    Paciente paciente = buscarpaciendni(dnibus);
                    if(paciente != null)

    {
        System.out.println("paciente encontrado:");
        System.out.println("Historial mediko del paciente:");
        for (String evento : paciente.historialmedico() ;){
        System.out.println(evento);
    }
    }else System.out.println("No existe paciente con dni"+dnibus+)
    break;
                    case 5: System.out.println("buscar dni del paciente")
                           String dniBuscar= Scanner.nextLine();
                      Paciente paciente = buscarpaciendni(dnibus);
                      if(paciente !=null){
                          System.out.println("Fecha del evento(dd/mm/a):");
                            String fechaEv =Scanner.nextLine();
                            System.out.print("Su historial es:")
                                    String observacion = Scanner.nextLine();
                            String evento = fechaEv+"-"observacion;
                            paciente.

    }



    public static void Cargarpruebadoctor() {
        doctor.add(new Doctor("dr. Juan perez", "4265646", "15/23/2023", "Cancer"));
        doctor.add(new Doctor("dr. Guiterraz", "42656246", "15/23/2023", "Lepra"));
    }
    }
    private static Paciente buscarpaciendni(String dniBuscar) {
        for (Paciente paciente : paciente) {
            if (paciente.DNI.equals(dniBuscar)) {}

                return paciente;
            }
        }
        return null;}