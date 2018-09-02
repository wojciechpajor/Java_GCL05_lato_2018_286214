import java.io.IOException;

public class ServerProgram {
    public static void main(String[] args) {

        CustomServer server = new CustomServer();
        server.start(6666);
        try{
            server.run(6666);

        } catch (IOException e){
            System.out.println("ERROR");
        }
    }
}