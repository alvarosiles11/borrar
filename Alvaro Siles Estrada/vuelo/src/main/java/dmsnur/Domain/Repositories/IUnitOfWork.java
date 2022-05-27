package dmsnur.Domain.Repositories;

import dmsnur.SharedKernel.http.Exception.HttpException;

public interface IUnitOfWork {
    public void commit() throws HttpException;
}
