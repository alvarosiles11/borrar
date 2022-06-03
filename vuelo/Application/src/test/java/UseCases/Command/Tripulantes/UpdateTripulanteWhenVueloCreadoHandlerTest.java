package UseCases.Command.Tripulantes;

import org.junit.Test;
import org.mockito.Mockito;

import Repositories.ITripulanteRepository;
import fourteam.http.Exception.HttpException;

public class UpdateTripulanteWhenVueloCreadoHandlerTest {

    ITripulanteRepository _ITripRep = Mockito.mock(ITripulanteRepository.class);

    // @Override
    // public void handle(Notification notification) {
    // System.out.println(notification);
    // }

    @Test
    public void HandleCorrectly() throws HttpException {

        UpdateTripulanteWhenVueloCreadoHandler handler = new UpdateTripulanteWhenVueloCreadoHandler(_ITripRep);

        // Notification notification;
        // handler.handle( );

    }

}
