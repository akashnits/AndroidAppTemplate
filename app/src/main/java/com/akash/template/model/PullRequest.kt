package com.akash.template.model

import com.google.gson.annotations.SerializedName

data class PullRequest(

	@field:SerializedName("PullRequest")
	val pullRequest: List<PullRequestItem?>? = null
)

data class Issue(

	@field:SerializedName("href")
	val href: String? = null
)

data class Statuses(

	@field:SerializedName("href")
	val href: String? = null
)

data class Commits(

	@field:SerializedName("href")
	val href: String? = null
)

data class Base(

	@field:SerializedName("ref")
	val ref: String? = null,

	@field:SerializedName("repo")
	val repo: Repo? = null,

	@field:SerializedName("label")
	val label: String? = null,

	@field:SerializedName("sha")
	val sha: String? = null,

	@field:SerializedName("user")
	val user: User? = null
)

data class Links(

	@field:SerializedName("comments")
	val comments: Comments? = null,

	@field:SerializedName("issue")
	val issue: Issue? = null,

	@field:SerializedName("self")
	val self: Self? = null,

	@field:SerializedName("review_comments")
	val reviewComments: ReviewComments? = null,

	@field:SerializedName("commits")
	val commits: Commits? = null,

	@field:SerializedName("statuses")
	val statuses: Statuses? = null,

	@field:SerializedName("html")
	val html: Html? = null,

	@field:SerializedName("review_comment")
	val reviewComment: ReviewComment? = null
)

data class Self(

	@field:SerializedName("href")
	val href: String? = null
)

data class ReviewComments(

	@field:SerializedName("href")
	val href: String? = null
)

data class User(

	@field:SerializedName("gists_url")
	val gistsUrl: String? = null,

	@field:SerializedName("repos_url")
	val reposUrl: String? = null,

	@field:SerializedName("following_url")
	val followingUrl: String? = null,

	@field:SerializedName("starred_url")
	val starredUrl: String? = null,

	@field:SerializedName("login")
	val login: String? = null,

	@field:SerializedName("followers_url")
	val followersUrl: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("subscriptions_url")
	val subscriptionsUrl: String? = null,

	@field:SerializedName("received_events_url")
	val receivedEventsUrl: String? = null,

	@field:SerializedName("avatar_url")
	val avatarUrl: String? = null,

	@field:SerializedName("events_url")
	val eventsUrl: String? = null,

	@field:SerializedName("html_url")
	val htmlUrl: String? = null,

	@field:SerializedName("site_admin")
	val siteAdmin: Boolean? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("gravatar_id")
	val gravatarId: String? = null,

	@field:SerializedName("node_id")
	val nodeId: String? = null,

	@field:SerializedName("organizations_url")
	val organizationsUrl: String? = null
)

data class AssigneesItem(

	@field:SerializedName("gists_url")
	val gistsUrl: String? = null,

	@field:SerializedName("repos_url")
	val reposUrl: String? = null,

	@field:SerializedName("following_url")
	val followingUrl: String? = null,

	@field:SerializedName("starred_url")
	val starredUrl: String? = null,

	@field:SerializedName("login")
	val login: String? = null,

	@field:SerializedName("followers_url")
	val followersUrl: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("subscriptions_url")
	val subscriptionsUrl: String? = null,

	@field:SerializedName("received_events_url")
	val receivedEventsUrl: String? = null,

	@field:SerializedName("avatar_url")
	val avatarUrl: String? = null,

	@field:SerializedName("events_url")
	val eventsUrl: String? = null,

	@field:SerializedName("html_url")
	val htmlUrl: String? = null,

	@field:SerializedName("site_admin")
	val siteAdmin: Boolean? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("gravatar_id")
	val gravatarId: String? = null,

	@field:SerializedName("node_id")
	val nodeId: String? = null,

	@field:SerializedName("organizations_url")
	val organizationsUrl: String? = null
)

