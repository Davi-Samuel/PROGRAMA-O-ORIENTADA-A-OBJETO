import java.util.ArrayList;

public class Contatov2 {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void armazenarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void removerContatos(Contato contato) {
        this.contatos.remove(contato);
    }

    public int encontraContato(String nome) { 
        for (int i = 0; i < contatos.size(); i++) {
            // .get(i) pega o objeto na posição i; 
            //.get_nome() função que retorna o nome do objeto 
            // .equals(nome) compara o nome do  objeto com o nome passado no parâmetro 
            if (contatos.get(i).getNome().equals(nome)) { 
                return i;
            }
        } return -1;
    }

    public void imprimirContato() {
        System.out.println("=====ÍNICIO=====");
        for (Contato contato : contatos) {
            contato.imprimirInformacoes();
            System.out.println("");
        }
        System.out.println("=====FIM=====");
    }

    public void imprimeContato(int posicao) {
        this.contatos.get(posicao).imprimirInformacoes();
    }
}
