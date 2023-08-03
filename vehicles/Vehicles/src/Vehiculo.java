public abstract class Vehiculo {
    
    // Atributos de las clases
    private int year;
    private String nombre, marca, color;

    //Metodo que asigna nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodo que asigna marca
    public void setMarca(String marca){
        this.marca = marca;
    }

    //Metodo que asigna year
    public void setYear(int year) {
        this.year = year;
    }

    //Metodo que asigna color
    public void setColor(String color) {
        this.color = color;
    }

    //Metodo abstracta que sirve para generar una descripcion
    public abstract void descrip();

    //Metodo que hace un sonido
    public abstract void arranque();

    //Metodo que retorna el year del vehiculo
    public int getYear() {
        return year;
    }

    //Metodo que retorna el nombre del vehiculo
    public String getNombre() {
        return nombre;
    }

    //Metodo que retorna la marca
    public String getMarca() {
        return marca;
    }

    //Metodo que retorna el color
    public String getColor() {
        return color;
    }

}