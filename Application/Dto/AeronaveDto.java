package Application.Dto;

import java.util.UUID;

public class AeronaveDto {
	public UUID keyAeronave;
	public String matricula;

	public AeronaveDto() {
	}

	public UUID getKeyAeronave() {
		return keyAeronave;
	}

	public void setKeyAeronave(UUID keyAeronave) {
		this.keyAeronave = keyAeronave;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}