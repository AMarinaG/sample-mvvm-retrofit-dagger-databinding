package es.amarinag.mvvm_databinging_dagger2.ui.viewmodel;

import android.databinding.BaseObservable;
import android.view.View;
import android.widget.Toast;
import es.amarinag.mvvm_databinging_dagger2.model.GithubRepository;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class GithubRowViewModel extends BaseObservable {
  private GithubRepository repository;

  public GithubRowViewModel(GithubRepository githubRepository) {
    repository=githubRepository;
  }
  public GithubRepository getRepository() {
    return repository;
  }

  public void onClickRepository(View view){
    Toast.makeText(view.getContext(), repository.getName(), Toast.LENGTH_SHORT).show();
  }
}
