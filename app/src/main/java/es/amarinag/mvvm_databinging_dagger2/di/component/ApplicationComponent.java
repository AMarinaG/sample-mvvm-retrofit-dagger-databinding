package es.amarinag.mvvm_databinging_dagger2.di.component;

import android.content.Context;
import android.view.LayoutInflater;
import dagger.Component;
import es.amarinag.mvvm_databinging_dagger2.App;
import es.amarinag.mvvm_databinging_dagger2.di.ForApplication;
import es.amarinag.mvvm_databinging_dagger2.di.module.AndroidModule;
import es.amarinag.mvvm_databinging_dagger2.di.module.ApplicationModule;
import es.amarinag.mvvm_databinging_dagger2.network.NetworkModule;
import es.amarinag.mvvm_databinging_dagger2.util.GsonModule;
import javax.inject.Singleton;

/**
 * Created by AMarinaG on 27/04/2016.
 */
@Singleton
@Component(modules = {
    ApplicationModule.class,
    AndroidModule.class,
    GsonModule.class,
    NetworkModule.class
})
public interface ApplicationComponent {
  @ForApplication Context provideContext();

  LayoutInflater provideLayoutInflater();

  void inject(App app);

  final class Initializer {
    public static ApplicationComponent init(App app) {
      return DaggerApplicationComponent.builder()
          .androidModule(new AndroidModule())
          .applicationModule(new ApplicationModule(app))
          .build();
    }
  }
}
