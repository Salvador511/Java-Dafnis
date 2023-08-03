public abstract class Figura {
    // Atributos
    private float perimeter, area;
    
    //Metodos abstractos de calcular area y perimetro y setters and getters
    
    public void setArea(float area) {
        this.area = area;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public float getArea() {
        return area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public abstract void area();

    public abstract void perimeter();

    public abstract void descrip();

}
