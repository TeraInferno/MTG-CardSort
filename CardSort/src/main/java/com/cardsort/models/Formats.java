
package com.cardsort.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Formats implements Serializable
{

    @SerializedName("commander")
    @Expose
    public String commander;
    @SerializedName("legacy")
    @Expose
    public String legacy;
    @SerializedName("modern")
    @Expose
    public String modern;
    @SerializedName("vintage")
    @Expose
    public String vintage;
    private final static long serialVersionUID = -2754839512926343994L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Formats() {
    }

    /**
     * 
     * @param commander
     * @param legacy
     * @param modern
     * @param vintage
     */
    public Formats(String commander, String legacy, String modern, String vintage) {
        super();
        this.commander = commander;
        this.legacy = legacy;
        this.modern = modern;
        this.vintage = vintage;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(commander).append(legacy).append(modern).append(vintage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Formats) == false) {
            return false;
        }
        Formats rhs = ((Formats) other);
        return new EqualsBuilder().append(commander, rhs.commander).append(legacy, rhs.legacy).append(modern, rhs.modern).append(vintage, rhs.vintage).isEquals();
    }

}
