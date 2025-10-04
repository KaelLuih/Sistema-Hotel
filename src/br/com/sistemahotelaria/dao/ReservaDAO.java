package br.com.sistemahotelaria.dao;

import br.com.sistemahotelaria.model.Reserva;
import br.com.sistemahotelaria.util.Conexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    public void CadastarReserva(Reserva reserva)throws SQLException{
        String query = """
                INSERT INTO Reserva
                (idHospede, idQuarto, dataEntrada, dataSaida, status)
                VALUES (?, ?, ?, ?, ?)
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setInt(1,reserva.getHospede().getId());
            stmt.setInt(2,reserva.getQuarto().getId());
            stmt.setDate(3, Date.valueOf(reserva.getDataEntrada()));
            stmt.setDate(4,Date.valueOf(reserva.getDataSaida()));
            stmt.setString(5, String.valueOf(reserva.getStatus()));
            stmt.executeUpdate();
        }
    }

    public List<Reserva>  listarReservas()throws SQLException{
        List<Reserva> reservas = new ArrayList<>();
        String query = """
                SELECT  id,
                        idHospede,
                        idQuarto,
                        dataEntrada,
                        dataSaida,
                        status
                FROM Reserva
               """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

        }
        return reservas;
    }
}
