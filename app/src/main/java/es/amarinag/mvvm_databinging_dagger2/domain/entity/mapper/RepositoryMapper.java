package es.amarinag.mvvm_databinging_dagger2.domain.entity.mapper;

import es.amarinag.mvvm_databinging_dagger2.domain.entity.OwnerEntity;
import es.amarinag.mvvm_databinging_dagger2.domain.entity.RepositoryEntity;
import es.amarinag.mvvm_databinging_dagger2.model.GithubOwner;
import es.amarinag.mvvm_databinging_dagger2.model.GithubRepository;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class RepositoryMapper {
  public static GithubRepository wrap(RepositoryEntity repositoryEntity) {
    GithubRepository repository = new GithubRepository();
    repository.setName(repositoryEntity.getName());
    return repository;
  }
  public static RepositoryEntity unwrap(GithubRepository githubRepository) {
    RepositoryEntity repositoryEntity = new RepositoryEntity();
    repositoryEntity.setName(githubRepository.getName());
    return repositoryEntity;
  }
}
