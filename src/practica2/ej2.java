package practica2;

public class Restaurante {

    private String nombre;
    private Punto posición;
    private int valoracion;
public Restaurante(String nombre, Punto posicion, int valoracion) {
    this.nombre = nombre;
    this.posicion=posicion;
    this.valoracion=valoracion;


    }
    String grtNombre(){
    return nombre;
    }
    String getPosicion(){
    return posicion;
    }
    String getValoracion(){
    return valoracion;
    }
    public double distancia (Punto otroPunto){

    }
}
