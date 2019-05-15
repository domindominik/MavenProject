package filemanager;

import java.io.*;
import java.util.List;

public class SaveToFile
{
    public void saveToFile(List<Integer> integerList)
    {
        try
        {
            FileOutputStream f = new FileOutputStream(new File("/home/dominik/Pobrane/intigerlist.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(integerList);
            o.close();
            f.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
