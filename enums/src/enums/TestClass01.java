package enums;

public class TestClass01 {

    static class Device implements AutoCloseable {
        private int index;

        public Device(int index) {
            this.index = index;
            System.out.println("Device " + index + " opened");
        }

        public String read() throws Exception {
            if (index == 2) {
                throw new Exception("Unable to read Device " + index);
            }

            System.out.println("Device " + index + " reading");
            return "Device " + index + " data";
        }

        @Override
        public void close() {
            System.out.println("Device " + index + " closed");
        }
    }

    public static void main(String[] args) {

        Device d1 = new Device(1);

        try (d1; Device d2  = new Device(2)) { //throws Exception

            System.out.println(d1.read());
            System.out.println(d2.read());

        } catch (Exception e) {

            System.out.println("Exception received: " + e.getMessage());

        } finally {

            System.out.println("In Finally");

        }
    }
}