package Exception_handler;

public class UserRemoveException extends ChatException {

    public UserRemoveException()
    {
        super("Nie udało się usunac użytkownika");
    }
}
