package com.practice.interface_;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretMessageDecoder {

    static class Point {
        int x;
        int y;
        char ch;

        Point(int x, int y, char ch) {
            this.x = x;
            this.y = y;
            this.ch = ch;
        }
    }

    public static void printSecretMessage(String url) throws Exception {

        Document doc = Jsoup.connect(url).get();

        Elements rows = doc.select("table tr");

        List<Point> points = new ArrayList<>();

        int maxX = 0;
        int maxY = 0;

        // Skip header row
        for (int i = 1; i < rows.size(); i++) {

            Elements cols = rows.get(i).select("td");

            if (cols.size() != 3)
                continue;

            int x = Integer.parseInt(cols.get(0).text().trim());
            char ch = cols.get(1).text().charAt(0);
            int y = Integer.parseInt(cols.get(2).text().trim());

            points.add(new Point(x, y, ch));

            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        char[][] grid = new char[maxY + 1][maxX + 1];

        for (char[] row : grid)
            Arrays.fill(row, ' ');

        for (Point p : points)
            grid[p.y][p.x] = p.ch;

        for (char[] row : grid)
            System.out.println(new String(row));
    }

    public static void main(String[] args) throws Exception {

        String url =
                "https://docs.google.com/document/d/e/2PACX-1vSvM5gDlNvt7npYHhp_XfsJvuntUhq184By5xO_pA4b_gCWeXb6dM6ZxwN8rE6S4ghUsCj2VKR21oEP/pub";

        printSecretMessage(url);
    }
}