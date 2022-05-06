package Domain.Repositories;

import java.util.UUID;

import Domain.Model.Vuelos.Vuelo;
import SharedKernel.core.IRepository;

public interface IVueloRepository extends IRepository<Vuelo, UUID>  {
    
}
