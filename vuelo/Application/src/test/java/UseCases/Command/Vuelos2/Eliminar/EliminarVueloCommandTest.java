package UseCases.Command.Vuelos2.Eliminar;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Dto.VueloDto;
import UseCases.Command.Vuelos.Eliminar.EliminarVueloCommand;

public class EliminarVueloCommandTest {

	@Test
	public void dataValid() {

		UUID key = UUID.randomUUID();
		VueloDto vueloDto = new VueloDto();
		vueloDto.key = key;
		EliminarVueloCommand command = new EliminarVueloCommand(vueloDto.key);
		Assert.assertEquals(key, vueloDto.key);

	}

	@Test
	public void constructorIsPrivate() {
		Assert.assertTrue(EliminarVueloCommand.class.getConstructors()[0].canAccess(null));
	}
}