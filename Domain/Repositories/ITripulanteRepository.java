package Domain.Repositories;

import java.util.List;
import java.util.UUID;

import Domain.Model.Vuelos.Tripulante;
import SharedKernel.core.IRepository;

public interface ITripulanteRepository extends IRepository<Tripulante, UUID> {

    public List<Tripulante> GetAll();

    public Tripulante Delete(Tripulante tripulante);

    public Tripulante Update(Tripulante tripulante);
}
