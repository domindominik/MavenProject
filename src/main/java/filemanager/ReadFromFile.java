package filemanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile
{
    //private File fileToRead = new File("/home/dominik/Pobrane/number.txt");



    public List<Integer> readFromFile (String filePatch)
    {
        File fileToRead = new File(filePatch);
        List<Integer> lines = new ArrayList<>();
        //List<Integer> integerList = new ArrayList<>();

        if (fileToRead.exists())
        {
            try (Scanner scanner = new Scanner(fileToRead))
            {
                while (scanner.hasNext())
                {
                    lines.add(Integer.parseInt(scanner.next()));

                }
            }
            catch (FileNotFoundException e)
            {
                System.out.println(e.getMessage());
            }
        }

       /* for (String line: lines)
        {
            System.out.println(line);
        }*/
       return lines;
    }

}
