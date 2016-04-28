package es.amarinag.mvvm_databinging_dagger2.domain.usecase;

import es.amarinag.mvvm_databinging_dagger2.domain.executor.ThreadExecutor;
import es.amarinag.mvvm_databinging_dagger2.domain.repository.GithubRepository;
import es.amarinag.mvvm_databinging_dagger2.model.Repository;
import java.util.List;
import javax.inject.Inject;
import rx.Observable;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class DetailRepositoryUseCase extends BaseUseCase {
  @Inject
  GithubRepository githubRepository;
  @Inject
  public DetailRepositoryUseCase(ThreadExecutor executor) {
    super(executor);
  }

  public Observable<Repository> invoke(String owner, String repository){
    return githubRepository.getDeatilRepository(owner, repository).compose(applySchedulers());
  }

}
