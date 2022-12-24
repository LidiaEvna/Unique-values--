package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> initialList = new ArrayList<>(); //создает пустой список
        // добавим в список ряд элементов
        initialList.add(" 1 ");
        initialList.add(" 1 ");
        initialList.add(" 990 ");
        initialList.add(" 10 ");
        initialList.add(" 34 ");
        initialList.add(" 34 ");
        System.out.println("\n Изначальный список: " + initialList);

        Set<String> set = new LinkedHashSet<>(initialList); // Хранит элемент только в одном экземпляре
        System.out.println("\n Уникальное значение: " + set);
    }
}
