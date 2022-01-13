package httpserver;

import httpserver.core.ServerListener;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GuiForm extends JFrame {
    private JButton startServerButton;
    private JButton pauseServerButton;
    private JButton stopServerButton;
    private JTextField textField1;
    HttpServer srv = new HttpServer();
    private int restart = 0;
    private int curentPort = 0, oldPort = 0;

    private static ServerListener serverController;
    private Container panelMain;

   /* public GuiForm() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, IOException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        startServerButton.addServerListener(new ServerListener() {
            public void actionPerformed(ActionEvent e) {
                curentPort = Integer.parseInt(textField1.getText());
                if (curentPort == oldPort && restart == 1) {
                    srv.setStateServer(1);
                    JOptionPane.showMessageDialog(null, "Server-ul a repornit cu succes ! URL:http://localhost:" + curentPort);
                }
                if ((curentPort != oldPort && restart == 1) || restart == 0) {
                    startSRV();
                    restart = 0;
                }
            }

        });

        pauseServerButton.addActionListener(new ServerListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Server-ul este in modul de metenanta!");
                srv.setStateServer(2);
                startServerButton.setText("Restart");
                startServerButton.setEnabled(true);
                restart=1;
            }
        });

        stopServerButton.addActionListener(new ServerListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Server-ul a fost oprit!");
                srv.setStateServer(3);
                startServerButton.setEnabled(true);
                restart=1;
            }
        });
    }
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, IOException {
        JFrame frame=new JFrame("App");

        frame.setContentPane(new GuiForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void startSRV(){
        if (srv.setPort(curentPort) && srv.acceptServerPort()) {
            JOptionPane.showMessageDialog(null, "Server-ul a pornit cu succes ! URL:http://localhost:"+curentPort);
            startServerButton.setEnabled(false);
            oldPort=curentPort;
            srv.setStateServer(1);
            Thread interfaceThread = null;
            try {
                interfaceThread = new Thread(new GuiForm());
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
                unsupportedLookAndFeelException.printStackTrace();
            } catch (InstantiationException instantiationException) {
                instantiationException.printStackTrace();
            } catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
            interfaceThread.start();
        } else {
            JOptionPane.showMessageDialog(null, "Portul este deja deschis!");

        }
    }
    @Override
    public void run() {
        srv.listenForClients();
   */ }

