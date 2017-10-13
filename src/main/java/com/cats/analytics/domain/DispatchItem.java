package com.cats.analytics.domain;




import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by User on 10/12/2017.
 */
public class DispatchItem {
    @Id
    private String id;
    private int dispatch_id;
    private CommodityCategory commodity_category;
    private Commodity commodity;
    private float quantity;
    private Project project;
    private Organization organization;
    private int created_by;
    private int modified_by;
    private Boolean deleted;
    private Date deleted_at;
    private Date created_at;
    private Date updated_at;

    public DispatchItem() {
    }

    public DispatchItem(String id, int dispatch_id, CommodityCategory commodity_category, Commodity commodity, float quantity, Project project, Organization organization, int created_by, int modified_by, Boolean deleted, Date deleted_at, Date created_at, Date updated_at) {
        this.id = id;
        this.dispatch_id = dispatch_id;
        this.commodity_category = commodity_category;
        this.commodity = commodity;
        this.quantity = quantity;
        this.project = project;
        this.organization = organization;
        this.created_by = created_by;
        this.modified_by = modified_by;
        this.deleted = deleted;
        this.deleted_at = deleted_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDispatch_id() {
        return dispatch_id;
    }

    public void setDispatch_id(int dispatch_id) {
        this.dispatch_id = dispatch_id;
    }

    public CommodityCategory getCommodity_category() {
        return commodity_category;
    }

    public void setCommodity_category(CommodityCategory commodity_category) {
        this.commodity_category = commodity_category;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getModified_by() {
        return modified_by;
    }

    public void setModified_by(int modified_by) {
        this.modified_by = modified_by;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
