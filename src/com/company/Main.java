package com.company;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.util.stream.Stream;
import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {
        List <Lection>group=new ArrayList<>();
        System.out.print("Введите число объектов в коллекции: ");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        System.out.print("Введите данные объекта: ");
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3=new Scanner(System.in);
        Scanner scanner4=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            Lection lect=new Lection();
            lect.Name=scanner2.nextLine();
            lect.Starting=scanner3.nextDouble();
            lect.Ending=scanner4.nextDouble();
            group.add(lect);
        }
        System.out.println(group);
        for(int i = 0; i < group.size(); i++){
            String lection=group.get(i).PrintInfo();
            System.out.println(lection);
        }
        Collections.sort(group, new Sortbyroll1());
        Collections.sort(group, new Sortbyroll2());
        System.out.println("\nОтсортированный массив:");
        for(int i = 0; i < group.size(); i++){
            String lection=group.get(i).PrintInfo();
            System.out.println(lection);
        }
    }
}
