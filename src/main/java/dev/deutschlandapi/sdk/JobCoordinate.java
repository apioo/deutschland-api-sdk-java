/**
 * JobCoordinate automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package dev.deutschlandapi.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class JobCoordinate {
    private String id;
    private String title;
    private String address;
    private String link;
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }
    @JsonGetter("title")
    public String getTitle() {
        return this.title;
    }
    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = address;
    }
    @JsonGetter("address")
    public String getAddress() {
        return this.address;
    }
    @JsonSetter("link")
    public void setLink(String link) {
        this.link = link;
    }
    @JsonGetter("link")
    public String getLink() {
        return this.link;
    }
}
