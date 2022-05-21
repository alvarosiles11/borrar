package Domain.Repositories;

import SharedKernel.http.Exception.HttpException;

public interface IUnitOfWork {
    public void commit() throws HttpException;
}
