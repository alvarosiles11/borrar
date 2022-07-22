package UseCases.Command.Aeronaves.Editar;

import Dto.AeronaveDto;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Test;

public class EditarAeronaveCommandTest {

  @Test
  public void dataValid() {
    UUID keyAeronave = UUID.randomUUID();
    String matricula = "xyz-1990";

    AeronaveDto aeronaveDto = new AeronaveDto();
    // aeronaveDto.setKey(keyAeronave);

    aeronaveDto.setKeyAeronave(keyAeronave);
    aeronaveDto.setMatricula(matricula);

    EditarAeronaveCommand command = new EditarAeronaveCommand(
      aeronaveDto.keyAeronave
    );
    command._AeronaveDto.keyAeronave = keyAeronave;
    command._AeronaveDto.matricula = matricula;
    Assert.assertEquals(keyAeronave, aeronaveDto.keyAeronave);
  }

  @Test
  public void constructorIsPrivate() {
    Assert.assertTrue(
      EditarAeronaveCommand.class.getConstructors()[0].canAccess(null)
    );
  }
}
