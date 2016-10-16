
package Task2_FileStructure;

 abstract class FileSystemObject {
    
    private String parent;
    private String name;
    
    FileSystemObject(String name)
    {
        this.name = name;
    }
    
    FileSystemObject(String parent, String name)
    {
        this.parent = parent;
        this.name = name;
    }
}
