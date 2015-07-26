package com.cybozu.kintone.database;

import java.util.List;

public class AppCustomizeFilesDto {

    private List<AppCustomizeFileDto> css;
    private List<AppCustomizeFileDto> js;
    private String revision;
    private String scope;

    public List<AppCustomizeFileDto> getCSSs() {
        return css;
    }

    public void setCSSs(List<AppCustomizeFileDto> csss) {
        this.css = csss;
    }

    public List<AppCustomizeFileDto> getJSs() {
        return js;
    }

    public void setJSs(List<AppCustomizeFileDto> jss) {
        this.js = jss;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

}
