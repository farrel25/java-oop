package farrel.putra.application;

import farrel.putra.data.LoginRequest;
import farrel.putra.error.ValidationException;
import farrel.putra.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) throws ValidationException {

        //LoginRequest loginRequest = new LoginRequest(null, null);
        LoginRequest loginRequest = new LoginRequest("Farrel", "rahasia");
        //LoginRequest loginRequest = new LoginRequest(null, "rahasia");
        //LoginRequest loginRequest = new LoginRequest("  ", "rahasia");

//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data valid");
//        } catch (ValidationException exception) {
//            System.out.println("Data tidak valid: " + exception.getMessage());
//        } catch (NullPointerException exception) {
//            System.out.println("Data null: " + exception.getMessage());
//        }

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Terjadi error: " + exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }


        System.out.println("\n==========\n");


        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");

    }
}
