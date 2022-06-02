package UseCases.Queries.Tripulantes.GetByKey;

import java.util.UUID;

import org.junit.Test;

import fourteam.http.Exception.HttpException;

public class GetTripulanteByKeyQueryTest {

    @Test
    public void HandleCorrectly() throws HttpException {
        UUID key = UUID.randomUUID();
        GetTripulanteByKeyQuery query = new GetTripulanteByKeyQuery(key);
    }
}
