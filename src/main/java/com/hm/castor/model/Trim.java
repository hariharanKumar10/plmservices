package com.hm.castor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="trim")
public class Trim {

    @Id
    private String _id;

    @Field("Type")
    private String type;

    @Field("Description")
    private String desc;

    @Field("Quality Details")
    private String qcDetails;

    @Field("Supplier")
    private String supplier;

    @Field("Article #")
    private String articleNo;

    @Field("Currency")
    private String currency;

    @Field("Purchase Cost UOM")
    private String purchaseCostUOM;

    @Field("Created Date")
    private String createddate;

    @Field("Status")
    private String status;

    @Field("Office")
    private String office;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getQcDetails() {
        return qcDetails;
    }

    public void setQcDetails(String qcDetails) {
        this.qcDetails = qcDetails;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(String articleNo) {
        this.articleNo = articleNo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPurchaseCostUOM() {
        return purchaseCostUOM;
    }

    public void setPurchaseCostUOM(String purchaseCostUOM) {
        this.purchaseCostUOM = purchaseCostUOM;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
