package es.amarinag.mvvm_databinging_dagger2.di.module;

import android.app.Application;
import android.view.LayoutInflater;
import dagger.Module;
import dagger.Provides;
import es.amarinag.mvvm_databinging_dagger2.di.ForApplication;

/**
 * Created by AMarinaG on 27/04/2016.
 */
@Module
public class AndroidModule {
  @Provides
  public LayoutInflater provideLayoutInflater(@ForApplication Application application) {
    return LayoutInflater.from(application);
  }
}
