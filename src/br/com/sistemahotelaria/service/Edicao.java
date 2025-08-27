package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.model.Reserva;
import br.com.sistemahotelaria.model.Usuario;
import br.com.sistemahotelaria.view.View;

import java.time.LocalDate;
import java.util.List;

public class Edicao {

    // ------- HÓSPEDE -------
    public static void editarHospede(List<Usuario> usuarioList, View view) {
        view.cabecalho("EDITAR HÓSPEDE");

        String nome = view.lerEntrada("Digite o nome do hóspede que deseja editar: ");
        Hospede hospede = buscarHospedePorNome(usuarioList, nome);

        if (hospede == null) {
            view.semCadastro();
            return;
        }

        // editar campos
        String novoNome = view.lerEntrada("Nome atual: " + hospede.getNome() + " | Novo (ENTER p/ manter): ");
        if (!novoNome.trim().isEmpty()) hospede.setNome(novoNome);

        String novoDoc = view.lerEntrada("Documento atual: " + hospede.getDocumento() + " | Novo (ENTER p/ manter): ");
        if (!novoDoc.trim().isEmpty()) hospede.setDocumento(novoDoc);

        String novoTel = view.lerEntrada("Telefone atual: " + hospede.getTelefone() + " | Novo (ENTER p/ manter): ");
        if (!novoTel.trim().isEmpty()) hospede.setTelefone(novoTel);

        view.editadoComSucesso();
    }

    private static Hospede buscarHospedePorNome(List<Usuario> usuarioList, String nome) {
        for (Usuario u : usuarioList) {
            if (u instanceof Hospede h && h.getNome().equalsIgnoreCase(nome)) {
                return h;
            }
        }
        return null;
    }

    // ------- QUARTO -------
    public static void editarQuarto(List<Quarto> quartoList, View view) {
        view.cabecalho("EDITAR QUARTO");

        String numero = view.lerEntrada("Digite o número do quarto que deseja editar: ");
        Quarto quarto = buscarQuartoPorNumero(quartoList, numero);

        if (quarto == null) {
            view.semCadastro();
            return;
        }

        String novoNumero = view.lerEntrada("Número atual: " + quarto.getNumero() + " | Novo (ENTER p/ manter): ");
        if (!novoNumero.trim().isEmpty()) quarto.setNumero(novoNumero);

        String novoTipo = view.lerEntrada("Tipo atual: " + quarto.getTipo() + " | Novo (ENTER p/ manter): ");
        if (!novoTipo.trim().isEmpty()) quarto.setTipo(novoTipo);

        String novoPreco = view.lerEntrada("Preço atual: " + quarto.getPreco() + " | Novo (ENTER p/ manter): ");
        if (!novoPreco.trim().isEmpty()) quarto.setPreco(novoPreco);

        view.editadoComSucesso();
    }

    private static Quarto buscarQuartoPorNumero(List<Quarto> quartoList, String numero) {
        for (Quarto q : quartoList) {
            if (q.getNumero().equalsIgnoreCase(numero)) return q;
        }
        return null;
    }

    // ------- RESERVA -------
    public static void editarReserva(List<Reserva> reservaList, View view) {
        view.cabecalho("EDITAR RESERVA");

        String nome = view.lerEntrada("Digite o nome do hóspede da reserva que deseja editar: ");
        Reserva reserva = buscarReservaPorHospede(reservaList, nome);

        if (reserva == null) {
            view.semCadastro();
            return;
        }

        String novaEntrada = view.lerEntrada("Data entrada atual: " + reserva.getDataEntrada() + " | Nova (yyyy-MM-dd ou ENTER p/ manter): ");
        if (!novaEntrada.trim().isEmpty()) reserva.setDataEntrada(LocalDate.parse(novaEntrada));

        String novaSaida = view.lerEntrada("Data saída atual: " + reserva.getDataSaida() + " | Nova (yyyy-MM-dd ou ENTER p/ manter): ");
        if (!novaSaida.trim().isEmpty()) reserva.setDataSaida(LocalDate.parse(novaSaida));

        String ativo = view.lerEntrada("Status atual: " + (reserva.getAtiva() ? "Ativa" : "Cancelada") + " | Digite S para Ativa, N para Cancelada, ENTER p/ manter: ");
        if (ativo.equalsIgnoreCase("S")) reserva.setAtiva(true);
        else if (ativo.equalsIgnoreCase("N")) reserva.setAtiva(false);

        view.editadoComSucesso();
    }

    private static Reserva buscarReservaPorHospede(List<Reserva> reservaList, String nome) {
        for (Reserva r : reservaList) {
            if (r.getHospede() != null && r.getHospede().getNome().equalsIgnoreCase(nome)) {
                return r;
            }
        }
        return null;
    }
}
