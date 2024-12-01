package org.example;


import lombok.SneakyThrows;
import org.example.stage1.Tree23;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

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
            var tree = new Tree23<Integer>();
            var prev = 0;
            for (int j = 0; j < s.length(); j++) {
                if ('R' == s.charAt(j)) {
                    tree.add(j + 1 - prev);
                    prev = j + 1;
                }
            }
            tree.add(s.length() + 1 - prev);
            bo.println(tree.getMax());
        }
        bo.flush();
    }


}
