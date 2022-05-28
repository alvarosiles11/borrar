package Repositories;

import java.util.List;
import java.util.UUID;

import Model.Vuelos.Vuelo;
import core.IRepository;

public interface IVueloRepository extends IRepository<Vuelo, UUID> {

    public List<Vuelo> GetAll();

    public Vuelo Delete(Vuelo vuelo);

    public Vuelo Update(Vuelo vuelo);

}
