public class Futbolista extends Persona{
    private String equipo;
    private String posicion;
    private int num_camiseta;
    private String representante;
    private String tiempo;

    public Futbolista(int CI, String Nombre, String Apellido, String Direccion, String Telefono, String equipo, String posicion, int num_camiseta, String representante, String tiempo){
        super(CI, Nombre, Apellido, Direccion, Telefono);
        this.equipo = equipo;
        this.posicion = posicion;
        this.num_camiseta = num_camiseta;
        this.representante = representante;
        this.tiempo = tiempo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNum_camiseta() {
        return num_camiseta;
    }

    public void setNum_camiseta(int num_camiseta) {
        this.num_camiseta = num_camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    public void correr(){
        System.out.println("El furbolista corre");
    }
    public void defender(){
        System.out.println("El furbolista defiende");
    }
}