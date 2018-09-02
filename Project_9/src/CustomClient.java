import java.io.*;
import java.net.*;

public class CustomClient {


    private InetAddress address = null;
    private Socket s1 = null;
    private String line = null;
    private BufferedReader br = null;
    private BufferedReader is = null;
    private PrintWriter os = null;

    public CustomClient() {
        try{
            this.address = InetAddress.getLocalHost();
        }catch ( Exception e){
            System.out.println("LocalHost ERROR");
        }
    }

    public void connect(String host, int port) throws IOException {
        try {
            s1=new Socket(address, 4445); // You can use static final constant PORT_NUM
            br= new BufferedReader(new InputStreamReader(System.in));
            is=new BufferedReader(new InputStreamReader(s1.getInputStream()));
            os= new PrintWriter(s1.getOutputStream());

            System.out.println("Client Address : " + address);
            System.out.println("Enter command line ( Enter QUIT to end):");
        }
        catch (IOException e){
            e.printStackTrace();
            System.err.print("IO Exception");
        }
    }

    public void disconnect(){

    }

    public boolean login(String username, String password){

        return true;
    }

    public void logout() throws IOException{

    }

    public boolean ping() throws IOException{

        return true;
    }

    public boolean echo( String text ) throws IOException{
        String response=null;
        try{
            line = br.readLine();
            while(line.compareTo("QUIT")!=0){
                os.println(line);
                os.flush();
                response = is.readLine();
                System.out.println("Server Response : " + response);
                line = br.readLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Socket read Error");
            return false;
        }
        finally{
            is.close();
            os.close();
            br.close();
            s1.close();
            System.out.println("Connection Closed");
        }
        return true;
    }
}