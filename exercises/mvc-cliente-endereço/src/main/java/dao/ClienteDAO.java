package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.DbFile;
import model.Cliente;

public class ClienteDAO {

    public void salvar(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, cpf, telefone) VALUES (?, ?, ?)";

        try (Connection conn = DbFile.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());

            stmt.executeUpdate();
            System.out.println("✅ Cliente salvo com sucesso!");

        } catch (SQLException e) {
            System.err.println("❌ Erro ao salvar cliente: " + e.getMessage());
        }
    }
}
