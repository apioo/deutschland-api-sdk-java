/**
 * CommonMessage automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package dev.deutschlandapi.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class CommonMessage {
    private Boolean success;
    private String message;
    private String id;
    @JsonSetter("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    @JsonGetter("success")
    public Boolean getSuccess() {
        return this.success;
    }
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }
    @JsonGetter("message")
    public String getMessage() {
        return this.message;
    }
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }
}
