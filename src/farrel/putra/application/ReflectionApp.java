package farrel.putra.application;

import farrel.putra.data.CreateUserRequest;
import farrel.putra.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Farrel");
        request.setPassword("123");
        request.setName("Farrel");

        ValidationUtil.validationReflection(request);
    }
}
