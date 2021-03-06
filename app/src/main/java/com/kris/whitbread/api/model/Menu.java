package com.kris.whitbread.api.model;

public class Menu {

    private String type;
    private String label;
    private String anchor;
    private String url;
    private String mobileUrl;

    public Menu() {
    }

    public Menu(String type, String label, String anchor, String url, String mobileUrl) {
        this.type = type;
        this.label = label;
        this.anchor = anchor;
        this.url = url;
        this.mobileUrl = mobileUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }
}
