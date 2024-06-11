import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarContato(String nome){
        Set<Contato> contatosNome = new HashSet<>();

        for (Contato c : contatos) {
            if (c.getNome().startsWith(nome)) {
                contatosNome.add(c);
            }
        }
        return contatosNome;
    }

    public Contato atualizarContato(String nome, int novoNumero){
        Contato contatoAtual = null;
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtual = c;
                break;
            }
        }
        return contatoAtual;
    }
    
}
