package es.amarinag.mvvm_databinging_dagger2.network;

import android.support.annotation.NonNull;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import dagger.Module;
import dagger.Provides;
import java.util.List;
import javax.inject.Singleton;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import timber.log.Timber;

import static java.util.Collections.singletonList;

/**
 * Created by AMarinaG on 27/04/2016.
 */
@Module
public class OkHttpInterceptorsModule {
  @Provides
  @Singleton
  @NonNull
  public HttpLoggingInterceptor provideHttpLoggingInterceptor() {
    return new HttpLoggingInterceptor(message -> Timber.d(message));
  }

  @Provides
  @OkHttpInterceptors
  @Singleton
  @NonNull
  public List<Interceptor> provideOkHttpInterceptors(@NonNull HttpLoggingInterceptor httpLoggingInterceptor) {
    return singletonList(httpLoggingInterceptor);
  }

  @Provides
  @OkHttpNetworkInterceptors
  @Singleton
  @NonNull
  public List<Interceptor> provideOkHttpNetworkInterceptors() {
    return singletonList(new StethoInterceptor());
  }
}
