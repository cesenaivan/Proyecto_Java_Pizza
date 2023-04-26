package pizzeria.lafamiglia;

public class Intolerancia {
    private int id;
    private static int nextId = 1;
    private String nombre;
    private String imagen;

    public Intolerancia(String nombre, String imagen) {
        this.id = nextId;
        nextId++;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
