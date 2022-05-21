package Domain.Model.Aeronaves;

import java.util.UUID;

import SharedKernel.core.Entity;

public class Aeronave extends Entity<UUID> {

	public String matricula;

	public Aeronave(String matricula) {
		key = UUID.randomUUID();
		this.matricula = matricula;
	}

}
