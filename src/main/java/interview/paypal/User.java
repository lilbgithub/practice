package interview.paypal;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a simplified version of Twitter where users can post tweets, follow other users, unfollow other users, see top 10 most recent tweets in the user's newsfeed, and create new users.
 * Your system should support the following methods.
 *
 * createUser(userHandle, userFullName) // createUser("jdoe", "John Doe")
 * postTweet(userHandle, tweet) // postTweet("jdoe", "This is my first tweet!")
 * follow(followerHandle, followeeHandle) // follow("jdoe", "janedoe")     jdoe follow janedoe
 * unfollow(followerHandle, followeehandle) // unfollow("jdoe", "janedoe")
 * getNewsFeed(userHandle) // tweets from  janedoe   ///Should return 10 tweets from most recent to least recent - Tweets from users that you follow, includes tweets the user posted themselves
 // getNewsFeed("jdoe")
 */
public class User {
    String userHandle;
    String userFullName;
    List<String> tweets = new ArrayList<>();
    List<String> followees = new ArrayList<>();
    //followTo List

    public User(String userHandle, String userFullName ){

        this.userHandle = userHandle;
        this.userFullName =  userFullName;
    }
    public void postTweet(String tweet){
        tweets.add(tweet);
    }

    public void addFollowee(String followee){
        followees.add(followee);
    }

    public void removeFollowee(String followee){
        followees.remove(followee);
    }

}