data class ReviewComment(

	@field:SerializedName("href")
	val href: String? = null
)

data class RequestedReviewersItem(

	@field:SerializedName("gists_url")
	val gistsUrl: String? = null,

	@field:SerializedName("repos_url")
	val reposUrl: String? = null,

	@field:SerializedName("following_url")
	val followingUrl: String? = null,

	@field:SerializedName("starred_url")
	val starredUrl: String? = null,

	@field:SerializedName("login")
	val login: String? = null,

	@field:SerializedName("followers_url")
	val followersUrl: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("subscriptions_url")
	val subscriptionsUrl: String? = null,

	@field:SerializedName("received_events_url")
	val receivedEventsUrl: String? = null,

	@field:SerializedName("avatar_url")
	val avatarUrl: String? = null,

	@field:SerializedName("events_url")
	val eventsUrl: String? = null,

	@field:SerializedName("html_url")
	val htmlUrl: String? = null,

	@field:SerializedName("site_admin")
	val siteAdmin: Boolean? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("gravatar_id")
	val gravatarId: String? = null,

	@field:SerializedName("node_id")
	val nodeId: String? = null,

	@field:SerializedName("organizations_url")
	val organizationsUrl: String? = null
)

data class Repo(

	@field:SerializedName("allow_forking")
	val allowForking: Boolean? = null,

	@field:SerializedName("stargazers_count")
	val stargazersCount: Int? = null,

	@field:SerializedName("is_template")
	val isTemplate: Boolean? = null,

	@field:SerializedName("pushed_at")
	val pushedAt: String? = null,

	@field:SerializedName("subscription_url")
	val subscriptionUrl: String? = null,

	@field:SerializedName("language")
	val language: String? = null,

	@field:SerializedName("branches_url")
	val branchesUrl: String? = null,

	@field:SerializedName("issue_comment_url")
	val issueCommentUrl: String? = null,

	@field:SerializedName("labels_url")
	val labelsUrl: String? = null,

	@field:SerializedName("subscribers_url")
	val subscribersUrl: String? = null,

	@field:SerializedName("releases_url")
	val releasesUrl: String? = null,

	@field:SerializedName("svn_url")
	val svnUrl: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("forks")
	val forks: Int? = null,

	@field:SerializedName("archive_url")
	val archiveUrl: String? = null,

	@field:SerializedName("git_refs_url")
	val gitRefsUrl: String? = null,

	@field:SerializedName("forks_url")
	val forksUrl: String? = null,

	@field:SerializedName("visibility")
	val visibility: String? = null,

	@field:SerializedName("statuses_url")
	val statusesUrl: String? = null,

	@field:SerializedName("ssh_url")
	val sshUrl: String? = null,

	@field:SerializedName("license")
	val license: License? = null,

	@field:SerializedName("full_name")
	val fullName: String? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("languages_url")
	val languagesUrl: String? = null,

	@field:SerializedName("html_url")
	val htmlUrl: String? = null,

	@field:SerializedName("collaborators_url")
	val collaboratorsUrl: String? = null,

	@field:SerializedName("clone_url")
	val cloneUrl: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("pulls_url")
	val pullsUrl: String? = null,

	@field:SerializedName("default_branch")
	val defaultBranch: String? = null,

	@field:SerializedName("hooks_url")
	val hooksUrl: String? = null,

	@field:SerializedName("trees_url")
	val treesUrl: String? = null,

	@field:SerializedName("tags_url")
	val tagsUrl: String? = null,

	@field:SerializedName("private")
	val jsonMemberPrivate: Boolean? = null,

	@field:SerializedName("contributors_url")
	val contributorsUrl: String? = null,

	@field:SerializedName("has_downloads")
	val hasDownloads: Boolean? = null,

	@field:SerializedName("notifications_url")
	val notificationsUrl: String? = null,

	@field:SerializedName("open_issues_count")
	val openIssuesCount: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("watchers")
	val watchers: Int? = null,

	@field:SerializedName("keys_url")
	val keysUrl: String? = null,

	@field:SerializedName("deployments_url")
	val deploymentsUrl: String? = null,

	@field:SerializedName("has_projects")
	val hasProjects: Boolean? = null,

	@field:SerializedName("archived")
	val archived: Boolean? = null,

	@field:SerializedName("has_wiki")
	val hasWiki: Boolean? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("comments_url")
	val commentsUrl: String? = null,

	@field:SerializedName("stargazers_url")
	val stargazersUrl: String? = null,

	@field:SerializedName("disabled")
	val disabled: Boolean? = null,

	@field:SerializedName("git_url")
	val gitUrl: String? = null,

	@field:SerializedName("has_pages")
	val hasPages: Boolean? = null,

	@field:SerializedName("owner")
	val owner: Owner? = null,

	@field:SerializedName("commits_url")
	val commitsUrl: String? = null,

	@field:SerializedName("compare_url")
	val compareUrl: String? = null,

	@field:SerializedName("git_commits_url")
	val gitCommitsUrl: String? = null,

	@field:SerializedName("topics")
	val topics: List<Any?>? = null,

	@field:SerializedName("blobs_url")
	val blobsUrl: String? = null,

	@field:SerializedName("git_tags_url")
	val gitTagsUrl: String? = null,

	@field:SerializedName("merges_url")
	val mergesUrl: String? = null,

	@field:SerializedName("downloads_url")
	val downloadsUrl: String? = null,

	@field:SerializedName("has_issues")
	val hasIssues: Boolean? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("contents_url")
	val contentsUrl: String? = null,

	@field:SerializedName("mirror_url")
	val mirrorUrl: Any? = null,

	@field:SerializedName("milestones_url")
	val milestonesUrl: String? = null,

	@field:SerializedName("teams_url")
	val teamsUrl: String? = null,

	@field:SerializedName("fork")
	val fork: Boolean? = null,

	@field:SerializedName("issues_url")
	val issuesUrl: String? = null,

	@field:SerializedName("events_url")
	val eventsUrl: String? = null,

	@field:SerializedName("issue_events_url")
	val issueEventsUrl: String? = null,

	@field:SerializedName("assignees_url")
	val assigneesUrl: String? = null,

	@field:SerializedName("open_issues")
	val openIssues: Int? = null,

	@field:SerializedName("watchers_count")
	val watchersCount: Int? = null,

	@field:SerializedName("node_id")
	val nodeId: String? = null,

	@field:SerializedName("homepage")
	val homepage: String? = null,

	@field:SerializedName("forks_count")
	val forksCount: Int? = null
)

