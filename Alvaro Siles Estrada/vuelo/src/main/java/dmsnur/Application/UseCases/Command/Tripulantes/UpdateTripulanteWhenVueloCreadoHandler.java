package dmsnur.Application.UseCases.Command.Tripulantes;

import dmsnur.Domain.Event.VueloCreado;
import dmsnur.Domain.Repositories.ITripulanteRepository;
import dmsnur.SharedKernel.mediator.Notification;
import dmsnur.SharedKernel.mediator.NotificationHandler;

public class UpdateTripulanteWhenVueloCreadoHandler implements NotificationHandler<VueloCreado> {

    protected ITripulanteRepository iTripulanteRepository;

    public UpdateTripulanteWhenVueloCreadoHandler(ITripulanteRepository _iTripulanteRepository) {
        this.iTripulanteRepository = _iTripulanteRepository;
    }

    @Override
    public void handle(Notification notification) {
        System.out.println(notification);
    }

}
