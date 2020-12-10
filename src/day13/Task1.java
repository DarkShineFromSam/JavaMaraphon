package day13;

public class Task1 {
    public static void main(String[] args) {
        // new profiles.
        User user1 = new User("Ula");
        User user2 = new User("Ksu");
        User user3 = new User("Dr");
        // sending messages.
        user1.sendMessage(user2,"Hello from Ula");
        user1.sendMessage(user2,"How are you?");

        user2.sendMessage(user1,"Hi Ula!");
        user2.sendMessage(user1,"I'm Ksu, Nice to meet you");
        user2.sendMessage(user1,"I'm fine, and you?");

        user3.sendMessage(user1,"Hey! my name is Dr.");
        user3.sendMessage(user1,"Do you remember me?");
        user3.sendMessage(user1,"We went the same school");

        user1.sendMessage(user3,"Hey Dr, of course I remember you!");
        user1.sendMessage(user3,"So nice to see you again");
        user1.sendMessage(user3,"Let's meet up. Are you free tomorrow?");

        user3.sendMessage(user1,"Yep, I'm free tomorrow, Let's go");

        MessageDatabase.showDialog(user1,user2);

        System.out.println();
    }
}
