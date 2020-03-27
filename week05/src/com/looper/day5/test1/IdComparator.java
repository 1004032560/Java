package com.looper.day5.test1;

import java.util.Comparator;

public class IdComparator implements Comparator<StudentOuter> {
    @Override
    public int compare(StudentOuter o1, StudentOuter o2) {
        return o1.getId()-o2.getId();
    }
}
