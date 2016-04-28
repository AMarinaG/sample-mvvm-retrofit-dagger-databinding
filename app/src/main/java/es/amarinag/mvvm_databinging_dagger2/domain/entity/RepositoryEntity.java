package es.amarinag.mvvm_databinging_dagger2.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by AMarinaG on 28/04/2016.
 */
public class RepositoryEntity {
  @SerializedName("id")
  @Expose
  public int id;
  @SerializedName("name")
  @Expose
  public String name;
  @SerializedName("full_name")
  @Expose
  public String fullName;
  @SerializedName("owner")
  @Expose
  public OwnerEntity owner;
  @SerializedName("private")
  @Expose
  public Boolean _private;
  @SerializedName("html_url")
  @Expose
  public String htmlUrl;
  @SerializedName("description")
  @Expose
  public String description;
  @SerializedName("fork")
  @Expose
  public Boolean fork;
  @SerializedName("url")
  @Expose
  public String url;
  @SerializedName("forks_url")
  @Expose
  public String forksUrl;
  @SerializedName("keys_url")
  @Expose
  public String keysUrl;
  @SerializedName("collaborators_url")
  @Expose
  public String collaboratorsUrl;
  @SerializedName("teams_url")
  @Expose
  public String teamsUrl;
  @SerializedName("hooks_url")
  @Expose
  public String hooksUrl;
  @SerializedName("issue_events_url")
  @Expose
  public String issueEventsUrl;
  @SerializedName("events_url")
  @Expose
  public String eventsUrl;
  @SerializedName("assignees_url")
  @Expose
  public String assigneesUrl;
  @SerializedName("branches_url")
  @Expose
  public String branchesUrl;
  @SerializedName("tags_url")
  @Expose
  public String tagsUrl;
  @SerializedName("blobs_url")
  @Expose
  public String blobsUrl;
  @SerializedName("git_tags_url")
  @Expose
  public String gitTagsUrl;
  @SerializedName("git_refs_url")
  @Expose
  public String gitRefsUrl;
  @SerializedName("trees_url")
  @Expose
  public String treesUrl;
  @SerializedName("statuses_url")
  @Expose
  public String statusesUrl;
  @SerializedName("languages_url")
  @Expose
  public String languagesUrl;
  @SerializedName("stargazers_url")
  @Expose
  public String stargazersUrl;
  @SerializedName("contributors_url")
  @Expose
  public String contributorsUrl;
  @SerializedName("subscribers_url")
  @Expose
  public String subscribersUrl;
  @SerializedName("subscription_url")
  @Expose
  public String subscriptionUrl;
  @SerializedName("commits_url")
  @Expose
  public String commitsUrl;
  @SerializedName("git_commits_url")
  @Expose
  public String gitCommitsUrl;
  @SerializedName("comments_url")
  @Expose
  public String commentsUrl;
  @SerializedName("issue_comment_url")
  @Expose
  public String issueCommentUrl;
  @SerializedName("contents_url")
  @Expose
  public String contentsUrl;
  @SerializedName("compare_url")
  @Expose
  public String compareUrl;
  @SerializedName("merges_url")
  @Expose
  public String mergesUrl;
  @SerializedName("archive_url")
  @Expose
  public String archiveUrl;
  @SerializedName("downloads_url")
  @Expose
  public String downloadsUrl;
  @SerializedName("issues_url")
  @Expose
  public String issuesUrl;
  @SerializedName("pulls_url")
  @Expose
  public String pullsUrl;
  @SerializedName("milestones_url")
  @Expose
  public String milestonesUrl;
  @SerializedName("notifications_url")
  @Expose
  public String notificationsUrl;
  @SerializedName("labels_url")
  @Expose
  public String labelsUrl;
  @SerializedName("releases_url")
  @Expose
  public String releasesUrl;
  @SerializedName("deployments_url")
  @Expose
  public String deploymentsUrl;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public OwnerEntity getOwner() {
    return owner;
  }

  public void setOwner(OwnerEntity owner) {
    this.owner = owner;
  }

  public Boolean get_private() {
    return _private;
  }

  public void set_private(Boolean _private) {
    this._private = _private;
  }

  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getFork() {
    return fork;
  }

