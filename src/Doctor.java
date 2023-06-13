public class Doctor extends Persona {
    private String especialidad;
    private int codigo;
    private String horario;
    private String hospital;
    private String signo;
    private int edad;

    public Doctor(){
        super();
    }

    public Doctor(int CI, String Nombre, String Apellido, String Direccion, String Telefono, String especialidad, int codigo, String horario, String hospital, String signo, int edad){
        super(CI, Nombre, Apellido, Direccion, Telefono);
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.horario = horario;
        this.hospital = hospital;
        this.signo = signo;
        this.edad = edad;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public void examinar(){
        System.out.println("El doctor examina");
    }

    public void curar(){
        System.out.println("El doctor cura");
    }
}
