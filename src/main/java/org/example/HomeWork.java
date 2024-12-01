package org.example;


import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;

public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Решить задачу https://codeforces.com/problemset/problem/1324/C
     */
    @SneakyThrows
    public void frogSteps(InputStream in, OutputStream out) {
        var bi = new BufferedReader(new InputStreamReader(in));
        var bo = new PrintStream(out);
        var count = Integer.parseInt(bi.readLine());
        for (int i = 0; i < count; i++) {
            var s = bi.readLine();
            var max = s.length() + 1;
            var list = new ArrayList<Integer>();
            list.add(0);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'R') {
                    list.add(j + 1);
                }
            }
            list.add(max);
            var d = 0;
            for (int j = 1; j < list.size(); j++) {
                d = Math.max(d, list.get(j) - list.get(j - 1));
            }
            bo.println(d);
        }
        bo.flush();
    }



}
