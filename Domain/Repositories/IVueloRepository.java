package Domain.Repositories;

import java.util.List;
import java.util.UUID;

import Domain.Model.Vuelos.Vuelo;
import SharedKernel.core.IRepository;

public interface IVueloRepository extends IRepository<Vuelo, UUID> {

    public List<Vuelo> GetAll();

    public Vuelo Delete(Vuelo vuelo);

    public Vuelo Update(Vuelo vuelo);

}
