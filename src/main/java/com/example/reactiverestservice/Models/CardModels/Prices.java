package com.example.reactiverestservice.Models.CardModels;

//-----------------------------------com.example.Prices.java-----------------------------------



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
"usd",
"usd_foil",
"eur",
"eur_foil",
"tix"
})
@Embeddable
// @Entity
public class Prices {

@JsonProperty("usd")
private String usd;
@JsonProperty("usd_foil")
private Object usdFoil;
@JsonProperty("eur")
private String eur;
@JsonProperty("eur_foil")
private Object eurFoil;
@JsonProperty("tix")
private Object tix;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("usd")
public String getUsd() {
return usd;
}

@JsonProperty("usd")
public void setUsd(String usd) {
this.usd = usd;
}

@JsonProperty("usd_foil")
public Object getUsdFoil() {
return usdFoil;
}

@JsonProperty("usd_foil")
public void setUsdFoil(Object usdFoil) {
this.usdFoil = usdFoil;
}

@JsonProperty("eur")
public String getEur() {
return eur;
}

@JsonProperty("eur")
public void setEur(String eur) {
this.eur = eur;
}

@JsonProperty("eur_foil")
public Object getEurFoil() {
return eurFoil;
}

@JsonProperty("eur_foil")
public void setEurFoil(Object eurFoil) {
this.eurFoil = eurFoil;
}

@JsonProperty("tix")
public Object getTix() {
return tix;
}

@JsonProperty("tix")
public void setTix(Object tix) {
this.tix = tix;
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