package pizzeria.lafamiglia;

public class Cafe {
private int id;
private static int nextId = 1;
     private String name;
     private double precio;
     private String  descripcion; 
     private String img; 


    public Cafe(String name, double precio, String descripcion , String img){
        this.id = nextId;
        nextId++;
        this.name =name;
        this.precio= precio;
        this.descripcion=descripcion;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

