package es.amarinag.mvvm_databinging_dagger2.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import es.amarinag.mvvm_databinging_dagger2.App;
import es.amarinag.mvvm_databinging_dagger2.R;
import es.amarinag.mvvm_databinging_dagger2.di.component.DaggerMainComponent;
import es.amarinag.mvvm_databinging_dagger2.di.component.MainComponent;
import es.amarinag.mvvm_databinging_dagger2.di.module.MainModule;

public class MainActivity extends AppCompatActivity {
  MainComponent component;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    injectModule();
  }

  private void injectModule() {
    component = DaggerMainComponent.builder().applicationComponent(App.get(this).getComponent()).mainModule(new MainModule(this)).build();
    component.inject(this);
  }
}
