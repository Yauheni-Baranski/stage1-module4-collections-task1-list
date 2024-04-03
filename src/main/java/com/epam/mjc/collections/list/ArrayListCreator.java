package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        List<String> result = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i += 3) {
            result.add(sourceList.get(i));
            result.add(sourceList.get(i));
        }
        return (ArrayList<String>) result;

    }
}

