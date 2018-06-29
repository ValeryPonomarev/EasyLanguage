package com.easysales.easylanguage.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.easysales.easylanguage.data.model.Word;
import com.easysales.easylanguage.data.dao.WordDao;

/**
 * Created on 29.06.2018.
 */

@Database(entities = {
        Word.class
}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract WordDao wordDao();
}
