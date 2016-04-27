package es.amarinag.mvvm_databinging_dagger2.di.component;

import dagger.Component;
import es.amarinag.mvvm_databinging_dagger2.di.ForActivity;
import es.amarinag.mvvm_databinging_dagger2.di.module.MainModule;
import es.amarinag.mvvm_databinging_dagger2.ui.activity.MainActivity;

/**
 * Created by AMarinaG on 27/04/2016.
 */
@ForActivity
@Component(dependencies = ApplicationComponent.class, modules = MainModule.class)
public interface MainComponent {

  void inject(MainActivity activity);
}
