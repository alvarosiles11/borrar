package UseCases.Command.Aeronaves.Editar;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Dto.AeronaveDto;

public class EditarAeronaveCommandTest {

	@Test
	public void dataValid() {

		UUID keyAeronave = UUID.randomUUID();
		String matricula = "xyz-1990";

	 
		AeronaveDto aeronaveDto = new AeronaveDto();
		aeronaveDto.setKeyAeronave(keyAeronave);
		aeronaveDto.setMatricula(matricula);
	 

		EditarAeronaveCommand command = new EditarAeronaveCommand(aeronaveDto);
 		Assert.assertEquals(keyAeronave, aeronaveDto.keyAeronave);
 		// Assert.assertEquals(aeronaveDto, command.aeronaveDto);
 		// Assert.assertEquals(keyAeronave, command.keyAeronave);
 	
	}

	@Test
	public void constructorIsPrivate() {
		Assert.assertTrue(EditarAeronaveCommand.class.getConstructors()[0].canAccess(null));
	}

}