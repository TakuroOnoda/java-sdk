package com.cybozu.kintone.database;

import java.util.List;

public class AppFormLayoutDto {

    private List<AppFormLayoutElementDto> layout;
    private String revision;

    public List<AppFormLayoutElementDto> getLayout() {
        return layout;
    }

    public void setLayout(List<AppFormLayoutElementDto> layout) {
        this.layout = layout;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }
}
