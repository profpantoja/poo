package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.DbFile;
import model.Endereco;

public class EnderecoDAO {

    public void salvar(Endereco endereco) {
        String sql = "INSERT INTO endereco (rua, numero, bairro, id_cliente) VALUES (?, ?, ?, ?)";

        try (Connection conn = DbFile.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, endereco.getRua());
            stmt.setInt(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setInt(4, endereco.getIdCliente());

            stmt.executeUpdate();
            System.out.println("✅ Endereço salvo com sucesso!");

        } catch (SQLException e) {
            System.err.println("❌ Erro ao salvar endereço: " + e.getMessage());
        }
    }
}
