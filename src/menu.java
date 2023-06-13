public class menu {
    public static void main(String[] args){
        Persona Persona2 = new Doctor(123,"Ana", "Ana", "Carcelen", "12312312","Leo", 33, "","Enfermera",123,"Sabados","Clinica");
        Persona Persona3 = new EmpleadoPublico(123,"Pablo","Pablo", "Carcelen","123456","","","","","");
        Persona Persona4 = new Futbolista(123,"Maritza","Marizta", "Carapungo", "12312421","fubol", 20,"5 Horas diarias","Ecuador", "5 horas diarias",0,"");
        Persona Persona5 = new Estudiante(123, "Melani", "a","Carapungo", "123", "", 20, "", 0,"@epn.edu.ec","3er semestre","Software");
        System.out.println("Primero");
        System.out.println("Nombre: "+ Persona2.getNombre());
        System.out.println("Edad: "+ Persona2.getEdad());
        System.out.println("Signo: "+ Persona2.getSigno());
        Persona2.examinar();
        System.out.println("Segundo");
        System.out.println("Nombre: "+ Persona3.getNombre());
        System.out.println("Teléfono: "+ Persona3.getTelefono());
        Persona3.tramitar();
        System.out.println("Tercero");
        System.out.println("Nombre: "+ Persona4.getNombre());
        System.out.println("Tiempo: "+ Persona4.getTiempo());
        Persona4.correr();
        System.out.println("Cuarto");
        System.out.println("Nombre: "+ Persona5.getNombre());
        System.out.println("Semestre: "+ Persona5.getSemestre());
        Persona5.leer();
    }
}
