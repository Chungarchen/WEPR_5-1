package murach.data;

import murach.business.User;

public class UserDB {
    public static void insert(User user) {
        // Ở đây tạm thời chỉ in ra thông tin user
        System.out.println("Inserting user: " + user.getEmail());
    }
}
