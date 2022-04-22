package Domain.Repositories;

import org.eclipse.jetty.util.thread.Scheduler.Task;

public interface IUnitOfWork {
    Task commitTask();
}
