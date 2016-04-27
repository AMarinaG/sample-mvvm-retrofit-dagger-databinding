package es.amarinag.mvvm_databinging_dagger2.ui.viewmodel;

import android.view.View;
import android.widget.Toast;
import es.amarinag.mvvm_databinging_dagger2.di.ForActivity;
import javax.inject.Inject;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class GithubViewModel {

  public void clickHelloWorld(View view){
    Toast.makeText(view.getContext(), "Hello World!! c[_]", Toast.LENGTH_SHORT).show();
  }
  @Inject
  @ForActivity
  public GithubViewModel() {
  }
}
