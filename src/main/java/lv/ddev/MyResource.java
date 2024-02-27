package lv.ddev;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.container.ResourceContext;
import jakarta.ws.rs.core.Context;

@Path("/")
public class MyResource {

  @Context
  ResourceContext resourceContext;

  @GET
  public Uni<String> parent() {
    return Uni.createFrom().item("parent");
  }


  @Path("sub")
  public SubResource sub() {
    return resourceContext.getResource(SubResource.class);
  }
}
