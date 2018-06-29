package com.easysales.easylanguage.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import dagger.Module;

/**
 * Created on 29.06.2018.
 */

@Entity(tableName = "word")
public class Word implements Model {

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private String foreignText;

    private String nativeText;

    @Override
    public void setId(Object newId) {
        this.id = (Integer) newId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForeignText() {
        return foreignText;
    }

    public void setForeignText(String foreignText) {
        this.foreignText = foreignText;
    }

    public String getNativeText() {
        return nativeText;
    }

    public void setNativeText(String nativeText) {
        this.nativeText = nativeText;
    }
}
