package co.com.flypass.models;

import java.time.LocalDate;

public class Task {
    private String taskCode;
    private LocalDate additionDate;
    private String description;
    private String assignedPerson;
    private String status;
    private String priority;
    private LocalDate startDate;
    private LocalDate endDate;
    private String comments;

    public Task(String taskCode, LocalDate additionDate, String description, String assignedPerson, String status, String priority, LocalDate startDate, LocalDate endDate, String comments) {
        this.taskCode = taskCode;
        this.additionDate = additionDate;
        this.description = description;
        this.assignedPerson = assignedPerson;
        this.status = status;
        this.priority = priority;
        this.startDate = startDate;
        this.endDate = endDate;
        this.comments = comments;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public LocalDate getAdditionDate() {
        return additionDate;
    }

    public void setAdditionDate(LocalDate additionDate) {
        this.additionDate = additionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedPerson() {
        return assignedPerson;
    }

    public void setAssignedPerson(String assignedPerson) {
        this.assignedPerson = assignedPerson;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
