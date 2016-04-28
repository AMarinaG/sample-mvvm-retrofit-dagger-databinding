package es.amarinag.mvvm_databinging_dagger2.domain.entity.mapper;

import es.amarinag.mvvm_databinging_dagger2.domain.entity.OwnerEntity;
import es.amarinag.mvvm_databinging_dagger2.model.GithubOwner;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class OwnerMapper {
  public static GithubOwner wrap(OwnerEntity ownerEntity) {
    GithubOwner owner = new GithubOwner();
    owner.setLogin(ownerEntity.getLogin());
    return owner;
  }
  public static OwnerEntity unwrap(GithubOwner githubOwner) {
    OwnerEntity ownerEntity = new OwnerEntity();
    ownerEntity.setLogin(githubOwner.getLogin());
    return ownerEntity;
  }
}
