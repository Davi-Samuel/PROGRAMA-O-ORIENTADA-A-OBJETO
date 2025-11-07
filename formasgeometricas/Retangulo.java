package formasgeometricas;

public class Retangulo {
  
    double base;
    double altura;
    double area;
    double perimetro;

  
    Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = base * altura;
        this.perimetro = 2 * base + altura;
    }

    void calcularArea() {
        this.area = base * altura;
    }

    void calcularPerimetro() {
        this.perimetro = 2 * base + altura;
    }

    void imprimir() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}