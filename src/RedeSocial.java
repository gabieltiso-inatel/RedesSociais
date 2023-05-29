import java.util.regex.Pattern;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) throws DadoInvalidoException {
        if(!Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$", senha)) {
            throw new DadoInvalidoException("Sua senha deve conter pelo menos um dígito, uma letra maiúscula, um caractere especial e ter no mímino 8 caracteres");
        }
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao() {
        System.out.println("Publicação curtida!");
    }
}
