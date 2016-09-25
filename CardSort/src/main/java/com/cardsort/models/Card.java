
package com.cardsort.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Card implements Serializable
{

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("store_url")
    @Expose
    public String storeUrl;
    @SerializedName("types")
    @Expose
    public List<String> types = new ArrayList<String>();
    @SerializedName("subtypes")
    @Expose
    public List<String> subtypes = new ArrayList<String>();
    @SerializedName("colors")
    @Expose
    public List<String> colors = new ArrayList<String>();
    @SerializedName("cmc")
    @Expose
    public int cmc;
    @SerializedName("cost")
    @Expose
    public String cost;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("power")
    @Expose
    public String power;
    @SerializedName("toughness")
    @Expose
    public String toughness;
    @SerializedName("formats")
    @Expose
    public Formats formats;
    @SerializedName("editions")
    @Expose
    public List<Edition> editions = new ArrayList<Edition>();
    @SerializedName("supertypes")
    @Expose
    public List<String> supertypes = new ArrayList<String>();
    private final static long serialVersionUID = 8909490993926010555L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Card() {
    }

    /**
     * 
     * @param types
     * @param cost
     * @param formats
     * @param url
     * @param colors
     * @param subtypes
     * @param editions
     * @param storeUrl
     * @param name
     * @param cmc
     * @param id
     * @param text
     * @param power
     * @param toughness
     * @param supertypes
     */
    public Card(String name, String id, String url, String storeUrl, List<String> types, List<String> subtypes, List<String> colors, int cmc, String cost, String text, String power, String toughness, Formats formats, List<Edition> editions, List<String> supertypes) {
        super();
        this.name = name;
        this.id = id;
        this.url = url;
        this.storeUrl = storeUrl;
        this.types = types;
        this.subtypes = subtypes;
        this.colors = colors;
        this.cmc = cmc;
        this.cost = cost;
        this.text = text;
        this.power = power;
        this.toughness = toughness;
        this.formats = formats;
        this.editions = editions;
        this.supertypes = supertypes;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).append(url).append(storeUrl).append(types).append(subtypes).append(colors).append(cmc).append(cost).append(text).append(power).append(toughness).append(formats).append(editions).append(supertypes).toHashCode();
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
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(url, rhs.url).append(storeUrl, rhs.storeUrl).append(types, rhs.types).append(subtypes, rhs.subtypes).append(colors, rhs.colors).append(cmc, rhs.cmc).append(cost, rhs.cost).append(text, rhs.text).append(power, rhs.power).append(toughness, rhs.toughness).append(formats, rhs.formats).append(editions, rhs.editions).append(supertypes, rhs.supertypes).isEquals();
    }

}
