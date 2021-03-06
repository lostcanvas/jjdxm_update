package com.dou361.update.bean;

import java.io.Serializable;

/**
 */
public class Update implements Serializable {

    /**
     * original data.
     */
    private String original;
    /**
     * update content,
     */
    private String updateContent;
    /**
     * update checkUrl
     */
    private String updateUrl;
    /**
     * update code
     */
    private int versionCode;
    /**
     * update name
     */
    private String versionName;
    private long apkSize;

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getUpdateContent() {
        return updateContent;
    }

    public void setUpdateContent(String updateContent) {
        this.updateContent = updateContent;
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public long getApkSize() {
        return apkSize;
    }

    public void setApkSize(long apkSize) {
        this.apkSize = apkSize;
    }
}
