package dbms.storage;

import dbms.Dbms.TableRootNode;

import java.util.HashMap;

/**
 * Handles everything related to saving & loading to XML
 */
public class XMLStorageManager {
    // Might return a list of tables? Which can be parsed into a HashMap?

    public HashMap<String, TableRootNode> readFile(String filePath) {
        HashMap<String, TableRootNode> tables = new HashMap<>();

        return tables;
    }

    // Will return something
    public Object setupFileRead(String filePath) {

        return null;
    }
}