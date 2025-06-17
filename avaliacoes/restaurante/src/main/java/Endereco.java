public class Endereco {
    
    private String rua;
    private String cep;
    private String bairro;
    private String cidade;
    private int num;

    public Endereco(String rua, String cep, String bairro, String cidade, int num) {
        setRua(rua);
        setCep(cep);
        setCidade(cidade);
        setBairro(bairro);
        setNum(num);
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return rua + ", nº " + num + " - " + bairro + ", " + cidade + " - CEP: " + cep;
    }
}
