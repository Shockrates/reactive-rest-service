package com.example.reactiverestservice.Models.CardModels;

//-----------------------------------com.example.RelatedUris.java-----------------------------------



import java.util.HashMap;
import java.util.Map;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"gatherer",
"tcgplayer_decks",
"edhrec",
"mtgtop8"
})
@Embeddable
// @Entity
public class RelatedUris {

@JsonProperty("gatherer")
private String gatherer;
@JsonProperty("tcgplayer_decks")
private String tcgplayerDecks;
@JsonProperty("edhrec")
private String edhrec;
@JsonProperty("mtgtop8")
private String mtgtop8;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("gatherer")
public String getGatherer() {
return gatherer;
}

@JsonProperty("gatherer")
public void setGatherer(String gatherer) {
this.gatherer = gatherer;
}

@JsonProperty("tcgplayer_decks")
public String getTcgplayerDecks() {
return tcgplayerDecks;
}

@JsonProperty("tcgplayer_decks")
public void setTcgplayerDecks(String tcgplayerDecks) {
this.tcgplayerDecks = tcgplayerDecks;
}

@JsonProperty("edhrec")
public String getEdhrec() {
return edhrec;
}

@JsonProperty("edhrec")
public void setEdhrec(String edhrec) {
this.edhrec = edhrec;
}

@JsonProperty("mtgtop8")
public String getMtgtop8() {
return mtgtop8;
}

@JsonProperty("mtgtop8")
public void setMtgtop8(String mtgtop8) {
this.mtgtop8 = mtgtop8;
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
