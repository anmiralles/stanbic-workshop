package org.acme.fruits;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/fruits")
@RegisterRestClient(configKey = "fruits-data")
public interface FruitService {

    @GET
    List<Fruit> listAll();

    @GET
    @Path("{id}")
    Fruit findById(Long id);

}
