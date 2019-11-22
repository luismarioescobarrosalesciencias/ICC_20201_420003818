import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;
import processing.core.PApplet;
import processing.core.PImage;
/**
     * @author Escobar Rosales Luis Mario 
     */
public class Practica9 extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Practica9");
    }

    /**
     * Tamaño de la ventana 
     */
    @Override
    public void settings() {
        size(720, 650);
    }

    /**
     * Establece el color y busca el archivo donde estan los numeros
     */
    @Override
    public void setup() {
        fill(100, 120, 130);
        String doc = getClass().getResource("numeros.csv").getPath();
        graph(doc);
    }

    @Override
    public void draw() {
    }

    /**
     * Metodo para dibujar circulos 
     * 
     * @param  doc--- numeros.csv
     */
    public void graph(String doc) {
        try {
            float rad = 20;
            List<String> lines = Files.readAllLines(Paths.get(doc));
            for (String string : lines) {
                String row[] = string.split(",");// separamos en un array donde cada cosa entre comas es un elemento
                ellipse(Float.parseFloat(row[0]), Float.parseFloat(row[1]), rad, rad);
                System.out.println("Coordenada X: " + row[0] + ", Coordenada Y: " + row[1]);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}