package dmsnur.Domain.Repositories;

import java.util.List;
import java.util.UUID;

import dmsnur.Domain.Model.Vuelos.Tripulante;
import dmsnur.SharedKernel.core.IRepository;

public interface ITripulanteRepository extends IRepository<Tripulante, UUID> {

    public List<Tripulante> GetAll();

    public Tripulante Delete(Tripulante tripulante);

    public Tripulante Update(Tripulante tripulante);
}
