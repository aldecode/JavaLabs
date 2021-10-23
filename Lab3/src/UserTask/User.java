package UserTask;

public class User {
    private String name;
    private int age;
    private int height;
    private int group;
    private String password;
    private String email;

    public User(String name, int age, int height, int group, String password, String email) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.group = group;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getGroup() {
        return group;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
