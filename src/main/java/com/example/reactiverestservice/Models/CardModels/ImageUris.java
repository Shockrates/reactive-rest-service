

//----------------------------------com.example.ImageUris.java-----------------------------------

package com.example.reactiverestservice.Models.CardModels;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"small",
"normal",
"large",
"png",
"art_crop",
"border_crop"
})
public class ImageUris {

@JsonProperty("small")
private String small;
@JsonProperty("normal")
private String normal;
@JsonProperty("large")
private String large;
@JsonProperty("png")
private String png;
@JsonProperty("art_crop")
private String artCrop;
@JsonProperty("border_crop")
private String borderCrop;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("small")
public String getSmall() {
return small;
}

@JsonProperty("small")
public void setSmall(String small) {
this.small = small;
}

@JsonProperty("normal")
public String getNormal() {
return normal;
}

@JsonProperty("normal")
public void setNormal(String normal) {
this.normal = normal;
}

@JsonProperty("large")
public String getLarge() {
return large;
}

@JsonProperty("large")
public void setLarge(String large) {
this.large = large;
}

@JsonProperty("png")
public String getPng() {
return png;
}

@JsonProperty("png")
public void setPng(String png) {
this.png = png;
}

@JsonProperty("art_crop")
public String getArtCrop() {
return artCrop;
}

@JsonProperty("art_crop")
public void setArtCrop(String artCrop) {
this.artCrop = artCrop;
}

@JsonProperty("border_crop")
public String getBorderCrop() {
return borderCrop;
}

@JsonProperty("border_crop")
public void setBorderCrop(String borderCrop) {
this.borderCrop = borderCrop;
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
