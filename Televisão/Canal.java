class Canal {
int numero;
String nome;

Canal(int numero, String nome) {
this.numero = numero;
this.nome = nome;
}

void mostrar() {
System.out.println("\nCanal " + numero + ": " + nome);
}
}