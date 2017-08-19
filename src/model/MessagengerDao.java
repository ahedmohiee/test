package model;

import java.util.HashMap;
import java.util.Map;

import messenger.Message;
import messenger.Profile;

public class MessagengerDao {
    private static Map<Long,Message> messages= new HashMap<>();
    private static Map<String,Profile> profiles= new HashMap<>();

  

    public static Map<Long, Message> getMessages() {
        return messages;
    }



    public static Map<String, Profile> getProfiles() {
        return profiles;
    }
}
