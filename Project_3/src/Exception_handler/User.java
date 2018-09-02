package Exception_handler;
public class User{
    long id;
    String name;
    long createdAt;
    int numberofSentMessages;
    int stars = 0;
    int idcount = 0;

    public User( String name) {
        this.id = idcount+1;
        this.name = name;
        this.numberofSentMessages = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public int getNumberofSentMessages() {
        return numberofSentMessages;
    }

    public void setNumberofSentMessages(int numberofSentMessages) {
        this.numberofSentMessages = numberofSentMessages;
    }


    public void addStar(String userName)
    {
        stars++;
    }
    public void removeStar(String userName)
    {
        stars--;
    }

}
