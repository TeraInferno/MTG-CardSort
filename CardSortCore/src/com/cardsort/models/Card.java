
package com.cardsort.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Card {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("manaCost")
    @Expose
    private String manaCost;
    @SerializedName("cmc")
    @Expose
    private Integer cmc;
    @SerializedName("colors")
    @Expose
    private List<String> colors = new ArrayList<String>();
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("types")
    @Expose
    private List<String> types = new ArrayList<String>();
    @SerializedName("subtypes")
    @Expose
    private List<String> subtypes = new ArrayList<String>();
    @SerializedName("rarity")
    @Expose
    private String rarity;
    @SerializedName("set")
    @Expose
    private String set;
    @SerializedName("setName")
    @Expose
    private String setName;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("flavor")
    @Expose
    private String flavor;
    @SerializedName("artist")
    @Expose
    private String artist;
    @SerializedName("power")
    @Expose
    private String power;
    @SerializedName("toughness")
    @Expose
    private String toughness;
    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("multiverseid")
    @Expose
    private Integer multiverseid;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("printings")
    @Expose
    private List<String> printings = new ArrayList<String>();
    @SerializedName("originalText")
    @Expose
    private String originalText;
    @SerializedName("originalType")
    @Expose
    private String originalType;
    @SerializedName("legalities")
    @Expose
    private List<Legality> legalities = new ArrayList<Legality>();
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("reserved")
    @Expose
    private Boolean reserved;
    @SerializedName("rulings")
    @Expose
    private List<Ruling> rulings = new ArrayList<Ruling>();
    @SerializedName("supertypes")
    @Expose
    private List<String> supertypes = new ArrayList<String>();
    @SerializedName("variations")
    @Expose
    private List<Integer> variations = new ArrayList<Integer>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Card() {
    }

    /**
     * 
     * @param setName
     * @param multiverseid
     * @param originalType
     * @param artist
     * @param rulings
     * @param type
     * @param colors
     * @param subtypes
     * @param printings
     * @param variations
     * @param imageUrl
     * @param text
     * @param power
     * @param id
     * @param toughness
     * @param supertypes
     * @param types
     * @param set
     * @param legalities
     * @param flavor
     * @param layout
     * @param originalText
     * @param reserved
     * @param name
     * @param cmc
     * @param manaCost
     * @param rarity
     */
    public Card(String name, String manaCost, Integer cmc, List<String> colors, String type, List<String> types, List<String> subtypes, String rarity, String set, String setName, String text, String flavor, String artist, String power, String toughness, String layout, Integer multiverseid, String imageUrl, List<String> printings, String originalText, String originalType, List<Legality> legalities, String id, Boolean reserved, List<Ruling> rulings, List<String> supertypes, List<Integer> variations) {
        super();
        this.name = name;
        this.manaCost = manaCost;
        this.cmc = cmc;
        this.colors = colors;
        this.type = type;
        this.types = types;
        this.subtypes = subtypes;
        this.rarity = rarity;
        this.set = set;
        this.setName = setName;
        this.text = text;
        this.flavor = flavor;
        this.artist = artist;
        this.power = power;
        this.toughness = toughness;
        this.layout = layout;
        this.multiverseid = multiverseid;
        this.imageUrl = imageUrl;
        this.printings = printings;
        this.originalText = originalText;
        this.originalType = originalType;
        this.legalities = legalities;
        this.id = id;
        this.reserved = reserved;
        this.rulings = rulings;
        this.supertypes = supertypes;
        this.variations = variations;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Card withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The manaCost
     */
    public String getManaCost() {
        return manaCost;
    }

    /**
     * 
     * @param manaCost
     *     The manaCost
     */
    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public Card withManaCost(String manaCost) {
        this.manaCost = manaCost;
        return this;
    }

    /**
     * 
     * @return
     *     The cmc
     */
    public Integer getCmc() {
        return cmc;
    }

    /**
     * 
     * @param cmc
     *     The cmc
     */
    public void setCmc(Integer cmc) {
        this.cmc = cmc;
    }

    public Card withCmc(Integer cmc) {
        this.cmc = cmc;
        return this;
    }

    /**
     * 
     * @return
     *     The colors
     */
    public List<String> getColors() {
        return colors;
    }

    /**
     * 
     * @param colors
     *     The colors
     */
    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public Card withColors(List<String> colors) {
        this.colors = colors;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Card withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The types
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * 
     * @param types
     *     The types
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Card withTypes(List<String> types) {
        this.types = types;
        return this;
    }

    /**
     * 
     * @return
     *     The subtypes
     */
    public List<String> getSubtypes() {
        return subtypes;
    }

    /**
     * 
     * @param subtypes
     *     The subtypes
     */
    public void setSubtypes(List<String> subtypes) {
        this.subtypes = subtypes;
    }

    public Card withSubtypes(List<String> subtypes) {
        this.subtypes = subtypes;
        return this;
    }

    /**
     * 
     * @return
     *     The rarity
     */
    public String getRarity() {
        return rarity;
    }

    /**
     * 
     * @param rarity
     *     The rarity
     */
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Card withRarity(String rarity) {
        this.rarity = rarity;
        return this;
    }

    /**
     * 
     * @return
     *     The set
     */
    public String getSet() {
        return set;
    }

    /**
     * 
     * @param set
     *     The set
     */
    public void setSet(String set) {
        this.set = set;
    }

    public Card withSet(String set) {
        this.set = set;
        return this;
    }

    /**
     * 
     * @return
     *     The setName
     */
    public String getSetName() {
        return setName;
    }

    /**
     * 
     * @param setName
     *     The setName
     */
    public void setSetName(String setName) {
        this.setName = setName;
    }

    public Card withSetName(String setName) {
        this.setName = setName;
        return this;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    public Card withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 
     * @return
     *     The flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * 
     * @param flavor
     *     The flavor
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Card withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 
     * @return
     *     The artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist
     *     The artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Card withArtist(String artist) {
        this.artist = artist;
        return this;
    }

    /**
     * 
     * @return
     *     The power
     */
    public String getPower() {
        return power;
    }

    /**
     * 
     * @param power
     *     The power
     */
    public void setPower(String power) {
        this.power = power;
    }

    public Card withPower(String power) {
        this.power = power;
        return this;
    }

    /**
     * 
     * @return
     *     The toughness
     */
    public String getToughness() {
        return toughness;
    }

    /**
     * 
     * @param toughness
     *     The toughness
     */
    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public Card withToughness(String toughness) {
        this.toughness = toughness;
        return this;
    }

    /**
     * 
     * @return
     *     The layout
     */
    public String getLayout() {
        return layout;
    }

    /**
     * 
     * @param layout
     *     The layout
     */
    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Card withLayout(String layout) {
        this.layout = layout;
        return this;
    }

    /**
     * 
     * @return
     *     The multiverseid
     */
    public Integer getMultiverseid() {
        return multiverseid;
    }

    /**
     * 
     * @param multiverseid
     *     The multiverseid
     */
    public void setMultiverseid(Integer multiverseid) {
        this.multiverseid = multiverseid;
    }

    public Card withMultiverseid(Integer multiverseid) {
        this.multiverseid = multiverseid;
        return this;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Card withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The printings
     */
    public List<String> getPrintings() {
        return printings;
    }

    /**
     * 
     * @param printings
     *     The printings
     */
    public void setPrintings(List<String> printings) {
        this.printings = printings;
    }

    public Card withPrintings(List<String> printings) {
        this.printings = printings;
        return this;
    }

    /**
     * 
     * @return
     *     The originalText
     */
    public String getOriginalText() {
        return originalText;
    }

    /**
     * 
     * @param originalText
     *     The originalText
     */
    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public Card withOriginalText(String originalText) {
        this.originalText = originalText;
        return this;
    }

    /**
     * 
     * @return
     *     The originalType
     */
    public String getOriginalType() {
        return originalType;
    }

    /**
     * 
     * @param originalType
     *     The originalType
     */
    public void setOriginalType(String originalType) {
        this.originalType = originalType;
    }

    public Card withOriginalType(String originalType) {
        this.originalType = originalType;
        return this;
    }

    /**
     * 
     * @return
     *     The legalities
     */
    public List<Legality> getLegalities() {
        return legalities;
    }

    /**
     * 
     * @param legalities
     *     The legalities
     */
    public void setLegalities(List<Legality> legalities) {
        this.legalities = legalities;
    }

    public Card withLegalities(List<Legality> legalities) {
        this.legalities = legalities;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Card withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The reserved
     */
    public Boolean getReserved() {
        return reserved;
    }

    /**
     * 
     * @param reserved
     *     The reserved
     */
    public void setReserved(Boolean reserved) {
        this.reserved = reserved;
    }

    public Card withReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * 
     * @return
     *     The rulings
     */
    public List<Ruling> getRulings() {
        return rulings;
    }

    /**
     * 
     * @param rulings
     *     The rulings
     */
    public void setRulings(List<Ruling> rulings) {
        this.rulings = rulings;
    }

    public Card withRulings(List<Ruling> rulings) {
        this.rulings = rulings;
        return this;
    }

    /**
     * 
     * @return
     *     The supertypes
     */
    public List<String> getSupertypes() {
        return supertypes;
    }

    /**
     * 
     * @param supertypes
     *     The supertypes
     */
    public void setSupertypes(List<String> supertypes) {
        this.supertypes = supertypes;
    }

    public Card withSupertypes(List<String> supertypes) {
        this.supertypes = supertypes;
        return this;
    }

    /**
     * 
     * @return
     *     The variations
     */
    public List<Integer> getVariations() {
        return variations;
    }

    /**
     * 
     * @param variations
     *     The variations
     */
    public void setVariations(List<Integer> variations) {
        this.variations = variations;
    }

    public Card withVariations(List<Integer> variations) {
        this.variations = variations;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(manaCost).append(cmc).append(colors).append(type).append(types).append(subtypes).append(rarity).append(set).append(setName).append(text).append(flavor).append(artist).append(power).append(toughness).append(layout).append(multiverseid).append(imageUrl).append(printings).append(originalText).append(originalType).append(legalities).append(id).append(reserved).append(rulings).append(supertypes).append(variations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Card) == false) {
            return false;
        }
        Card rhs = ((Card) other);
        return new EqualsBuilder().append(name, rhs.name).append(manaCost, rhs.manaCost).append(cmc, rhs.cmc).append(colors, rhs.colors).append(type, rhs.type).append(types, rhs.types).append(subtypes, rhs.subtypes).append(rarity, rhs.rarity).append(set, rhs.set).append(setName, rhs.setName).append(text, rhs.text).append(flavor, rhs.flavor).append(artist, rhs.artist).append(power, rhs.power).append(toughness, rhs.toughness).append(layout, rhs.layout).append(multiverseid, rhs.multiverseid).append(imageUrl, rhs.imageUrl).append(printings, rhs.printings).append(originalText, rhs.originalText).append(originalType, rhs.originalType).append(legalities, rhs.legalities).append(id, rhs.id).append(reserved, rhs.reserved).append(rulings, rhs.rulings).append(supertypes, rhs.supertypes).append(variations, rhs.variations).isEquals();
    }

}
