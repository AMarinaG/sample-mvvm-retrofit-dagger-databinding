package es.amarinag.mvvm_databinging_dagger2.util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import java.text.DateFormat;
import javax.inject.Singleton;

/**
 * Created by AMarinaG on 27/04/2016.
 */
@Module
public class GsonModule {
  @Provides
  @Singleton
  public GsonBuilder provideDefaultGsonBuilder() {
    GsonBuilder gsonBuilder = new GsonBuilder();

    gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
    gsonBuilder.setDateFormat(DateFormat.FULL);
    return gsonBuilder;
  }

  @Provides
  @Singleton Gson provideGson(GsonBuilder gsonBuilder) {
    return gsonBuilder.create();
  }
}
