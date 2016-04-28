package es.amarinag.mvvm_databinging_dagger2.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.amarinag.mvvm_databinging_dagger2.databinding.FragmentRepositoryDetailBinding;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class RepositoryDetailFragment extends BaseFragment {
  private FragmentRepositoryDetailBinding binding;

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    binding = FragmentRepositoryDetailBinding.inflate(inflater, container, false);
    return binding.getRoot();
  }

  @Override
  protected void inject() {
    getComponent().inject(this);
  }
}
