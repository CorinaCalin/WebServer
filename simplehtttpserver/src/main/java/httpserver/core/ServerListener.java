package httpserver.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener extends Thread{
    private final static Logger LOGGER = LoggerFactory.getLogger(ServerListener.class);

    private int p;
    private String wroot;
    private ServerSocket serverSocket;

    public ServerListener(int port, String webroot) throws IOException {
        this.p = port;
        this.wroot = webroot;
        this.serverSocket = new ServerSocket(this.p);
    }

    public ServerListener() {

    }

    @Override
    public void run() {
        try {

            while(serverSocket.isBound() && !serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();

                LOGGER.info("Connection accepted: " + socket.getInetAddress());

                HttpConnection workerThread = new HttpConnection(socket);
                workerThread.start();

            }

        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.error("ERROR: Problem with setting socket",e);
        } finally {
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
