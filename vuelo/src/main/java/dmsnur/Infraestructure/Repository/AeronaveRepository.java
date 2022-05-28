package dmsnur.Infraestructure.Repository;

import java.util.List;
import java.util.UUID;

import dmsnur.Domain.Model.Aeronaves.Aeronave;
import dmsnur.Domain.Repositories.IAeronaveRepository;
import dmsnur.Infraestructure.Context.IWriteDbContext;
import dmsnur.SharedKernel.db.DbSet;

public class AeronaveRepository implements IAeronaveRepository {

	private DbSet<Aeronave> _aeronave;

	public AeronaveRepository(IWriteDbContext database) {
		_aeronave = database.Aeronave;
	}

	@Override
	public Aeronave FindByKey(UUID key) {
		return _aeronave.Single(obj -> obj.key.equals(key));

	}

	@Override
	public void Create(Aeronave obj) {
		_aeronave.Add(obj);
	}

	@Override
	public List<Aeronave> GetAll() {
		return _aeronave.All();

	}

	@Override
	public Aeronave Delete(Aeronave aeronave) {
		_aeronave.Delete((it -> it.key.equals(aeronave.key)));
		return aeronave;
	}

	@Override
	public Aeronave Update(Aeronave aeronave) {
		_aeronave.Update(aeronave, (it -> it.key.equals(aeronave.key)));
		return aeronave;
	}

}
