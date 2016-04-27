package es.amarinag.mvvm_databinging_dagger2.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import es.amarinag.mvvm_databinging_dagger2.R;
import es.amarinag.mvvm_databinging_dagger2.databinding.RowGithubRepoBinding;
import es.amarinag.mvvm_databinging_dagger2.di.ForActivity;
import es.amarinag.mvvm_databinging_dagger2.model.GithubRepository;
import es.amarinag.mvvm_databinging_dagger2.ui.widget.ArrayRecyclerAdapter;
import es.amarinag.mvvm_databinging_dagger2.ui.widget.BindingHolder;
import javax.inject.Inject;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class ReposAdapter extends
    ArrayRecyclerAdapter<GithubRepository, BindingHolder<RowGithubRepoBinding>> {
  @Inject
  public ReposAdapter(@NonNull @ForActivity Context context) {
    super(context);
  }

  @Override
  public BindingHolder<RowGithubRepoBinding> onCreateViewHolder(ViewGroup parent, int viewType) {
    return new BindingHolder<>(getContext(), parent, R.layout.row_github_repo);
  }

  @Override public void onBindViewHolder(BindingHolder<RowGithubRepoBinding> holder, int position) {
    GithubRepository githubRepository = getItem(position);
    RowGithubRepoBinding row = holder.binding;
    row.rowRepoName.setText(githubRepository.getName());
    row.getRoot().setOnClickListener(v -> dispatchOnItemClick(v.getRootView(), githubRepository));
  }

  public void fakeData(int total) {
    for (int i = 1; i < total; i++) {
      GithubRepository repository = new GithubRepository();
      repository.setName("Item #" + i);
      addItem(repository);
    }
  }
}
