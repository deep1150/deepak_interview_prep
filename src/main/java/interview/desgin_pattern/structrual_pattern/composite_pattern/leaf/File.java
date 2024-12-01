package deepak_lld_prep.structrual_pattern.composite_pattern.leaf;

import deepak_lld_prep.structrual_pattern.composite_pattern.component.StorageItem;

public class File implements StorageItem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
