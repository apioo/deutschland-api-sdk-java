/**
 * AutobahnWarningCollection automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package dev.deutschlandapi.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class AutobahnWarningCollection {
    private List<AutobahnWarning> entries;
    @JsonSetter("entries")
    public void setEntries(List<AutobahnWarning> entries) {
        this.entries = entries;
    }
    @JsonGetter("entries")
    public List<AutobahnWarning> getEntries() {
        return this.entries;
    }
}
