package com.company;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
class Sortbyroll2 implements Comparator<Lection>{
    @Override
    public int compare(Lection a, Lection b) {
        return Double.compare(a.Ending, b.Ending);
    }
}
