package com.depend.sssh.common.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * 验证码生成类
 * 
 * @project HMSM Web Syetem
 * @author blacksalon@163.com
 * @creationTime 2016-1-21 上午10:07:52
 * @version 1.0.0
 */
public class Captcha {

	private BufferedImage img; // 图片缓存区
	private String rand; // 随即验证码

	public static Captcha getCaptcha() {
		Captcha captcha = new Captcha();
		// 设置图片大小
		int width = 60, height = 25;
		// 定义验证码范围
		String str = "ABCDEFGHIJKLMNOPQRESTUVWXYZ123456789abcdefghijklmnopqrestuvwxyz";
		// 创建图片文件
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// 得到图片文件的绘图工具
		Graphics g = image.getGraphics();
		// 创建随机数
		Random random = new Random();
		// 设置绘图的颜色
		g.setColor(getRandColor(200, 250));
		// 设置在图片文件的那个范围内画内容
		g.fillRect(0, 0, width, height);
		// 设置图片文件中的文字字体
		g.setFont(new Font("微软雅黑", Font.BOLD, 18));
		// 存储生成验证码
		String rand = "";
		for (int i = 0; i < 4; i++) {
			// 设置绘图颜色
			g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
			int index = random.nextInt(str.length());
			if (rand.equals(str.charAt(index))) {
				i--;
			} else {
				rand += str.charAt(index);
				// 舒服字体
				g.drawString(str.charAt(index) + "", 13 * i + 6, 16);
				// 将生成的图片文件和验证码保存在制定的对象中
				captcha.img = image;
				captcha.rand = rand;
			}
		}
		g.dispose();
		return captcha;
	}

	/**
	 * 得到图片
	 * 
	 * @return BufferedImage 图片输出流
	 */
	public BufferedImage getImg() {
		return img;
	}

	/**
	 * 得到生成的验证码
	 * 
	 * @return String 验证码
	 */
	public String getRand() {
		return rand;
	}

	/**
	 * 设置随机颜色
	 * 
	 * @param fc
	 * @param bc
	 * @return
	 */
	public static Color getRandColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255) {
			fc = 255;
		}
		if (bc > 255) {
			bc = 255;
		}
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
}
