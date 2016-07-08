package org.recap.model.solr;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by angelind on 15/6/16.
 */
public class Item {

    @Id
    @Field
    private String id;

    @Field("ItemId")
    private String itemId;

    @Field("Barcode")
    private String barcode;

    @Field("Availability")
    private String availability;

    @Field("CollectionGroupDesignation")
    private String collectionGroupDesignation;

    @Field("DocType")
    private String docType;

    @Field("CustomerCode")
    private String customerCode;

    @Field("UseRestriction")
    private String useRestriction;

    @Field("VolumePartYear")
    private String volumePartYear;

    @Field("CallNumber")
    private String callNumber;

    @Field("SummaryHoldings")
    private String summaryHoldings;

    @Field("ItemBibId")
    private List<String> itemBibIdList;

    @Field("HoldingsId")
    private List<String> holdingsIdList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getCollectionGroupDesignation() {
        return collectionGroupDesignation;
    }

    public void setCollectionGroupDesignation(String collectionGroupDesignation) {
        this.collectionGroupDesignation = collectionGroupDesignation;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getUseRestriction() {
        return useRestriction;
    }

    public void setUseRestriction(String useRestriction) {
        this.useRestriction = useRestriction;
    }

    public String getVolumePartYear() {
        return volumePartYear;
    }

    public void setVolumePartYear(String volumePartYear) {
        this.volumePartYear = volumePartYear;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public String getSummaryHoldings() {
        return summaryHoldings;
    }

    public void setSummaryHoldings(String summaryHoldings) {
        this.summaryHoldings = summaryHoldings;
    }

    public List<String> getItemBibIdList() {
        return itemBibIdList;
    }

    public void setItemBibIdList(List<String> itemBibIdList) {
        this.itemBibIdList = itemBibIdList;
    }

    public List<String> getHoldingsIdList() {
        return holdingsIdList;
    }

    public void setHoldingsIdList(List<String> holdingsIdList) {
        this.holdingsIdList = holdingsIdList;
    }
}