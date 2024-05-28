package com.r.Buffereaderoutputstream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * Life is a fucking movie
 * 生而自由
 */
public class outPut01 {
    public static void main(String[] args) {

    }
@Test
    public void r1() {
        String srcPath = "C:\\Users\\19538\\Desktop\\桌面图片幻灯片\\1658671894037.jpg";
        String descPath = "C:\\Users\\19538\\Desktop\\面试\\11111111111111.jpg";

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcPath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(descPath));
            byte[] byte1 = new byte[1024];
            int w = 0;
            while ((w = bufferedInputStream.read(byte1)) != -1) {
                bufferedOutputStream.write(byte1,0,w);
            }
            System.out.println("完成");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
