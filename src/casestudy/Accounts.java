package casestudy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Accounts {

    private String user;
    private String pass;
    private String phone;
    private String address;
    private String mail;
    private String name;
    private int age;

    public Accounts() {
    }

    public Accounts(String user, String pass, String phone, String address, String mail, String name, int age) {
        this.user = user;
        this.pass = pass;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
        this.name = name;
        this.age = age;
    }
    public void inputAccount(){
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("Nhâp tên tài khoản");
        user = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,16}");
        if (pattern.matcher(user).find()){
            break;
        }else System.out.println("Nhap ten dang nhap tư 8 den 16 ky tu");
        }
        while (true){
        System.out.println("Nhap mật khẩu");
        pass = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{8,16}");
        if (pattern.matcher(pass).find()){
            break;
        }else System.out.println("Nhap mat khau tư 8 den 16 ky tu");
        }
        System.out.println("Nhập số điện thoại");
        phone = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        address = scanner.nextLine();
        System.out.println("Nhập email");
        mail = scanner.nextLine();
        System.out.println("Nhập tên");
        name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        age = Integer.parseInt(scanner.nextLine());
    }

    public String getUser() {
        return user;
    }

//    public boolean setUser(String user) {
//
//            this.user = user;
//            return true;
//
//    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
