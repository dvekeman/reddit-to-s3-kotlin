package com.upwork.reddit.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
		"contest_mode",
		"banned_by",
		"domain",
		"subreddit",
		"selftext_html",
		"selftext",
		"likes",
		"suggested_sort",
		"user_reports",
		"secure_media",
		"saved",
		"id",
		"gilded",
		"secure_media_embed",
		"clicked",
		"report_reasons",
		"author",
		"media",
		"name",
		"score",
		"approved_by",
		"over_18",
		"removal_reason",
		"hidden",
		"thumbnail",
		"subreddit_id",
		"edited",
		"link_flair_css_class",
		"author_flair_css_class",
		"downs",
		"mod_reports",
		"archived",
		"media_embed",
		"is_self",
		"hide_score",
		"permalink",
		"locked",
		"stickied",
		"created",
		"url",
		"author_flair_text",
		"quarantine",
		"title",
		"created_utc",
		"link_flair_text",
		"distinguished",
		"num_comments",
		"visited",
		"num_reports",
		"ups"
})
public class Data_ {

	@JsonProperty("contest_mode")
	private Boolean contestMode;
	@JsonProperty("banned_by")
	private Object bannedBy;
	@JsonProperty("domain")
	private String domain;
	@JsonProperty("subreddit")
	private String subreddit;
	@JsonProperty("selftext_html")
	private Object selftextHtml;
	@JsonProperty("selftext")
	private String selftext;
	@JsonProperty("likes")
	private Object likes;
	@JsonProperty("suggested_sort")
	private Object suggestedSort;
	@JsonProperty("user_reports")
	private List<Object> userReports = new ArrayList<Object>();
	@JsonProperty("secure_media")
	private SecureMedia secureMedia;
	@JsonProperty("saved")
	private Boolean saved;
	@JsonProperty("id")
	private String id;
	@JsonProperty("gilded")
	private Integer gilded;
	@JsonProperty("secure_media_embed")
	private SecureMediaEmbed secureMediaEmbed;
	@JsonProperty("clicked")
	private Boolean clicked;
	@JsonProperty("report_reasons")
	private Object reportReasons;
	@JsonProperty("author")
	private String author;
	@JsonProperty("media")
	private Media media;
	@JsonProperty("name")
	private String name;
	@JsonProperty("score")
	private Integer score;
	@JsonProperty("approved_by")
	private Object approvedBy;
	@JsonProperty("over_18")
	private Boolean over18;
	@JsonProperty("removal_reason")
	private Object removalReason;
	@JsonProperty("hidden")
	private Boolean hidden;
	@JsonProperty("thumbnail")
	private String thumbnail;
	@JsonProperty("subreddit_id")
	private String subredditId;
	@JsonProperty("edited")
	private Boolean edited;
	@JsonProperty("link_flair_css_class")
	private Object linkFlairCssClass;
	@JsonProperty("author_flair_css_class")
	private Object authorFlairCssClass;
	@JsonProperty("downs")
	private Integer downs;
	@JsonProperty("mod_reports")
	private List<Object> modReports = new ArrayList<Object>();
	@JsonProperty("archived")
	private Boolean archived;
	@JsonProperty("media_embed")
	private MediaEmbed mediaEmbed;
	@JsonProperty("is_self")
	private Boolean isSelf;
	@JsonProperty("hide_score")
	private Boolean hideScore;
	@JsonProperty("permalink")
	private String permalink;
	@JsonProperty("locked")
	private Boolean locked;
	@JsonProperty("stickied")
	private Boolean stickied;
	@JsonProperty("created")
	private Double created;
	@JsonProperty("url")
	private String url;
	@JsonProperty("author_flair_text")
	private Object authorFlairText;
	@JsonProperty("quarantine")
	private Boolean quarantine;
	@JsonProperty("title")
	private String title;
	@JsonProperty("created_utc")
	private Double createdUtc;
	@JsonProperty("link_flair_text")
	private Object linkFlairText;
	@JsonProperty("distinguished")
	private Object distinguished;
	@JsonProperty("num_comments")
	private Integer numComments;
	@JsonProperty("visited")
	private Boolean visited;
	@JsonProperty("num_reports")
	private Object numReports;
	@JsonProperty("ups")
	private Integer ups;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * @return The contestMode
	 */
	@JsonProperty("contest_mode")
	public Boolean getContestMode() {
		return contestMode;
	}

	/**
	 * @param contestMode The contest_mode
	 */
	@JsonProperty("contest_mode")
	public void setContestMode(Boolean contestMode) {
		this.contestMode = contestMode;
	}

	/**
	 * @return The bannedBy
	 */
	@JsonProperty("banned_by")
	public Object getBannedBy() {
		return bannedBy;
	}

