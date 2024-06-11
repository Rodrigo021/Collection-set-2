public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos ac = new AgendaContatos();

        ac.exibirContato();

        ac.adicionarContato("Rodrigo", 123456);
        ac.adicionarContato("Rodrigo", 0);
        ac.adicionarContato("Rodrigo Siqueira", 111111);
        ac.adicionarContato("Rodrigo DIO", 456789);
        ac.adicionarContato("Giovanna", 11111111);

        ac.exibirContato();

        System.out.println(ac.pesquisarContato("Rodrigo"));

        System.out.println("Contato atualizado: "+ ac.atualizarContato("Giovanna", 555555));

        ac.exibirContato();
    }
}
