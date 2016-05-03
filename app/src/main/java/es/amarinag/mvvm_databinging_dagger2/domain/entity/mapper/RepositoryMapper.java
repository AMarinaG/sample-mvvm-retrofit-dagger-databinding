package es.amarinag.mvvm_databinging_dagger2.domain.entity.mapper;

import es.amarinag.mvvm_databinging_dagger2.domain.entity.RepositoryEntity;
import es.amarinag.mvvm_databinging_dagger2.model.Repository;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class RepositoryMapper {
  public static Repository wrap(RepositoryEntity repositoryEntity) {
    Repository repository = new Repository();
    repository.setName(repositoryEntity.getName());
    repository.setOwner(OwnerMapper.wrap(repositoryEntity.getOwner()));
    return repository;
  }
  public static RepositoryEntity unwrap(Repository repository) {
    RepositoryEntity repositoryEntity = new RepositoryEntity();
    repositoryEntity.setName(repository.getName());
    repositoryEntity.setOwner(OwnerMapper.unwrap(repository.getOwner()));
    return repositoryEntity;
  }
}
