package es.amarinag.mvvm_databinging_dagger2.domain.entity.mapper;

import es.amarinag.mvvm_databinging_dagger2.domain.entity.OwnerEntity;
import es.amarinag.mvvm_databinging_dagger2.model.Owner;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class OwnerMapper {
  public static Owner wrap(OwnerEntity ownerEntity) {
    Owner owner = new Owner();
    owner.setLogin(ownerEntity.getLogin());
    return owner;
  }
  public static OwnerEntity unwrap(Owner owner) {
    OwnerEntity ownerEntity = new OwnerEntity();
    ownerEntity.setLogin(owner.getLogin());
    return ownerEntity;
  }
}
