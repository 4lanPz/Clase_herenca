public class menu {
    public static void main(String[] args){
        Persona persona1 = new Persona(1928481, "as","asd","awa", "213123312312312");
        System.out.println(persona1);
        Persona Pedro = new Estudiante(12421,"asdas","asdaasd","asñlokasd","290219012",123,"@gaksd","sa","xd");
        Pedro.caminar();
        Persona Persona2 = new Doctor(123,"Ana", "Ana", "Carcelen", "12312312", "Doctora", 132, "7-12", "Clin","Leo",33);
        Persona Persona3 = new EmpleadoPublico(123,"Pablo","Pablo", "Carcelen","123456","Tramites","Tramites");
        Persona Persona4 = new Futbolista(123,"Maritza","Marizta", "Carapungo", "12312421","fubol", "1",1,"Ecuador", "5 horas diarias");
        Persona Persona5 = new Estudiante(123, "Melani", "a","Carapungo", "123", 123, "estudiante@gmail", "3er semestre", "Software");
        System.out.println("Primero");
        System.out.println("Nombre: "+ Persona2.getNombre());
        System.out.println("Edad: "+ Persona2.getEdad());
        System.out.println("Signo: "+ Persona2.getSigno());
        persona1.examinar();
        System.out.println("Segundo");
        System.out.println("Nombre: "+ Persona3.getNombre());
        System.out.println("Teléfono: "+ Persona3.getTelefono());
        persona1.tramitar();
        System.out.println("Tercero");
        System.out.println("Nombre: "+ Persona4.getNombre());
        System.out.println("Tiempo: "+ Persona4.gettiempo());
        persona1.correr();
        System.out.println("Cuarto");
        System.out.println("Nombre: "+ Persona5.getNombre());
        System.out.println("Semestre: "+ Persona5.getsemestre());
        persona1.leer();
    }
}
