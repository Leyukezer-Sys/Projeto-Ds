package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Fornecedor;
import utilitario.Conectar;

public class FornecedorDao {

    public void inserir(Fornecedor f) {
        Connection con = Conectar.getConectar();
        String sql = "INSERT INTO Fornecedor(nomeFantasia,rasaoSociao,telefone,cnpj,estado,cidade,cep,numero,endereco) VALUES(?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, f.getNomeFantasia());
            stm.setString(2, f.getRasaoSociao());
            stm.setString(3, f.getTelefone());
            stm.setString(4, f.getCnpj());
            stm.setString(5, f.getEstado());
            stm.setString(6, f.getCidade());
            stm.setString(7, f.getCep());
            stm.setString(8, f.getNumero());
            stm.setString(9, f.getEndereco());
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Fornecedor " + f.getNomeFantasia()+ " Cadastrado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar o Cliente!", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public void atualizar(Fornecedor f) {
        Connection con = Conectar.getConectar();
        String sql = "UPDATE Fornecedor SET nomeFantasia= ?, rasaoSociao= ?, telefone= ?, cnpj= ?, estado= ?, cidade= ?, cep= ?, numero= ?, endereco= ? WHERE idFornecedor= ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, f.getNomeFantasia());
            stm.setString(2, f.getRasaoSociao());
            stm.setString(3, f.getTelefone());
            stm.setString(4, f.getCnpj());
            stm.setString(5, f.getEstado());
            stm.setString(6, f.getCidade());
            stm.setString(7, f.getCep());
            stm.setString(8, f.getNumero());
            stm.setString(9, f.getEndereco());
            stm.setInt(10, f.getIdFornecedor());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, f.getNomeFantasia()+" Atualizado com Sucesso!");
            stm.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Fornecedor", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

    }

    public void deletar(Fornecedor f) {
        Connection con = Conectar.getConectar();
        String sql = "DELETE FROM Fornecedor WHERE idFornecedor= ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o Clietne " + f.getNomeFantasia(), "Exclusão", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, f.getIdFornecedor());
                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                stm.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar", null, JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
    }

    public List<Fornecedor> listarTodos(String nome) {
        Connection con = Conectar.getConectar();
        List<Fornecedor> prList = new ArrayList();
        String sql = "SELECT * FROM Fornecedor WHERE nomeFantasia Like ? ORDER BY nomeFantasia";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + nome + "%");
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Fornecedor f = new Fornecedor();
                f.setIdFornecedor(resultados.getInt("idFornecedor"));
                f.setNomeFantasia(resultados.getString("nomeFantasia"));
                f.setRasaoSociao(resultados.getString("rasaoSociao"));
                f.setTelefone(resultados.getString("telefone"));
                f.setCnpj(resultados.getString("cnpj"));
                f.setEstado(resultados.getString("estado"));
                f.setCidade(resultados.getString("cidade"));
                f.setCep(resultados.getString("cep"));
                f.setNumero(resultados.getString("numero"));
                f.setEndereco(resultados.getString("endereco"));
                prList.add(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }

    public List<Fornecedor> listarTodos() {
        Connection con = Conectar.getConectar();
        List<Fornecedor> prList = new ArrayList();
        String sql = "SELECT * FROM Fornecedor ORDER BY nomeFantasia";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Fornecedor f = new Fornecedor();
                f.setIdFornecedor(resultados.getInt("idFornecedor"));
                f.setNomeFantasia(resultados.getString("nomeFantasia"));
                f.setRasaoSociao(resultados.getString("rasaoSociao"));
                f.setTelefone(resultados.getString("telefone"));
                f.setCnpj(resultados.getString("cnpj"));
                f.setEstado(resultados.getString("estado"));
                f.setCidade(resultados.getString("cidade"));
                f.setCep(resultados.getString("cep"));
                f.setNumero(resultados.getString("numero"));
                f.setEndereco(resultados.getString("endereco"));
                prList.add(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }
    
     public List<Fornecedor> listarTodos(int id) {
        Connection con = Conectar.getConectar();
        List<Fornecedor> prList = new ArrayList();
        String sql = "SELECT * FROM Fornecedor WHERE idFornecedor = " + id;
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Fornecedor f = new Fornecedor();
                f.setIdFornecedor(resultados.getInt("idFornecedor"));
                f.setNomeFantasia(resultados.getString("nomeFantasia"));
                f.setRasaoSociao(resultados.getString("rasaoSociao"));
                f.setTelefone(resultados.getString("telefone"));
                f.setCnpj(resultados.getString("cnpj"));
                f.setEstado(resultados.getString("estado"));
                f.setCidade(resultados.getString("cidade"));
                f.setCep(resultados.getString("cep"));
                f.setNumero(resultados.getString("numero"));
                f.setEndereco(resultados.getString("endereco"));
                prList.add(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }
}
