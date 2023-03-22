package practica2;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }


    public Punto desplazar(double DesplazamientoX, double DespalzamientoY) {
        double xdesp = this.x + DesplazamientoX;
        double ydesp = this.y + DespalzamientoY;
        Punto nuevopunto = new Punto (xdesp, ydesp);
        return nuevopunto;

    }
    public double distancia (Punto otroPunto) {
        double x1 = this.x;
        double y1 = this.y;
        double x2 = otroPunto.x;
        double y2 = otroPunto.y;
        double dist = Math.sqrt(Math.pow(x1, x2) );
        return dist ;

    }

    public String toString(){
        String cadx=String.valueOf(this.x);
        String cady=String.valueOf(this.y);
        String cad=("(" + cadx + "," + cady + ")");
        return cad;

    }
    public boolean equals(Object otroObjeto){

        if(this == otroObjeto)
        return true;
        if(!(otroObjeto instanceof Punto))
            return false;
    }
}


