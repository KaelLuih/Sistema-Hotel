package br.com.sistemahotelaria.dao;

import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.PropertyResourceBundle;

public class HospedeDAO {

    public void InserirHospede(Hospede hospede)throws SQLException {
        String query = """
                INSERT INTO Hospede
                (nome, documento, telefone)
                VALUES (?, ?, ?)
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1,hospede.getNome());
            stmt.setString(2,hospede.getDocumento());
            stmt.setString(3,hospede.getTelefone());
            stmt.executeUpdate();
            }
    }

    public List<Hospede> listarHospede()throws SQLException{
        List<Hospede> hospedes = new ArrayList<>();
        String query = """
                SELECT FROM Hospede
                (id, nome, documento, telefone)                
                """;
        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String documento = rs.getString("documento");
                String telefone = rs.getString("telefone");
            }
        }
        return hospedes;
    }
    public void editarHospede(Hospede hospede)throws SQLException{
        String query = """
                UPDATE Material SET nome = ? ,documento = ?, telefone =?
                WHERE id =? 
                
                """;
        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1,hospede.getNome());
            stmt.setString(2,hospede.getDocumento());
            stmt.setString(3,hospede.getTelefone());
            stmt.executeUpdate();
        }

    }

}
