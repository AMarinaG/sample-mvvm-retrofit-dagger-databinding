package es.amarinag.mvvm_databinging_dagger2.ui.fragment;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.v4.app.Fragment;
import es.amarinag.mvvm_databinging_dagger2.di.component.MainComponent;
import es.amarinag.mvvm_databinging_dagger2.ui.activity.MainActivity;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public abstract class BaseFragment extends Fragment {
  protected String TAG = getClass().getSimpleName();
  @CallSuper
  @Override
  public void onCreate(Bundle bundle) {
    super.onCreate(bundle);
    inject();
  }

  protected abstract void inject();
  protected MainComponent getComponent(){
    return ((MainActivity)getActivity()).getComponent();
  }
}