  public void setFork(Boolean fork) {
    this.fork = fork;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getForksUrl() {
    return forksUrl;
  }

  public void setForksUrl(String forksUrl) {
    this.forksUrl = forksUrl;
  }

  public String getKeysUrl() {
    return keysUrl;
  }

  public void setKeysUrl(String keysUrl) {
    this.keysUrl = keysUrl;
  }

  public String getCollaboratorsUrl() {
    return collaboratorsUrl;
  }

  public void setCollaboratorsUrl(String collaboratorsUrl) {
    this.collaboratorsUrl = collaboratorsUrl;
  }

  public String getTeamsUrl() {
    return teamsUrl;
  }

  public void setTeamsUrl(String teamsUrl) {
    this.teamsUrl = teamsUrl;
  }

  public String getHooksUrl() {
    return hooksUrl;
  }

  public void setHooksUrl(String hooksUrl) {
    this.hooksUrl = hooksUrl;
  }

  public String getIssueEventsUrl() {
    return issueEventsUrl;
  }

  public void setIssueEventsUrl(String issueEventsUrl) {
    this.issueEventsUrl = issueEventsUrl;
  }

  public String getEventsUrl() {
    return eventsUrl;
  }

  public void setEventsUrl(String eventsUrl) {
    this.eventsUrl = eventsUrl;
  }

  public String getAssigneesUrl() {
    return assigneesUrl;
  }

  public void setAssigneesUrl(String assigneesUrl) {
    this.assigneesUrl = assigneesUrl;
  }

  public String getBranchesUrl() {
    return branchesUrl;
  }

  public void setBranchesUrl(String branchesUrl) {
    this.branchesUrl = branchesUrl;
  }

  public String getTagsUrl() {
    return tagsUrl;
  }

  public void setTagsUrl(String tagsUrl) {
    this.tagsUrl = tagsUrl;
  }

  public String getBlobsUrl() {
    return blobsUrl;
  }

  public void setBlobsUrl(String blobsUrl) {
    this.blobsUrl = blobsUrl;
  }

  public String getGitTagsUrl() {
    return gitTagsUrl;
  }

  public void setGitTagsUrl(String gitTagsUrl) {
    this.gitTagsUrl = gitTagsUrl;
  }

  public String getGitRefsUrl() {
    return gitRefsUrl;
  }

  public void setGitRefsUrl(String gitRefsUrl) {
    this.gitRefsUrl = gitRefsUrl;
  }

  public String getTreesUrl() {
    return treesUrl;
  }

  public void setTreesUrl(String treesUrl) {
    this.treesUrl = treesUrl;
  }

  public String getStatusesUrl() {
    return statusesUrl;
  }

  public void setStatusesUrl(String statusesUrl) {
    this.statusesUrl = statusesUrl;
  }

  public String getLanguagesUrl() {
    return languagesUrl;
  }

  public void setLanguagesUrl(String languagesUrl) {
    this.languagesUrl = languagesUrl;
  }

  public String getStargazersUrl() {
    return stargazersUrl;
  }

  public void setStargazersUrl(String stargazersUrl) {
    this.stargazersUrl = stargazersUrl;
  }

  public String getContributorsUrl() {
    return contributorsUrl;
  }

  public void setContributorsUrl(String contributorsUrl) {
    this.contributorsUrl = contributorsUrl;
  }

  public String getSubscribersUrl() {
    return subscribersUrl;
  }

  public void setSubscribersUrl(String subscribersUrl) {
    this.subscribersUrl = subscribersUrl;
  }

  public String getSubscriptionUrl() {
    return subscriptionUrl;
  }

  public void setSubscriptionUrl(String subscriptionUrl) {
    this.subscriptionUrl = subscriptionUrl;
  }

  public String getCommitsUrl() {
    return commitsUrl;
  }

  public void setCommitsUrl(String commitsUrl) {
    this.commitsUrl = commitsUrl;
  }

  public String getGitCommitsUrl() {
    return gitCommitsUrl;
  }

  public void setGitCommitsUrl(String gitCommitsUrl) {
    this.gitCommitsUrl = gitCommitsUrl;
  }

  public String getCommentsUrl() {
    return commentsUrl;
  }

  public void setCommentsUrl(String commentsUrl) {
    this.commentsUrl = commentsUrl;
  }

  public String getIssueCommentUrl() {
    return issueCommentUrl;
  }

  public void setIssueCommentUrl(String issueCommentUrl) {
    this.issueCommentUrl = issueCommentUrl;
  }

  public String getContentsUrl() {
    return contentsUrl;
  }

  public void setContentsUrl(String contentsUrl) {
    this.contentsUrl = contentsUrl;
  }

  public String getCompareUrl() {
    return compareUrl;
  }

  public void setCompareUrl(String compareUrl) {
    this.compareUrl = compareUrl;
  }

  public String getMergesUrl() {
    return mergesUrl;
  }

  public void setMergesUrl(String mergesUrl) {
    this.mergesUrl = mergesUrl;
  }

  public String getArchiveUrl() {
    return archiveUrl;
  }

  public void setArchiveUrl(String archiveUrl) {
    this.archiveUrl = archiveUrl;
  }

  public String getDownloadsUrl() {
    return downloadsUrl;
  }

  public void setDownloadsUrl(String downloadsUrl) {
    this.downloadsUrl = downloadsUrl;
  }

  public String getIssuesUrl() {
    return issuesUrl;
  }

  public void setIssuesUrl(String issuesUrl) {
    this.issuesUrl = issuesUrl;
  }

  public String getPullsUrl() {
    return pullsUrl;
  }

  public void setPullsUrl(String pullsUrl) {
    this.pullsUrl = pullsUrl;
  }

  public String getMilestonesUrl() {
    return milestonesUrl;
  }

  public void setMilestonesUrl(String milestonesUrl) {
    this.milestonesUrl = milestonesUrl;
  }

  public String getNotificationsUrl() {
    return notificationsUrl;
  }

  public void setNotificationsUrl(String notificationsUrl) {
    this.notificationsUrl = notificationsUrl;
  }

  public String getLabelsUrl() {
    return labelsUrl;
  }

  public void setLabelsUrl(String labelsUrl) {
    this.labelsUrl = labelsUrl;
  }

  public String getReleasesUrl() {
    return releasesUrl;
  }

  public void setReleasesUrl(String releasesUrl) {
    this.releasesUrl = releasesUrl;
  }

  public String getDeploymentsUrl() {
    return deploymentsUrl;
  }

  public void setDeploymentsUrl(String deploymentsUrl) {
    this.deploymentsUrl = deploymentsUrl;
  }

  @Override public String toString() {
    return "{\"RepositoryEntity\":{"
        + "\"id\":\"" + id + "\""
        + ", \"name\":\"" + name + "\""
        + ", \"fullName\":\"" + fullName + "\""
        + ", \"owner\":" + owner
        + ", \"_private\":\"" + _private + "\""
        + ", \"htmlUrl\":\"" + htmlUrl + "\""
        + ", \"description\":\"" + description + "\""
        + ", \"fork\":\"" + fork + "\""
        + ", \"url\":\"" + url + "\""
        + ", \"forksUrl\":\"" + forksUrl + "\""
        + ", \"keysUrl\":\"" + keysUrl + "\""
        + ", \"collaboratorsUrl\":\"" + collaboratorsUrl + "\""
        + ", \"teamsUrl\":\"" + teamsUrl + "\""
        + ", \"hooksUrl\":\"" + hooksUrl + "\""
        + ", \"issueEventsUrl\":\"" + issueEventsUrl + "\""
        + ", \"eventsUrl\":\"" + eventsUrl + "\""
        + ", \"assigneesUrl\":\"" + assigneesUrl + "\""
        + ", \"branchesUrl\":\"" + branchesUrl + "\""
        + ", \"tagsUrl\":\"" + tagsUrl + "\""
        + ", \"blobsUrl\":\"" + blobsUrl + "\""
        + ", \"gitTagsUrl\":\"" + gitTagsUrl + "\""
        + ", \"gitRefsUrl\":\"" + gitRefsUrl + "\""
        + ", \"treesUrl\":\"" + treesUrl + "\""
        + ", \"statusesUrl\":\"" + statusesUrl + "\""
        + ", \"languagesUrl\":\"" + languagesUrl + "\""
        + ", \"stargazersUrl\":\"" + stargazersUrl + "\""
        + ", \"contributorsUrl\":\"" + contributorsUrl + "\""
        + ", \"subscribersUrl\":\"" + subscribersUrl + "\""
        + ", \"subscriptionUrl\":\"" + subscriptionUrl + "\""
        + ", \"commitsUrl\":\"" + commitsUrl + "\""
        + ", \"gitCommitsUrl\":\"" + gitCommitsUrl + "\""
        + ", \"commentsUrl\":\"" + commentsUrl + "\""
        + ", \"issueCommentUrl\":\"" + issueCommentUrl + "\""
        + ", \"contentsUrl\":\"" + contentsUrl + "\""
        + ", \"compareUrl\":\"" + compareUrl + "\""
        + ", \"mergesUrl\":\"" + mergesUrl + "\""
        + ", \"archiveUrl\":\"" + archiveUrl + "\""
        + ", \"downloadsUrl\":\"" + downloadsUrl + "\""
        + ", \"issuesUrl\":\"" + issuesUrl + "\""
        + ", \"pullsUrl\":\"" + pullsUrl + "\""
        + ", \"milestonesUrl\":\"" + milestonesUrl + "\""
        + ", \"notificationsUrl\":\"" + notificationsUrl + "\""
        + ", \"labelsUrl\":\"" + labelsUrl + "\""
        + ", \"releasesUrl\":\"" + releasesUrl + "\""
        + ", \"deploymentsUrl\":\"" + deploymentsUrl + "\""
        + "}}";
  }
}
