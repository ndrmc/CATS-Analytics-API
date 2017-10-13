package com.cats.analytics.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

/**
 * Created by User on 10/11/2017.
 */
@Document(collection = "dispatches")
public class Dispatch {
    @Id
    private String id;
    private String gin_no;
    private int operation_id;
    private String requisition_number;
    private Date dispatch_date;
    private int fdp_id;
    private int woreda_id;
    private int zone_id;
    private int region_id;
    private String fdp_name;
    private String woreda_name;
    private String zone_name;
    private String region_name;
    private String weight_bridge_ticket_number;
    private Transporter transporter;
    private String plate_number;
    private String trailer_plate_number;
    private String driver_name;
    private String remark;
    private Boolean draft;
    private int created_by;
    private int modified_by;
    private Boolean deleted;
    private Date deleted_at;
    private Date created_at;
    private Date updated_at;
    private Hub hub;
    private Warehouse warehouse;
    private String dispatch_date_ec;
    private DispatchItem  dispatchItems;

    public Dispatch() {
    }
    public Dispatch(String id, String gin_no, int operation_id,
                    String requisition_number, Date dispatch_date,
                    int fdp_id, int woreda_id, int zone_id, int region_id,
                    String fdp_name, String woreda_name, String zone_name,
                    String region_name, String weight_bridge_ticket_number,
                    Transporter transporter, String plate_number, String trailer_plate_number,
                    String driver_name, String remark, Boolean draft, int created_by,
                    int modified_by, Boolean deleted, Date deleted_at, Date created_at,
                    Date updated_at, Hub hub, Warehouse warehouse, String dispatch_date_ec, DispatchItem dispatchItems) {
        this.id = id;
        this.gin_no = gin_no;
        this.operation_id = operation_id;
        this.requisition_number = requisition_number;
        this.dispatch_date = dispatch_date;
        this.fdp_id = fdp_id;
        this.woreda_id = woreda_id;
        this.zone_id = zone_id;
        this.region_id = region_id;
        this.fdp_name = fdp_name;
        this.woreda_name = woreda_name;
        this.zone_name = zone_name;
        this.region_name = region_name;
        this.weight_bridge_ticket_number = weight_bridge_ticket_number;
        this.transporter = transporter;
        this.plate_number = plate_number;
        this.trailer_plate_number = trailer_plate_number;
        this.driver_name = driver_name;
        this.remark = remark;
        this.draft = draft;
        this.created_by = created_by;
        this.modified_by = modified_by;
        this.deleted = deleted;
        this.deleted_at = deleted_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.hub = hub;
        this.warehouse = warehouse;
        this.dispatch_date_ec = dispatch_date_ec;
        this.dispatchItems = dispatchItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGin_no() {
        return gin_no;
    }

    public void setGin_no(String gin_no) {
        this.gin_no = gin_no;
    }

    public int getOperation_id() {
        return operation_id;
    }

    public void setOperation_id(int operation_id) {
        this.operation_id = operation_id;
    }

    public String getRequisition_number() {
        return requisition_number;
    }

    public void setRequisition_number(String requisition_number) {
        this.requisition_number = requisition_number;
    }

    public Date getDispatch_date() {
        return dispatch_date;
    }

    public void setDispatch_date(Date dispatch_date) {
        this.dispatch_date = dispatch_date;
    }

    public int getFdp_id() {
        return fdp_id;
    }

    public void setFdp_id(int fdp_id) {
        this.fdp_id = fdp_id;
    }

    public int getWoreda_id() {
        return woreda_id;
    }

    public void setWoreda_id(int woreda_id) {
        this.woreda_id = woreda_id;
    }

    public int getZone_id() {
        return zone_id;
    }

    public void setZone_id(int zone_id) {
        this.zone_id = zone_id;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getFdp_name() {
        return fdp_name;
    }

    public void setFdp_name(String fdp_name) {
        this.fdp_name = fdp_name;
    }

    public String getWoreda_name() {
        return woreda_name;
    }

    public void setWoreda_name(String woreda_name) {
        this.woreda_name = woreda_name;
    }

    public String getZone_name() {
        return zone_name;
    }

    public void setZone_name(String zone_name) {
        this.zone_name = zone_name;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getWeight_bridge_ticket_number() {
        return weight_bridge_ticket_number;
    }

    public void setWeight_bridge_ticket_number(String weight_bridge_ticket_number) {
        this.weight_bridge_ticket_number = weight_bridge_ticket_number;
    }

    public Transporter getTransporter() {
        return transporter;
    }

    public void setTransporter(Transporter transporter) {
        this.transporter = transporter;
    }

    public String getPlate_number() {
        return plate_number;
    }

    public void setPlate_number(String plate_number) {
        this.plate_number = plate_number;
    }

    public String getTrailer_plate_number() {
        return trailer_plate_number;
    }

    public void setTrailer_plate_number(String trailer_plate_number) {
        this.trailer_plate_number = trailer_plate_number;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
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

    public Hub getHub() {
        return hub;
    }

    public void setHub(Hub hub) {
        this.hub = hub;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String getDispatch_date_ec() {
        return dispatch_date_ec;
    }

    public void setDispatch_date_ec(String dispatch_date_ec) {
        this.dispatch_date_ec = dispatch_date_ec;
    }
}
