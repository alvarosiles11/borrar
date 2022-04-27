package Domain.Repositories;

import java.util.UUID;

import Domain.Model.Vuelos.Vuelo;
import kernel.core.IRepository;

public interface IVueloRepository extends IRepository<Vuelo, UUID>  {
    
}
