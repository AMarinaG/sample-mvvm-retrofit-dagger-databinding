package es.amarinag.mvvm_databinging_dagger2.domain.usecase;

import java.util.concurrent.Executor;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public abstract class BaseUseCase {
  //si queremos el executor, implementar
  protected Executor executor;

  public BaseUseCase(Executor executor) {
    this.executor = executor;
  }
}
