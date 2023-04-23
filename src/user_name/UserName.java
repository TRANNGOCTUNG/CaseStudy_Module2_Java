package user_name;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{4}$");
        Matcher usernameMatcher = pattern.matcher(username);
        if(!usernameMatcher.matches()){
            System.out.println("tên đăng nhập không đúng");
        } else {
            System.out.println("tên đăng nhập đúng");
        }
        Pattern passwors = Pattern.compile("^[0-9]{2}$");
        Matcher passwordMatcher = passwors.matcher(password);
        if(!passwordMatcher.matches()){
            System.out.println("Mật khẩu thất bại");
        } else {
            System.out.println("mật khẩu đúng");
        }
        try {
            FileWriter fileWriter = new FileWriter("userName.txt", true);
            fileWriter.write(username);
            fileWriter.write(password);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
