package com.ppm.wipo.wipoapi.dto;

import java.io.Serializable;

public class WipoDTO implements Serializable {

    private String pctTitle;
    private String patentAbstract;
    private String publicationNumber;
    private String publicationDate;
    private String internationalApplicationNo;
    private String inventor; // TODO: Will be an array

    public String getPctTitle() {
        return pctTitle;
    }

    public void setPctTitle(String pctTitle) {
        this.pctTitle = pctTitle;
    }

    public String getPatentAbstract() {
        return patentAbstract;
    }

    public void setPatentAbstract(String patentAbstract) {
        this.patentAbstract = patentAbstract;
    }

    public String getPublicationNumber() {
        return publicationNumber;
    }

    public void setPublicationNumber(String publicationNumber) {
        this.publicationNumber = publicationNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getInternationalApplicationNo() {
        return internationalApplicationNo;
    }

    public void setInternationalApplicationNo(String internationalApplicationNo) {
        this.internationalApplicationNo = internationalApplicationNo;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}