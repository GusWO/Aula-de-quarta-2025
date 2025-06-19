package br.edu.unijui.pcn.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;


/**
 * Esta classe reune a implmentação para interação com o banco de dados.
 * @author <seu nome aqui>
 */
public class DBManager{
    
    // Atributos
    private Connection connection;
    
    private String serverName;
    private int portNumber;
    private String dbName;
    private String user;
    private String password;


    // Construtor
    public DBManager(String serverName, int portNumber, String dbName, String user, String password) {
        this.serverName = serverName;
        this.portNumber = portNumber;
        this.dbName = dbName;
        this.user = user;
        this.password = password;
    }

    // Operações
    private void openConnection(){
        try{
            String URL = "jdbc:derby://"+this.serverName+":"+this.portNumber+"/"+this.dbName;
            connection = DriverManager.getConnection(URL, this.user, this.password );
        }catch(SQLException ex){            
            Logger.getLogger(DBManager.class.getName()).log(Level.WARNING, null, ex);
        }
    }

    private void closeConnection(){
        try{
            connection.close();
        }catch(SQLException ex){
            Logger.getLogger(DBManager.class.getName()).log(Level.WARNING, null, ex);
        }
    }
    
    /**
     * Carrega os dados de isolamento social do arquivo .CSV para o banco de dados. 
     * @param inputFileName indica o nome do arquivo .csv
     */
    public void store(String inputFileName){
        openConnection();
        
        int somaRegistros = 0;
        Set<String> cidades = new HashSet<>();
        Set<String> estados = new HashSet<>();
        
        try{
            
            BufferedReader br = new BufferedReader(new FileReader(inputFileName));
            String linha;
            
            while((linha = br.readLine()) != null){
                String[] info = linha.split(",");
                
                if(info.length < 4){
                }
                
                String estado = info[0].trim();
                String cidade = info[1].trim();
                String data = info[2].trim();
                double indice = Double.parseDouble(info[3].trim());
                int id = info[4].trim();
                
                String sqlInsereIsolamento = """
                    INSERT INTO A.SOCIAL_ISOLATION (ID)                       
                                             """
                PreparedStatement pstm = connection.prepareStatement(estado)
            }
            
            
            
        }catch(Exception ex){
            Logger.getLogger(DBManager.class.getName()).log(Level.WARNING, null, ex);
        }finally{
            closeConnection();
        }
        
    }
    
    
    /**
     * Busca no banco de dados todos os registros de cidades com isolamento social.
     * @return ResultSet contendo os dados de isolamento social
     */
    public ResultSet load() {
        openConnection();

        // Siga aqui a implementação
        
        try{

            
            return null; // modifique esse retorno
        }catch(Exception ex){
            Logger.getLogger(DBManager.class.getName()).log(Level.WARNING, null, ex);
            return null;
        }finally{
            closeConnection();
        }
        
    }
    

    /**
     * Retorna o número total de registros com dados sobre isolamento carregados no banco de dados.
     * @return int indicando o total de registros.
     */
    public int getTotal() {
        // Implemente aqui seu código
        return 0; // modifique esse retorno
    }

    /**
     * Retorna o número de cidades únicas com dados de isolamento no banco de dados.
     * @return int indicando o número de cidades sem repetição de nome.
     */
    public int getNumberOfCities() {
        // Implemente aqui seu código
        return 0; // modifique esse retorno
    }

    /**
     * Retorna o número de estados com dados de isolamento no banco de dados.
     * @return int indicando o número de estados sem repetição de nome.
     */
    public int getNumberOfStates() {
        // Implemente aqui seu código
        return 0; // modifique esse retorno
    }
    

    


}
        
