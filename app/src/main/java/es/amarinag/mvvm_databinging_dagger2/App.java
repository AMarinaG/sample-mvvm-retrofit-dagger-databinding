package es.amarinag.mvvm_databinging_dagger2;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.facebook.stetho.Stetho;
import es.amarinag.mvvm_databinging_dagger2.di.component.ApplicationComponent;
import rx.schedulers.Schedulers;
import timber.log.Timber;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class App extends Application {
  private ApplicationComponent applicationComponent;

  @Override
  public void onCreate() {
    super.onCreate();
    Timber.plant(new Timber.DebugTree());
    Timber.i("c[_]");
    applicationComponent = createComponent();
    Stetho.initializeWithDefaults(this);
  }

  private ApplicationComponent createComponent() {
    applicationComponent = ApplicationComponent.Initializer.init(this);
    applicationComponent.inject(this);
    return applicationComponent;
  }

  public ApplicationComponent getComponent() {
    if (applicationComponent == null) {
      createComponent();
    }
    return applicationComponent;
  }

  public static App get(Context context) {
    return (App) context.getApplicationContext();
  }
}
