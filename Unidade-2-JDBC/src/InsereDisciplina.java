import java.sql.*;
import java.util.Random;
public class InsereDisciplina {

    
    public static void main(String[] args) {
        
        String user = "root";
        String passwrd = "root";
        String url = "jdbc:derby://localhost:3306/MyDB";
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            conn = DriverManager.getConnection(url, user, passwrd);
            if(conn != null){
                System.out.println("Conectou com o banco!!!");
            }
            String SQLInsert = 
                    """
                    INSERT INTO root.DISCIPLINA 
                    (ID, NOME, PROFESSOR, DIASEMANA, CURSO)
                    VALUES (?, ?, ?, ?, ?)
                    """;
            
            pstmt = conn.prepareStatement(SQLInsert);
            
            //abrir a transação
            //conn.setAutoCommit(false);
            
            for(int i = 0; i<50; i++){
                Disciplina d = CreateDisciplina();
                pstmt.setInt(1, d.getId());
                pstmt.setString(2, d.getNome());
                pstmt.setString(3, d.getProfessor());
                pstmt.setString(4, d.getDiaSemana());
                pstmt.setString(5, d.getCurso());
                
                pstmt.executeUpdate();
                
               /* if(i == 38){
                    String s = null;
                    s.length();
                } */
            }
            
            //encerrar transação
            //conn.commit();
            
            DatabaseMetaData dbmeta = conn.getMetaData();
            int maxConn = dbmeta.getMaxConnections();
            System.out.println(maxConn);
            
            
            
            
            pstmt.close();
            conn.close();
            
            
            
        } catch (SQLException e) {
            System.out.println("Erro:" +e.getMessage());
        }
    }
    
    private static Disciplina CreateDisciplina(){
        
        Disciplina disciplina = new Disciplina();
        int id = new Random().nextInt();
        
        disciplina.setId(id);
        disciplina.setNome("PCN");
        disciplina.setProfessor("Frantz Fritz");
        disciplina.setDiaSemana("Quarta");
        disciplina.setCurso("Comp");
        return disciplina;
    }
    
}
