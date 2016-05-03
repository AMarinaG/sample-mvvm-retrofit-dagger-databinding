package es.amarinag.mvvm_databinging_dagger2.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import es.amarinag.mvvm_databinging_dagger2.R;
import es.amarinag.mvvm_databinging_dagger2.databinding.RowGithubRepoBinding;
import es.amarinag.mvvm_databinging_dagger2.di.ForActivity;
import es.amarinag.mvvm_databinging_dagger2.model.Repository;
import es.amarinag.mvvm_databinging_dagger2.ui.viewmodel.GithubRowViewModel;
import es.amarinag.mvvm_databinging_dagger2.ui.widget.ArrayRecyclerAdapter;
import es.amarinag.mvvm_databinging_dagger2.ui.widget.BindingHolder;
import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class ReposAdapter extends
    ArrayRecyclerAdapter<Repository, BindingHolder<RowGithubRepoBinding>> {
  @Inject
  @ForActivity
  Provider<GithubRowViewModel> githubRowViewModelProvider;
  @Inject
  public ReposAdapter(@NonNull @ForActivity Context context) {
    super(context);
  }

  @Override
  public BindingHolder<RowGithubRepoBinding> onCreateViewHolder(ViewGroup parent, int viewType) {
    return new BindingHolder<>(getContext(), parent, R.layout.row_github_repo);
  }

  @Override public void onBindViewHolder(BindingHolder<RowGithubRepoBinding> holder, int position) {
    Repository repository = getItem(position);
    RowGithubRepoBinding row = holder.binding;
    GithubRowViewModel githubRowViewModel = githubRowViewModelProvider.get();
    githubRowViewModel.bindRepo(repository);
    row.setRepositoryViewModel(githubRowViewModel);
  }

  public void fakeData(int total) {
    for (int i = 1; i < total; i++) {
      Repository repository = new Repository();
      repository.setName("Item #" + i);
      addItem(repository);
    }
  }
}
