package es.amarinag.mvvm_databinging_dagger2.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import es.amarinag.mvvm_databinging_dagger2.R;
import es.amarinag.mvvm_databinging_dagger2.databinding.RowGithubRepoBinding;
import es.amarinag.mvvm_databinging_dagger2.di.ForActivity;
import es.amarinag.mvvm_databinging_dagger2.di.ForApplication;
import es.amarinag.mvvm_databinging_dagger2.ui.widget.ArrayRecyclerAdapter;
import es.amarinag.mvvm_databinging_dagger2.ui.widget.BindingHolder;
import javax.inject.Inject;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class ReposAdapter extends
    ArrayRecyclerAdapter<String, BindingHolder<RowGithubRepoBinding>> {
  @Inject
  public ReposAdapter(@NonNull @ForActivity Context context) {
    super(context);
  }

  @Override
  public BindingHolder<RowGithubRepoBinding> onCreateViewHolder(ViewGroup parent, int viewType) {
    return new BindingHolder<>(getContext(), parent, R.layout.row_github_repo);
  }

  @Override public void onBindViewHolder(BindingHolder<RowGithubRepoBinding> holder, int position) {
    String name = getItem(position);
    RowGithubRepoBinding row = holder.binding;
    row.rowRepoName.setText(name);
    row.getRoot().setOnClickListener(v -> dispatchOnItemClick(v.getRootView(), name));
  }

  public void fakeData(int total) {
    for (int i = 1; i < total; i++) {
      addItem("Item #" + i);
    }
  }
}
