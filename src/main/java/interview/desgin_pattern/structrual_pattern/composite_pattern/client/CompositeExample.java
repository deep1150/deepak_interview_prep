package deepak_lld_prep.structrual_pattern.composite_pattern.client;

import deepak_lld_prep.structrual_pattern.composite_pattern.leaf.File;
import deepak_lld_prep.structrual_pattern.composite_pattern.composite.Directory;


public class CompositeExample {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        Directory dir1 = new Directory("Folder 1");
        Directory dir2 = new Directory("Folder 2");

        dir1.addComponent(file1);
        dir1.addComponent(file2);

        dir2.addComponent(file3);
        dir2.addComponent(dir1);

        dir2.showDetails();
    }
}