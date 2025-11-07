public class TV {
boolean ligada = false;
int volume = 10;
int canalAtual = 1;

Canal canal1 = new Canal(1, "Globo");
Canal canal2 = new Canal(2, "SBT");
Canal canal3 = new Canal(3, "Record");
Canal canal4 = new Canal(4, "Canal do Boi");
Canal canal5 = new Canal(5, "SportTV");

public void ligar() {
ligada = true;
System.out.println("TV ligada.");
mostrarCanal();
}

public void desligar() {
ligada = false;
System.out.println("TV desligada.");
}

public void ajustarVolume(int novoVolume) {
if (novoVolume >= 0 && novoVolume <= 100) {
volume = novoVolume;
System.out.println("Volume ajustado para: " + volume);
} else {
System.out.println("Volume fora do limite. Máximo é 100 e mínimo é 0.");
}
}

public void mudarCanal(int numero) {
if (numero >= 1 && numero <= 5) {
canalAtual = numero;
mostrarCanal();
} else {
System.out.println("Canal não encontrado");
}
}

public void mostrarCanal() {
if (canalAtual == 1) canal1.mostrar();
else if (canalAtual == 2) canal2.mostrar();
else if (canalAtual == 3) canal3.mostrar();
else if (canalAtual == 4) canal4.mostrar();
else canal5.mostrar();
}

public void listarCanais() {
System.out.println("Canais disponíveis:");
canal1.mostrar();
canal2.mostrar();
canal3.mostrar();
canal4.mostrar();
canal5.mostrar();
}

public void mostrarInfo() {
System.out.println("Volume: " + volume);
mostrarCanal();
}

boolean estaLigada() {
return ligada;
}
}