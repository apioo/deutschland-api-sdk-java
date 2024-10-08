/**
 * District automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package dev.deutschlandapi.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class District {
    private String id;
    private String state;
    private String type;
    private String name;
    private String nuts;
    private Integer area;
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }
    @JsonGetter("state")
    public String getState() {
        return this.state;
    }
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }
    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("nuts3")
    public void setNuts(String nuts) {
        this.nuts = nuts;
    }
    @JsonGetter("nuts3")
    public String getNuts() {
        return this.nuts;
    }
    @JsonSetter("area")
    public void setArea(Integer area) {
        this.area = area;
    }
    @JsonGetter("area")
    public Integer getArea() {
        return this.area;
    }
}
