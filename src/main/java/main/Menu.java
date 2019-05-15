package main;

import filemanager.ReadFromFile;
import filemanager.SaveToFile;

import java.util.ArrayList;
import java.util.List;

public class Menu
{
    public static void main(String[] args)
    {
        ReadFromFile readFromFile = new ReadFromFile();

        List<Integer> integerList = readFromFile.readFromFile("/home/dominik/Pobrane/number.txt");

        System.out.println("Liczby wczytane z pliku: ");

        for (Integer integer: integerList)
        {
            System.out.println(integer);
        }


        System.out.println("Liczby mniejsze niż 20 podniesione do potęgi 3: ");

        integerList = Exponentiation.exponentiation(integerList);

        for (Integer integer: integerList)
        {
            System.out.println(integer);
        }

        SaveToFile saveToFile = new  SaveToFile();
        saveToFile.saveToFile(integerList);

    }
}
