package br.com.sistemahotelaria.dao;

import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuartoDAO {

    public void InseriQuarto(Quarto quarto)throws SQLException {
        String query = """
                INSERT INTO Quarto
                (numero, tipo, preco)
                VALUES (?, ?, ?)
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1,quarto.getNumero());
            stmt.setString(2,quarto.getTipo());
            stmt.setDouble(3,quarto.getPreco());
            stmt.executeUpdate();
        }
    }

    public List<Quarto> listarQuarto(){
        List<Quarto> quartos = new ArrayList<>();
        String query = """
                SELECT id, numero, tipo, preco
                FROM Quarto
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                int numero = rs.getInt("numero");
                String tipo = rs.getString("tipo");
                double preco = rs.getDouble("preco");

                var quarto = new Quarto(id, numero, tipo, preco);
                quartos.add(quarto);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return quartos;
    }


}
