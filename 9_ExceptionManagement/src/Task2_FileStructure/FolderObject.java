
package Task2_FileStructure;


public class FolderObject extends FileSystemObject{
    
    private FileSystemObject[] children;
    
    FolderObject(String name)
    {
        super(name);
    }
    
    FolderObject(String parent, String name)
    {
        super(parent,name);
    }
    
}
