package Repository;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Context.IWriteDbContext;
import Context.MongoDB.WriteDbContext;
import Model.Aeronaves.Aeronave;
import fourteam.db.DbSet;

public class AeronaveRepositoryTest {

	IWriteDbContext _database = Mockito.mock(IWriteDbContext.class);
	DbSet<Aeronave> _aeronaves = Mockito.mock(DbSet.class);

	@Before
	public void setUp() {
		_database.Aeronave = _aeronaves;

	}

	@Test
	public void constructor_accept() {
		AeronaveRepository repository = new AeronaveRepository(_database);
		Assert.assertNotNull(repository);
	}

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

	@Test
	public void FindByKey_accept() {
		// Mockito.verify(_aeronaves).Single(obj -> obj.key.equals(UUID.randomUUID()));
		Aeronave a = new Aeronave();
		// when(_aeronaves.Single(any())).thenReturn(a);
		AeronaveRepository repository = new AeronaveRepository(_database);
		// ArgumentCaptor<Aeronave> captor = ArgumentCaptor.forClass(Aeronave.class);
		repository.FindByKey(UUID.randomUUID());
		// Assert.assertNotNull(repository);
	}

}