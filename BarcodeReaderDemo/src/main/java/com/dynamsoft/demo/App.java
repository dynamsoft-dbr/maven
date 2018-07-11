package com.dynamsoft.demo;

import com.dynamsoft.barcode.jni.BarcodeReader;
import com.dynamsoft.barcode.jni.TextResult;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        Path p = Paths.get(path, "images", "test.jpg");
        System.out.println("image: " + p);
        try {
            BarcodeReader reader = new BarcodeReader(
                    "t0068MgAAAEEC0tQ7CbKWKyywjkX97zQBIltf52LRibwf0AJLBuzvNuCzxE1bVv6pT2D6GelDmOv0f6+IUE1NvvBWmkgSNXE=");
            TextResult[] results = reader.decodeFile(p.toString(), "");
            for (TextResult result : results) {
                System.out.println(result.barcodeText);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
