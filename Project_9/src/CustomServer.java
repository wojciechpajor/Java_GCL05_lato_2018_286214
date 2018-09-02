import java.io.*;
import java.net.*;

public class CustomServer{

    private Socket socket = null;
    private ServerSocket serverSocket = null;

    public void start(int port) {
        System.out.println("Server Listening......");
        try{
            serverSocket = new ServerSocket(4445, 5);

        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Server error");
        }
    }

    public void run(int port) throws IOException {
        while (true) {
            try {
                socket = serverSocket.accept();
                System.out.println("connection Established");
                ServerThread st = new ServerThread(socket);
                st.start();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Connection Error");
            }
        }
    }
}