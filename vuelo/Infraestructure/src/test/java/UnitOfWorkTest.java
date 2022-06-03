import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import Context.IWriteDbContext;
import fourteam.http.Exception.HttpException;
import fourteam.mediator.Mediator;

public class UnitOfWorkTest {

    IWriteDbContext context = Mockito.mock(IWriteDbContext.class);
    Mediator mediator = Mockito.mock(Mediator.class);

    @Test
    public void CheckConstructor() {
        UnitOfWork unitOfWork = new UnitOfWork(context, mediator);
        // unitOfWork.setContext(context);
        // unitOfWork.setMediator(mediator);

        // verify(_IVueloRepository).Create(response);
        // verify(_IUnitOfWork).commit();
        //alvaro
    }

    @Test
    public void CheckCommit() throws HttpException {
        UnitOfWork unitOfWork = new UnitOfWork(context, mediator);
        unitOfWork.commit();
        List<Object> events = context.getDomainEvents();
        for (Object event : events) {
            System.out.println(event);
        }
        // verify(_IVueloRepository).Create(response);
        // verify(_IUnitOfWork).commit();
        // mediator.notify();
        // mediator.commit();
    }
}
