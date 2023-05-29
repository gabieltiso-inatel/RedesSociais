public class Main {
    public static void main(String[] args) {
        try {
            RedeSocial[] redesDoUsuario = {
                new GooglePlus("2aaaB&cde", 150),
                new Instagram("Abhs34$#h", 35),
            };
            Usuario usuarioParaTestes = new Usuario("João", "joao@email.com", redesDoUsuario);

            // Nesse caso, ao varrermos o array de redes do usuário, apenas os
            // condicionais relacionados à instância do Facebook e do Twitter serão
            // executados, pos são as duas redes sociais presentes no array. Nesse 
            // caso, o requerimento do exercício para que os métodos diferentes sejam
            // chamados em cada rede social será atendido.
            for(RedeSocial rede : redesDoUsuario) {
                if(rede instanceof Facebook) {
                    Facebook redeFacebook = (Facebook)rede;
                    redeFacebook.curtirPublicacao();
                    redeFacebook.postarVideo();
                    redeFacebook.fazStreaming();
                } else if(rede instanceof GooglePlus) {
                    GooglePlus redeGooglePlus = (GooglePlus)rede;
                    redeGooglePlus.postarFoto();
                    redeGooglePlus.compartilhar();
                    redeGooglePlus.fazStreaming();
                } else if(rede instanceof Twitter) {
                    Twitter redeTwitter = (Twitter)rede;
                    redeTwitter.postarVideo();
                    redeTwitter.postarComentario();
                    redeTwitter.compartilhar();
                } else {
                    Instagram redeInstagram = (Instagram)rede;
                    redeInstagram.postarVideo();
                    redeInstagram.postarComentario();
                    redeInstagram.postarFoto();
                }
            }
        } catch(DadoInvalidoException e) {
            e.printStackTrace();
        }
    }
}
