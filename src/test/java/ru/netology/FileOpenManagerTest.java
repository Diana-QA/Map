package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    private final FileOpenManager manager = new FileOpenManager();
    private final String app1 = "Google Chrome";
    private final String app2 = "IntelliJ IDEA";
    private final String app3 = "Adobe Photoshop";
    private final String extension1 = ".html";
    private final String extension2 = ".java";
    private final String extension3 = ".psd";

    @BeforeEach
    void setUp() {
        manager.registerApp(extension1, app1);
        manager.registerApp(extension2, app2);
        manager.registerApp(extension3, app3);
    }

    @Test
    void shouldGetApp() {
        String actual = manager.getApp(extension1);
        String expected = app1;
        assertEquals(actual, expected);
    }

    @Test
    void shouldRemoveApp() {
        manager.remove(extension2);
        Set<String> actual = manager.getAllExtension();
        Set<String> expected = Set.of(extension1, extension3);
        assertEquals(actual, expected);
    }

    @Test
    void shouldGetAllExtension() {
        Set<String> actual = manager.getAllExtension();
        Set<String> expected = Set.of(extension1, extension2, extension3);
        assertEquals(actual, expected);
    }

    @Test
    void shouldGetAllApp() {
        Set<String> actual = manager.getAllApp();
        Set<String> expected = Set.of(app1, app2, app3);
        assertEquals(actual, expected);
    }
}