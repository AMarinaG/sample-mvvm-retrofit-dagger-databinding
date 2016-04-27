package es.amarinag.mvvm_databinging_dagger2.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import es.amarinag.mvvm_databinging_dagger2.App;
import es.amarinag.mvvm_databinging_dagger2.R;
import es.amarinag.mvvm_databinging_dagger2.databinding.ActivityMainBinding;
import es.amarinag.mvvm_databinging_dagger2.di.component.DaggerMainComponent;
import es.amarinag.mvvm_databinging_dagger2.di.component.MainComponent;
import es.amarinag.mvvm_databinging_dagger2.di.module.MainModule;
import es.amarinag.mvvm_databinging_dagger2.ui.fragment.GithubFragment;

public class MainActivity extends AppCompatActivity {
  MainComponent component;
  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    injectModule();
    getSupportFragmentManager().beginTransaction().replace(R.id.main_content, new GithubFragment()).commit();
  }

  private void injectModule() {
    component = DaggerMainComponent.builder().applicationComponent(App.get(this).getComponent()).mainModule(new MainModule(this)).build();
    component.inject(this);
  }

  public MainComponent getComponent() {
    return component;
  }

}
