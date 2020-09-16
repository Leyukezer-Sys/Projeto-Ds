package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Cliente;
import utilitario.Conectar;

public class ClienteDao {

    public void inserir(Cliente c) {
        Connection con = Conectar.getConectar();
        String sql = "INSERT INTO Cliente(nomeCompleto,telefone,cpf,rg,rua,cidade,estado,bairro,cep,numeroResidencial,complementoEndereco,carteiraDeTrabalho, pessoaReferencia,numeroPessoaReferencia,lojaDeReferencia, idade) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, c.getNomeCompleto());
            stm.setString(2, c.getTelefone());
            stm.setString(3, c.getCpf());
            stm.setString(4, c.getRg());
            stm.setString(5, c.getRua());
            stm.setString(6, c.getCidade());
            stm.setString(7, c.getEstado());
            stm.setString(8, c.getBairro());
            stm.setString(9, c.getCep());
            stm.setString(10, c.getNumeroResidencial());
            stm.setString(11, c.getComplementoEndereco());
            stm.setString(12, c.getCarteiraDeTrabalho());
            stm.setString(13, c.getPessoaReferencia());
            stm.setString(14, c.getNumeroPessoaReferencia());
            stm.setString(15, c.getLojaDeReferencia());
            stm.setInt(16, c.getIdade());
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Cliente " + c.getNomeCompleto() + " Cadastrado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar o Cliente!", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public void atualizar(Cliente c) {
        Connection con = Conectar.getConectar();
        String sql = "UPDATE Cliente SET nomeCompleto= ?, telefone= ?, cpf= ?, rg= ?, rua= ?, cidade= ?, estado= ?, bairro= ?, cep= ?, numeroResidencial= ?, complementoEndereco= ?, carteiraDeTrabalho= ?, pessoaReferencia= ?, numeroPessoaReferencia= ?, lojaDeReferencia= ?, idade= ? WHERE idCliente= ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, c.getNomeCompleto());
            stm.setString(2, c.getTelefone());
            stm.setString(3, c.getCpf());
            stm.setString(4, c.getRg());
            stm.setString(5, c.getRua());
            stm.setString(6, c.getCidade());
            stm.setString(7, c.getEstado());
            stm.setString(8, c.getBairro());
            stm.setString(9, c.getCep());
            stm.setString(10, c.getNumeroResidencial());
            stm.setString(11, c.getComplementoEndereco());
            stm.setString(12, c.getCarteiraDeTrabalho());
            stm.setString(13, c.getPessoaReferencia());
            stm.setString(14, c.getNumeroPessoaReferencia());
            stm.setString(15, c.getLojaDeReferencia());
            stm.setInt(16, c.getIdade());
            stm.setInt(17, c.getIdCliente());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, c.getNomeCompleto()+" Atualizado com Sucesso!");
            stm.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Cliente", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

    }

    public void deletar(Cliente c) {
        Connection con = Conectar.getConectar();
        String sql = "DELETE FROM Cliente WHERE idCliente= ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o Clietne " + c.getNomeCompleto(), "Exclusão", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, c.getIdCliente());
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

    public List<Cliente> listarTodos(String nome) {
        Connection con = Conectar.getConectar();
        List<Cliente> prList = new ArrayList();
        String sql = "SELECT * FROM Cliente WHERE nomeCompleto Like ? ORDER BY nomeCompleto";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + nome + "%");
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(resultados.getInt("idCliente"));
                c.setNomeCompleto(resultados.getString("nomeCompleto"));
                c.setTelefone(resultados.getString("telefone"));
                c.setRg(resultados.getString("rg"));
                c.setCpf(resultados.getString("cpf"));
                c.setIdade(resultados.getInt("idade"));
                c.setCidade(resultados.getString("cidade"));
                c.setEstado(resultados.getString("estado"));
                c.setRua(resultados.getString("rua"));
                c.setBairro(resultados.getString("bairro"));
                c.setComplementoEndereco(resultados.getString("complementoEndereco"));
                c.setCep(resultados.getString("cep"));
                c.setNumeroResidencial(resultados.getString("numeroResidencial"));
                c.setPessoaReferencia(resultados.getString("pessoaReferencia"));
                c.setNumeroPessoaReferencia(resultados.getString("numeroPessoaReferencia"));
                c.setLojaDeReferencia(resultados.getString("lojaDeReferencia"));
                c.setCarteiraDeTrabalho(resultados.getString("carteiraDeTrabalho"));
                prList.add(c);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }

    public List<Cliente> listarTodos() {
        Connection con = Conectar.getConectar();
        List<Cliente> prList = new ArrayList();
        String sql = "SELECT * FROM Cliente ORDER BY nomeCompleto";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(resultados.getInt("idCliente"));
                c.setNomeCompleto(resultados.getString("nomeCompleto"));
                c.setTelefone(resultados.getString("telefone"));
                c.setRg(resultados.getString("rg"));
                c.setCpf(resultados.getString("cpf"));
                c.setIdade(resultados.getInt("idade"));
                c.setCidade(resultados.getString("cidade"));
                c.setEstado(resultados.getString("estado"));
                c.setRua(resultados.getString("rua"));
                c.setBairro(resultados.getString("bairro"));
                c.setComplementoEndereco(resultados.getString("complementoEndereco"));
                c.setCep(resultados.getString("cep"));
                c.setNumeroResidencial(resultados.getString("numeroResidencial"));
                c.setPessoaReferencia(resultados.getString("pessoaReferencia"));
                c.setNumeroPessoaReferencia(resultados.getString("numeroPessoaReferencia"));
                c.setLojaDeReferencia(resultados.getString("lojaDeReferencia"));
                c.setCarteiraDeTrabalho(resultados.getString("carteiraDeTrabalho"));
                prList.add(c);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }
    
     public List<Cliente> listarTodos(int id) {
        Connection con = Conectar.getConectar();
        List<Cliente> prList = new ArrayList();
        String sql = "SELECT * FROM Cliente WHERE idCliente = " + id;
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(resultados.getInt("idCliente"));
                c.setNomeCompleto(resultados.getString("nomeCompleto"));
                c.setTelefone(resultados.getString("telefone"));
                c.setRg(resultados.getString("rg"));
                c.setCpf(resultados.getString("cpf"));
                c.setIdade(resultados.getInt("idade"));
                c.setCidade(resultados.getString("cidade"));
                c.setEstado(resultados.getString("estado"));
                c.setRua(resultados.getString("rua"));
                c.setBairro(resultados.getString("bairro"));
                c.setComplementoEndereco(resultados.getString("complementoEndereco"));
                c.setCep(resultados.getString("cep"));
                c.setNumeroResidencial(resultados.getString("numeroResidencial"));
                c.setPessoaReferencia(resultados.getString("pessoaReferencia"));
                c.setNumeroPessoaReferencia(resultados.getString("numeroPessoaReferencia"));
                c.setLojaDeReferencia(resultados.getString("lojaDeReferencia"));
                c.setCarteiraDeTrabalho(resultados.getString("carteiraDeTrabalho"));
                prList.add(c);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }
}
