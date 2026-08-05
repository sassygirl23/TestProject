package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Sixteen {

    static class Image {
        private int width;
        private int height;

        public Image(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return width + " x " + height;
        }
    }
    public static List<Image> filterImages(List<Image> images, Predicate<Image> predicate) {

        List<Image> filteredImages = new ArrayList<>();

        for (Image image : images) {
            if (predicate.test(image)) {
                filteredImages.add(image);
                
            }   
        }

        return filteredImages;
    }
 // Exercise #4
    public static void main(String[] args) {

        List<Image> images = new ArrayList<>();

        images.add(new Image(50, 50));
        images.add(new Image(120, 90));
        images.add(new Image(80, 80));
        images.add(new Image(200, 150));
        images.add(new Image(90, 95));

        // i f'filter yung  images that are smaller than 100 x 100
        List<Image> smallImages = filterImages(
                images,
                image -> image.getWidth() < 100 && image.getHeight() < 100
        );

        System.out.println("Images smaller than 100 x 100:");

        for (Image image : smallImages) {
            System.out.println(image);
        }
    }

}


