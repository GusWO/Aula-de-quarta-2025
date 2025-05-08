package br.com.acme.xml.usage;

import br.com.acme.xml.XMLParams;
import java.util.ArrayList;
import java.util.Map;

public class LoadParams {

    public static String EXPERIMENTS_CONF_FILE = "./experiments-conf.xml";
    public static int    REPETITION_TIMES;
    public static int    TIME_LIMIT;
    public static int    INTERVAL;
    public static ArrayList<Integer> ARRIVAL_RATES;
    public static ArrayList<Integer> NUMBER_OF_THREADS;
    public static ArrayList<Integer> NUMBER_OF_MESSAGES;          
    public static String STATS_FOLDER;
    

    public static void main(String[] args) {

        String[] params = {"repeat","time-limit", "interval", "arrival-rates", "threads", "number-of-messages", "stats-folder"};
        
        Map<String, String> values = XMLParams.load(params, EXPERIMENTS_CONF_FILE);

        ARRIVAL_RATES = new ArrayList<>();
        for (String e : values.get("arrival-rates").split(",")) {
            ARRIVAL_RATES.add(Integer.valueOf( e.trim() ));
        }

        NUMBER_OF_THREADS = new ArrayList<>();
        for (String e : values.get("threads").split(",")) {
            NUMBER_OF_THREADS.add(Integer.valueOf(e.trim()));
        }

        NUMBER_OF_MESSAGES = new ArrayList<>();
        for (String e : values.get("number-of-messages").split(",")) {
            NUMBER_OF_MESSAGES.add(Integer.valueOf(e.trim()));
        }

        REPETITION_TIMES = Integer.parseInt( values.get("repeat").trim() );
        TIME_LIMIT = Integer.parseInt(values.get("time-limit").trim());
        INTERVAL = Integer.parseInt(values.get("interval").trim());
        STATS_FOLDER = values.get("stats-folder").trim();
        
        

    }
}
