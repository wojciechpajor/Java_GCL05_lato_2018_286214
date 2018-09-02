import java.io.*;
import java.net.*;

class ServerThread extends Thread{

    private static final int PING_FRAME = 1;
    private static final int HELLO_WORLD_FRAME = 2;

    private String line = null;
    private BufferedReader is = null;
    private PrintWriter os = null;
    private Socket s = null;

    public ServerThread(Socket s){
        this.s = s;
    }

    public void run() {

        try(BufferedReader is = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter os = new PrintWriter(s.getOutputStream())) {

            line = is.readLine();
            while( !Thread.interrupted() ){
                switch( line )
                {
                    case "PING":
                        os.println( "PING_FRAME" ); // odsyłamy typ ramki (pusta ramka)
                        os.flush();
                        System.out.println( "CLIENT PING" );
                        line = is.readLine();
                        break;
                    case "ECHO":
                        //os.println( "HELLO_WORLD_FRAME" ); // typ ramki
                        os.println( "HELLO WORLD!" ); // dane ramki
                        os.flush();
                        System.out.println( "CLIENT ASKED FOR RESPONSE" );
                        line = is.readLine();
                        break;
                    case "QUIT":
                        this.interrupt();
                        s.close();
                    case "LOGIN":
                        //os.println( "HELLO_WORLD_FRAME" );
                        User użytkownik = new User("nick","pass");
                        os.println( "UŻYTKOWNIK " + użytkownik.username + " logged in" );
                        os.flush();
                        System.out.println( "USER LOGGED IN" );
                        line = is.readLine();
                        break;
                    case "LOGOUT":
                        //os.println( "HELLO_WORLD_FRAME" );
                        os.println( "UŻYTKOWNIK WYLOGOWANY" );
                        os.flush();
                        System.out.println( "USER LOGGED OUT" );
                        line = is.readLine();
                        break;
                    default:
                        os.println("Invalid command!");
                        os.flush();
                        System.out.println("Message from Client  :  " + line);
                        line = is.readLine();
                        break;
                    //next cases
                }
            }
        } catch (IOException e){
            line = this.getName();
            System.out.println("IO Error/ Client " + line + " terminated abruptly");
        } catch (NullPointerException e){
            line=this.getName();
            System.out.println("Client " + line + " Closed");
        }
    }
}