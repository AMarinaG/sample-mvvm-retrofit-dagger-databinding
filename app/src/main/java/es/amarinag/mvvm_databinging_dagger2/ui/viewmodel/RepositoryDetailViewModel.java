package es.amarinag.mvvm_databinging_dagger2.ui.viewmodel;

import es.amarinag.mvvm_databinging_dagger2.model.Owner;
import es.amarinag.mvvm_databinging_dagger2.model.Repository;
import javax.inject.Inject;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class RepositoryDetailViewModel {
  private Repository repository;

  @Inject
  public RepositoryDetailViewModel() {
  }



  public Repository getRepository() {
    return repository;
  }

  public void setRepository(Repository repository) {
    this.repository = repository;
  }

  public void refreshData(String owner, String repository) {
    this.repository.setName(repository);
    this.repository.setOwner(new Owner(owner));
  }
}
