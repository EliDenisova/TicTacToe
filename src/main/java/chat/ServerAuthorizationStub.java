package chat;

import chat.model.UserCredentials;

public class ServerAuthorizationStub {
    public static String checkUserAuthority(UserCredentials user){
        return "Go ahead!";
    }
}