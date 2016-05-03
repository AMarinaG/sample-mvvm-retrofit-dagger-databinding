package es.amarinag.mvvm_databinging_dagger2.domain.repository.remote;

import es.amarinag.mvvm_databinging_dagger2.domain.entity.RepositoryEntity;
import es.amarinag.mvvm_databinging_dagger2.domain.service.GithubService;
import java.util.List;
import javax.inject.Inject;
import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class GithubRemoteRepository {
  private final GithubService githubService;

  @Inject
  public GithubRemoteRepository(Retrofit retrofit) {
    githubService = retrofit.create(GithubService.class);
  }

  public Observable<List<RepositoryEntity>> getAllRepositories(){
    return githubService.getAllRepositories();
  }

  public Observable<RepositoryEntity> getDetailRepository(String owner, String repository) {
    return githubService.getDetailRepository(owner, repository);
  }
}
