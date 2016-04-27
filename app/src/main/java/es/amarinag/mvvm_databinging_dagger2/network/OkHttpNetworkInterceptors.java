package es.amarinag.mvvm_databinging_dagger2.network;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by AMarinaG on 27/04/2016.
 */
@Documented
@Qualifier
@Retention(RUNTIME)
public @interface OkHttpNetworkInterceptors {
}
