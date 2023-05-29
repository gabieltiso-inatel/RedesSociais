public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia {
    public Facebook(String senha, int numAmigos) throws DadoInvalidoException {
        super(senha, numAmigos);
    }

    // Override dos métodos da classe mãe

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Facebook!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Facebook!");
    }

    // Implementação de interfaces
    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming pelo Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando pelo Facebook!");
    }
}
