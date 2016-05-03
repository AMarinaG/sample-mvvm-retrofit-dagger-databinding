package es.amarinag.mvvm_databinging_dagger2.network;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import es.amarinag.mvvm_databinging_dagger2.App;
import es.amarinag.mvvm_databinging_dagger2.BuildConfig;
import es.amarinag.mvvm_databinging_dagger2.di.ForApplication;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by AMarinaG on 27/04/2016.
 */
@Module
public class NetworkModule {

  static final int DISK_CACHE_SIZE = (int) 1_000_000L;

  private final App app;

  public NetworkModule(App app) {
    this.app = app;
  }

  @Provides
  @Singleton
  public OkHttpClient provideOkHttpClient(@ForApplication Context app,
      @OkHttpInterceptors @NonNull List<Interceptor> interceptors,
      @OkHttpNetworkInterceptors @NonNull List<Interceptor> networkInterceptors) {

    File cacheDir = new File(app.getCacheDir(), "http");
    Cache cache = new Cache(cacheDir, DISK_CACHE_SIZE);

    final OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();

    for (Interceptor interceptor : interceptors) {
      okHttpBuilder.addInterceptor(interceptor);
    }

    for (Interceptor networkInterceptor : networkInterceptors) {
      okHttpBuilder.addNetworkInterceptor(networkInterceptor);
    }

    okHttpBuilder.cache(cache);
    okHttpBuilder.readTimeout(30, TimeUnit.SECONDS);
    okHttpBuilder.writeTimeout(30, TimeUnit.SECONDS);
    okHttpBuilder.connectTimeout(30, TimeUnit.SECONDS);

    return okHttpBuilder.build();

  }

  @Provides
  @Singleton
  public Retrofit provideRestAdapter(@NonNull OkHttpClient okHttpClient, @NonNull Gson gson) {
    return new Retrofit.Builder()
        .baseUrl(BuildConfig.API_ENDPOINT_LOCAL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .build();
  }



}
