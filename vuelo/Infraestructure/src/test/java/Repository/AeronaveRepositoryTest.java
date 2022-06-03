package Repository;

import java.util.UUID;

import org.junit.Test;

import Context.IWriteDbContext;
import Context.MongoDB.WriteDbContext;
import Model.Aeronaves.Aeronave;

public class AeronaveRepositoryTest {

	@Test
	public void dataValid() {
		UUID key = UUID.randomUUID();
		String matricula = "xyz-1990";
		IWriteDbContext database = new WriteDbContext();
		AeronaveRepository aeronaveRepository = new AeronaveRepository(database);
		Aeronave aeronave = new Aeronave(matricula);
		aeronaveRepository.GetAll();
		aeronaveRepository.FindByKey(key);
		aeronaveRepository.Create(aeronave);
		aeronaveRepository.Update(aeronave);
		aeronaveRepository.Delete(aeronave);
	}
}