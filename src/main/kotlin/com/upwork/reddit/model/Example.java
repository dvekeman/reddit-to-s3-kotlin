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
		"kind",
		"data"
})
public class Example {

	@JsonProperty("kind")
	private String kind;
	@JsonProperty("data")
	private Data data;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * @return The kind
	 */
	@JsonProperty("kind")
	public String getKind() {
		return kind;
	}

	/**
	 * @param kind The kind
	 */
	@JsonProperty("kind")
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * @return The data
	 */
	@JsonProperty("data")
	public Data getData() {
		return data;
	}

	/**
	 * @param data The data
	 */
	@JsonProperty("data")
	public void setData(Data data) {
		this.data = data;
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