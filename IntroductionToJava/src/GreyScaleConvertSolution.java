package firstweek;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GreyScaleConvertSolution {

	private static final String IMAGE_PATH = "D:\\images\\img.jpg";

	public static void convertToGreyscale(String IMAGE_PATH) throws IOException {

		int greenValue = 150;
		int blueValue = 200;
		int redValue = 100;
		int alphaValue = 255;

		File file = new File(IMAGE_PATH);
		BufferedImage image = ImageIO.read(file);
		int imageWidth = image.getWidth();
		int imageHeight = image.getHeight();
		int currentPixel;

		for (int i = 0; i < imageHeight; i++) {
			for (int j = 0; j < imageWidth; j++) {
				currentPixel = image.getRGB(j, i);
				if (currentPixel != alphaValue) {

					int alpha = (currentPixel >> 24) & 255;
					redValue = (currentPixel >> 16) & 255;
					greenValue = (currentPixel >> 8) & 255;
					blueValue = currentPixel & 255;

					int average = (redValue + greenValue + blueValue) / 3;
					int newRGB = alpha << 24 | average << 16 | average << 8 | average;
					image.setRGB(j, i, newRGB);

				}
			}
		}
		File outputfile = new File("D:\\Images\\image.jpg");
		ImageIO.write(image, "jpg", outputfile);

	}

	public static void main(String args[]) throws IOException {
		convertToGreyscale(IMAGE_PATH);

	}

}
