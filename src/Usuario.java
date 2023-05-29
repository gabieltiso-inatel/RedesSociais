import java.util.regex.Pattern;

public class Usuario {
   private String nome;
   private String email;
   private RedeSocial[] redesSociais;

   public Usuario(String nome, String email, RedeSocial[] redesSociais) throws DadoInvalidoException {
       if(!Pattern.matches("^(.+)@(.+)$", email)) {
           throw new DadoInvalidoException("Esse endereço de email não é válido!");
       }

       this.nome = nome;
       this.email = email;
       this.redesSociais = redesSociais;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public RedeSocial[] getRedesSociais() {
       return redesSociais;
   }
}
