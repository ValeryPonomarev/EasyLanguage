package com.easysales.easylanguage.data.repository;

import android.support.annotation.NonNull;

import com.lifeimpulse.clientapp.data.model.Model;

import java.util.Collection;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * Created by lordp on 06.12.2017.
 */

public interface Repository<M extends Model> {

    Maybe<M> find(@NonNull Object id);
    Single<List<M>> findAll();
    Completable create(@NonNull M model);
    Completable delete(@NonNull M model);
    Completable deleteAll();
    Completable createAll(@NonNull Collection<M> models);
    Completable update(@NonNull M model);
    Observable<String> updateAll(@NonNull Collection<M> models);
    Maybe<M> changeId(Object oldId, Object newId);
}
