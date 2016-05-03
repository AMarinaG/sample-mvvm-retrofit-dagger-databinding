package es.amarinag.mvvm_databinging_dagger2.domain.repository;

import es.amarinag.mvvm_databinging_dagger2.domain.entity.RepositoryEntity;
import es.amarinag.mvvm_databinging_dagger2.domain.entity.mapper.RepositoryMapper;
import es.amarinag.mvvm_databinging_dagger2.domain.repository.remote.GithubRemoteRepository;
import es.amarinag.mvvm_databinging_dagger2.model.Repository;
import java.util.List;
import javax.inject.Inject;
import rx.Observable;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class GithubRepository {
  @Inject
  GithubRemoteRepository githubRemoteRepository;

  @Inject
  public GithubRepository() {
  }

  public Observable<List<Repository>> getAllRepositories(){
    Observable<List<RepositoryEntity>> listObservable = githubRemoteRepository.getAllRepositories();
    return listObservable
        .flatMapIterable(repositoryEntities -> repositoryEntities)
        .map(RepositoryMapper::wrap)
        .toList();
  }

  public Observable<Repository> getDeatilRepository(String owner, String repository) {
    Observable<RepositoryEntity> repositoryEntityObservable = githubRemoteRepository.getDetailRepository(owner, repository);
    return repositoryEntityObservable
        .map(RepositoryMapper::wrap);
  }
}
