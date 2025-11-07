package formasgeometricas;

public class Quadrado {

    double lado;
    double area;
    double perimetro;

    Quadrado(double lado) {
        this.lado = lado;
        this.area = lado * lado;
        this.perimetro = lado * 4;
    }

    //Métodos própios
    void calcularArea() {
        this.area = lado * lado;
    }

    void calcularPerimetro() {
        this.perimetro = lado * 4;
    }

    void imprimir() {
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
