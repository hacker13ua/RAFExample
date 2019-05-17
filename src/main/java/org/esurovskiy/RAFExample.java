package org.esurovskiy;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.List;

public class RAFExample {
    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        RandomAccessFile file =
                new RandomAccessFile("/home/esurovskiy/dev/numbers.txt",
                        "rw");
        final byte[] array = new byte[20];
        for (Integer number : list) {
            file.seek((list.size() - 1) * 2 - number * 2);
            file.writeBytes(number.toString() + "\n");
        }
        file.close();
    }


}
