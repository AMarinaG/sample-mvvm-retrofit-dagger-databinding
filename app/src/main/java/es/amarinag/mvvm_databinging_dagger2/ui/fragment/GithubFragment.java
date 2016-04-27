package es.amarinag.mvvm_databinging_dagger2.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.amarinag.mvvm_databinging_dagger2.databinding.FragmentGithubBinding;
import es.amarinag.mvvm_databinging_dagger2.ui.viewmodel.GithubViewModel;
import javax.inject.Inject;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class GithubFragment extends BaseFragment {
  private FragmentGithubBinding binding;
  @Inject
  GithubViewModel githubViewModel;

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    binding = FragmentGithubBinding.inflate(inflater, container, false);
    binding.setGithubModel(githubViewModel);
    //storeAdapter = new StoreAdapter(getActivity());
    //binding.storeRecycler.setAdapter(storeAdapter);
    //binding.storeRecycler.addItemDecoration(new DividerItemDecoration(getActivity()));
    //binding.storeRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
    //storeAdapter.setOnItemClickListener((view, item) -> Snackbar.make(binding.getRoot(), item.toString(), Snackbar.LENGTH_SHORT).show());
    //loadData();
    return binding.getRoot();
  }

  @Override protected void inject() {
    getComponent().inject(this);
  }
}