	/**
	 * @param bannedBy The banned_by
	 */
	@JsonProperty("banned_by")
	public void setBannedBy(Object bannedBy) {
		this.bannedBy = bannedBy;
	}

	/**
	 * @return The domain
	 */
	@JsonProperty("domain")
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain The domain
	 */
	@JsonProperty("domain")
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return The subreddit
	 */
	@JsonProperty("subreddit")
	public String getSubreddit() {
		return subreddit;
	}

	/**
	 * @param subreddit The subreddit
	 */
	@JsonProperty("subreddit")
	public void setSubreddit(String subreddit) {
		this.subreddit = subreddit;
	}

	/**
	 * @return The selftextHtml
	 */
	@JsonProperty("selftext_html")
	public Object getSelftextHtml() {
		return selftextHtml;
	}

	/**
	 * @param selftextHtml The selftext_html
	 */
	@JsonProperty("selftext_html")
	public void setSelftextHtml(Object selftextHtml) {
		this.selftextHtml = selftextHtml;
	}

	/**
	 * @return The selftext
	 */
	@JsonProperty("selftext")
	public String getSelftext() {
		return selftext;
	}

	/**
	 * @param selftext The selftext
	 */
	@JsonProperty("selftext")
	public void setSelftext(String selftext) {
		this.selftext = selftext;
	}

	/**
	 * @return The likes
	 */
	@JsonProperty("likes")
	public Object getLikes() {
		return likes;
	}

	/**
	 * @param likes The likes
	 */
	@JsonProperty("likes")
	public void setLikes(Object likes) {
		this.likes = likes;
	}

	/**
	 * @return The suggestedSort
	 */
	@JsonProperty("suggested_sort")
	public Object getSuggestedSort() {
		return suggestedSort;
	}

	/**
	 * @param suggestedSort The suggested_sort
	 */
	@JsonProperty("suggested_sort")
	public void setSuggestedSort(Object suggestedSort) {
		this.suggestedSort = suggestedSort;
	}

	/**
	 * @return The userReports
	 */
	@JsonProperty("user_reports")
	public List<Object> getUserReports() {
		return userReports;
	}

	/**
	 * @param userReports The user_reports
	 */
	@JsonProperty("user_reports")
	public void setUserReports(List<Object> userReports) {
		this.userReports = userReports;
	}

	/**
	 * @return The secureMedia
	 */
	@JsonProperty("secure_media")
	public SecureMedia getSecureMedia() {
		return secureMedia;
	}

	/**
	 * @param secureMedia The secure_media
	 */
	@JsonProperty("secure_media")
	public void setSecureMedia(SecureMedia secureMedia) {
		this.secureMedia = secureMedia;
	}

	/**
	 * @return The saved
	 */
	@JsonProperty("saved")
	public Boolean getSaved() {
		return saved;
	}

	/**
	 * @param saved The saved
	 */
	@JsonProperty("saved")
	public void setSaved(Boolean saved) {
		this.saved = saved;
	}

	/**
	 * @return The id
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * @param id The id
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return The gilded
	 */
	@JsonProperty("gilded")
	public Integer getGilded() {
		return gilded;
	}

	/**
	 * @param gilded The gilded
	 */
	@JsonProperty("gilded")
	public void setGilded(Integer gilded) {
		this.gilded = gilded;
	}

	/**
	 * @return The secureMediaEmbed
	 */
	@JsonProperty("secure_media_embed")
	public SecureMediaEmbed getSecureMediaEmbed() {
		return secureMediaEmbed;
	}

