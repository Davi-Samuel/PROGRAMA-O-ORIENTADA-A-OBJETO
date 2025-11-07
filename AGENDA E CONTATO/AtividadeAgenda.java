public class AtividadeAgenda {
    public static void main(String[] args) {
        Contato contato1 = new Contato(
        "Capitão-América", 
        "capitao@gmail.com", 
        "(69)99999-1111");
        Contato contato2 = new Contato(
        "Batman", 
        "batman@email.com", 
        "(11)98888-2222");
        Contato contato3 = new Contato(
        "Spider-Man", 
        "spider@email.com", 
        "(69)97777-3333");

        Contatov2 agenda = new Contatov2();

        agenda.armazenarContato(contato1);
        agenda.armazenarContato(contato2);
        agenda.armazenarContato(contato3);

        System.out.println("Agenda completa:");
        agenda.imprimirContato();

        agenda.removerContatos(contato2);

        System.out.println("\nAgenda depois de remover do contato na posição 1:");
        agenda.imprimirContato();

        Contato contato4 = new Contato("HarryPotter", "harry@email.com", "(69)96666-4444");

        agenda.armazenarContato(contato4);


        System.out.println("\nInformações do contato na posição 1:");
        agenda.imprimeContato(1);
    }
}