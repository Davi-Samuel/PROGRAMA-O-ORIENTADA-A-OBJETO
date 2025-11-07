package formasgeometricas;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(5);
        quadrado.calcularArea();
        quadrado.calcularPerimetro();
        System.out.println("Quadrado");
        quadrado.imprimir();

        Circulo circulo = new Circulo(3);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        System.out.println("\nCírculo");
        circulo.imprimir();

        Retangulo retangulo = new Retangulo(4, 6);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        System.out.println("\nRetângulo");
        retangulo.imprimir();
    }
}