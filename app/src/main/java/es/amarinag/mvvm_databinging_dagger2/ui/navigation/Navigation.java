package es.amarinag.mvvm_databinging_dagger2.ui.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import es.amarinag.mvvm_databinging_dagger2.BuildConfig;
import es.amarinag.mvvm_databinging_dagger2.R;
import es.amarinag.mvvm_databinging_dagger2.ui.activity.MainActivity;
import es.amarinag.mvvm_databinging_dagger2.ui.fragment.GithubFragment;
import es.amarinag.mvvm_databinging_dagger2.ui.fragment.RepositoryDetailFragment;
import javax.inject.Inject;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class Navigation {
  private MainActivity activity;
  private FragmentManager fragmentManager;

  @Inject
  public Navigation(MainActivity activity, FragmentManager fragmentManager) {
    this.activity = activity;
    this.fragmentManager = fragmentManager;
  }

  public void firstFragent() {
    fragmentManager.beginTransaction().replace(
        R.id.main_content, new GithubFragment(), "GithubFragment").commit();
  }

  public void showFragment(Fragment fragment) {
    fragmentManager.beginTransaction()
        .replace(R.id.main_content, fragment, fragment.getClass().getSimpleName())
        .addToBackStack(BuildConfig.APPLICATION_ID)
        .commit();
  }

  public void showFragment(Fragment fragment, Bundle args) {
    fragment.setArguments(args);
    fragmentManager.beginTransaction()
        .replace(R.id.main_content, fragment, fragment.getClass().getSimpleName())
        .addToBackStack(BuildConfig.APPLICATION_ID)
        .commit();
  }
}
