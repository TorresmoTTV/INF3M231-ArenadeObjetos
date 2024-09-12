package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Ladrao;

public class LadraoDAO {
    public void cadastrarLadrao(Ladrao gVO) {
        try {
            Connection con = Conexao.getConexao();
            // id, nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida
            String sql = "insert into guerreiro values "
                    + "(null, ?, ?, ?, ?, ?, null, ?, ?)";// reprodução da ordem baseada no banco de dados
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, gVO.getNome());
            pst.setString(2, gVO.getOlho());
            pst.setString(3, gVO.getCabelo());
            pst.setString(4, gVO.getPele());
            pst.setBoolean(5, gVO.isSexo());
            pst.setString(6, gVO.getPlanoDeFuga());
            pst.setInt(7, gVO.getPontosDeVida());
            pst.execute();// indice para o povoamento da tabela
            System.out.println("Ladrao cadastrado com sucesso!!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Ladrao.\n" + e.getMessage());
        }
    }

    public ArrayList<Ladrao> getLadroes() {
        ArrayList<Ladrao> ladroes = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from guerreiro "
                    + "where armamento is not null "
                    + "and planoDeFuga is null";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Ladrao ladrao = new Ladrao();
                ladrao.setNome(rs.getString("Nome"));
                ladrao.setCabelo(rs.getString("Cabelo"));
                ladrao.setOlho(rs.getString("Olho"));
                ladrao.setPele(rs.getString("Pele"));
                ladrao.setSexo(rs.getBoolean("Sexo"));
                ladrao.setPlanoDeFuga(rs.getString("planoDeFuga"));
                ladrao.setPontosDeVida(rs.getInt("pontosDeVida"));
                ladroes.add(ladrao);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar o Ladrao.\n"
                    + e.getMessage());
        }
        return ladroes;
    }

    public Ladrao getLadraoByNome(String nome) {
        Ladrao l = new Ladrao();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from ladrao " + "where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                l.setId(rs.getInt("id"));
                l.setNome(rs.getString("Nome"));
                l.setCabelo(rs.getString("Cabelo"));
                l.setOlho(rs.getString("Olho"));
                l.setPele(rs.getString("Pele"));
                l.setSexo(rs.getBoolean("Sexo"));
                l.setPlanoDeFuga(rs.getString("planoDeFuga"));
                l.setPontosDeVida(rs.getInt("pontosDeVida"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Ladrao.\n" + e.getMessage());
        }
        return l;
    }

    public void atualizarLadrao(Ladrao lVO) {

    }

    public boolean deletarLadrao(String nome) {

        return true;
    }
}