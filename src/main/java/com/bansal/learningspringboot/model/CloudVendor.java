package com.bansal.learningspringboot.model;

public class CloudVendor {
    private String vendorId;
    private String vendorName;
    private String vendorAdress;
    private String vendorPhoneNumber;

    public CloudVendor() {
        
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAdress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAdress = vendorAdress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    /**
     * @return String return the vendorId
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * @param vendorId the vendorId to set
     */
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * @return String return the vendorName
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * @param vendorName the vendorName to set
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * @return String return the vendorAdress
     */
    public String getVendorAdress() {
        return vendorAdress;
    }

    /**
     * @param vendorAdress the vendorAdress to set
     */
    public void setVendorAdress(String vendorAdress) {
        this.vendorAdress = vendorAdress;
    }

    /**
     * @return String return the vendorPhoneNumber
     */
    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    /**
     * @param vendorPhoneNumber the vendorPhoneNumber to set
     */
    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

}
