package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Pessoa;

public class VitimaDAO {

    public void cadastrarVitima(Pessoa vVO) {
        try {
            Connection con = Conexao.getConexao();
            // id, nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida
            String sql = "insert into pessoa values "
                    + "(null, ?, ?, ?, ?, ?, null, null, ?)";// reprodução da ordem baseada no banco de dados
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, vVO.getNome());
            pst.setString(2, vVO.getOlho());
            pst.setString(3, vVO.getCabelo());
            pst.setString(4, vVO.getPele());
            pst.setBoolean(5, vVO.isSexo());
            pst.setInt(6, vVO.getPontosDeVida());
            pst.execute();// indice para o povoamento da tabela
            System.out.println("Vitima cadastrada com sucesso!!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Pessoa.\n" + e.getMessage());
        }
    }

    public ArrayList<Pessoa> getVitimas() {
        ArrayList<Pessoa> vitimas = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from pessoa "
                    + "where armamento is null "
                    + "and planoDeFuga is null";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Pessoa vitima = new Pessoa();
                vitima.setId(rs.getInt("id"));
                vitima.setNome(rs.getString("Nome"));
                vitima.setCabelo(rs.getString("Cabelo"));
                vitima.setOlho(rs.getString("Olho"));
                vitima.setPele(rs.getString("Pele"));
                vitima.setSexo(rs.getBoolean("Sexo"));
                vitima.setPontosDeVida(rs.getInt("pontosDeVida"));
                vitimas.add(vitima);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar a Vitima.\n"
                    + e.getMessage());
        }
        return vitimas;
    }

    public Pessoa getVitimaByNome(String nome) {
        Pessoa v = new Pessoa();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from pessoa " + "where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                v.setId(rs.getInt("id"));
                v.setNome(rs.getString("Nome"));
                v.setCabelo(rs.getString("Cabelo"));
                v.setOlho(rs.getString("Olho"));
                v.setPele(rs.getString("Pele"));
                v.setSexo(rs.getBoolean("Sexo"));
                v.setPontosDeVida(rs.getInt("pontosDeVida"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar vitima.\n" + e.getMessage());
        }
        return v;
    }

    public void atualizarVitima(Pessoa vVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update pessoa set nome = ?,"
                    + "olho = ?,"
                    + "cabelo = ?,"
                    + "pele = ?,"
                    + "pontosDeVida = ?"
                    + " where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, vVO.getNome());
            pst.setString(2, vVO.getOlho());
            pst.setString(3, vVO.getCabelo());
            pst.setString(4, vVO.getPele());
            pst.setInt(5, vVO.getId());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar vitima.\n" + e.getMessage());
        }
    }

    public boolean deletarVitima(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from pessoa where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar a vitima.\n" + e.getMessage());
        }
        return true;
    }

    public Pessoa getVitimaById(int id) {
        Pessoa v = new Pessoa();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from pessoa " + "where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                v.setId(rs.getInt("id"));
                v.setNome(rs.getString("Nome"));
                v.setCabelo(rs.getString("Cabelo"));
                v.setOlho(rs.getString("Olho"));
                v.setPele(rs.getString("Pele"));
                v.setSexo(rs.getBoolean("Sexo"));
                v.setPontosDeVida(rs.getInt("pontosDeVida"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar vitima.\n" + e.getMessage());
        }
        return v;
    }
}
