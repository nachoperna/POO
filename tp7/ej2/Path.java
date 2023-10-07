package ej2;

import java.util.ArrayList;

public class Path {
    private ArrayList<String> path = new ArrayList<>();

    public Path() {

    }

    public void add(String x) {
        path.add(x);
    }

    @Override
    public String toString() {
        String x = "";
        for (String p : path) {
            x += "\n" + p;
        }
        return x;
    }

}
