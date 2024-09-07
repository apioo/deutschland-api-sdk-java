/**
 * Job automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package dev.deutschlandapi.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.time.LocalDateTime;
public class Job {
    private String job;
    private String title;
    private String number;
    private JobLocation location;
    private String employer;
    private LocalDateTime publishDate;
    private LocalDateTime entranceDate;
    @JsonSetter("job")
    public void setJob(String job) {
        this.job = job;
    }
    @JsonGetter("job")
    public String getJob() {
        return this.job;
    }
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }
    @JsonGetter("title")
    public String getTitle() {
        return this.title;
    }
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }
    @JsonGetter("number")
    public String getNumber() {
        return this.number;
    }
    @JsonSetter("location")
    public void setLocation(JobLocation location) {
        this.location = location;
    }
    @JsonGetter("location")
    public JobLocation getLocation() {
        return this.location;
    }
    @JsonSetter("employer")
    public void setEmployer(String employer) {
        this.employer = employer;
    }
    @JsonGetter("employer")
    public String getEmployer() {
        return this.employer;
    }
    @JsonSetter("publishDate")
    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }
    @JsonGetter("publishDate")
    public LocalDateTime getPublishDate() {
        return this.publishDate;
    }
    @JsonSetter("entranceDate")
    public void setEntranceDate(LocalDateTime entranceDate) {
        this.entranceDate = entranceDate;
    }
    @JsonGetter("entranceDate")
    public LocalDateTime getEntranceDate() {
        return this.entranceDate;
    }
}
