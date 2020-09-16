package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Usuario;
import utilitario.Conectar;

public class UsuarioDao {

    public void inserir(Usuario u) {
        Connection con = Conectar.getConectar();
        String sql = "INSERT INTO Usuario(cpf,nome,sobrenome,telefone,email,userName,foto,dataLogin,horarioLogin,idFuncionario_FK,senha) VALUES(?,?,?,?,?,?,?,?,?,?,MD5(?))";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            
            stm.setString(1, u.getCpf());
            stm.setString(2, u.getNome());
            stm.setString(3, u.getSobrenome());
            stm.setString(4, u.getTelefone());
            stm.setString(5, u.getEmail());
            stm.setString(6, u.getUserName());
            stm.setString(7, u.getFoto());
            stm.setString(8, u.getDataDeLogin());
            stm.setString(9, u.getHorarioDeLogin());
            stm.setInt(10, u.getIdFuncionari0());
            stm.setString(11, u.getSenha());
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Usuario " + u.getUserName()+ " Cadastrado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar o Cliente!", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public void atualizar(Usuario u) {
        Connection con = Conectar.getConectar();
        String sql = "UPDATE Usuario SET email= ?, userName= ?, foto= ?, dataLogin= ?, horarioLogin= ?, nome= ?, sobrenome= ?, cpf= ?, telefone= ?, idFuncionario= ? WHERE idUsuario= ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, u.getEmail());
            stm.setString(2, u.getUserName());
            stm.setString(3, u.getFoto());
            stm.setString(4, u.getDataDeLogin());
            stm.setString(5, u.getHorarioDeLogin());
            stm.setString(6, u.getNome());
            stm.setString(7, u.getSobrenome());
            stm.setString(8, u.getCpf());
            stm.setString(9, u.getTelefone());
            stm.setInt(10, u.getIdFuncionari0());
            stm.setInt(11, u.getIdUsuario());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, u.getUserName()+" Atualizado com Sucesso!");
            stm.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Fornecedor", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

    }

    public void deletar(Usuario u) {
        Connection con = Conectar.getConectar();
        String sql = "DELETE FROM Usuario WHERE idUsuario= ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o Clietne " + u.getUserName(), "Exclusão", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, u.getIdUsuario());
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

    public List<Usuario> listarTodos(String nome) {
        Connection con = Conectar.getConectar();
        List<Usuario> prList = new ArrayList();
        String sql = "SELECT * FROM Usuario WHERE userName Like ? ORDER BY userName";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + nome + "%");
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(resultados.getInt("idUsuario"));
                u.setEmail(resultados.getString("email"));
                u.setUserName(resultados.getString("userName"));
                u.setSenha(resultados.getString("senha"));
                u.setFoto(resultados.getString("foto"));
                u.setDataDeLogin(resultados.getString("dataLogin"));
                u.setHorarioDeLogin(resultados.getString("horarioLogin"));
                u.setIdFuncionari0(resultados.getInt("idFuncionario_FK"));
                u.setNome(resultados.getString("nome"));
                u.setSobrenome(resultados.getString("sobrenome"));
                u.setCpf(resultados.getString("cpf"));
                u.setTelefone(resultados.getString("telefone"));
                prList.add(u);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }

    public List<Usuario> listarTodos() {
        Connection con = Conectar.getConectar();
        List<Usuario> prList = new ArrayList();
        String sql = "SELECT * FROM Usuario ORDER BY userName";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(resultados.getInt("idUsuario"));
                u.setEmail(resultados.getString("email"));
                u.setUserName(resultados.getString("userName"));
                u.setSenha(resultados.getString("senha"));
                u.setFoto(resultados.getString("foto"));
                u.setDataDeLogin(resultados.getString("dataLogin"));
                u.setHorarioDeLogin(resultados.getString("horarioLogin"));
                u.setIdFuncionari0(resultados.getInt("idFuncionario_FK"));
                u.setNome(resultados.getString("nome"));
                u.setSobrenome(resultados.getString("sobrenome"));
                u.setCpf(resultados.getString("cpf"));
                u.setTelefone(resultados.getString("telefone"));
                prList.add(u);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }
    
     public List<Usuario> listarTodos(int id) {
        Connection con = Conectar.getConectar();
        List<Usuario> prList = new ArrayList();
        String sql = "SELECT * FROM Usuario WHERE idUsuario = " + id;
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(resultados.getInt("idUsuario"));
                u.setEmail(resultados.getString("email"));
                u.setUserName(resultados.getString("userName"));
                u.setSenha(resultados.getString("senha"));
                u.setFoto(resultados.getString("foto"));
                u.setDataDeLogin(resultados.getString("dataLogin"));
                u.setHorarioDeLogin(resultados.getString("horarioLogin"));
                u.setIdFuncionari0(resultados.getInt("idFuncionario_FK"));
                u.setNome(resultados.getString("nome"));
                u.setSobrenome(resultados.getString("sobrenome"));
                u.setCpf(resultados.getString("cpf"));
                u.setTelefone(resultados.getString("telefone"));
                prList.add(u);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }
     
     public Usuario login(String user, String senha){
        Connection con = Conectar.getConectar();
        Usuario u = new Usuario();
        String sql = "SELECT * FROM Usuario WHERE (userName= ? or email= ?) and senha= md5(?)";
        try (PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, user);
            stm.setString(2, user);
            stm.setString(3, senha);
            ResultSet resultado = stm.executeQuery();
            resultado.next();
            if (resultado.getInt("idUsuario")>0) {
                u.setIdUsuario(resultado.getInt("idUsuario"));
                u.setIdFuncionari0(resultado.getInt("idFuncionario_FK"));
                u.setUserName(resultado.getString("userName"));
                u.setSenha(resultado.getString("senha"));
                u.setEmail(resultado.getString("email"));
                u.setHorarioDeLogin(resultado.getString("horarioLogin"));
                u.setDataDeLogin(resultado.getString("dataLogin"));
                u.setFoto(resultado.getString("foto"));
                u.setNome(resultado.getString("nome"));
                u.setSobrenome(resultado.getString("sobrenome"));
                u.setCpf(resultado.getString("cpf"));
                u.setTelefone(resultado.getString("telefone"));
            }else{
                //JOptionPane.showMessageDialog(null, "Usuario ou senha Incorreto!");
            }
        } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Erro ao buscar Funcionario"+e.getMessage());
                //JOptionPane.showMessageDialog(null, "Usuario ou senha Incorreto!");
        }
        return u;
    }
}
