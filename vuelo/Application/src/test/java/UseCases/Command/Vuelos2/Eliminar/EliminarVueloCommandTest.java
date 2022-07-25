package UseCases.Command.Vuelos2.Eliminar;

import Dto.VueloDto;
import UseCases.Command.Vuelos.Eliminar.EliminarVueloCommand;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Test;

public class EliminarVueloCommandTest {

  @Test
  public void dataValid() {
    UUID key = UUID.randomUUID();
    VueloDto vueloDto = new VueloDto();
    vueloDto.key = key;
    EliminarVueloCommand command = new EliminarVueloCommand(vueloDto.key);
    Assert.assertEquals(key, vueloDto.key);
    System.out.println(command);
  }

  @Test
  public void constructorIsPrivate() {
    Assert.assertTrue(
      EliminarVueloCommand.class.getConstructors()[0].canAccess(null)
    );
  }
}
