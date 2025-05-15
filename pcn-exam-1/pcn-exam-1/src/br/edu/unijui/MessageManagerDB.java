package br.edu.unijui;

import br.edu.unijui.Message.Priority;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Avaliação
 * Disciplina de Programação para Camada de Negócio
 * @author <<< Gustavo Welter Obadowski >>> e Professor Rafael Zancan Frantz
 */
public class MessageManagerDB {

    
    /**
     * Stores every message in the list of generated messages;
     * @param messageList the list of messages to be stored in the database.
     */
    
    public static void store(List<Message> messageList) {
        Connection con = getConnection();               
        PreparedStatement pstm = null;       
        // Insira aqui seu código para armazenar todas as mensagens no banco de dados.
        // Lembre-se de criar (abrir e fechar) uma transação para isso.
        // Lembre-se que é preciso usar blocos try-catch.
        
        try {
            
            if (con != null) {
                System.out.println("Conectou com o banco, portando irá inserir os dados."+con.getClientInfo());
            }
            String SQLInsert = """
                    INSERT INTO APP.MESSAGE 
                    (ID, PRIORITY, CREATION_DATE, EXPIRATION_DATE, TARGET_POINT_ID, SEQUENCE_NUMBER, CONTENT)
                    VALUES (?, ?, ?, ?, ?, ?, ?)
                                   """;
            pstm = con.prepareStatement(SQLInsert);
            con.setAutoCommit(false);
            
            for (Message message : messageList) {
                pstm.setString(1, message.getId().toString());
                pstm.setInt(2, message.getPriority().ordinal());
                pstm.setDate(3, new java.sql.Date(message.getCreationDate().getTime()));
                pstm.setDate(4, new java.sql.Date(message.getExpirationDate().getTime()));
                pstm.setString(5, message.getTargetPortId());
                pstm.setInt(6, message.getSequenceNumber());
                pstm.setString(7, message.getContent());
                
                pstm.executeUpdate();
            }
            con.commit();
            
            
        } catch (SQLException e) {
            System.out.println("Deu erro "+e.getMessage()+" e "+e.getSQLState());  
            try {
                if(con != null){
                    con.rollback();
                }    
            } catch (SQLException ex) {
                System.out.println("Erro no rollback: "+ex.getMessage());
            }
        } finally {
            try {
                if (pstm != null) pstm.close();
                if (con != null) con.close();
            } catch (SQLException exx) {
                System.out.println("Erro ao fechar o pstm e con: "+exx.getMessage());
            }
        } 
    }
    
    

    /**
     * Print messages with a given priority which are stored in the database
     *
     * @param priority the priority to select messages
     */
    public static void printMessages( Priority priority ) {
        
        Connection con = getConnection();
        Statement stm = null;
        // Insira aqui seu código para consultar e imprimir na tela todos os dados das mensagens recuperadas do banco de dados, de acordo com a prioridade informada.
        // Lembre-se que é preciso usar blocos try-catch.
        
        try {
            if (con != null) {
                System.out.println("Conectou com o banco e agora os dados serão printados.");
            }
            
            String SQLSelect = """
            SELECT * FROM APP.MESSAGE
                               """;
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery(SQLSelect);
            
            while (rs.next()) {
                String identificador = rs.getString("ID");
                int prioridade = rs.getInt("PRIORITY");
                Date datadeCriacao = rs.getDate("CREATION_DATE");
                Date dataDeExpiracao = rs.getDate("EXPIRATION_DATE");
                String targetPointID = rs.getString("TARGET_POINT_ID");
                int sequenceNumber = rs.getInt("SEQUENCE_NUMBER");
                String content = rs.getString("CONTENT");
                
                String resultado = """
                                   Identificador:       %1$s
                                   Prioridade:          %2$d
                                   Data de Criação:     %3$td/%3$tm/%3$tY
                                   Data de expiração:   %4$td/%4$tm/%4$tY
                                   Target point ID:     %5$s
                                   Sequence number:     %6$d
                                   Content:             %7$s
                                   """.formatted(identificador, prioridade, datadeCriacao, dataDeExpiracao, targetPointID, sequenceNumber, content);
                System.out.println(resultado);
            }
            rs.close();
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
        }
        
    }

    
    /**
     * When invoked, it opens a connection to the database.
     *
     * @return the connection
     */
    private static Connection getConnection() {
        Connection con = null;
        try {
            // Insira aqui o código necessário para abrir uma conexão com o banco de dados.
            // Lembre-se de que o método deve retornar essa conexão.
            String url = "jdbc:derby://localhost:1527/examDB";
            String user = "app";
            String password = "app";
            
            
            con = DriverManager.getConnection(url, user, password);
            
            return con;
        } catch (SQLException ex) {
            System.out.println("Mensagem: "+ex.getMessage());
          return con;
        }catch (NullPointerException ex){
            System.out.println("Mensagem: "+ex.getMessage());
          return con;
        }
    }
}
    
