package org.iesfm.socialnetwork;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ISocialNetwork {
    Set<Post> returnPostWall(String username);

    Set<Post> returnPostByTag(String username, String tag);

    void addPostWallUser(String author, String message, String date, HashSet<String> tags);

    List<Post> postReturnList(String username);

    User createUser(String username);
}
