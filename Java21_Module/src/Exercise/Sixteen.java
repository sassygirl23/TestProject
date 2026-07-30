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
}


