package br.edu.unijui;


import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

/**
 * Avaliação
 * Disciplina de Programação para Camada de Negócio
 * @author <<< Gustavo Welter Obadowski >>> e Professor Rafael Zancan Frantz
 */
public class MessageFactory {
    
    private static final Logger logger = Logger.getLogger(MessageFactory.class.getName());
    /**
     * This static method creates a list of random generated messages
     * @param numberOfMessages the number of messages to be created
     * @return a list of messages
     */
    public static List<Message> buildMessages( int numberOfMessages ) {
        List<Message> list = new ArrayList<>();
        Message msg = null;
        for ( int i=0; i<numberOfMessages; i++ ) {
            msg = new Message();
            msg.setExpirationDate( new GregorianCalendar( 2020, Calendar.DECEMBER, 31 ).getTime() );
            Message.Priority priority = Message.Priority.values()[ new Random().nextInt( Message.Priority.values().length ) ] ;
            msg.setPriority(priority);
            
            if (priority == Message.Priority.LOWEST || priority == Message.Priority.HIGHEST){
                logger.warning("Mensagem Criada na classe MessageFactory e tem Prioridade : "+priority);
            }
      
            msg.setContent( "This is the message body..." );
            
            /* Adicione aqui o código para gerar os demais dados a serem setados na mensagem, são eles:
               - Identificador de porta alvo. Será mapeado para a coluna TARGET_PORT_ID
            */
            msg.setTargetPortId("PORTA"+(1+i));
            /*
               - Número de sequencia para a mensagem. Pode ser qualquer número inteiro. Será mapeado para a coluna SEQUENCE_NUMBER
            */
            msg.setSequenceNumber(i+1);
            list.add( msg );
        }
        
        if (numberOfMessages < 50 ) {
            logger.fine("Menos de 50 mensagens foram criadas na classe MessageFactory: "+numberOfMessages);
        }
        
        if (numberOfMessages > 1000) {
            logger.severe("Mais de 1000 mensagens foram criadas na classe MessageFactory: "+numberOfMessages);
        }
        return list;
    }
    
    
}
