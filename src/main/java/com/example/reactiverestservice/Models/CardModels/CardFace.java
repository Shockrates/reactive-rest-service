package com.example.reactiverestservice.Models.CardModels;

//-----------------------------------com.example.CardFace.java-----------------------------------


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
"object",
"name",
"mana_cost",
"type_line",
"oracle_text",
"artist",
"artist_id",
"illustration_id"
})
public class CardFace {

@JsonProperty("object")
private String object;
@JsonProperty("name")
private String name;
@JsonProperty("mana_cost")
private String manaCost;
@JsonProperty("type_line")
private String typeLine;
@JsonProperty("oracle_text")
private String oracleText;
@JsonProperty("artist")
private String artist;
@JsonProperty("artist_id")
private String artistId;
@JsonProperty("illustration_id")
private String illustrationId;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("object")
public String getObject() {
return object;
}

@JsonProperty("object")
public void setObject(String object) {
this.object = object;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("mana_cost")
public String getManaCost() {
return manaCost;
}

@JsonProperty("mana_cost")
public void setManaCost(String manaCost) {
this.manaCost = manaCost;
}

@JsonProperty("type_line")
public String getTypeLine() {
return typeLine;
}

@JsonProperty("type_line")
public void setTypeLine(String typeLine) {
this.typeLine = typeLine;
}

@JsonProperty("oracle_text")
public String getOracleText() {
return oracleText;
}

@JsonProperty("oracle_text")
public void setOracleText(String oracleText) {
this.oracleText = oracleText;
}

@JsonProperty("artist")
public String getArtist() {
return artist;
}

@JsonProperty("artist")
public void setArtist(String artist) {
this.artist = artist;
}

@JsonProperty("artist_id")
public String getArtistId() {
return artistId;
}

@JsonProperty("artist_id")
public void setArtistId(String artistId) {
this.artistId = artistId;
}

@JsonProperty("illustration_id")
public String getIllustrationId() {
return illustrationId;
}

@JsonProperty("illustration_id")
public void setIllustrationId(String illustrationId) {
this.illustrationId = illustrationId;
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