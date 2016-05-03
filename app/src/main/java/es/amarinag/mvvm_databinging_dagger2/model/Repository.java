package es.amarinag.mvvm_databinging_dagger2.model;

/**
 * Created by AMarinaG on 27/04/2016.
 */
public class Repository {
  private String name;
  private Owner owner;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  @Override public String toString() {
    return "{\"Repository\":{"
        + "\"name\":\"" + name + "\""
        + ", \"owner\":" + owner
        + "}}";
  }
}
