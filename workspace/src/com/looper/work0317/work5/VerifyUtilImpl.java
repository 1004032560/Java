package com.looper.work0317.work5;

public class VerifyUtilImpl implements VerifyUtil {
    @Override
    public boolean verifyPhone(String phoneNo) {

        String phoneRegex = "^1(3|4|5|6|7|8|9)\\d{9}$";
        boolean flag = phoneNo.matches(phoneRegex);

        return flag;
    }

    @Override
    public boolean verifyEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
        boolean flag = email.matches(emailRegex);

        return flag;
    }
}
