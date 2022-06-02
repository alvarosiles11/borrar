package UseCases.Queries.Vuelos.GetByKey;

import java.util.UUID;

import org.junit.Test;

import fourteam.http.Exception.HttpException;

public class GetVueloByKeyQueryTest {

    @Test
    public void HandleCorrectly() throws HttpException {
        UUID key = UUID.randomUUID();
        GetVueloByKeyQuery query = new GetVueloByKeyQuery(key);
    }
}
