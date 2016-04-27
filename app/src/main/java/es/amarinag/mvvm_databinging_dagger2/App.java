package es.amarinag.mvvm_databinging_dagger2;

import android.app.Application;
import android.util.Log;

/**
 * Created by alcorce on 27/04/2016.
 */
public class App extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    Log.i(getClass().getSimpleName(), "start App");
  }
}
