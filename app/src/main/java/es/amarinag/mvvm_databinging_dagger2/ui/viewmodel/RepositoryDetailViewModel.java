package es.amarinag.mvvm_databinging_dagger2.ui.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.util.Log;
import es.amarinag.mvvm_databinging_dagger2.domain.usecase.DetailRepositoryUseCase;
import es.amarinag.mvvm_databinging_dagger2.model.Repository;
import javax.inject.Inject;
import rx.Observable;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class RepositoryDetailViewModel extends BaseObservable {
  private Repository repository;
  private ObservableBoolean showLoading = new ObservableBoolean(true);

  @Inject
  DetailRepositoryUseCase detailRepositoryUseCase;

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
    Observable<Repository> repositoryObservable = detailRepositoryUseCase.invoke(owner, repository);
    repositoryObservable.subscribe(repo -> {
          this.repository = repo;
          setShowLoading(false);
        }, throwable -> Log.e("C[_]", throwable.getMessage(), throwable)
    );
  }

  public ObservableBoolean getShowLoading() {
    return showLoading;
  }

  public void setShowLoading(boolean showLoading) {
    this.showLoading.set(showLoading);
  }
}
