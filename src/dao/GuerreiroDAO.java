package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Guerreiro;

public class GuerreiroDAO {
    public void cadastrarGuerreiro(Guerreiro gVO) {
        try {
            Connection con = Conexao.getConexao();
            // id, nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida
            String sql = "insert into guerreiro values "
                    + "(null, ?, ?, ?, ?, ?, ?, null, ?)";// reprodução da ordem baseada no banco de dados
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, gVO.getNome());
            pst.setString(2, gVO.getOlho());
            pst.setString(3, gVO.getCabelo());
            pst.setString(4, gVO.getPele());
            pst.setBoolean(5, gVO.isSexo());
            pst.setString(6, gVO.getArmamento());
            pst.setInt(7, gVO.getPontosDeVida());
            pst.execute();// indice para o povoamento da tabela
            System.out.println("Guerreiro cadastrado com sucesso!!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Guerreiro.\n" + e.getMessage());
        }
    }

    public ArrayList<Guerreiro> getGuerreiros() {
        ArrayList<Guerreiro> guerreiros = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from guerreiro "
                    + "where armamento is %?% "
                    + "and planoDeFuga is null";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Guerreiro guerreiro = new Guerreiro();
                guerreiro.setNome(rs.getString("Nome"));
                guerreiro.setCabelo(rs.getString("Cabelo"));
                guerreiro.setOlho(rs.getString("Olho"));
                guerreiro.setPele(rs.getString("Pele"));
                guerreiro.setSexo(rs.getBoolean("Sexo"));
                guerreiro.setArmamento(rs.getString("armamento"));
                guerreiro.setPontosDeVida(rs.getInt("pontosDeVida"));
                guerreiros.add(guerreiro);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar o Guerreiro.\n"
                    + e.getMessage());
        }
        return guerreiros;
    }

    public Guerreiro getGuerreiroByNome(String nome) {
        Guerreiro g = new Guerreiro();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from guerreiro " + "where nome like %?%";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Guerreiro guerreiro = new Guerreiro();
                guerreiro.setId(rs.getInt("id"));
                guerreiro.setNome(rs.getString("Nome"));
                guerreiro.setCabelo(rs.getString("Cabelo"));
                guerreiro.setOlho(rs.getString("Olho"));
                guerreiro.setPele(rs.getString("Pele"));
                guerreiro.setSexo(rs.getBoolean("Sexo"));
                guerreiro.setArmamento(rs.getString("armamento"));
                guerreiro.setPontosDeVida(rs.getInt("pontosDeVida"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Guerreiro.\n" + e.getMessage());
        }
        return g;
    }

    public void atualizarGuerreiro(Guerreiro gVO) {

    }

    public boolean deletarGuerreiro(String nome) {

        return true;
    }
}