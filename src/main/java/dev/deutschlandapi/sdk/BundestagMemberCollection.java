/**
 * BundestagMemberCollection automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package dev.deutschlandapi.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class BundestagMemberCollection {
    private List<BundestagMember> entries;
    @JsonSetter("entries")
    public void setEntries(List<BundestagMember> entries) {
        this.entries = entries;
    }
    @JsonGetter("entries")
    public List<BundestagMember> getEntries() {
        return this.entries;
    }
}
