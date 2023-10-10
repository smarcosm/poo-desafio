public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
    public static void main(String[] args) {

    Iphone iphone = new Iphone();
    iphone.ligar();
    iphone.selecionarMusica();
    iphone.tocar();
    iphone.exibirPagina();

    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando página...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}