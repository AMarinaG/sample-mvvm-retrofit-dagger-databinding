# Basic **MVVM** + **databinding** + **dagger2** + **observable**

Tired of examples MVP ??

_Basic architecture_ of **MVVM** using **dagger2** , **retrofit2**, **androidbinding** and **RxAndroid**


**_Any help will be welcome and appreciated._**

## Used libraries

| Library  | Obs |
|---|---|
| [Dagger 2](http://google.github.io/dagger/)  |  **D**ependency **I**njection |
| [Retrofit 2](http://square.github.io/retrofit/) | Type-safe **HTTP client** |
| [Android Binding (native)](http://developer.android.com/intl/es/tools/data-binding/guide.html) | **Bind** your application **logic** and **layouts** |
| [RxAndroid](https://github.com/ReactiveX/RxAndroid), [RxJava](https://github.com/ReactiveX/RxJava) | Asynchronous and event-based programs using **observable pattern** |
| [Gson](https://github.com/google/gson) |JSON parser|
| [Stetho](http://facebook.github.io/stetho/) |A **debug** bridge for Android applications|
| [Retrolambda](https://github.com/evant/gradle-retrolambda) |**Java8** for android, _Gradle plugin_|
| [Timber](https://github.com/JakeWharton/timber) | A **log**ger |


## TODO LIST 
- Look way to evade `new Adapter()` and use android binding for _create adapter and view_
- Fix bug retrolambda <--> junit
- Learn how to wait for data of recyclerView with espresso

## WISH LIST :P

- Add code review
- add ci config like travis (can compile in cl --> `gradlew tasks` to show availables tasks)
- improve this readme. :D
- automated this readme, and documentation