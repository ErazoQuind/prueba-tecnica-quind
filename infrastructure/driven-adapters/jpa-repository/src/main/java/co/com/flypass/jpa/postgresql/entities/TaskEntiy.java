package co.com.flypass.jpa.postgresql.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "task")
public class TaskEntiy {
    @Id
    @Column(name = "task_code")
    private String taskCode;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "addition_date")
    private LocalDate additionDate;

    @Column(name = "description")
    private String description;

    @Column(name = "assigned_person")
    private String assignedPerson;

    @Column(name = "status")
    private String status;

    @Column(name = "priority")
    private String priority;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date")
    private LocalDate startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "comments")
    private String comments;

    public TaskEntiy() {
    }

    public TaskEntiy(String taskCode, LocalDate additionDate, String description, String assignedPerson, String status, String priority, LocalDate startDate, LocalDate endDate, String comments) {
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
