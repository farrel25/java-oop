package farrel.putra.application;

public class StackTraceApp {
    public static void main(String[] args) {

//        try {
//            String[] names = {
//                    "Farrel", "Athaillah", "Putra"
//            };
//            System.out.println(names[100]);
//        } catch (Throwable throwable) {
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//            System.out.println("throwable.getMessage(): " + throwable.getMessage());
//            throwable.printStackTrace();
//        }

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Farrel", "Athaillah", "Putra"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
