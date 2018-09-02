package Exception_handler;

public class Main {

    public static void main(String[] args) throws UserAddException {

        ChatEngine chatEngine = new ChatEngine();
        User user = new User("ja");
        chatEngine.loginUser(user);
        System.out.println("number of users: " + chatEngine.getNumberOfUsers());
        user.addStar("ja");
        //chatEngine.logoutUser(user.id);
        System.out.println("is user 'ja': " + chatEngine.hasUser(user.id));
        System.out.println("is user 'ja': " + chatEngine.hasUser("ja"));



        System.out.println();
    }
}
