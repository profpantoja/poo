package controller;

import dao.EnderecoDAO;
import model.Endereco;

public class EnderecoController {

    private final EnderecoDAO enderecoDAO;

    public EnderecoController() {
        this.enderecoDAO = new EnderecoDAO();
    }

    public void cadastrarEndereco(String rua, int numero, String bairro, int idCliente) {
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setIdCliente(idCliente);

        enderecoDAO.salvar(endereco);
    }

    public void listarEnderecos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarEnderecos'");
    }
}
