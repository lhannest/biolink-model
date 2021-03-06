import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * FunctionalAssociation
 * <p>
 * An association between a macromolecular machine (gene, gene product or complex of gene products) and either a molecular activity, a biological process or a cellular location in which a function is executed
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "object",
    "subject"
})
public class FunctionalAssociation {

    /**
     * class describing the activity, process or localization of the gene product
     * (Required)
     * 
     */
    @JsonProperty("object")
    @JsonPropertyDescription("class describing the activity, process or localization of the gene product")
    private String object;
    /**
     * gene, product or macromolecular complex that has the function associated with the GO term
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("gene, product or macromolecular complex that has the function associated with the GO term")
    private String subject;

    /**
     * class describing the activity, process or localization of the gene product
     * (Required)
     * 
     */
    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    /**
     * class describing the activity, process or localization of the gene product
     * (Required)
     * 
     */
    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * gene, product or macromolecular complex that has the function associated with the GO term
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * gene, product or macromolecular complex that has the function associated with the GO term
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("object", object).append("subject", subject).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subject).append(object).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionalAssociation) == false) {
            return false;
        }
        FunctionalAssociation rhs = ((FunctionalAssociation) other);
        return new EqualsBuilder().append(subject, rhs.subject).append(object, rhs.object).isEquals();
    }

}
