package Composite;

import java.util.ArrayList;
import java.util.List;

interface FileSystemItem {
    void showDetails();
}

class File implements FileSystemItem {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + ", Size: " + size + " KB");
    }
}

class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addItem(FileSystemItem item) {
        items.add(item);
    }

    public void removeItem(FileSystemItem item) {
        items.remove(item);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemItem item : items) {
            item.showDetails();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FileSystemItem file1 = new File("Resume.pdf", 120);
        FileSystemItem file2 = new File("Photo.jpg", 200);
        FileSystemItem file3 = new File("Certificate.docx", 300);

        Directory directory1 = new Directory("Documents");
        directory1.addItem(file1);
        directory1.addItem(file3);

        Directory directory2 = new Directory("Pictures");
        directory2.addItem(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addItem(directory1);
        rootDirectory.addItem(directory2);

        rootDirectory.showDetails();
    }
}
