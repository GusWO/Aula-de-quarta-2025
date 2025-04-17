import java.sql.*;


public class MyDbApp {

   
    public static void main(String[] args) {
        
        String url = "jdbc:derby://localhost:1527/sample";
        String user = "app";
        String password = "app";
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão aberta com sucesso");
            
            String SQL = "Select * from app.customer ";
            
            Statement stmt = conn.createStatement(); //gera objeto statment
            ResultSet rs = stmt.executeQuery(SQL); // executa a consulta
            
            while(rs.next()){
                String names = rs.getString("NAME");
                String emails = rs.getString("EMAIL");
                
                String result = """
                                Nome: %s 
                                Email: %s
                                """.formatted(names, emails);
                
                System.out.println(result);
                
            }
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException e) {
            System.out.println("Erro ao abrir "+e.getMessage());
        }
    }
    
}
