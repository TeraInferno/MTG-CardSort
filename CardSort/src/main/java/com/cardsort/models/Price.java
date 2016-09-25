
package com.cardsort.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Price implements Serializable
{

    @SerializedName("low")
    @Expose
    public int low;
    @SerializedName("median")
    @Expose
    public int median;
    @SerializedName("high")
    @Expose
    public int high;
    private final static long serialVersionUID = 2263594614703859978L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Price() {
    }

    /**
     * 
     * @param high
     * @param median
     * @param low
     */
    public Price(int low, int median, int high) {
        super();
        this.low = low;
        this.median = median;
        this.high = high;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(low).append(median).append(high).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Price) == false) {
            return false;
        }
        Price rhs = ((Price) other);
        return new EqualsBuilder().append(low, rhs.low).append(median, rhs.median).append(high, rhs.high).isEquals();
    }

}
