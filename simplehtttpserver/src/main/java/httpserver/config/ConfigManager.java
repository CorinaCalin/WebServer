package httpserver.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import httpserver.util.Json;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConfigManager {
    private static ConfigManager myConfigManager;
    private static Config myCurrentConfig;

    public ConfigManager() {
    }

    public void loadConfigurationFile(String filePath) {
        FileReader fileReader;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            throw new ConfigException(e);
        }
        StringBuilder sb = new StringBuilder();
        int i;
        while(true){
            try {
                if ((i = fileReader.read()) == -1) break;
            } catch (IOException e) {
                throw new ConfigException(e);
            }
            sb.append((char)i);
        }
        JsonNode conf;
        try {
            conf = Json.parse(sb.toString());
        } catch (IOException e) {
            throw new ConfigException("ERROR Parsing The Configuration File!!", e);
        }
        try {
            myCurrentConfig= Json.fromJson(conf,Config.class);
        } catch (JsonProcessingException e) {
            throw new ConfigException("*ERROR Parsing The Internal Configuration File",e);
        }
    }
    public static ConfigManager getInstance(){
        if(myConfigManager ==null)
            myConfigManager = new ConfigManager();
        return myConfigManager;
    }
    public Config getCurrentConfiguration(){
        if (myCurrentConfig == null){
            throw new ConfigException("ERROR No Current Configuration Set.");
        }
        return myCurrentConfig;
    }
}
