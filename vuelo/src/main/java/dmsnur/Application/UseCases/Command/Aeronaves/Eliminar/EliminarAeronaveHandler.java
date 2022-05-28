package dmsnur.Application.UseCases.Command.Aeronaves.Eliminar;

import dmsnur.Domain.Factories.IAeronaveFactory;
import dmsnur.Domain.Model.Aeronaves.Aeronave;
import dmsnur.Domain.Repositories.IAeronaveRepository;
import dmsnur.Domain.Repositories.IUnitOfWork;
import dmsnur.SharedKernel.http.HttpStatus;
import dmsnur.SharedKernel.http.Exception.HttpException;
import dmsnur.SharedKernel.mediator.RequestHandler;

public class EliminarAeronaveHandler implements RequestHandler<EliminarAeronaveCommand, Aeronave> {

    // Declaro Factory, Repository, UnitOfWork
    protected IAeronaveFactory _IAeronaveFactory;
    private IAeronaveRepository _IAeronaveRepository;
    protected IUnitOfWork _unitOfWor;

    // Constructor
    public EliminarAeronaveHandler(IAeronaveFactory iAeronaveFactory, IAeronaveRepository iAeronaveRepository,
            IUnitOfWork unitOfWor) {
        this._IAeronaveFactory = iAeronaveFactory;
        this._IAeronaveRepository = iAeronaveRepository;
        this._unitOfWor = unitOfWor;
    }

    @Override
    public Aeronave handle(EliminarAeronaveCommand request) throws HttpException {
        Aeronave aeronave = _IAeronaveRepository.FindByKey(request._AeronaveDto.keyAeronave);
        if (aeronave == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST, "Aeronave no encontrada");
        }
        return _IAeronaveRepository.Delete(aeronave);
    }
}