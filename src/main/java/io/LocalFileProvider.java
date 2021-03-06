package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Andrzej on 2016-12-19.
 */
public class LocalFileProvider implements FileProvider {

    @Override
    public RandomAccessFile obtainFileHandler(File path) {
        try {
            return new RandomAccessFile(path, "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
