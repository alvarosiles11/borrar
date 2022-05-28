package dmsnur.Application.UseCases.Command.Aeronaves.Editar;

import dmsnur.Domain.Factories.IAeronaveFactory;
import dmsnur.Domain.Model.Aeronaves.Aeronave;
import dmsnur.Domain.Repositories.IAeronaveRepository;
import dmsnur.Domain.Repositories.IUnitOfWork;
import dmsnur.SharedKernel.http.HttpStatus;
import dmsnur.SharedKernel.http.Exception.HttpException;
import dmsnur.SharedKernel.mediator.RequestHandler;

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