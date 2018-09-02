import java.io.IOException;

public class ClientProgram {
    public static void main(String[] args) {

        CustomClient client = new CustomClient();
        try{
            client.connect("host", 6542);
            client.echo("echo");
        } catch (IOException e){
            System.out.println("ERROR");
        }
    }
}