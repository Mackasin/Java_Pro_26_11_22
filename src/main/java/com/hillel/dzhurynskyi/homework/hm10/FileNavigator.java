package com.hillel.dzhurynskyi.homework.hm10;


import java.util.*;


public class FileNavigator {

    private Map<String, List<FileData>> storage;

    public FileNavigator() {
        storage = new HashMap<>();
    }

    public void add(String path, FileData info) {
        if (info.getPath().equals(path) && storage.containsKey(path)) {
            storage.get(path).add(info);
        } else {
            if (info.getPath().equals(path)) {
                List<FileData> section = new ArrayList<>();
                section.add(info);
                storage.put(path, section);
            } else System.out.println("paths not equals");
        }
    }

    public List<FileData> find(String path) {
        return storage.getOrDefault(path, null);
    }

    public List<FileData> filterBySize(Integer size) {
        List<FileData> filesForReturn = new ArrayList<>();
        Collection<List<FileData>> files = storage.values();

        for (List<FileData> elem : files) {
            for (FileData entry : elem) {
                if (entry.getSize() <= size) {
                    filesForReturn.add(entry);
                }
            }
        }
        return filesForReturn;
    }

    public List<FileData> sortBySize() {
        List<FileData> filesForReturn = new ArrayList<>();
        Collection<List<FileData>> files = storage.values();

        for (List<FileData> elem : files) {
            filesForReturn.addAll(elem);
        }
        filesForReturn.sort(Comparator.comparing(FileData::getSize));
        return filesForReturn;
    }

    public void remove(String path) {
        if (storage.containsKey(path)) {
            storage.remove(path);
        } else {
            System.out.printf("path not exist");
        }
    }

    @Override
    public String toString() {
        return "FileNavigator{" + "storage=" + storage + '}';
    }
}
