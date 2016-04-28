package es.amarinag.mvvm_databinging_dagger2.ui.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import es.amarinag.mvvm_databinging_dagger2.di.ForActivity;
import es.amarinag.mvvm_databinging_dagger2.model.Repository;
import es.amarinag.mvvm_databinging_dagger2.ui.fragment.RepositoryDetailFragment;
import es.amarinag.mvvm_databinging_dagger2.ui.navigation.Navigation;
import javax.inject.Inject;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class GithubRowViewModel extends BaseObservable {
  private Repository repository;

  @Inject
  @ForActivity
  Context context;
  @Inject
  Navigation navigation;

  @Inject
  public GithubRowViewModel() {
  }

  public void bindRepo(Repository repository) {
    this.repository = repository;
  }

  public Repository getRepository() {
    return repository;
  }

  public void onClickRepository(View view) {
    Toast.makeText(view.getContext(), repository.getName(), Toast.LENGTH_SHORT).show();
    Bundle args = new Bundle();
    args.putString(RepositoryDetailFragment.ARG_REPOSITORY, repository.getName());
    args.putString(RepositoryDetailFragment.ARG_OWNER, repository.getOwner().getLogin());
    navigation.showFragment(new RepositoryDetailFragment(), args);
  }
}
