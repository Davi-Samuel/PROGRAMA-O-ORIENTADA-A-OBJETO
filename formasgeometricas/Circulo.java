package formasgeometricas;

public class Circulo {
    double raio;
    double area;
    double perimetro;
    double PI = 3.14; 

    Circulo(double raio) {
        this.raio = raio;
        this.area = PI * raio * raio;
        this.perimetro = 2 * PI * raio;
    }

    void calcularArea() {
        this.area = PI * raio * raio;
    }

    void calcularPerimetro() {
        this.perimetro = 2 * PI * raio;
    }

    void imprimir() {
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}