	/**
	 * @param secureMediaEmbed The secure_media_embed
	 */
	@JsonProperty("secure_media_embed")
	public void setSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
		this.secureMediaEmbed = secureMediaEmbed;
	}

	/**
	 * @return The clicked
	 */
	@JsonProperty("clicked")
	public Boolean getClicked() {
		return clicked;
	}

	/**
	 * @param clicked The clicked
	 */
	@JsonProperty("clicked")
	public void setClicked(Boolean clicked) {
		this.clicked = clicked;
	}

	/**
	 * @return The reportReasons
	 */
	@JsonProperty("report_reasons")
	public Object getReportReasons() {
		return reportReasons;
	}

	/**
	 * @param reportReasons The report_reasons
	 */
	@JsonProperty("report_reasons")
	public void setReportReasons(Object reportReasons) {
		this.reportReasons = reportReasons;
	}

	/**
	 * @return The author
	 */
	@JsonProperty("author")
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author The author
	 */
	@JsonProperty("author")
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return The media
	 */
	@JsonProperty("media")
	public Media getMedia() {
		return media;
	}

	/**
	 * @param media The media
	 */
	@JsonProperty("media")
	public void setMedia(Media media) {
		this.media = media;
	}

	/**
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * @param name The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The score
	 */
	@JsonProperty("score")
	public Integer getScore() {
		return score;
	}

	/**
	 * @param score The score
	 */
	@JsonProperty("score")
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * @return The approvedBy
	 */
	@JsonProperty("approved_by")
	public Object getApprovedBy() {
		return approvedBy;
	}

	/**
	 * @param approvedBy The approved_by
	 */
	@JsonProperty("approved_by")
	public void setApprovedBy(Object approvedBy) {
		this.approvedBy = approvedBy;
	}

	/**
	 * @return The over18
	 */
	@JsonProperty("over_18")
	public Boolean getOver18() {
		return over18;
	}

	/**
	 * @param over18 The over_18
	 */
	@JsonProperty("over_18")
	public void setOver18(Boolean over18) {
		this.over18 = over18;
	}

	/**
	 * @return The removalReason
	 */
	@JsonProperty("removal_reason")
	public Object getRemovalReason() {
		return removalReason;
	}

	/**
	 * @param removalReason The removal_reason
	 */
	@JsonProperty("removal_reason")
	public void setRemovalReason(Object removalReason) {
		this.removalReason = removalReason;
	}

	/**
	 * @return The hidden
	 */
	@JsonProperty("hidden")
	public Boolean getHidden() {
		return hidden;
	}

	/**
	 * @param hidden The hidden
	 */
	@JsonProperty("hidden")
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	/**
	 * @return The thumbnail
	 */
	@JsonProperty("thumbnail")
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * @param thumbnail The thumbnail
	 */
	@JsonProperty("thumbnail")
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	/**
	 * @return The subredditId
	 */
	@JsonProperty("subreddit_id")
	public String getSubredditId() {
		return subredditId;
	}

	/**
	 * @param subredditId The subreddit_id
	 */
	@JsonProperty("subreddit_id")
	public void setSubredditId(String subredditId) {
		this.subredditId = subredditId;
	}

	/**
	 * @return The edited
	 */
	@JsonProperty("edited")
	public Boolean getEdited() {
		return edited;
	}

	/**
	 * @param edited The edited
	 */
	@JsonProperty("edited")
	public void setEdited(Boolean edited) {
		this.edited = edited;
	}

	/**
	 * @return The linkFlairCssClass
	 */
	@JsonProperty("link_flair_css_class")
	public Object getLinkFlairCssClass() {
		return linkFlairCssClass;
	}

	/**
	 * @param linkFlairCssClass The link_flair_css_class
	 */
	@JsonProperty("link_flair_css_class")
	public void setLinkFlairCssClass(Object linkFlairCssClass) {
		this.linkFlairCssClass = linkFlairCssClass;
	}

	/**
	 * @return The authorFlairCssClass
	 */
	@JsonProperty("author_flair_css_class")
	public Object getAuthorFlairCssClass() {
		return authorFlairCssClass;
	}

	/**
	 * @param authorFlairCssClass The author_flair_css_class
	 */
	@JsonProperty("author_flair_css_class")
	public void setAuthorFlairCssClass(Object authorFlairCssClass) {
		this.authorFlairCssClass = authorFlairCssClass;
	}

	/**
	 * @return The downs
	 */
	@JsonProperty("downs")
	public Integer getDowns() {
		return downs;
	}

	/**
	 * @param downs The downs
	 */
	@JsonProperty("downs")
	public void setDowns(Integer downs) {
		this.downs = downs;
	}

	/**
	 * @return The modReports
	 */
	@JsonProperty("mod_reports")
	public List<Object> getModReports() {
		return modReports;
	}

	/**
	 * @param modReports The mod_reports
	 */
	@JsonProperty("mod_reports")
	public void setModReports(List<Object> modReports) {
		this.modReports = modReports;
	}

	/**
	 * @return The archived
	 */
	@JsonProperty("archived")
	public Boolean getArchived() {
		return archived;
	}

	/**
	 * @param archived The archived
	 */
	@JsonProperty("archived")
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

	/**
	 * @return The mediaEmbed
	 */
	@JsonProperty("media_embed")
	public MediaEmbed getMediaEmbed() {
		return mediaEmbed;
	}

	/**
	 * @param mediaEmbed The media_embed
	 */
	@JsonProperty("media_embed")
	public void setMediaEmbed(MediaEmbed mediaEmbed) {
		this.mediaEmbed = mediaEmbed;
	}

	/**
	 * @return The isSelf
	 */
	@JsonProperty("is_self")
	public Boolean getIsSelf() {
		return isSelf;
	}

	/**
	 * @param isSelf The is_self
	 */
	@JsonProperty("is_self")
	public void setIsSelf(Boolean isSelf) {
		this.isSelf = isSelf;
	}

	/**
	 * @return The hideScore
	 */
	@JsonProperty("hide_score")
	public Boolean getHideScore() {
		return hideScore;
	}

	/**
	 * @param hideScore The hide_score
	 */
	@JsonProperty("hide_score")
	public void setHideScore(Boolean hideScore) {
		this.hideScore = hideScore;
	}

	/**
	 * @return The permalink
	 */
	@JsonProperty("permalink")
	public String getPermalink() {
		return permalink;
	}

	/**
	 * @param permalink The permalink
	 */
	@JsonProperty("permalink")
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	/**
	 * @return The locked
	 */
	@JsonProperty("locked")
	public Boolean getLocked() {
		return locked;
	}

	/**
	 * @param locked The locked
	 */
	@JsonProperty("locked")
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	/**
	 * @return The stickied
	 */
	@JsonProperty("stickied")
	public Boolean getStickied() {
		return stickied;
	}

	/**
	 * @param stickied The stickied
	 */
	@JsonProperty("stickied")
	public void setStickied(Boolean stickied) {
		this.stickied = stickied;
	}

	/**
	 * @return The created
	 */
	@JsonProperty("created")
	public Double getCreated() {
		return created;
	}

	/**
	 * @param created The created
	 */
	@JsonProperty("created")
	public void setCreated(Double created) {
		this.created = created;
	}

	/**
	 * @return The url
	 */
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	/**
	 * @param url The url
	 */
	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return The authorFlairText
	 */
	@JsonProperty("author_flair_text")
	public Object getAuthorFlairText() {
		return authorFlairText;
	}

	/**
	 * @param authorFlairText The author_flair_text
	 */
	@JsonProperty("author_flair_text")
	public void setAuthorFlairText(Object authorFlairText) {
		this.authorFlairText = authorFlairText;
	}

	/**
	 * @return The quarantine
	 */
	@JsonProperty("quarantine")
	public Boolean getQuarantine() {
		return quarantine;
	}

	/**
	 * @param quarantine The quarantine
	 */
	@JsonProperty("quarantine")
	public void setQuarantine(Boolean quarantine) {
		this.quarantine = quarantine;
	}

	/**
	 * @return The title
	 */
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	/**
	 * @param title The title
	 */
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return The createdUtc
	 */
	@JsonProperty("created_utc")
	public Double getCreatedUtc() {
		return createdUtc;
	}

	/**
	 * @param createdUtc The created_utc
	 */
	@JsonProperty("created_utc")
	public void setCreatedUtc(Double createdUtc) {
		this.createdUtc = createdUtc;
	}

	/**
	 * @return The linkFlairText
	 */
	@JsonProperty("link_flair_text")
	public Object getLinkFlairText() {
		return linkFlairText;
	}

	/**
	 * @param linkFlairText The link_flair_text
	 */
	@JsonProperty("link_flair_text")
	public void setLinkFlairText(Object linkFlairText) {
		this.linkFlairText = linkFlairText;
	}

	/**
	 * @return The distinguished
	 */
	@JsonProperty("distinguished")
	public Object getDistinguished() {
		return distinguished;
	}

	/**
	 * @param distinguished The distinguished
	 */
	@JsonProperty("distinguished")
	public void setDistinguished(Object distinguished) {
		this.distinguished = distinguished;
	}

	/**
	 * @return The numComments
	 */
	@JsonProperty("num_comments")
	public Integer getNumComments() {
		return numComments;
	}

	/**
	 * @param numComments The num_comments
	 */
	@JsonProperty("num_comments")
	public void setNumComments(Integer numComments) {
		this.numComments = numComments;
	}

	/**
	 * @return The visited
	 */
	@JsonProperty("visited")
	public Boolean getVisited() {
		return visited;
	}

	/**
	 * @param visited The visited
	 */
	@JsonProperty("visited")
	public void setVisited(Boolean visited) {
		this.visited = visited;
	}

	/**
	 * @return The numReports
	 */
	@JsonProperty("num_reports")
	public Object getNumReports() {
		return numReports;
	}

	/**
	 * @param numReports The num_reports
	 */
	@JsonProperty("num_reports")
	public void setNumReports(Object numReports) {
		this.numReports = numReports;
	}

	/**
	 * @return The ups
	 */
	@JsonProperty("ups")
	public Integer getUps() {
		return ups;
	}

	/**
	 * @param ups The ups
	 */
	@JsonProperty("ups")
	public void setUps(Integer ups) {
		this.ups = ups;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}