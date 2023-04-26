package pizzeria.lafamiglia;


public class Postre {
    private static int nextId = 1; // variable estática para mantener el valor del próximo ID disponible
    private int id; // id de la piz
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private Double precio;
    private String  descripcion; 
    private String img;  
     

     public Postre(String name, double precio, String descripcion , String img){
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

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
