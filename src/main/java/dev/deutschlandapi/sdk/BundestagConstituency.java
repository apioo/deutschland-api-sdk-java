/**
 * BundestagConstituency automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package dev.deutschlandapi.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BundestagConstituency {
    private String number;
    private String name;
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }
    @JsonGetter("number")
    public String getNumber() {
        return this.number;
    }
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
}
