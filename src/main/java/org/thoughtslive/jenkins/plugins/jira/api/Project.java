
package org.thoughtslive.jenkins.plugins.jira.api;

import java.io.Serializable;

import org.kohsuke.stapler.DataBoundConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor(onConstructor = @__({@DataBoundConstructor}))
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Project implements Serializable {

	private final static long serialVersionUID = -2732936022079989665L;

	@JsonProperty("self")
	private String self;

	@JsonProperty("id")
	private String id;

	@JsonProperty("key")
	private String key;

	@JsonProperty("name")
	private String name;

	@JsonProperty("projectCategory")
	private ProjectCategory projectCategory;

}