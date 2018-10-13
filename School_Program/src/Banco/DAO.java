package Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DAO {
 
Connection Con = ConexaoBD.getConnection();
PreparedStatement Stmt = null;
private ResultSet Rsltst;
private boolean acesso=false;

// Cadastro do pessoal do departamento ou setor escolar
    public void Cadastro(Basics info_pessoal){
        try {
            Stmt = Con.prepareStatement("INSERT INTO info_user (Usuario, Senha, Primeiro_Nome, Segundo_Nome, Local_Trabalho) VALUES (?,?,?,?,?)");
            Stmt.setString(1,info_pessoal.getUsuario());
            Stmt.setString(2,info_pessoal.getSenha());
            Stmt.setString(3,info_pessoal.getPrimeiro_Nome());
            Stmt.setString(4,info_pessoal.getSegundo_Nome());
            Stmt.setString(5,info_pessoal.getLocal_Trabalho());
            Stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: "+ex);
        } finally {
            ConexaoBD.closeConnection(Con, Stmt);
        }
    }
// Login do pessoal cadastrado
    public boolean acesso(){
        return this.acesso;
    }
    
    public void Login(Basics info_pessoal) {
    
    try {
        Stmt = Con.prepareStatement("SELECT * FROM info_user WHERE Usuario =? AND Senha=?");
        Stmt.setString (1,info_pessoal.getUsuario());
        Stmt.setString (2,info_pessoal.getSenha());
        Rsltst = Stmt.executeQuery();
        if(Rsltst.next()){
             this.acesso=true;
             JOptionPane.showMessageDialog(null, "Acesso Permitido.");
             Dados(info_pessoal.getUsuario());
        }else{
             this.acesso=false;
             JOptionPane.showMessageDialog(null, "Acesso Negado!");
         }
    } catch (SQLException ex) {
        this.acesso=false;
        JOptionPane.showMessageDialog(null, "Erro no código:"+ex);
    } finally {
            ConexaoBD.closeConnection(Con, Stmt);
        }
    }
 // Exclusão do pessoal cadastrado
public void Exclusao(String User) {
    try {
        Stmt = Con.prepareStatement("DELETE FROM info_user WHERE Usuario=?");
        Stmt.setString (1, User);
        Stmt.execute();
        
        JOptionPane.showMessageDialog(null, "Ecluído com sucesso!");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro no código: "+ex);
    }
}
 // Criação de um novo documento
public Basics Dados(String User) {
    Basics user = new Basics();
    try {
        Stmt = Con.prepareStatement("SELECT Primeiro_Nome, Segundo_Nome, Local_Trabalho FROM info_user WHERE Usuario =?");
        Stmt.setString (1,User);
        Rsltst = Stmt.executeQuery();
        while (Rsltst.next()){
        user.setPrimeiro_Nome(Rsltst.getString("Primeiro_Nome"));
        user.setSegundo_Nome(Rsltst.getString("Segundo_Nome"));
        user.setLocal_Trabalho(Rsltst.getString("Local_Trabalho"));
        }
    
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro no código: "+ex);
    }
    return user;
}
public void NewFile(Basics Calendario) {
    Basics user = new Basics();
    
    try {
        Stmt = Con.prepareStatement("INSERT INTO calendario (Descricao, Informacao) VALUES (?,?)");
        Stmt.setString(1, Calendario.getDescricao());
        Stmt.setString(2, Calendario.getInformacao());
        Stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Postagem Realizada.");
    } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Erro no código: "+ex);
    }
}

// Postagem de um novo documento
public String Post(String Tipo){
    String Classificacao = null;
    try {
        Stmt = Con.prepareStatement("SELECT Informacao FROM calendario WHERE DESCRICAO =?");
        Stmt.setString(1, Tipo);
        Rsltst = Stmt.executeQuery();
        while(Rsltst.next()){
          Classificacao = Rsltst.getString("Informacao");
      }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro no código: "+ex); 
    }
    return Classificacao;
}

}
