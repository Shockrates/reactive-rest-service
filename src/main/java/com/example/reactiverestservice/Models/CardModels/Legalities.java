

//-----------------------------------com.example.Legalities.java-----------------------------------

package com.example.reactiverestservice.Models.CardModels;

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
"standard",
"future",
"historic",
"pioneer",
"modern",
"legacy",
"pauper",
"vintage",
"penny",
"commander",
"brawl",
"duel",
"oldschool"
})
@Embeddable
// @Entity
public class Legalities {

@JsonProperty("standard")
private String standard;
@JsonProperty("future")
private String future;
@JsonProperty("historic")
private String historic;
@JsonProperty("pioneer")
private String pioneer;
@JsonProperty("modern")
private String modern;
@JsonProperty("legacy")
private String legacy;
@JsonProperty("pauper")
private String pauper;
@JsonProperty("vintage")
private String vintage;
@JsonProperty("penny")
private String penny;
@JsonProperty("commander")
private String commander;
@JsonProperty("brawl")
private String brawl;
@JsonProperty("duel")
private String duel;
@JsonProperty("oldschool")
private String oldschool;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("standard")
public String getStandard() {
return standard;
}

@JsonProperty("standard")
public void setStandard(String standard) {
this.standard = standard;
}

@JsonProperty("future")
public String getFuture() {
return future;
}

@JsonProperty("future")
public void setFuture(String future) {
this.future = future;
}

@JsonProperty("historic")
public String getHistoric() {
return historic;
}

@JsonProperty("historic")
public void setHistoric(String historic) {
this.historic = historic;
}

@JsonProperty("pioneer")
public String getPioneer() {
return pioneer;
}

@JsonProperty("pioneer")
public void setPioneer(String pioneer) {
this.pioneer = pioneer;
}

@JsonProperty("modern")
public String getModern() {
return modern;
}

@JsonProperty("modern")
public void setModern(String modern) {
this.modern = modern;
}

@JsonProperty("legacy")
public String getLegacy() {
return legacy;
}

@JsonProperty("legacy")
public void setLegacy(String legacy) {
this.legacy = legacy;
}

@JsonProperty("pauper")
public String getPauper() {
return pauper;
}

@JsonProperty("pauper")
public void setPauper(String pauper) {
this.pauper = pauper;
}

@JsonProperty("vintage")
public String getVintage() {
return vintage;
}

@JsonProperty("vintage")
public void setVintage(String vintage) {
this.vintage = vintage;
}

@JsonProperty("penny")
public String getPenny() {
return penny;
}

@JsonProperty("penny")
public void setPenny(String penny) {
this.penny = penny;
}

@JsonProperty("commander")
public String getCommander() {
return commander;
}

@JsonProperty("commander")
public void setCommander(String commander) {
this.commander = commander;
}

@JsonProperty("brawl")
public String getBrawl() {
return brawl;
}

@JsonProperty("brawl")
public void setBrawl(String brawl) {
this.brawl = brawl;
}

@JsonProperty("duel")
public String getDuel() {
return duel;
}

@JsonProperty("duel")
public void setDuel(String duel) {
this.duel = duel;
}

@JsonProperty("oldschool")
public String getOldschool() {
return oldschool;
}

@JsonProperty("oldschool")
public void setOldschool(String oldschool) {
this.oldschool = oldschool;
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
