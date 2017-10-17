package com.cats.analytics.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 10/11/2017.
 */
@Document(collection = "operations")
public class Operation {
    @Id
    private String id;
    private int operationId;
    private String name;
    private String description;
    private int hrdId;
    private String hrdName;
    private int programId;
    private String programName;
    private int fscdAnnualPlanId;
    private String fscdAnnualPlanName;
    private int year;
    private int round;
    private String month;
    private String expectedStart;
    private String expectedEnd;
    private String actualStart;
    private String actualEnd;
    private String status;
    private String createdAt;
    private String updatedAt;
    private int createdById;
    private String createdByName;
    private int modifiedById;
    private String modifiedByName;
    private String deletedAt;
    private List<RationItem> rationItems;

    public Operation() {
    }

    public Operation(String id, int operationId, String name, String description, int hrdId, String hrdName, int programId, String programName, int fscdAnnualPlanId, String fscdAnnualPlanName, int year, int round, String month, String expectedStart, String expectedEnd, String actualStart, String actualEnd, String status, String createdAt, String updatedAt, int createdById, String createdByName, int modifiedById, String modifiedByName, String deletedAt, List<RationItem> rationItems) {
        this.id = id;
        this.operationId = operationId;
        this.name = name;
        this.description = description;
        this.hrdId = hrdId;
        this.hrdName = hrdName;
        this.programId = programId;
        this.programName = programName;
        this.fscdAnnualPlanId = fscdAnnualPlanId;
        this.fscdAnnualPlanName = fscdAnnualPlanName;
        this.year = year;
        this.round = round;
        this.month = month;
        this.expectedStart = expectedStart;
        this.expectedEnd = expectedEnd;
        this.actualStart = actualStart;
        this.actualEnd = actualEnd;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdById = createdById;
        this.createdByName = createdByName;
        this.modifiedById = modifiedById;
        this.modifiedByName = modifiedByName;
        this.deletedAt = deletedAt;
        this.rationItems = rationItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHrdId() {
        return hrdId;
    }

    public void setHrdId(int hrdId) {
        this.hrdId = hrdId;
    }

    public String getHrdName() {
        return hrdName;
    }

    public void setHrdName(String hrdName) {
        this.hrdName = hrdName;
    }

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getFscdAnnualPlanId() {
        return fscdAnnualPlanId;
    }

    public void setFscdAnnualPlanId(int fscdAnnualPlanId) {
        this.fscdAnnualPlanId = fscdAnnualPlanId;
    }

    public String getFscdAnnualPlanName() {
        return fscdAnnualPlanName;
    }

    public void setFscdAnnualPlanName(String fscdAnnualPlanName) {
        this.fscdAnnualPlanName = fscdAnnualPlanName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getExpectedStart() {
        return expectedStart;
    }

    public void setExpectedStart(String expectedStart) {
        this.expectedStart = expectedStart;
    }

    public String getExpectedEnd() {
        return expectedEnd;
    }

    public void setExpectedEnd(String expectedEnd) {
        this.expectedEnd = expectedEnd;
    }

    public String getActualStart() {
        return actualStart;
    }

    public void setActualStart(String actualStart) {
        this.actualStart = actualStart;
    }

    public String getActualEnd() {
        return actualEnd;
    }

    public void setActualEnd(String actualEnd) {
        this.actualEnd = actualEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getCreatedById() {
        return createdById;
    }

    public void setCreatedById(int createdById) {
        this.createdById = createdById;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public int getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(int modifiedById) {
        this.modifiedById = modifiedById;
    }

    public String getModifiedByName() {
        return modifiedByName;
    }

    public void setModifiedByName(String modifiedByName) {
        this.modifiedByName = modifiedByName;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public List<RationItem> getRationItems() {
        return rationItems;
    }

    public void setRationItems(List<RationItem> rationItems) {
        this.rationItems = rationItems;
    }
}
