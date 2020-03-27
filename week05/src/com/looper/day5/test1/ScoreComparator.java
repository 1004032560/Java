package com.looper.day5.test1;

import java.util.Comparator;

public class ScoreComparator implements Comparator<StudentOuter> {
    @Override
    public int compare(StudentOuter o1, StudentOuter o2) {
        return o1.getScore()-o2.getScore();
    }
}
