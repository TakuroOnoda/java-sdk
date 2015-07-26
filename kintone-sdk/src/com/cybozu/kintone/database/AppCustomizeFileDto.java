package com.cybozu.kintone.database;


public class AppCustomizeFileDto {

    private FileDto file;
    private String type;
    private String url;

    public FileDto getFile() {
        return file;
    }

    public void setFile(FileDto file) {
        this.file = file;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
