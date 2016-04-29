package es.amarinag.mvvm_databinging_dagger2.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.amarinag.mvvm_databinging_dagger2.databinding.FragmentRepositoryDetailBinding;
import es.amarinag.mvvm_databinging_dagger2.ui.viewmodel.RepositoryDetailViewModel;
import javax.inject.Inject;
import timber.log.Timber;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class RepositoryDetailFragment extends BaseFragment {
  public static final String ARG_REPOSITORY = "ARG_REPOSITORY";
  public static final String ARG_OWNER = "ARG_OWNER";
  private FragmentRepositoryDetailBinding binding;

  @Inject
  RepositoryDetailViewModel repositoryDetailViewModel;

  @Override public void onResume() {
    super.onResume();
    Timber.wtf("Hemos salido en pausa!!!!");
    if(null!=getArguments())
    repositoryDetailViewModel.refreshData(
        getArguments().getString(ARG_OWNER, "pepe"),
        getArguments().getString(ARG_REPOSITORY, "pepe Repo")
    );
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    binding = FragmentRepositoryDetailBinding.inflate(inflater, container, false);
    binding.setRepositoryDetailViewModel(repositoryDetailViewModel);
    return binding.getRoot();
  }

  @Override public void onPause() {
    super.onPause();
    Timber.wtf("Hemos entrado en pausa!!!!");
  }

  @Override
  protected void inject() {
    getComponent().inject(this);
  }
}
