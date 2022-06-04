package Factories;

import org.junit.Test;

import Model.Aeronaves.Aeronave;

public class AeronaveFactoryTest {

	@Test
	public void dataValid() {
		AeronaveFactory aeronaveFactory = new AeronaveFactory();
		Aeronave aeronave = aeronaveFactory.Create("xyz-1990");
	}
}