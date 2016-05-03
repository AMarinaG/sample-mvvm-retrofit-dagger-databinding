package es.amarinag.mvvm_databinging_dagger2.domain.entity.mapper;

import es.amarinag.mvvm_databinging_dagger2.domain.entity.OwnerEntity;
import es.amarinag.mvvm_databinging_dagger2.domain.entity.RepositoryEntity;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AMarinaG on 29/04/2016.
 */
public class OwnerMapperTest {

  private static final String DUMMY_LOGIN = "Feliciano";
  private static final String DUMMY_REPOSITORY = "Feliciano";

  @Test
  public void testWrap() throws Exception {
    OwnerEntity ownerEntity = new OwnerEntity();
    ownerEntity.setLogin(DUMMY_LOGIN);
    RepositoryEntity repositoryEntity = new RepositoryEntity();
    repositoryEntity.setOwner(ownerEntity);
    repositoryEntity.setName(DUMMY_REPOSITORY);
    assertTrue("Bad repo! " +repositoryEntity.getName(), DUMMY_REPOSITORY.equals(repositoryEntity.getName()));
    assertTrue("Bad login! " +repositoryEntity.getOwner().getLogin(), DUMMY_LOGIN.equals(repositoryEntity.getOwner().getLogin()));
  }

  @Test
  public void testUnwrap() throws Exception {

  }
}