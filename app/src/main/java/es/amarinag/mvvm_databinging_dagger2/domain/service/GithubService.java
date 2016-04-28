package es.amarinag.mvvm_databinging_dagger2.domain.service;

import es.amarinag.mvvm_databinging_dagger2.domain.entity.RepositoryEntity;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public interface GithubService {
  @GET("repositories")
  Observable<List<RepositoryEntity>> getAllRepositories();

  @GET("repos/{owner}/{repo}")
  Observable<RepositoryEntity> getDetailRepository(
      @Path("owner") String owner,
      @Path("repo") String repository
  );
}
