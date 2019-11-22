
package shapesSVG;

/**
 * @author Escobar Rosales Luis Mario
 * Clase Abstracta Figura que sirve para crear otras figuras figuras
 **/

public abstract class Shape implements Comparable<Shape> {

    protected double area;
    protected double perimetro;

    /**
     * Cosntructor de figura
     */
    public Shape() {
    }

    /**
     * Metedo abstacto que permite calcular el area de una figura
     * 
     * @return double el area de la fugura
     */
    abstract public double calculaArea();

    /**
     * Metodo abstracto para calcular el permitetro de una figura
     * 
     * @return double - el perimetro de la figura
     */
    abstract public double calculaPerimetro();

    /**
     * Metodo abstracto de el SVG de una figura
     * 
     * @return
     */
    abstract public String toSVG();

    /**
     * Metodo para comparar 2 figuras por el tamaño de sus areas
     */
    @Override
    public int compareTo(Shape figura) {
        if (this.area < figura.getArea())
            return -1;
        if (this.area > figura.getArea())
            return 1;
        if (this.area == figura.getArea())
            return 0;
        return -1;
    }

    /**
     * Método equals para comparar figuras a partir de su área y perímetro
     * 
     * @param : Object o
     **/
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Shape))
            return false;
        @SuppressWarnings("unchecked")
        Shape f = (Shape) o;
        return (f.calculaArea() == this.area) && (f.calculaPerimetro() == this.perimetro);
    }

    /**
     * Método toString de la clase Figura
     * 
     * @return String
     **/
    @Override
    public String toString() {
        return "Perímetro: " + this.perimetro + ", Area: " + this.area;
    }

    /**
     * Getter del area de una figura
     * 
     * @return double - el area
     */
    public double getArea() {
        return this.area;
    }

    /**
     * Getter del permitro de una figura
     * 
     * @return double - el permetro
     */
    public double getPerimetro() {
        return this.perimetro;
    }
}