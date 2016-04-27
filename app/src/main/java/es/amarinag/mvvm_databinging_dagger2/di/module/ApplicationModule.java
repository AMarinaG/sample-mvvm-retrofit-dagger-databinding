package es.amarinag.mvvm_databinging_dagger2.di.module;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import es.amarinag.mvvm_databinging_dagger2.App;
import es.amarinag.mvvm_databinging_dagger2.di.ForApplication;
import javax.inject.Singleton;

/**
 * Created by AMarinaG on 27/04/2016.
 */
@Module
public class ApplicationModule {
  private App application;

  public ApplicationModule(App application) {
    this.application = application;
  }
  @ForApplication
  @Provides
  @Singleton
  public Application provideApplication() {
    return application;
  }

  @ForApplication
  @Provides
  @Singleton
  public App provideApp() {
    return application;
  }

  @ForApplication
  @Provides
  @Singleton
  public Context provideContext() {
    return application.getApplicationContext();
  }
}
