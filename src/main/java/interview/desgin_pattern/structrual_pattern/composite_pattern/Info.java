package deepak_lld_prep.structrual_pattern.composite_pattern;

/**
 * Composite Pattern
 * Definition:
 * The Composite Pattern is used to treat individual objects and compositions of objects uniformly.
 * It allows you to compose objects into tree-like structures to represent part-whole hierarchies.
 * This pattern is often used to implement hierarchies, such as file systems, graphics, or UI components.
 *
 * Real-Life Example: File System
 * Consider a file system where directories can contain both files and other directories.
 * Both files and directories should have common operations like open(), delete(), and showDetails().
 * Using the Composite Pattern, we can treat both files and directories uniformly, so operations on them are seamless.
 *
 *
 * Explanation:
 * Component (FileComponent): Defines the common interface for both File and Directory.
 * Leaf (File): Represents individual objects that do not contain other objects.
 * Composite (Directory): Contains multiple FileComponent objects and can contain both File objects and other Directory objects.
 * Client Code: Treats both files and directories uniformly, allowing complex hierarchies to be handled with ease.
 *
 */
public class Info {
}
