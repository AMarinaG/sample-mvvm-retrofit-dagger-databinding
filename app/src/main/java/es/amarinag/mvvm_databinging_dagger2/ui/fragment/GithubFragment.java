package es.amarinag.mvvm_databinging_dagger2.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.amarinag.mvvm_databinging_dagger2.databinding.FragmentGithubBinding;
import es.amarinag.mvvm_databinging_dagger2.domain.repository.GithubRepository;
import es.amarinag.mvvm_databinging_dagger2.model.Repository;
import es.amarinag.mvvm_databinging_dagger2.ui.adapter.ReposAdapter;
import es.amarinag.mvvm_databinging_dagger2.ui.viewmodel.GithubViewModel;
import es.amarinag.mvvm_databinging_dagger2.ui.widget.itemdecorator.DividerItemDecoration;
import java.util.List;
import javax.inject.Inject;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class GithubFragment extends BaseFragment {
  private FragmentGithubBinding binding;
  @Inject
  GithubViewModel githubViewModel;


  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    binding = FragmentGithubBinding.inflate(inflater, container, false);
    binding.setGithubModel(githubViewModel);
    binding.githubReycler.setAdapter(githubViewModel.getReposAdapter());
    binding.githubReycler.addItemDecoration(new DividerItemDecoration(getActivity()));
    binding.githubReycler.setLayoutManager(new LinearLayoutManager(getActivity()));
    githubViewModel.loadData();
    return binding.getRoot();
  }

  @Override protected void inject() {
    getComponent().inject(this);
  }
}
