package Exception_handler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Queue;

public class ChatEngine implements Comparator<User>{
    HashMap<Long, User> usersID;
    HashMap<String, User> usersName;
    ArrayList<String> ban;
    Queue<String> messages;
    int stars;
    int idcount;

    public ChatEngine() {
        this.usersID = new HashMap<Long, User>();
        this.usersName = new HashMap<String, User>();
        ban = new ArrayList<String>();
        idcount = 0;
    }

    public void loginUser(User user) throws UserAddException
    {

        if(usersName.get(user.getName()) != null)
        {
            throw new UserAddException();
        }
        else
        {
            String newName = user.getName();
            user.setCreatedAt(System.currentTimeMillis());
            idcount++;
            user.setId(idcount);
            usersID.put(user.getId(), user);
            usersName.put(user.getName(), user);
        }
    }

    public void logoutUser(Long userID) throws UserAddException
    {
        String name = usersID.get(userID).getName();
        if(usersID.remove(userID) == null)
            throw new UserAddException();

        else {
            usersName.remove(name);

        }

    }

    public int getNumberOfUsers(){
        return usersID.size();
    }

    public void createBan(String userName)
    {
        if(usersName.containsKey(userName))
        {
            Long toDelete = usersName.get(userName).getId();
            usersName.remove(userName);
            usersID.remove(toDelete);
        }
        ban.add(userName);
    }

    public void removeBan(String userName)
    {
        ban.remove(userName);
    }

    public boolean hasUser(Long userID)
    {
        return (usersID.containsKey(userID));
    }

    public boolean hasUser(String userName)
    {
        return (usersName.containsKey(userName));
    }

    public boolean broadcastMessage(Long userID, String message)
    {
        return true;
    }

    @Override
    public int compare(User o1, User o2) {
        if(o1.getName() == o2.getName())
            return 0;
        else
            return 1;
    }
}
