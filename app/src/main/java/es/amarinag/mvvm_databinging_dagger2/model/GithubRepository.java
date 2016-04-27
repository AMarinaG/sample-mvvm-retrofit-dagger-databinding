package es.amarinag.mvvm_databinging_dagger2.model;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class GithubRepository {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override public String toString() {
    return "{\"GithubRepository\":{"
        + "\"name\":\"" + name + "\""
        + "}}";
  }
}
