public class Cliente {
    //Atributos
    String nombre;
    String apellido;
    int cedula;
    char sexo;
    String ubicacion;

    //Constructor con tod
    public Cliente(String nombre, String apellido, int cedula, char sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    //Constructor sin atributo sexo
    public Cliente(String nombre, String apellido, int cedula, String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.ubicacion = ubicacion;


    }

    //Constructor por defecto
    public Cliente() {
    }

    public void suscribirse(Suscripcion suscripcion) {
        System.out.println(nombre + " " + apellido+
                " adquirió una suscripción " + suscripcion.getTipo() + ".");
    }
}
