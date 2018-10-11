package com.reenam.brnews.Model;

import java.util.List;

import javax.xml.transform.Source;

public class WebSite {
    private String status;
    private List<Source> sources;

    public WebSite() {
    }

    public WebSite(String statu, List<Source> source) {
        status = statu;
        sources = source;
    }

}
