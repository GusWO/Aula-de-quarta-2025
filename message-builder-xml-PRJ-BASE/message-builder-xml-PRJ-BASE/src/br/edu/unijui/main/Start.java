package br.edu.unijui.main;

import br.edu.unijui.Message;
import br.edu.unijui.MessageFactory;
import br.edu.unijui.XMLHandler;
import br.edu.unijui.XMLMessageManager;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Exercício Message Builder XML
 *
 * @author Professor Rafael Zancan Frantz 
 */
public class Start {

    private static final int NUMBER_OF_MESSAGES = 10;

    public static void main(String[] args) {

        // Cria uma lista de mensagens aleatórias, com a quantidade de mensagens de acordo com número informado.
        List<Message> generatedMessages = MessageFactory.buildMessages(NUMBER_OF_MESSAGES);

        String filename = "messages.xml";
        
        // Armazena a lista de mensagens em arquivo XML
        XMLMessageManager.store(filename, generatedMessages);
        
        
        // Recupera as mensagens do arquivo XML
        List<Message> recoveredMessages = XMLMessageManager.recover(filename);
        System.out.println(recoveredMessages.size());

        
        // Imprime na tela as mensagens recuperadas do arquivo XML
        XMLMessageManager.printMessages(recoveredMessages, Message.Priority.HIGH);
        
        printXMLContent(filename);
        
        

    }
    
    public static void printXMLContent(String filename){
        try {
            String content = new String(Files.readAllBytes(Paths.get(filename)));
            System.out.println(content);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
    }

}
