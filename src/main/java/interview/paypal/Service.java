package interview.paypal;

import java.util.HashMap;
import java.util.Map;

public class Service {
    public static final Map <String, User > USER_STORAGE =  new HashMap<>();

    public User createUser(String userHandle, String userFullName ){

        validateUser(userHandle, userFullName);

        User user =  new User(userHandle, userFullName);
        USER_STORAGE.put(userHandle, user);
        return user;
    }


    public void postTweet(String userHandle, String tweet){
   //validate user exists in store
        User user = USER_STORAGE.get(userHandle);
        user.postTweet(tweet);
    }



   public void follow(String followerHandle, String followeeHandle){
       //validate user exists in store
       User user = USER_STORAGE.get(followerHandle);
       user.addFollowee(followeeHandle);
   }

    public void unfollow(String followerHandle, String followeehandle){
        //validate user exists in store
        User user = USER_STORAGE.get(followerHandle);
        user.removeFollowee(followeehandle);
    }



    private void validateUser(String userHandle, String userFullName) {
        if(userHandle == null ||  userHandle.isEmpty()
                || userFullName.isEmpty()||userFullName == null){
            throw new IllegalArgumentException("Please provide complete user details");
        }
    }

}
