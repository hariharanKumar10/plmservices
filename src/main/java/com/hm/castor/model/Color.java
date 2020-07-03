package com.hm.castor.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.sql.DataSourceDefinition;

@Document(collection="color")
public class Color {

    @Id
    private String _id;

    @Field("Status")
    private String status;

    @Field("Colour Value")
    private String colorValue;


    @Field("Colour Swatch")
    private String colour_swatch;


    @Field("Colour Code")
    private String colour_code;


    @Field("Colour Master")
    private String colour_master;


    @Field("Colour Supplier")
    private String colour_supplier;


    @Field("Colour Supplier ID")
    private String colour_supplier_id;



    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getColour_swatch() {
        return colour_swatch;
    }

    public void setColour_swatch(String colour_swatch) {
        this.colour_swatch = colour_swatch;
    }

    public String getColour_code() {
        return colour_code;
    }

    public void setColour_code(String colour_code) {
        this.colour_code = colour_code;
    }

    public String getColour_master() {
        return colour_master;
    }

    public void setColour_master(String colour_master) {
        this.colour_master = colour_master;
    }

    public String getColour_supplier() {
        return colour_supplier;
    }

    public void setColour_supplier(String colour_supplier) {
        this.colour_supplier = colour_supplier;
    }

    public String getColour_supplier_id() {
        return colour_supplier_id;
    }

    public void setColour_supplier_id(String colour_supplier_id) {
        this.colour_supplier_id = colour_supplier_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColorValue() {
        return colorValue;
    }

    public void setColorValue(String colorValue) {
        this.colorValue = colorValue;
    }
}
