package edu.escuelaing.ieti.lab1.microservicio.dto;

import java.util.List;

public class TaskDto {
    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private String dueDate;
    private String created;

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * set field
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get field
     *
     * @return status
     */
    public Status getStatus() {
        return this.status;
    }

    /**
     * set field
     *
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * get field
     *
     * @return assignedTo
     */
    public String getAssignedTo() {
        return this.assignedTo;
    }

    /**
     * set field
     *
     * @param assignedTo
     */
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    /**
     * get field
     *
     * @return dueDate
     */
    public String getDueDate() {
        return this.dueDate;
    }

    /**
     * set field
     *
     * @param dueDate
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * get field
     *
     * @return created
     */
    public String getCreated() {
        return this.created;
    }

    /**
     * set field
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }
}
