package com.finance.controller;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * 控制器用于生成验证码
 * @author lizelong
 * */
@Controller
public class DrawImageController {
    public static final int WIDTH = 120;
    public static final int HEIGHT = 30;

    /**
     * 生成图片
     * @param request
     * @param response
     * */
    public void drawImage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        // 创建缓存
        BufferedImage bi = new BufferedImage(WIDTH, HEIGHT,
                BufferedImage.TYPE_INT_RGB);
        // 获得画布
        Graphics g = bi.getGraphics();
        // 设置背影色
        // 设置颜色
        g.setColor(new Color(22, 160, 133));
        // 填充区域
        g.fillRect(0, 0, WIDTH, HEIGHT);
        // 设置边框
        // 设置边框颜色
        g.setColor(new Color(22, 160, 133));
        // 边框区域
        g.drawRect(1, 1, WIDTH - 2, HEIGHT - 2);
        // 画干扰线
        // 设置颜色
        g.setColor(Color.WHITE);
        // 设置线条个数并画线
        for (int i = 0; i < 5; i++) {
            int x1 = new Random().nextInt(WIDTH);
            int y1 = new Random().nextInt(HEIGHT);
            int x2 = new Random().nextInt(WIDTH);
            int y2 = new Random().nextInt(HEIGHT);
            g.drawLine(x1, y1, x2, y2);
        }

        //重点，生成随机数！！
        drawRandomNum((Graphics2D) g);
    }

    /**
     * 画随机汉字
     *
     * @param g
     * @return
     */
    private String drawRandomNum(Graphics2D g) {
        return "";
    }
}
