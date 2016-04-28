package es.amarinag.mvvm_databinging_dagger2.ui.viewmodel;

import android.util.Log;
import android.view.View;
import android.widget.Toast;
import es.amarinag.mvvm_databinging_dagger2.di.ForActivity;
import es.amarinag.mvvm_databinging_dagger2.domain.repository.GithubRepository;
import es.amarinag.mvvm_databinging_dagger2.domain.usecase.BaseUseCase;
import es.amarinag.mvvm_databinging_dagger2.domain.usecase.LoadRepositoriesUseCase;
import es.amarinag.mvvm_databinging_dagger2.model.Repository;
import es.amarinag.mvvm_databinging_dagger2.ui.adapter.ReposAdapter;
import java.util.List;
import javax.inject.Inject;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class GithubViewModel {
  @Inject
  ReposAdapter reposAdapter;
  @Inject
  LoadRepositoriesUseCase loadRepositoriesUseCase;

  @Inject
  @ForActivity
  public GithubViewModel() {
  }

  public ReposAdapter getReposAdapter() {
    return reposAdapter;
  }

  public void loadData() {
    Observable<List<Repository>> listObservable = loadRepositoriesUseCase.invoke();
    listObservable
        .subscribe(repositories -> reposAdapter.reset(repositories),throwable -> Log.e("C[_]", throwable.getMessage(), throwable));
  }
}
