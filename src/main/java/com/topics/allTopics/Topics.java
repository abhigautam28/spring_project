package com.topics.allTopics;


/**
 * this is my Entity class or you can say data model class.
 */
public class Topics {

    private String id;
    private String course;
    private String description;



    Topics() {

    }
    public Topics(String id, String course, String description) {
        super();
        this.id = id;
        this.course = course;
        this.description = description;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
