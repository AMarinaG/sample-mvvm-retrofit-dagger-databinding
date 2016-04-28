package es.amarinag.mvvm_databinging_dagger2.model;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class GithubOwner {
  private String login;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  @Override public String toString() {
    return "{\"GithubOwner\":{"
        + "\"login\":\"" + login + "\""
        + "}}";
  }
}
