package com.example.cameron.instacam;

import android.os.Environment;

import java.io.File;
import java.util.UUID;

/**
 * Created by Cameron on 7/20/15.
 */
public class Photo {
    private static final File sDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
    private UUID mId;

    Photo(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public File getFile(){
        return new File(sDirectory, mId.toString());
    }
}
