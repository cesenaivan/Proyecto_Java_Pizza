package pizzeria.lafamiglia;

public class Pizza {
    private static int nextId = 1; // variable estática para mantener el valor del próximo ID disponible
    private int id; // id de la pizza
    private Boolean trigo;
    private Boolean frutosSecos;
    private Boolean leche;
    private Boolean huevos;
    private int precio;
    private String descripcion;
    private String[] ingredientes;
    private String img;
    private String name;

    public Boolean getFrutosSecos() {
        return frutosSecos;
    }

    public void setFrutosSecos(Boolean frutosSecos) {
        this.frutosSecos = frutosSecos;
    }

    public Boolean getLeche() {
        return leche;
    }

    public void setLeche(Boolean leche) {
        this.leche = leche;
    }

    public Boolean getHuevos() {
        return huevos;
    }

    public void setHuevos(Boolean huevos) {
        this.huevos = huevos;
    }

    public Pizza(String name,boolean huevos,boolean leche, boolean frutosSecos, int precio, String descripcion, String[] ingredientes, String img) {
        this.trigo = true;
        this.id = nextId;
        nextId++;
        this.name = name;
        this.frutosSecos = frutosSecos;
        this.huevos = huevos;
        this.leche = leche;
        this.precio = precio;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
        this.img = img;
    }

    public static void setNextId(int nextId) {
        Pizza.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 
    public void setFrutosSecos(boolean frutosSecos) {
        this.frutosSecos = frutosSecos;
    }

    public int getPrecio() {
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

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNextId() {
        return nextId;
    }

    public Boolean getTrigo() {
        return trigo;
    }

    public void setTrigo(Boolean trigo) {
        this.trigo = trigo;
    }
}
