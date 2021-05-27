package ru.netology;

import java.util.*;

public class FileOpenManager {
    Map<String, String> map = new TreeMap<>();

    public void registerApp(String file, String app) {
        map.put(file, app);
    }

    public String getApp(String app) {
        return map.get(app);
    }

    public void removeApp(String file) {
        map.remove(file);
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
