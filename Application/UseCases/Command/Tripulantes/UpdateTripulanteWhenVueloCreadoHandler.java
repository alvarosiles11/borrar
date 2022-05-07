package Application.UseCases.Command.Tripulantes;

import Domain.Event.VueloCreado;
import Domain.Repositories.ITripulanteRepository;
import SharedKernel.mediator.Notification;
import SharedKernel.mediator.NotificationHandler;

public class UpdateTripulanteWhenVueloCreadoHandler implements NotificationHandler<VueloCreado> {

    private ITripulanteRepository iTripulanteRepository;

    public UpdateTripulanteWhenVueloCreadoHandler(ITripulanteRepository _iTripulanteRepository) {
        this.iTripulanteRepository = _iTripulanteRepository;
    }

    @Override
    public void handle(Notification notification) {
        System.out.println(notification);
    }

}