data class PullRequestItem(

	@field:SerializedName("issue_url")
	val issueUrl: String? = null,

	@field:SerializedName("_links")
	val links: Links? = null,

	@field:SerializedName("diff_url")
	val diffUrl: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("assignees")
	val assignees: List<Any?>? = null,

	@field:SerializedName("requested_reviewers")
	val requestedReviewers: List<RequestedReviewersItem?>? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("body")
	val body: String? = null,

	@field:SerializedName("requested_teams")
	val requestedTeams: List<Any?>? = null,

	@field:SerializedName("head")
	val head: Head? = null,

	@field:SerializedName("author_association")
	val authorAssociation: String? = null,

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("patch_url")
	val patchUrl: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("draft")
	val draft: Boolean? = null,

	@field:SerializedName("merge_commit_sha")
	val mergeCommitSha: String? = null,

	@field:SerializedName("comments_url")
	val commentsUrl: String? = null,

	@field:SerializedName("review_comment_url")
	val reviewCommentUrl: String? = null,

	@field:SerializedName("active_lock_reason")
	val activeLockReason: Any? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("locked")
	val locked: Boolean? = null,

	@field:SerializedName("commits_url")
	val commitsUrl: String? = null,

	@field:SerializedName("closed_at")
	val closedAt: Any? = null,

	@field:SerializedName("statuses_url")
	val statusesUrl: String? = null,

	@field:SerializedName("merged_at")
	val mergedAt: Any? = null,

	@field:SerializedName("auto_merge")
	val autoMerge: Any? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("labels")
	val labels: List<LabelsItem?>? = null,

	@field:SerializedName("milestone")
	val milestone: Any? = null,

	@field:SerializedName("html_url")
	val htmlUrl: String? = null,

	@field:SerializedName("review_comments_url")
	val reviewCommentsUrl: String? = null,

	@field:SerializedName("assignee")
	val assignee: Any? = null,

	@field:SerializedName("user")
	val user: User? = null,

	@field:SerializedName("node_id")
	val nodeId: String? = null,

	@field:SerializedName("base")
	val base: Base? = null
)

