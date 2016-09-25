
package com.cardsort.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Edition implements Serializable
{

    @SerializedName("set")
    @Expose
    public String set;
    @SerializedName("set_id")
    @Expose
    public String setId;
    @SerializedName("rarity")
    @Expose
    public String rarity;
    @SerializedName("artist")
    @Expose
    public String artist;
    @SerializedName("multiverse_id")
    @Expose
    public int multiverseId;
    @SerializedName("number")
    @Expose
    public String number;
    @SerializedName("layout")
    @Expose
    public String layout;
    @SerializedName("price")
    @Expose
    public Price price;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("image_url")
    @Expose
    public String imageUrl;
    @SerializedName("set_url")
    @Expose
    public String setUrl;
    @SerializedName("store_url")
    @Expose
    public String storeUrl;
    @SerializedName("html_url")
    @Expose
    public String htmlUrl;
    private final static long serialVersionUID = -4669313942076751755L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Edition() {
    }

    /**
     * 
     * @param multiverseId
     * @param set
     * @param artist
     * @param htmlUrl
     * @param url
     * @param setUrl
     * @param layout
     * @param number
     * @param price
     * @param imageUrl
     * @param storeUrl
     * @param setId
     * @param rarity
     */
    public Edition(String set, String setId, String rarity, String artist, int multiverseId, String number, String layout, Price price, String url, String imageUrl, String setUrl, String storeUrl, String htmlUrl) {
        super();
        this.set = set;
        this.setId = setId;
        this.rarity = rarity;
        this.artist = artist;
        this.multiverseId = multiverseId;
        this.number = number;
        this.layout = layout;
        this.price = price;
        this.url = url;
        this.imageUrl = imageUrl;
        this.setUrl = setUrl;
        this.storeUrl = storeUrl;
        this.htmlUrl = htmlUrl;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(set).append(setId).append(rarity).append(artist).append(multiverseId).append(number).append(layout).append(price).append(url).append(imageUrl).append(setUrl).append(storeUrl).append(htmlUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Edition) == false) {
            return false;
        }
        Edition rhs = ((Edition) other);
        return new EqualsBuilder().append(set, rhs.set).append(setId, rhs.setId).append(rarity, rhs.rarity).append(artist, rhs.artist).append(multiverseId, rhs.multiverseId).append(number, rhs.number).append(layout, rhs.layout).append(price, rhs.price).append(url, rhs.url).append(imageUrl, rhs.imageUrl).append(setUrl, rhs.setUrl).append(storeUrl, rhs.storeUrl).append(htmlUrl, rhs.htmlUrl).isEquals();
    }

}
