package lv.ddev;

import io.quarkus.arc.Unremovable;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.container.ResourceContext;
import jakarta.ws.rs.core.Context;

//@Unremovable
@Singleton
public class SubResource {

  @Context
  ResourceContext resourceContext;

  @GET
  public Uni<String> sub() {
    return Uni.createFrom().item("sub");
  }

}
