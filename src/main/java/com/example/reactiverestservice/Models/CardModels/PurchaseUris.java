package com.example.reactiverestservice.Models.CardModels;

//-----------------------------------com.example.PurchaseUris.java-----------------------------------



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
"tcgplayer",
"cardmarket",
"cardhoarder"
})
@Embeddable
// @Entity
public class PurchaseUris {

@JsonProperty("tcgplayer")
private String tcgplayer;
@JsonProperty("cardmarket")
private String cardmarket;
@JsonProperty("cardhoarder")
private String cardhoarder;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("tcgplayer")
public String getTcgplayer() {
return tcgplayer;
}

@JsonProperty("tcgplayer")
public void setTcgplayer(String tcgplayer) {
this.tcgplayer = tcgplayer;
}

@JsonProperty("cardmarket")
public String getCardmarket() {
return cardmarket;
}

@JsonProperty("cardmarket")
public void setCardmarket(String cardmarket) {
this.cardmarket = cardmarket;
}

@JsonProperty("cardhoarder")
public String getCardhoarder() {
return cardhoarder;
}

@JsonProperty("cardhoarder")
public void setCardhoarder(String cardhoarder) {
this.cardhoarder = cardhoarder;
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
