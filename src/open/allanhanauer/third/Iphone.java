package open.allanhanauer.third;

public class Iphone implements AparelhoTelefonico,ReprodutoMusical,NavegadorInternet{
    @Override
    public void ligar() {
        System.out.println("O aparelho está iniciando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando a musica do reprodutor");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aumentanto o número de páginas");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Recarregando a Página");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a tela para o usuário");
    }
}
