package com.upwork.reddit.model;

import java.util.HashMap;
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
		"provider_url",
		"description",
		"title",
		"type",
		"thumbnail_width",
		"height",
		"width",
		"html",
		"author_name",
		"version",
		"provider_name",
		"thumbnail_url",
		"thumbnail_height",
		"author_url"
})
public class Oembed_ {

	@JsonProperty("provider_url")
	private String providerUrl;
	@JsonProperty("description")
	private String description;
	@JsonProperty("title")
	private String title;
	@JsonProperty("type")
	private String type;
	@JsonProperty("thumbnail_width")
	private Integer thumbnailWidth;
	@JsonProperty("height")
	private Integer height;
	@JsonProperty("width")
	private Integer width;
	@JsonProperty("html")
	private String html;
	@JsonProperty("author_name")
	private String authorName;
	@JsonProperty("version")
	private String version;
	@JsonProperty("provider_name")
	private String providerName;
	@JsonProperty("thumbnail_url")
	private String thumbnailUrl;
	@JsonProperty("thumbnail_height")
	private Integer thumbnailHeight;
	@JsonProperty("author_url")
	private String authorUrl;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * @return The providerUrl
	 */
	@JsonProperty("provider_url")
	public String getProviderUrl() {
		return providerUrl;
	}

	/**
	 * @param providerUrl The provider_url
	 */
	@JsonProperty("provider_url")
	public void setProviderUrl(String providerUrl) {
		this.providerUrl = providerUrl;
	}

	/**
	 * @return The description
	 */
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	/**
	 * @param description The description
	 */
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
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
	 * @return The type
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	/**
	 * @param type The type
	 */
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return The thumbnailWidth
	 */
	@JsonProperty("thumbnail_width")
	public Integer getThumbnailWidth() {
		return thumbnailWidth;
	}

	/**
	 * @param thumbnailWidth The thumbnail_width
	 */
	@JsonProperty("thumbnail_width")
	public void setThumbnailWidth(Integer thumbnailWidth) {
		this.thumbnailWidth = thumbnailWidth;
	}

	/**
	 * @return The height
	 */
	@JsonProperty("height")
	public Integer getHeight() {
		return height;
	}

	/**
	 * @param height The height
	 */
	@JsonProperty("height")
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * @return The width
	 */
	@JsonProperty("width")
	public Integer getWidth() {
		return width;
	}

	/**
	 * @param width The width
	 */
	@JsonProperty("width")
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * @return The html
	 */
	@JsonProperty("html")
	public String getHtml() {
		return html;
	}

	/**
	 * @param html The html
	 */
	@JsonProperty("html")
	public void setHtml(String html) {
		this.html = html;
	}

	/**
	 * @return The authorName
	 */
	@JsonProperty("author_name")
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * @param authorName The author_name
	 */
	@JsonProperty("author_name")
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * @return The version
	 */
	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	/**
	 * @param version The version
	 */
	@JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return The providerName
	 */
	@JsonProperty("provider_name")
	public String getProviderName() {
		return providerName;
	}

	/**
	 * @param providerName The provider_name
	 */
	@JsonProperty("provider_name")
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	/**
	 * @return The thumbnailUrl
	 */
	@JsonProperty("thumbnail_url")
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	/**
	 * @param thumbnailUrl The thumbnail_url
	 */
	@JsonProperty("thumbnail_url")
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	/**
	 * @return The thumbnailHeight
	 */
	@JsonProperty("thumbnail_height")
	public Integer getThumbnailHeight() {
		return thumbnailHeight;
	}

	/**
	 * @param thumbnailHeight The thumbnail_height
	 */
	@JsonProperty("thumbnail_height")
	public void setThumbnailHeight(Integer thumbnailHeight) {
		this.thumbnailHeight = thumbnailHeight;
	}

	/**
	 * @return The authorUrl
	 */
	@JsonProperty("author_url")
	public String getAuthorUrl() {
		return authorUrl;
	}

	/**
	 * @param authorUrl The author_url
	 */
	@JsonProperty("author_url")
	public void setAuthorUrl(String authorUrl) {
		this.authorUrl = authorUrl;
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