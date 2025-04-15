package com.dloc.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
private String duration;
private String course;
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "Certificate [duration=" + duration + ", course=" + course + "]";
}

}
