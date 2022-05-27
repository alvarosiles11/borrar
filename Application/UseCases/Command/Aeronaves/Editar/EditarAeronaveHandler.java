package Application.UseCases.Command.Aeronaves.Editar;

import Domain.Factories.IAeronaveFactory;
import Domain.Model.Aeronaves.Aeronave;
import Domain.Repositories.IAeronaveRepository;
import Domain.Repositories.IUnitOfWork;
import SharedKernel.http.HttpStatus;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.mediator.RequestHandler;

public class EditarAeronaveHandler implements RequestHandler<EditarAeronaveCommand, Aeronave> {

    // Declaro Factory, Repository, UnitOfWork
    protected IAeronaveFactory _IAeronaveFactory;
    protected IAeronaveRepository _IAeronaveRepository;
    protected IUnitOfWork _unitOfWor;

    // Constructor
    public EditarAeronaveHandler(IAeronaveFactory iAeronaveFactory, IAeronaveRepository iAeronaveRepository,
            IUnitOfWork unitOfWor) {
        this._IAeronaveFactory = iAeronaveFactory;
        this._IAeronaveRepository = iAeronaveRepository;
        this._unitOfWor = unitOfWor;
    }

    @Override
    public Aeronave handle(EditarAeronaveCommand request) throws HttpException {
        Aeronave aeronave = _IAeronaveRepository.FindByKey(request._AeronaveDto.keyAeronave);
        if (aeronave == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST, "Aeronave no encontrada");
        }
        aeronave.matricula = request._AeronaveDto.matricula;
        _IAeronaveRepository.Update(aeronave);
        return aeronave;
    }
}