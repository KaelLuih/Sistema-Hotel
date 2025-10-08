package br.com.sistemahotelaria.dao;

import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.model.Reserva;
import br.com.sistemahotelaria.model.Status;
import br.com.sistemahotelaria.util.Conexao;

import java.sql.*;
import java.time.LocalDate;
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
        var hospedeDAO = new HospedeDAO();
        var quartoDAO = new QuartoDAO();
        List<Reserva> reservas = new ArrayList<>();
        List<Hospede> hospedes = hospedeDAO.listarHospede();
        List<Quarto> quartos = quartoDAO.listarQuarto();

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
            ResultSet rs= stmt.executeQuery();

            Hospede hospede = null;
            Quarto quarto = null;
            while (rs.next()){
                int id = rs.getInt("id");
                int idHospede = rs.getInt("idHospede");
                for(Hospede h : hospedes) {
                    if(h.getId() == idHospede){
                        hospede = h;
                        break;
                    }
                }
               int idQuarto = rs.getInt("idQuarto");
                for(Quarto q: quartos) {
                    if (q.getId() == idQuarto){
                        quarto = q;
                        break;
                    }

                }
                LocalDate dataEntrada =rs.getObject("dataEntrada",LocalDate.class);
                LocalDate dataSaida = rs.getObject("dataSaida",LocalDate.class);
                Status status = Status.valueOf(rs.getString("status"));
                var reserva = new Reserva(id,hospede, quarto,dataEntrada,dataSaida,status);
            }

        }
        return reservas;
    }
}
