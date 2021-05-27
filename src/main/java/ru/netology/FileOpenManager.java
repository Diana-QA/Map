package ru.netology;

import java.util.*;

public class FileOpenManager {
    Map<String, String> map = new TreeMap<>();

    public void registerApp(String extension, String app) {
        map.put(extension, app);
    }

    public String getApp(String extension) {
        return map.get(extension);
    }

    public void remove(String extension) {
        map.remove(extension);
    }

    public Set<String> getAllExtension() {
        Set<String> files = new TreeSet<>(Comparator.naturalOrder());
        files.addAll(map.keySet());
        return files;
    }

    public Set<String> getAllApp() {
        Set<String> files = new TreeSet<>(Comparator.naturalOrder());
        files.addAll(map.values());
        return files;
    }
}
