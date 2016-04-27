package es.amarinag.mvvm_databinging_dagger2.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import es.amarinag.mvvm_databinging_dagger2.databinding.FragmentGithubBinding;
import es.amarinag.mvvm_databinging_dagger2.ui.adapter.ReposAdapter;
import es.amarinag.mvvm_databinging_dagger2.ui.viewmodel.GithubViewModel;
import es.amarinag.mvvm_databinging_dagger2.ui.widget.itemdecorator.DividerItemDecoration;
import javax.inject.Inject;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class GithubFragment extends BaseFragment {
  private FragmentGithubBinding binding;
  @Inject
  GithubViewModel githubViewModel;
  @Inject
  ReposAdapter reposAdapter;

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    binding = FragmentGithubBinding.inflate(inflater, container, false);
    binding.setGithubModel(githubViewModel);
    reposAdapter.fakeData(11);
    reposAdapter.setOnItemClickListener((view, item) -> Toast.makeText(getContext(), item, Toast.LENGTH_SHORT).show());
    binding.githubReycler.setAdapter(reposAdapter);
    binding.githubReycler.addItemDecoration(new DividerItemDecoration(getActivity()));
    binding.githubReycler.setLayoutManager(new LinearLayoutManager(getActivity()));
    //storeAdapter.setOnItemClickListener((view, item) -> Snackbar.make(binding.getRoot(), item.toString(), Snackbar.LENGTH_SHORT).show());
    //loadData();
    return binding.getRoot();
  }

  @Override protected void inject() {
    getComponent().inject(this);
  }
}
