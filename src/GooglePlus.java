public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia {
    public GooglePlus(String senha, int numAmigos) throws DadoInvalidoException {
        super(senha, numAmigos);
    }

    // Override dos métodos da classe mãe

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no GooglePlus!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no GooglePlus!");
    }

    // Implementação de interfaces
    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming pelo GooglePlus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando pelo GooglePlus!");
    }
}
