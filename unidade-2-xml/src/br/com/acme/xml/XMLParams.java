package br.com.acme.xml;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Document;

public class XMLParams {

    public static Map<String, String> load(String[] params, String fileName) {
        
        HashMap<String, String> res = new HashMap<>();
        Document doc = XMLHandler.readXmlFile(fileName);

        for (String p : params) {
            String val = doc.getElementsByTagName(p).item(0).getTextContent();
            res.put(p.trim(), val.trim());
        }

        return res;
    }
}
