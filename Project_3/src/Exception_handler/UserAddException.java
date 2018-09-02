package Exception_handler;

public class UserAddException extends ChatException {

    public UserAddException()
    {
        super("Nie udało się dodać użytkownika");
    }
}
