package Model.Aeronaves;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

public class AeronaveTest {

	@Test
	public void CheckConstructor() {
		UUID key = UUID.randomUUID();
		String matricula = "A12345";

		Aeronave aeronave = new Aeronave(matricula);
		// Assert.assertEquals(key, aeronave.key);
		// Assert.assertEquals(matricula, aeronave.matricula);
	}

}
