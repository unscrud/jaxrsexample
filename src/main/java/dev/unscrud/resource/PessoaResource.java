package dev.unscrud.resource;

import dev.unscrud.model.Pessoa;
import dev.unscrud.repository.PessoaRepository;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pessoa")
public class PessoaResource {
  private PessoaRepository repository = new PessoaRepository();

  @PUT
  @Path("{id}")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response put(@PathParam("id") int id, Pessoa pessoa) {
    Pessoa p = repository.get(id);
    if (p == null)
      return Response.status(Response.Status.NOT_FOUND).build();

    try {
      pessoa.setId(id);
      repository.edit(pessoa);
      return Response.status(Response.Status.OK).entity(pessoa).build();
    } catch (Exception e) {
      return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
    }
  }
}
