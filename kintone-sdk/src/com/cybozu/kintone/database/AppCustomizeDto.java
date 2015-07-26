package com.cybozu.kintone.database;


public class AppCustomizeDto {

    private AppCustomizeFilesDto desktop;
    private AppCustomizeFilesDto mobile;

    public AppCustomizeFilesDto getDesktop() {
        return desktop;
    }

    public void setDesktop(AppCustomizeFilesDto desktop) {
        this.desktop = desktop;
    }

    public AppCustomizeFilesDto getMobile() {
        return mobile;
    }

    public void setMobile(AppCustomizeFilesDto mobile) {
        this.mobile = mobile;
    }

}
