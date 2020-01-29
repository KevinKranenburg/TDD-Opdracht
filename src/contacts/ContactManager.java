package contacts;

public class ContactManager {
    Contact[] myFriends;
    int friendsCount;

    public ContactManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    public void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getName().equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }

    public int getFriendsCount() {
        return friendsCount;
    }
}