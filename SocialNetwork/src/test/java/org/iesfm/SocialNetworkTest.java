package org.iesfm;

import org.iesfm.socialnetwork.Post;
import org.iesfm.socialnetwork.SocialNetwork;
import org.iesfm.socialnetwork.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SocialNetworkTest {
    // Ejemplo Clase.
    @Test
    public void createUserTest(){
        SocialNetwork socialNetwork = new SocialNetwork("Instagram",new HashMap<>(),new LinkedList<>());
        String username = "Reus";

        User user = socialNetwork.createUser(username);
        Assert.assertEquals("Reus",user.getUsername());
        Assert.assertTrue(socialNetwork.getUsers().containsKey(username));
        Assert.assertEquals(user,socialNetwork.getUsers().get(username));
        Assert.assertEquals(username, socialNetwork.getUsers().get(username));
    }

    //Cambia el nombre del test subnormal.
    @Test
    public void returnPostWallTest() {
        String etiqueta1 = "Futbolistas";
        String etiqueta2 = "Compañeros";
        HashSet<String> etiquetas = new HashSet<>();
        etiquetas.add(etiqueta1);
        etiquetas.add(etiqueta2);
        Post post = new Post("Christian", "Hola Mikel, como estás", "16-04-21", etiquetas);
        TreeSet<Post> postChristian = new TreeSet<>();
        postChristian.add(post);
        User christian = new User("Christian", postChristian);
        Map<String, User> map = new HashMap<>();
        map.put("Christian", christian);
        List<String> trendingTopics = new ArrayList<>();
        trendingTopics.add("Andres Iniesta");
        trendingTopics.add("Fernando Torres");
        SocialNetwork socialNetwork = new SocialNetwork("Instagram", map, trendingTopics);
        Set<Post> expected = socialNetwork.returnPostWall("Christian");
        Assert.assertEquals(postChristian, expected);
    }

    @Test
    public void returnPostByTagTest() {
        String etiqueta1 = "Futbolistas";
        String etiqueta2 = "Compañeros";
        HashSet<String> etiquetas = new HashSet<>();
        etiquetas.add(etiqueta1);
        etiquetas.add(etiqueta2);
        Post post = new Post("Christian", "Hola Mikel, como estás", "16-04-21", etiquetas);
        TreeSet<Post> postChristian = new TreeSet<>();
        postChristian.add(post);
        User christian = new User("Christian", postChristian);
        Map<String, User> map = new HashMap<>();
        map.put("Christian", christian);
        List<String> trendingTopics = new ArrayList<>();
        trendingTopics.add("Andres Iniesta");
        trendingTopics.add("Fernando Torres");
        SocialNetwork socialNetwork = new SocialNetwork("Instagram", map, trendingTopics);
        Set<Post> expected = socialNetwork.returnPostByTag("Christian", "Compañeros");
        Assert.assertEquals(postChristian, expected);
    }
}

