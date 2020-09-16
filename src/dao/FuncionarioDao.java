package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Funcionario;
import utilitario.Conectar;

public class FuncionarioDao {

    public void inserir(Funcionario f) {
        Connection con = Conectar.getConectar();
        String sql = "INSERT INTO Funcionario(nomeCompleto,cpf,rg,dataDeNascimento,idade,telefone,estadoCivil,tipoSanguineo,carteiraDeTrabalho,cnh,tituloDeEleitor,cargoDoFuncionario,tempoServiço,dataDeAdmissao,jornadaDeTrabalho,formaDePagamento,"
                + "agenciaBancaria,salarioAtual,nomeDoPai,nomeDaMae,naturalidade,estado,cidade,cep,rua,bairro,numeroResidencial,complementoEndereco, categoriaCnh) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, f.getNomeCompleto());
            stm.setString(2, f.getCpf());
            stm.setString(3, f.getRg());
            stm.setString(4, f.getDataNasc());
            stm.setInt(5, f.getIdade());
            stm.setString(6, f.getTelefone());
            stm.setString(7, f.getEstadoCivil());
            stm.setString(8, f.getTipoSanguineo());
            stm.setString(9, f.getCarteiraDeTrabalho());
            stm.setString(10, f.getCnh());
            stm.setString(11, f.getTituloDeEleitor());
            stm.setString(12, f.getCargoDoFuncionario());
            stm.setString(13, f.getTempoServico());
            stm.setString(14, f.getDataDeAdmissao());
            stm.setString(15, f.getJornadaDeTrabalho());
            stm.setString(16, f.getFormaDePagamento());
            stm.setString(17, f.getAgenciaBancaria());
            stm.setFloat(18, f.getSalarioAtual());
            stm.setString(19, f.getNomeDoPai());
            stm.setString(20, f.getNomeDaMae());
            stm.setString(21, f.getNaturalidade());
            stm.setString(22, f.getEstado());
            stm.setString(23, f.getCidade());
            stm.setString(24, f.getCep());
            stm.setString(25, f.getRua());
            stm.setString(26, f.getBairro());
            stm.setString(27, f.getNumeroResidencial());
            stm.setString(28, f.getComplementoEndereco());
            stm.setString(29, f.getCategoriaCnh());
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Funcionario " + f.getNomeCompleto() + " Cadastrado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar o Cliente!", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public void atualizar(Funcionario f) {
        Connection con = Conectar.getConectar();
        String sql = "UPDATE Funcionario SET nomeCompleto= ?, cpf= ?, rg= ?, dataDeNascimento= ?, idade= ?, telefone= ?, estadoCivil= ?, tipoSanguineo= ?, carteiraDeTrabalho= ?, cnh= ?, tituloDeEleitor= ?, cargoDoFuncionario= ?, tempoServiço= ?, dataDeAdmissao= ?, jornadaDeTrabalho= ?, formaDePagamento= ?, agenciaBancaria= ?, agenciaBancaria= ?, nomeDoPai= ?, nomeDoPai= ?, Naturalidade= ?, estado= ?, cidade= ?, cep= ?, rua= ?, bairro= ?, numeroResidencial= ?, complementoEndereco= ?, categoriaCnh= ? WHERE idFuncionario= ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, f.getNomeCompleto());
            stm.setString(2, f.getCpf());
            stm.setString(3, f.getRg());
            stm.setString(4, f.getDataNasc());
            stm.setInt(5, f.getIdade());
            stm.setString(6, f.getTelefone());
            stm.setString(7, f.getEstadoCivil());
            stm.setString(8, f.getTipoSanguineo());
            stm.setString(9, f.getCarteiraDeTrabalho());
            stm.setString(10, f.getCnh());
            stm.setString(11, f.getTituloDeEleitor());
            stm.setString(12, f.getCargoDoFuncionario());
            stm.setString(13, f.getTempoServico());
            stm.setString(14, f.getDataDeAdmissao());
            stm.setString(15, f.getJornadaDeTrabalho());
            stm.setString(16, f.getFormaDePagamento());
            stm.setString(17, f.getAgenciaBancaria());
            stm.setFloat(18, f.getSalarioAtual());
            stm.setString(19, f.getNomeDoPai());
            stm.setString(20, f.getNomeDaMae());
            stm.setString(21, f.getNaturalidade());
            stm.setString(22, f.getEstado());
            stm.setString(23, f.getCidade());
            stm.setString(24, f.getCep());
            stm.setString(25, f.getRua());
            stm.setString(26, f.getBairro());
            stm.setString(27, f.getNumeroResidencial());
            stm.setString(28, f.getComplementoEndereco());
            stm.setString(29, f.getCategoriaCnh());
            stm.setInt(30, f.getIdFuncionario());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, f.getNomeCompleto()+" Atualizado com Sucesso!");
            stm.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Cliente", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

    }

    public void deletar(Funcionario f) {
        Connection con = Conectar.getConectar();
        String sql = "DELETE FROM Funcionario WHERE idFuncionario= ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o Funcionario " + f.getNomeCompleto(), "Exclusão", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, f.getIdFuncionario());
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

    public List<Funcionario> listarTodos(String nome) {
        Connection con = Conectar.getConectar();
        List<Funcionario> prList = new ArrayList();
        String sql = "SELECT * FROM Funcionario WHERE nomeCompleto Like ? ORDER BY nomeCompleto";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + nome + "%");
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Funcionario f = new Funcionario();
                f.setIdFuncionario(resultados.getInt("idFuncionario"));
                f.setNomeCompleto(resultados.getString("nomeCompleto"));
                f.setCpf(resultados.getString("cpf"));
                f.setRg(resultados.getString("rg"));
                f.setDataNasc(resultados.getString("dataDeNascimento"));
                f.setIdade(resultados.getInt("idade"));
                f.setTelefone(resultados.getString("telefone"));
                f.setEstadoCivil(resultados.getString("estadoCivil"));
                f.setTipoSanguineo(resultados.getString("tipoSanguineo"));
                f.setCarteiraDeTrabalho(resultados.getString("carteiraDeTrabalho"));
                f.setCnh(resultados.getString("cnh"));
                f.setTituloDeEleitor(resultados.getString("tituloDeEleitor"));
                f.setCargoDoFuncionario(resultados.getString("cargoDoFuncionario"));
                f.setTempoServico(resultados.getString("tempoServiço"));
                f.setDataDeAdmissao(resultados.getString("dataDeAdmissao"));
                f.setJornadaDeTrabalho(resultados.getString("jornadaDeTrabalho"));
                f.setFormaDePagamento(resultados.getString("formaDePagamento"));
                f.setAgenciaBancaria(resultados.getString("agenciaBancaria"));
                f.setSalarioAtual(resultados.getFloat("salarioAtual"));
                f.setNomeDoPai(resultados.getString("nomeDoPai"));
                f.setNomeDaMae(resultados.getString("nomeDaMae"));
                f.setNaturalidade(resultados.getString("Naturalidade"));
                f.setEstado(resultados.getString("estado"));
                f.setCidade(resultados.getString("cidade"));
                f.setCep(resultados.getString("cep"));
                f.setRua(resultados.getString("rua"));
                f.setBairro(resultados.getString("bairro"));
                f.setNumeroResidencial(resultados.getString("numeroResidencial"));
                f.setComplementoEndereco(resultados.getString("complementoEndereco"));
                f.setCategoriaCnh(resultados.getString("categoriaCnh"));
                prList.add(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }

    public List<Funcionario> listarTodos() {
        Connection con = Conectar.getConectar();
        List<Funcionario> prList = new ArrayList();
        String sql = "SELECT * FROM Funcionario ORDER BY nomeCompleto";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
                Funcionario f = new Funcionario();
                f.setIdFuncionario(resultados.getInt("idFuncionario"));
                f.setNomeCompleto(resultados.getString("nomeCompleto"));
                f.setCpf(resultados.getString("cpf"));
                f.setRg(resultados.getString("rg"));
                f.setDataNasc(resultados.getString("dataDeNascimento"));
                f.setIdade(resultados.getInt("idade"));
                f.setTelefone(resultados.getString("telefone"));
                f.setEstadoCivil(resultados.getString("estadoCivil"));
                f.setTipoSanguineo(resultados.getString("tipoSanguineo"));
                f.setCarteiraDeTrabalho(resultados.getString("carteiraDeTrabalho"));
                f.setCnh(resultados.getString("cnh"));
                f.setTituloDeEleitor(resultados.getString("tituloDeEleitor"));
                f.setCargoDoFuncionario(resultados.getString("cargoDoFuncionario"));
                f.setTempoServico(resultados.getString("tempoServiço"));
                f.setDataDeAdmissao(resultados.getString("dataDeAdmissao"));
                f.setJornadaDeTrabalho(resultados.getString("jornadaDeTrabalho"));
                f.setFormaDePagamento(resultados.getString("formaDePagamento"));
                f.setAgenciaBancaria(resultados.getString("agenciaBancaria"));
                f.setSalarioAtual(resultados.getFloat("salarioAtual"));
                f.setNomeDoPai(resultados.getString("nomeDoPai"));
                f.setNomeDaMae(resultados.getString("nomeDaMae"));
                f.setNaturalidade(resultados.getString("Naturalidade"));
                f.setEstado(resultados.getString("estado"));
                f.setCidade(resultados.getString("cidade"));
                f.setCep(resultados.getString("cep"));
                f.setRua(resultados.getString("rua"));
                f.setBairro(resultados.getString("bairro"));
                f.setNumeroResidencial(resultados.getString("numeroResidencial"));
                f.setComplementoEndereco(resultados.getString("complementoEndereco"));
                f.setCategoriaCnh(resultados.getString("categoriaCnh"));
                prList.add(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }
    
     public List<Funcionario> BuscarFuncionarioId(int id) {
        Connection con = Conectar.getConectar();
        List<Funcionario> prList = new ArrayList();
        String sql = "SELECT * FROM Funcionario WHERE idFuncionario = " + id;
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet resultados = stm.executeQuery();
            while (resultados.next()) {
               Funcionario f = new Funcionario();
                f.setIdFuncionario(resultados.getInt("idFuncionario"));
                f.setNomeCompleto(resultados.getString("nomeCompleto"));
                f.setCpf(resultados.getString("cpf"));
                f.setRg(resultados.getString("rg"));
                f.setDataNasc(resultados.getString("dataDeNascimento"));
                f.setIdade(resultados.getInt("idade"));
                f.setTelefone(resultados.getString("telefone"));
                f.setEstadoCivil(resultados.getString("estadoCivil"));
                f.setTipoSanguineo(resultados.getString("tipoSanguineo"));
                f.setCarteiraDeTrabalho(resultados.getString("carteiraDeTrabalho"));
                f.setCnh(resultados.getString("cnh"));
                f.setTituloDeEleitor(resultados.getString("tituloDeEleitor"));
                f.setCargoDoFuncionario(resultados.getString("cargoDoFuncionario"));
                f.setTempoServico(resultados.getString("tempoServiço"));
                f.setDataDeAdmissao(resultados.getString("dataDeAdmissao"));
                f.setJornadaDeTrabalho(resultados.getString("jornadaDeTrabalho"));
                f.setFormaDePagamento(resultados.getString("formaDePagamento"));
                f.setAgenciaBancaria(resultados.getString("agenciaBancaria"));
                f.setSalarioAtual(resultados.getFloat("salarioAtual"));
                f.setNomeDoPai(resultados.getString("nomeDoPai"));
                f.setNomeDaMae(resultados.getString("nomeDaMae"));
                f.setNaturalidade(resultados.getString("Naturalidade"));
                f.setEstado(resultados.getString("estado"));
                f.setCidade(resultados.getString("cidade"));
                f.setCep(resultados.getString("cep"));
                f.setRua(resultados.getString("rua"));
                f.setBairro(resultados.getString("bairro"));
                f.setNumeroResidencial(resultados.getString("numeroResidencial"));
                f.setComplementoEndereco(resultados.getString("complementoEndereco"));
                f.setCategoriaCnh(resultados.getString("categoriaCnh"));
                prList.add(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Lista", null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return prList;
    }
}
