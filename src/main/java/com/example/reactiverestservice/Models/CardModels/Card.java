package com.example.reactiverestservice.Models.CardModels;

//-----------------------------------com.example.Example.java-----------------------------------



import java.util.HashMap;
import java.util.List;
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
"id",
"oracle_id",
"multiverse_ids",
"mtgo_id",
"tcgplayer_id",
"cardmarket_id",
"name",
"lang",
"released_at",
"uri",
"scryfall_uri",
"layout",
"highres_image",
"image_uris",
"mana_cost",
"cmc",
"type_line",
"colors",
"color_identity",
"keywords",
"card_faces",
"legalities",
"games",
"reserved",
"foil",
"nonfoil",
"oversized",
"promo",
"reprint",
"variation",
"set",
"set_name",
"set_type",
"set_uri",
"set_search_uri",
"scryfall_set_uri",
"rulings_uri",
"prints_search_uri",
"collector_number",
"digital",
"rarity",
"card_back_id",
"artist",
"artist_ids",
"illustration_id",
"border_color",
"frame",
"full_art",
"textless",
"booster",
"story_spotlight",
"edhrec_rank",
"prices",
"related_uris",
"purchase_uris"
})
public class Card {

@JsonProperty("object")
private String object;
@JsonProperty("id")
private String id;
@JsonProperty("oracle_id")
private String oracleId;
@JsonProperty("multiverse_ids")
private List<Integer> multiverseIds = null;
@JsonProperty("mtgo_id")
private Integer mtgoId;
@JsonProperty("tcgplayer_id")
private Integer tcgplayerId;
@JsonProperty("cardmarket_id")
private Integer cardmarketId;
@JsonProperty("name")
private String name;
@JsonProperty("lang")
private String lang;
@JsonProperty("released_at")
private String releasedAt;
@JsonProperty("uri")
private String uri;
@JsonProperty("scryfall_uri")
private String scryfallUri;
@JsonProperty("layout")
private String layout;
@JsonProperty("highres_image")
private Boolean highresImage;
@JsonProperty("image_uris")
private ImageUris imageUris;
@JsonProperty("mana_cost")
private String manaCost;
@JsonProperty("cmc")
private Double cmc;
@JsonProperty("type_line")
private String typeLine;
@JsonProperty("colors")
private List<String> colors = null;
@JsonProperty("color_identity")
private List<String> colorIdentity = null;
@JsonProperty("keywords")
private List<String> keywords = null;
@JsonProperty("card_faces")
private List<CardFace> cardFaces = null;
@JsonProperty("legalities")
private Legalities legalities;
@JsonProperty("games")
private List<String> games = null;
@JsonProperty("reserved")
private Boolean reserved;
@JsonProperty("foil")
private Boolean foil;
@JsonProperty("nonfoil")
private Boolean nonfoil;
@JsonProperty("oversized")
private Boolean oversized;
@JsonProperty("promo")
private Boolean promo;
@JsonProperty("reprint")
private Boolean reprint;
@JsonProperty("variation")
private Boolean variation;
@JsonProperty("set")
private String set;
@JsonProperty("set_name")
private String setName;
@JsonProperty("set_type")
private String setType;
@JsonProperty("set_uri")
private String setUri;
@JsonProperty("set_search_uri")
private String setSearchUri;
@JsonProperty("scryfall_set_uri")
private String scryfallSetUri;
@JsonProperty("rulings_uri")
private String rulingsUri;
@JsonProperty("prints_search_uri")
private String printsSearchUri;
@JsonProperty("collector_number")
private String collectorNumber;
@JsonProperty("digital")
private Boolean digital;
@JsonProperty("rarity")
private String rarity;
@JsonProperty("card_back_id")
private String cardBackId;
@JsonProperty("artist")
private String artist;
@JsonProperty("artist_ids")
private List<String> artistIds = null;
@JsonProperty("illustration_id")
private String illustrationId;
@JsonProperty("border_color")
private String borderColor;
@JsonProperty("frame")
private String frame;
@JsonProperty("full_art")
private Boolean fullArt;
@JsonProperty("textless")
private Boolean textless;
@JsonProperty("booster")
private Boolean booster;
@JsonProperty("story_spotlight")
private Boolean storySpotlight;
@JsonProperty("edhrec_rank")
private Integer edhrecRank;
@JsonProperty("prices")
private Prices prices;
@JsonProperty("related_uris")
private RelatedUris relatedUris;
@JsonProperty("purchase_uris")
private PurchaseUris purchaseUris;
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

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("oracle_id")
public String getOracleId() {
return oracleId;
}

@JsonProperty("oracle_id")
public void setOracleId(String oracleId) {
this.oracleId = oracleId;
}

@JsonProperty("multiverse_ids")
public List<Integer> getMultiverseIds() {
return multiverseIds;
}

@JsonProperty("multiverse_ids")
public void setMultiverseIds(List<Integer> multiverseIds) {
this.multiverseIds = multiverseIds;
}

@JsonProperty("mtgo_id")
public Integer getMtgoId() {
return mtgoId;
}

@JsonProperty("mtgo_id")
public void setMtgoId(Integer mtgoId) {
this.mtgoId = mtgoId;
}

@JsonProperty("tcgplayer_id")
public Integer getTcgplayerId() {
return tcgplayerId;
}

@JsonProperty("tcgplayer_id")
public void setTcgplayerId(Integer tcgplayerId) {
this.tcgplayerId = tcgplayerId;
}

@JsonProperty("cardmarket_id")
public Integer getCardmarketId() {
return cardmarketId;
}

@JsonProperty("cardmarket_id")
public void setCardmarketId(Integer cardmarketId) {
this.cardmarketId = cardmarketId;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("lang")
public String getLang() {
return lang;
}

@JsonProperty("lang")
public void setLang(String lang) {
this.lang = lang;
}

@JsonProperty("released_at")
public String getReleasedAt() {
return releasedAt;
}

@JsonProperty("released_at")
public void setReleasedAt(String releasedAt) {
this.releasedAt = releasedAt;
}

@JsonProperty("uri")
public String getUri() {
return uri;
}

@JsonProperty("uri")
public void setUri(String uri) {
this.uri = uri;
}

@JsonProperty("scryfall_uri")
public String getScryfallUri() {
return scryfallUri;
}

@JsonProperty("scryfall_uri")
public void setScryfallUri(String scryfallUri) {
this.scryfallUri = scryfallUri;
}

@JsonProperty("layout")
public String getLayout() {
return layout;
}

@JsonProperty("layout")
public void setLayout(String layout) {
this.layout = layout;
}

@JsonProperty("highres_image")
public Boolean getHighresImage() {
return highresImage;
}

@JsonProperty("highres_image")
public void setHighresImage(Boolean highresImage) {
this.highresImage = highresImage;
}

@JsonProperty("image_uris")
public ImageUris getImageUris() {
return imageUris;
}

@JsonProperty("image_uris")
public void setImageUris(ImageUris imageUris) {
this.imageUris = imageUris;
}

@JsonProperty("mana_cost")
public String getManaCost() {
return manaCost;
}

@JsonProperty("mana_cost")
public void setManaCost(String manaCost) {
this.manaCost = manaCost;
}

@JsonProperty("cmc")
public Double getCmc() {
return cmc;
}

@JsonProperty("cmc")
public void setCmc(Double cmc) {
this.cmc = cmc;
}

@JsonProperty("type_line")
public String getTypeLine() {
return typeLine;
}

@JsonProperty("type_line")
public void setTypeLine(String typeLine) {
this.typeLine = typeLine;
}

@JsonProperty("colors")
public List<String> getColors() {
return colors;
}

@JsonProperty("colors")
public void setColors(List<String> colors) {
this.colors = colors;
}

@JsonProperty("color_identity")
public List<String> getColorIdentity() {
return colorIdentity;
}

@JsonProperty("color_identity")
public void setColorIdentity(List<String> colorIdentity) {
this.colorIdentity = colorIdentity;
}

@JsonProperty("keywords")
public List<String> getKeywords() {
return keywords;
}

@JsonProperty("keywords")
public void setKeywords(List<String> keywords) {
this.keywords = keywords;
}

@JsonProperty("card_faces")
public List<CardFace> getCardFaces() {
return cardFaces;
}

@JsonProperty("card_faces")
public void setCardFaces(List<CardFace> cardFaces) {
this.cardFaces = cardFaces;
}

@JsonProperty("legalities")
public Legalities getLegalities() {
return legalities;
}

@JsonProperty("legalities")
public void setLegalities(Legalities legalities) {
this.legalities = legalities;
}

@JsonProperty("games")
public List<String> getGames() {
return games;
}

@JsonProperty("games")
public void setGames(List<String> games) {
this.games = games;
}

@JsonProperty("reserved")
public Boolean getReserved() {
return reserved;
}

@JsonProperty("reserved")
public void setReserved(Boolean reserved) {
this.reserved = reserved;
}

@JsonProperty("foil")
public Boolean getFoil() {
return foil;
}

@JsonProperty("foil")
public void setFoil(Boolean foil) {
this.foil = foil;
}

@JsonProperty("nonfoil")
public Boolean getNonfoil() {
return nonfoil;
}

@JsonProperty("nonfoil")
public void setNonfoil(Boolean nonfoil) {
this.nonfoil = nonfoil;
}

@JsonProperty("oversized")
public Boolean getOversized() {
return oversized;
}

@JsonProperty("oversized")
public void setOversized(Boolean oversized) {
this.oversized = oversized;
}

@JsonProperty("promo")
public Boolean getPromo() {
return promo;
}

@JsonProperty("promo")
public void setPromo(Boolean promo) {
this.promo = promo;
}

@JsonProperty("reprint")
public Boolean getReprint() {
return reprint;
}

@JsonProperty("reprint")
public void setReprint(Boolean reprint) {
this.reprint = reprint;
}

@JsonProperty("variation")
public Boolean getVariation() {
return variation;
}

@JsonProperty("variation")
public void setVariation(Boolean variation) {
this.variation = variation;
}

@JsonProperty("set")
public String getSet() {
return set;
}

@JsonProperty("set")
public void setSet(String set) {
this.set = set;
}

@JsonProperty("set_name")
public String getSetName() {
return setName;
}

@JsonProperty("set_name")
public void setSetName(String setName) {
this.setName = setName;
}

@JsonProperty("set_type")
public String getSetType() {
return setType;
}

@JsonProperty("set_type")
public void setSetType(String setType) {
this.setType = setType;
}

@JsonProperty("set_uri")
public String getSetUri() {
return setUri;
}

@JsonProperty("set_uri")
public void setSetUri(String setUri) {
this.setUri = setUri;
}

@JsonProperty("set_search_uri")
public String getSetSearchUri() {
return setSearchUri;
}

@JsonProperty("set_search_uri")
public void setSetSearchUri(String setSearchUri) {
this.setSearchUri = setSearchUri;
}

@JsonProperty("scryfall_set_uri")
public String getScryfallSetUri() {
return scryfallSetUri;
}

@JsonProperty("scryfall_set_uri")
public void setScryfallSetUri(String scryfallSetUri) {
this.scryfallSetUri = scryfallSetUri;
}

@JsonProperty("rulings_uri")
public String getRulingsUri() {
return rulingsUri;
}

@JsonProperty("rulings_uri")
public void setRulingsUri(String rulingsUri) {
this.rulingsUri = rulingsUri;
}

@JsonProperty("prints_search_uri")
public String getPrintsSearchUri() {
return printsSearchUri;
}

@JsonProperty("prints_search_uri")
public void setPrintsSearchUri(String printsSearchUri) {
this.printsSearchUri = printsSearchUri;
}

@JsonProperty("collector_number")
public String getCollectorNumber() {
return collectorNumber;
}

@JsonProperty("collector_number")
public void setCollectorNumber(String collectorNumber) {
this.collectorNumber = collectorNumber;
}

@JsonProperty("digital")
public Boolean getDigital() {
return digital;
}

@JsonProperty("digital")
public void setDigital(Boolean digital) {
this.digital = digital;
}

@JsonProperty("rarity")
public String getRarity() {
return rarity;
}

@JsonProperty("rarity")
public void setRarity(String rarity) {
this.rarity = rarity;
}

@JsonProperty("card_back_id")
public String getCardBackId() {
return cardBackId;
}

@JsonProperty("card_back_id")
public void setCardBackId(String cardBackId) {
this.cardBackId = cardBackId;
}

@JsonProperty("artist")
public String getArtist() {
return artist;
}

@JsonProperty("artist")
public void setArtist(String artist) {
this.artist = artist;
}

@JsonProperty("artist_ids")
public List<String> getArtistIds() {
return artistIds;
}

@JsonProperty("artist_ids")
public void setArtistIds(List<String> artistIds) {
this.artistIds = artistIds;
}

@JsonProperty("illustration_id")
public String getIllustrationId() {
return illustrationId;
}

@JsonProperty("illustration_id")
public void setIllustrationId(String illustrationId) {
this.illustrationId = illustrationId;
}

@JsonProperty("border_color")
public String getBorderColor() {
return borderColor;
}

@JsonProperty("border_color")
public void setBorderColor(String borderColor) {
this.borderColor = borderColor;
}

@JsonProperty("frame")
public String getFrame() {
return frame;
}

@JsonProperty("frame")
public void setFrame(String frame) {
this.frame = frame;
}

@JsonProperty("full_art")
public Boolean getFullArt() {
return fullArt;
}

@JsonProperty("full_art")
public void setFullArt(Boolean fullArt) {
this.fullArt = fullArt;
}

@JsonProperty("textless")
public Boolean getTextless() {
return textless;
}

@JsonProperty("textless")
public void setTextless(Boolean textless) {
this.textless = textless;
}

@JsonProperty("booster")
public Boolean getBooster() {
return booster;
}

@JsonProperty("booster")
public void setBooster(Boolean booster) {
this.booster = booster;
}

@JsonProperty("story_spotlight")
public Boolean getStorySpotlight() {
return storySpotlight;
}

@JsonProperty("story_spotlight")
public void setStorySpotlight(Boolean storySpotlight) {
this.storySpotlight = storySpotlight;
}

@JsonProperty("edhrec_rank")
public Integer getEdhrecRank() {
return edhrecRank;
}

@JsonProperty("edhrec_rank")
public void setEdhrecRank(Integer edhrecRank) {
this.edhrecRank = edhrecRank;
}

@JsonProperty("prices")
public Prices getPrices() {
return prices;
}

@JsonProperty("prices")
public void setPrices(Prices prices) {
this.prices = prices;
}

@JsonProperty("related_uris")
public RelatedUris getRelatedUris() {
return relatedUris;
}

@JsonProperty("related_uris")
public void setRelatedUris(RelatedUris relatedUris) {
this.relatedUris = relatedUris;
}

@JsonProperty("purchase_uris")
public PurchaseUris getPurchaseUris() {
return purchaseUris;
}

@JsonProperty("purchase_uris")
public void setPurchaseUris(PurchaseUris purchaseUris) {
this.purchaseUris = purchaseUris;
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
