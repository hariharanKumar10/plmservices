package com.hm.castor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="prints")
public class Print {

    @Id
    private String _id;

    @Field("PRINT TECHNIQUE ID")
    private String printTechId;

    @Field("PRINT CATEGORY")
    private String printCategory;

    @Field("PRINT DETAILS")
    private String printDetails;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPrintTechId() {
        return printTechId;
    }

    public void setPrintTechId(String printTechId) {
        this.printTechId = printTechId;
    }

    public String getPrintCategory() {
        return printCategory;
    }

    public void setPrintCategory(String printCategory) {
        this.printCategory = printCategory;
    }

    public String getPrintDetails() {
        return printDetails;
    }

    public void setPrintDetails(String printDetails) {
        this.printDetails = printDetails;
    }
}
