import java.util.Scanner;

public class Triangulo {
    double verticeAx;
    double verticeAy;
    double verticeBx;
    double verticeBy;
    double verticeCx;
    double verticeCy;

    public Triangulo(double verticeAx, double verticeAy, double verticeBx, double verticeBy, double verticeCx, double verticeCy) {
        this.verticeAx = verticeAx;
        this.verticeAy = verticeAy;
        this.verticeBx = verticeBx;
        this.verticeBy = verticeBy;
        this.verticeCx = verticeCx;
        this.verticeCy = verticeCy;
    }

    public Triangulo() {
    }

    public double getVerticeAx() {
        return verticeAx;
    }

    public double getVerticeAy() {
        return verticeAy;
    }

    public double getVerticeBx() {
        return verticeBx;
    }

    public double getVerticeBy() {
        return verticeBy;
    }

    public double getVerticeCx() {
        return verticeCx;
    }

    public double getVerticeCy() {
        return verticeCy;
    }

    public void setVerticeAx(double verticeAx) {
        this.verticeAx = verticeAx;
    }

    public void setVerticeAy(double verticeAy) {
        this.verticeAy = verticeAy;
    }

    public void setVerticeBx(double verticeBx) {
        this.verticeBx = verticeBx;
    }

    public void setVerticeBy(double verticeBy) {
        this.verticeBy = verticeBy;
    }

    public void setVerticeCx(double verticeCx) {
        this.verticeCx = verticeCx;
    }

    public void setVerticeCy(double verticeCy) {
        this.verticeCy = verticeCy;
    }
    double baricentrox(double vay, double vbx, double vcx) {
        double bx = 0;
        bx = (verticeAx + verticeBx + verticeCx) / 3;
        return bx;
    }

    double baricentroy(double vay,double vby, double vcb ) {
        double by = 0;
        by = (verticeAy + verticeBy + verticeCy) / 3;
        return by;
    }


    public void ingresarCoordenadas(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la  coordenada de A ");
        System.out.println("A: X");
        double vax1=sc.nextDouble();
        System.out.println("A: Y");
        double vay1=sc.nextDouble();
        System.out.println("Ingrese la coordenada de B ");
        System.out.println("B: X");
        double vbx1=sc.nextDouble();
        System.out.println("B: Y");
        double vby1=sc.nextDouble();
        System.out.println("Ingrese la coordenada de C ");
        System.out.println("C: X");
        double vcx1=sc.nextDouble();
        System.out.println("C: Y");
        double vcy1=sc.nextDouble();
        this.verticeAx=vax1;
        this.verticeAy=vay1;
        this.verticeBx=vbx1;
        this.verticeBy=vby1;
        this.verticeCx=vcx1;
        this.verticeCy=vcy1;
    }
public void impreciondebari(){

    double bx=this.baricentrox(this.verticeAx,this.verticeBx,this.verticeCx);
    double by=this.baricentroy(this.verticeAy,this.verticeBy,this.verticeCy);
    System.out.println("--------------------------------------------");
    System.out.println("Las coordenada Baricentro del triangulo de las coordenadas puestas en A B y C es: ");
    System.out.println("("+bx+","+by+")");
}
}
