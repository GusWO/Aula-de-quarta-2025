import java.sql.*;


public class InsertTest {

    
    public static void main(String[] args) {
        
        String url = "jdbc:derby://localhost:1527/sample";
        String user = "app";
        String password = "app";
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão aberta com sucesso");
            
            String SQL = "INSERT INTO APP.CUSTOMER (CUSTOMER_ID, NAME, EMAIL, DISCOUNT_CODE, ZIP) VALUES (?, ?, ?, ?, ?) ";
            
            PreparedStatement pstmt = conn.prepareStatement(SQL); //gera objeto statment
            pstmt.setInt(1, 99);
            pstmt.setString(2, "Gustavo");
            pstmt.setString(3, "gustavo.obadowski@gmail.com");
            pstmt.setString(4, "H");
            pstmt.setString(5, "10095");
            
            pstmt.executeUpdate();
            
            pstmt.close();
            conn.close();
            
            
        } catch (SQLException e) {
            System.out.println("Erro ao abrir "+e.getMessage());
        }
    }
    
}
