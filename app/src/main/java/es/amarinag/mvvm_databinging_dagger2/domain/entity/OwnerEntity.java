package es.amarinag.mvvm_databinging_dagger2.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class OwnerEntity {
  @SerializedName("login")
  @Expose
  public String login;
  @SerializedName("id")
  @Expose
  public Integer id;
  @SerializedName("avatar_url")
  @Expose
  public String avatarUrl;
  @SerializedName("gravatar_id")
  @Expose
  public String gravatarId;
  @SerializedName("url")
  @Expose
  public String url;
  @SerializedName("html_url")
  @Expose
  public String htmlUrl;
  @SerializedName("followers_url")
  @Expose
  public String followersUrl;
  @SerializedName("following_url")
  @Expose
  public String followingUrl;
  @SerializedName("gists_url")
  @Expose
  public String gistsUrl;
  @SerializedName("starred_url")
  @Expose
  public String starredUrl;
  @SerializedName("subscriptions_url")
  @Expose
  public String subscriptionsUrl;
  @SerializedName("organizations_url")
  @Expose
  public String organizationsUrl;
  @SerializedName("repos_url")
  @Expose
  public String reposUrl;
  @SerializedName("events_url")
  @Expose
  public String eventsUrl;
  @SerializedName("received_events_url")
  @Expose
  public String receivedEventsUrl;
  @SerializedName("type")
  @Expose
  public String type;
  @SerializedName("site_admin")
  @Expose
  public Boolean siteAdmin;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getGravatarId() {
    return gravatarId;
  }

  public void setGravatarId(String gravatarId) {
    this.gravatarId = gravatarId;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public String getFollowersUrl() {
    return followersUrl;
  }

  public void setFollowersUrl(String followersUrl) {
    this.followersUrl = followersUrl;
  }

  public String getFollowingUrl() {
    return followingUrl;
  }

  public void setFollowingUrl(String followingUrl) {
    this.followingUrl = followingUrl;
  }

  public String getGistsUrl() {
    return gistsUrl;
  }

  public void setGistsUrl(String gistsUrl) {
    this.gistsUrl = gistsUrl;
  }

  public String getStarredUrl() {
    return starredUrl;
  }

  public void setStarredUrl(String starredUrl) {
    this.starredUrl = starredUrl;
  }

  public String getSubscriptionsUrl() {
    return subscriptionsUrl;
  }

  public void setSubscriptionsUrl(String subscriptionsUrl) {
    this.subscriptionsUrl = subscriptionsUrl;
  }

  public String getOrganizationsUrl() {
    return organizationsUrl;
  }

  public void setOrganizationsUrl(String organizationsUrl) {
    this.organizationsUrl = organizationsUrl;
  }

  public String getReposUrl() {
    return reposUrl;
  }

  public void setReposUrl(String reposUrl) {
    this.reposUrl = reposUrl;
  }

  public String getEventsUrl() {
    return eventsUrl;
  }

  public void setEventsUrl(String eventsUrl) {
    this.eventsUrl = eventsUrl;
  }

  public String getReceivedEventsUrl() {
    return receivedEventsUrl;
  }

  public void setReceivedEventsUrl(String receivedEventsUrl) {
    this.receivedEventsUrl = receivedEventsUrl;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Boolean getSiteAdmin() {
    return siteAdmin;
  }

  public void setSiteAdmin(Boolean siteAdmin) {
    this.siteAdmin = siteAdmin;
  }

  @Override public String toString() {
    return "{\"OwnerEntity\":{"
        + "\"login\":\"" + login + "\""
        + ", \"id\":\"" + id + "\""
        + ", \"avatarUrl\":\"" + avatarUrl + "\""
        + ", \"gravatarId\":\"" + gravatarId + "\""
        + ", \"url\":\"" + url + "\""
        + ", \"htmlUrl\":\"" + htmlUrl + "\""
        + ", \"followersUrl\":\"" + followersUrl + "\""
        + ", \"followingUrl\":\"" + followingUrl + "\""
        + ", \"gistsUrl\":\"" + gistsUrl + "\""
        + ", \"starredUrl\":\"" + starredUrl + "\""
        + ", \"subscriptionsUrl\":\"" + subscriptionsUrl + "\""
        + ", \"organizationsUrl\":\"" + organizationsUrl + "\""
        + ", \"reposUrl\":\"" + reposUrl + "\""
        + ", \"eventsUrl\":\"" + eventsUrl + "\""
        + ", \"receivedEventsUrl\":\"" + receivedEventsUrl + "\""
        + ", \"type\":\"" + type + "\""
        + ", \"siteAdmin\":\"" + siteAdmin + "\""
        + "}}";
  }
}
