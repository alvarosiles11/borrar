package dmsnur.Dto;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import dmsnur.Application.Dto.AeronaveDto;

public class AeronaveDtoTest {
	@Test
	public void CheckPropertiesValid() {
		UUID keyAeronave = UUID.randomUUID();
		String matricula = "xyz-1990";

		AeronaveDto aeronave = new AeronaveDto();

		Assert.assertEquals(null, aeronave.keyAeronave);
		Assert.assertEquals(null, aeronave.matricula);

		aeronave.keyAeronave = keyAeronave;
		aeronave.setKeyAeronave(keyAeronave);
		aeronave.setMatricula(matricula);

		Assert.assertEquals(keyAeronave, aeronave.getKeyAeronave());
		Assert.assertEquals(matricula, aeronave.getMatricula());
	}
}
