package es.amarinag.mvvm_databinging_dagger2.domain.usecase;

import es.amarinag.mvvm_databinging_dagger2.domain.repository.GithubRepository;
import es.amarinag.mvvm_databinging_dagger2.model.Repository;
import java.util.List;
import javax.inject.Inject;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class LoadRepositoriesUseCase{
  @Inject
  GithubRepository githubRepository;
  @Inject
  public LoadRepositoriesUseCase() {
  }

  public Observable<List<Repository>> invoke(){
    return githubRepository.getAllRepositories()
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io());
  }
}
