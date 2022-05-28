package Dto;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

public class AeronaveDtoTest {
	@Test
	public void CheckPropertiesValid() {
		UUID keyAeronave = UUID.randomUUID();
		String matricula = "xyz-1990";

		// dto
		AeronaveDto aeronaveDto = new AeronaveDto();
		Assert.assertEquals(null, aeronaveDto.keyAeronave);
		Assert.assertEquals(null, aeronaveDto.matricula);
		// end dto

		// getters and setters
		aeronaveDto.setKeyAeronave(keyAeronave);
		aeronaveDto.setMatricula(matricula);
 		Assert.assertEquals(keyAeronave, aeronaveDto.getKeyAeronave());
		Assert.assertEquals(matricula, aeronaveDto.getMatricula());
	}
}