data class LabelsItem(

	@field:SerializedName("default")
	val jsonMemberDefault: Boolean? = null,

	@field:SerializedName("color")
	val color: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("node_id")
	val nodeId: String? = null
)

data class Comments(

	@field:SerializedName("href")
	val href: String? = null
)

data class Assignee(

	@field:SerializedName("gists_url")
	val gistsUrl: String? = null,

	@field:SerializedName("repos_url")
	val reposUrl: String? = null,

	@field:SerializedName("following_url")
	val followingUrl: String? = null,

	@field:SerializedName("starred_url")
	val starredUrl: String? = null,

	@field:SerializedName("login")
	val login: String? = null,

	@field:SerializedName("followers_url")
	val followersUrl: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("subscriptions_url")
	val subscriptionsUrl: String? = null,

	@field:SerializedName("received_events_url")
	val receivedEventsUrl: String? = null,

	@field:SerializedName("avatar_url")
	val avatarUrl: String? = null,

	@field:SerializedName("events_url")
	val eventsUrl: String? = null,

	@field:SerializedName("html_url")
	val htmlUrl: String? = null,

	@field:SerializedName("site_admin")
	val siteAdmin: Boolean? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("gravatar_id")
	val gravatarId: String? = null,

	@field:SerializedName("node_id")
	val nodeId: String? = null,

	@field:SerializedName("organizations_url")
	val organizationsUrl: String? = null
)

data class Html(

	@field:SerializedName("href")
	val href: String? = null
)

data class License(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("spdx_id")
	val spdxId: String? = null,

	@field:SerializedName("key")
	val key: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("node_id")
	val nodeId: String? = null
)

data class Owner(

	@field:SerializedName("gists_url")
	val gistsUrl: String? = null,

	@field:SerializedName("repos_url")
	val reposUrl: String? = null,

	@field:SerializedName("following_url")
	val followingUrl: String? = null,

	@field:SerializedName("starred_url")
	val starredUrl: String? = null,

	@field:SerializedName("login")
	val login: String? = null,

	@field:SerializedName("followers_url")
	val followersUrl: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("subscriptions_url")
	val subscriptionsUrl: String? = null,

	@field:SerializedName("received_events_url")
	val receivedEventsUrl: String? = null,

	@field:SerializedName("avatar_url")
	val avatarUrl: String? = null,

	@field:SerializedName("events_url")
	val eventsUrl: String? = null,

	@field:SerializedName("html_url")
	val htmlUrl: String? = null,

	@field:SerializedName("site_admin")
	val siteAdmin: Boolean? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("gravatar_id")
	val gravatarId: String? = null,

	@field:SerializedName("node_id")
	val nodeId: String? = null,

	@field:SerializedName("organizations_url")
	val organizationsUrl: String? = null
)

data class Head(

	@field:SerializedName("ref")
	val ref: String? = null,

	@field:SerializedName("repo")
	val repo: Repo? = null,

	@field:SerializedName("label")
	val label: String? = null,

	@field:SerializedName("sha")
	val sha: String? = null,

	@field:SerializedName("user")
	val user: User? = null
)
