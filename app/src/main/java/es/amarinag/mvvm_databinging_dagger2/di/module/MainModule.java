package es.amarinag.mvvm_databinging_dagger2.di.module;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import es.amarinag.mvvm_databinging_dagger2.di.ForActivity;
import es.amarinag.mvvm_databinging_dagger2.ui.activity.MainActivity;

/**
 * Created by AMarinaG on 27/04/2016.
 */
@Module
@ForActivity
public class MainModule {
  private MainActivity activity;

  public MainModule(MainActivity activity) {
    this.activity = activity;
  }

  @Provides
  protected MainActivity activity() {
    return activity;
  }
  @ForActivity
  @Provides Context provideContext(){
    return activity;
  }
}
