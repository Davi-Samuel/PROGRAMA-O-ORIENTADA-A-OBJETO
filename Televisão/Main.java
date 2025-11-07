import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
TV tv = new TV();

while (true) {
System.out.println("\n1 - Ligar TV");
System.out.println("2 - Desligar TV");
System.out.println("3 - Mudar Canal");
System.out.println("4 - Ajustar Volume");
System.out.println("5 - Mostrar Informações");
System.out.println("6 - Listar Canais");
System.out.print("Escolha: ");
int opção = sc.nextInt();

switch (opção) {
case 1:
tv.ligar();
break;
case 2:
tv.desligar();
break;
case 3:
if (tv.estaLigada()) {
System.out.print("Número do canal (1 a 5): ");
tv.mudarCanal(sc.nextInt());
} else {
System.out.println("A TV está desligada.");
}
break;
case 4:
if (tv.estaLigada()) {
System.out.print("Novo volume: ");
tv.ajustarVolume(sc.nextInt());
} else {
System.out.println("A TV está desligada.");
}
break;
case 5:
if (tv.estaLigada()) {
tv.mostrarInfo();
} else {
System.out.println("A TV está desligada.");
}
break;
case 6:
if (tv.estaLigada()) {
tv.listarCanais();
} else {
System.out.println("A TV está desligada.");
}
break;

default:
System.out.println("Opção inválida.");

}
sc.close();
}

}
}