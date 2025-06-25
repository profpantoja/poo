public class Coordenador {

    private String nome_cordenador;
    private String email;
    private String instituição_origem;
    private String endereço;
    private String função;

    public Coordenador(String nome_cordenador, String email, String instituição_origem, String endereço,
            String função) {
        this.nome_cordenador = nome_cordenador;
        this.email = email;
        this.instituição_origem = instituição_origem;
        this.endereço = endereço;
        this.função = função;
    }

    public String getNome_cordenador() {
        return nome_cordenador;
    }
    public void setNome_cordenador(String nome_cordenador) {
        this.nome_cordenador = nome_cordenador;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getInstituição_origem() {
        return instituição_origem;
    }
    public void setInstituição_origem(String instituição_origem) {
        this.instituição_origem = instituição_origem;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getFunção() {
        return função;
    }
    public void setFunção(String função) {
        this.função = função;
    }


    
    
}
