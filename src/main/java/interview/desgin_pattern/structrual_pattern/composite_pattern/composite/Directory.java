package deepak_lld_prep.structrual_pattern.composite_pattern.composite;

import deepak_lld_prep.structrual_pattern.composite_pattern.component.StorageItem;

import java.util.List;
import java.util.ArrayList;



public class Directory implements StorageItem {
    private String name;
    private List<StorageItem> contents = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(StorageItem storageItem) {
        contents.add(storageItem);
    }

    public void removeComponent(StorageItem storageItem) {
        contents.remove(storageItem);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (StorageItem storageItem : contents) {
            storageItem.showDetails();
        }
    }
}
