package farrel.putra.data;

public class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

class FakeFacebook extends Facebook {

    // ERROR
    // @Override
    // void login(String username, String password) {
        //
    // }
}
