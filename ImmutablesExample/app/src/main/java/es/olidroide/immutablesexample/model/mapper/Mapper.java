package es.olidroide.immutablesexample.model.mapper;

import android.support.annotation.NonNull;

/**
 * Transforms an input object into an output object
 */
public interface Mapper<OUT, IN> {
    OUT map(@NonNull IN in);
}