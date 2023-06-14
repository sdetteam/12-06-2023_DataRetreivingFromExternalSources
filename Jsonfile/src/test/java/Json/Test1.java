package Json;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test1 {

	public static void main(String[] args) {
		
		//to parse Json file use parser class
		JSONParser parser = new JSONParser();
		
		try {     
            Object obj = parser.parse(new FileReader("D:\\json\\mydata.json"));

            JSONObject jsonObject =  (JSONObject) obj;

            String username = (String) jsonObject.get("username");
            System.out.println(username);

            String password= (String) jsonObject.get("password");
            System.out.println(password);
            
		} catch (Exception e) {
            e.printStackTrace();
        }

	}
	
	
	
	public static String getValueByKey( String key) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("D:\\json\\mydata.json"));

        JsonNode valueNode = rootNode.get(key);
        if (valueNode != null) {
            return valueNode.asText();
        }

        return null;
    }
}

	


