package com.cybozu.kintone.database;

import java.util.Map;

public class AppFormFieldsDto {
    private Map<String, AppFormFieldsPropertyDto> properties;
    private String revision;

    public Map<String, AppFormFieldsPropertyDto> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, AppFormFieldsPropertyDto> properties) {
        this.properties = properties;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }
}
