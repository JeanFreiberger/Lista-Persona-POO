public class Persona {
    private String Dni;
    private String nombre;


    public Persona(String nombre, String Dni) {
        this.nombre = nombre;
        this.Dni = Dni;
    }

    // Métodos getter y setter para acceder y modificar las propiedades

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setEdad(int Dni) {
        this.Dni = String.valueOf(Dni);
    }
}