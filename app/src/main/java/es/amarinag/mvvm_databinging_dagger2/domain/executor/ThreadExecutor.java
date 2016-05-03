package es.amarinag.mvvm_databinging_dagger2.domain.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public interface ThreadExecutor extends Executor {
  Future<?> submit(Runnable task);

  <T> Future<T> submit(Callable<T> task);
}
