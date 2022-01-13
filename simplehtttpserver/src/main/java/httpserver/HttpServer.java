package httpserver;
import httpserver.config.Config;
import httpserver.config.ConfigManager;
import httpserver.core.ServerListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;


public class HttpServer {

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpServer.class);
    public static void main(String[] args){

        LOGGER.info("Running");
        ConfigManager.getInstance().loadConfigurationFile("simplehtttpserver/src/main/resources/http.json");
        Config conf = ConfigManager.getInstance().getCurrentConfiguration();

        LOGGER.info("Port used: " + conf.getPort());
        try {
            ServerListener serverListener = new ServerListener(conf.getPort(), conf.getWebroot());
            serverListener.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setStateServer(int i) {
    }

    public boolean setPort(int curentPort) {
        return true;
    }

    public boolean acceptServerPort() {
        return true;
    }

    public void listenForClients() {
    }
}
