package org.iesfm.socialnetwork;

import com.sun.source.tree.Tree;

import java.util.*;

public class SocialNetwork implements ISocialNetwork {
    private String name;
    private Map<String, User> users;
    private List<String> trendingTopics;

    public SocialNetwork(String name, Map<String, User> users, List<String> trendingTopics) {
        this.name = name;
        this.users = users;
        this.trendingTopics = trendingTopics;
    }

    //Ejemplo Clase.
    @Override
    public User createUser(String username) {
        User user = new User(username, new TreeSet<>());

        users.put(username, user);
        return user;
    }

    //Método que dado un username, nos devuelva los posts del muro de ese usuario.
    @Override
    public Set<Post> returnPostWall(String username) {
        User user = null;
        for (Map.Entry<String, User> entry : users.entrySet()) {
            if (entry != null) {
                if (username.equals(entry.getKey())) {
                    user = entry.getValue();
                }
            }
        }
        return user.getWall();
    }


    //Un método que dado un username y una etiqueta, nos devuelva los posts del muro de ese usuario que tengan esa etiqueta.
    @Override
    public Set<Post> returnPostByTag(String username, String tag) {
        Set<Post> userWall = returnPostWall(username);
        Set<Post> postResult = new TreeSet<>();
        for (Post post : userWall) {
            for (String postTag : post.getTags()) {
                if (postTag.equals(tag)) {
                    postResult.add(post);
                }
            }
        }
        return postResult;
    }


    //Un método que dado un username, un mensaje, una fecha y unas etiquetas, añada un post en el propio muro del usuario.
    @Override
    public void addPostWallUser(String author, String message, String date, HashSet<String> tags) {
        Set<Post> userWall = returnPostWall(author);
        Post post = new Post(author, message, date, tags);
        userWall.add(post);
    }


    //Un metodo que dado un username, busque todos los posts de los que es autor en los diferentes muros y los devuelva en una lista.
    @Override
    public List<Post> postReturnList(String username) {
        List<Post> postList = new ArrayList<>();
        for (Map.Entry<String, User> entry : users.entrySet()) {
            User user = entry.getValue();
            TreeSet<Post> userWall = user.getWall();
            for (Post post : userWall) {
                if (username.equals(post.getAuthor())) {
                    postList.add(post);
                }
            }
        }
        return postList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public List<String> getTrendingTopics() {
        return trendingTopics;
    }

    public void setTrendingTopics(List<String> trendingTopics) {
        this.trendingTopics = trendingTopics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialNetwork that = (SocialNetwork) o;
        return Objects.equals(name, that.name) && Objects.equals(users, that.users) && Objects.equals(trendingTopics, that.trendingTopics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users, trendingTopics);
    }
}