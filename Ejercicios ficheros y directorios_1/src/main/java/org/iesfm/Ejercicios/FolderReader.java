package org.iesfm.accesoadatos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.SplittableRandom;

public class FolderReader {

    private final static Logger log = LoggerFactory.getLogger(FolderReader.class);

    public String readAll(String folderPath){
        return null;

    }

    public static void main(String[] args) {
        FolderReader reader = new FolderReader();
        log.info(reader.readAll("home/mchael/files"));
    }
}
