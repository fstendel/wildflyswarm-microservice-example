package de.florianstendel.apps.wildflyswarm.jaxrs;

import de.florianstendel.apps.wildflyswarm.jaxrs.entity.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Florian on 03.12.2016.
 */
@Path("users")
public class UserResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers(){

        List<User> users = new ArrayList<>();
        users.add(new User("Max","Mustermann","max.mustermann@muster.domain"));

        return users;
    }
}
