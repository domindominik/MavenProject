package filemanager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile
{
    public List<Integer> readFromFile (String filePatch)
    {
        File fileToRead = new File(filePatch);

        List<Integer> lines = new ArrayList<>();

        if (fileToRead.exists())
        {
            try (Scanner scanner = new Scanner(fileToRead))
            {
                while (scanner.hasNext())
                {
                    lines.add(Integer.parseInt(scanner.next()));
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        return lines;
    }

}
