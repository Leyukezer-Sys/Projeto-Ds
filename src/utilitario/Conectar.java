package utilitario;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conectar {
    private static final String url = "jdbc:mysql://localhost:3306/projeto_wwwjl";
    private static final String user = "root";
    private static final String senha = "root";
    
      public static Connection getConectar() {
                
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, senha);
           // msg.informacao("Conectado com sussesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ");
            System.out.println(e.getMessage());
        }
        return con;
    }
}
