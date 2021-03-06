
package de.uhh.l2g.webservices.videoprocessor.model.opencast;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Auto-generated by http://www.jsonschema2pojo.org/
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "identifier",
    "channels",
    "framecount",
    "format",
    "bitrate",
    "samplingrate"
})
public class Audio1 {

    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("channels")
    private Integer channels;
    @JsonProperty("framecount")
    private Integer framecount;
    @JsonProperty("format")
    private String format;
    @JsonProperty("bitrate")
    private Double bitrate;
    @JsonProperty("samplingrate")
    private Integer samplingrate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("channels")
    public Integer getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    @JsonProperty("framecount")
    public Integer getFramecount() {
        return framecount;
    }

    @JsonProperty("framecount")
    public void setFramecount(Integer framecount) {
        this.framecount = framecount;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("bitrate")
    public Double getBitrate() {
        return bitrate;
    }

    @JsonProperty("bitrate")
    public void setBitrate(Double bitrate) {
        this.bitrate = bitrate;
    }

    @JsonProperty("samplingrate")
    public Integer getSamplingrate() {
        return samplingrate;
    }

    @JsonProperty("samplingrate")
    public void setSamplingrate(Integer samplingrate) {
        this.samplingrate = samplingrate;
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
