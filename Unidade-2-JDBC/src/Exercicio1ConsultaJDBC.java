
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gustavo.obadowski
 */
public class Exercicio1ConsultaJDBC {

    
    public static void main(String[] args) {
        
        String url = "jdbc:derby://localhost:1527/sample";
        String user = "app";
        String password = "app";
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão aberta com sucesso");
            
            String SQL = """
            SELECT APP.PRODUCT.PRODUCT_CODE, APP.MANUFACTURER.NAME, APP.PRODUCT.MARKUP, 
            APP.PRODUCT.PURCHASE_COST, 
            APP.PRODUCT.QUANTITY_ON_HAND, APP.PRODUCT.AVAILABLE, APP.PRODUCT.DESCRIPTION
            FROM APP.PRODUCT 
            INNER JOIN APP.MANUFACTURER ON 
            APP.MANUFACTURER.MANUFACTURER_ID = APP.PRODUCT.MANUFACTURER_ID
            INNER JOIN APP.PRODUCT_CODE ON PROD_CODE = PRODUCT_CODE
                         """;
            
            Statement stmt = conn.createStatement(); //gera objeto statment
            ResultSet rs = stmt.executeQuery(SQL); // executa a consulta
            
            while(rs.next()){
                //String names = rs.getString("NAME");
                //String emails = rs.getString("EMAIL");
                // não precisa colocar o nome da base.nome da tabela.nome da coluna, só coloco o nome da coluna
                String identificador = rs.getString("PRODUCT_CODE");
                String nomeDocaraQueFez = rs.getString("NAME");
                String tipoProduto = rs.getString("MARKUP");
                double custoProduto = rs.getDouble("PURCHASE_COST");
                int quantidade = rs.getInt("QUANTITY_ON_HAND");
                String disponibilidade = rs.getString("AVAILABLE");
                String descricao = rs.getString("DESCRIPTION");
                String result = """
                                Identificador: %s
                                Nome do fabricante: %s
                                Tipo do produto: %s
                                Custo do produto: %f
                                Quantide no estoque: %d
                                Disponibilidade: %s
                                Descrição: %s
                                """.formatted(identificador, nomeDocaraQueFez, tipoProduto, custoProduto, quantidade, disponibilidade, descricao);
                
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
