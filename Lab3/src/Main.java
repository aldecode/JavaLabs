import UserTask.User;
import UserTask.UserDTO;
import UserTask.UserMapper;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Task #1
        System.out.println("\nTask#1");
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream().filter(str -> str.contains("c")).map(str -> str.toUpperCase(Locale.ROOT)).sorted().forEach(System.out::println);

        //Task#2
        System.out.println("\nTask#2");
        Random random = new Random();
        int[] arr = new int [10 + random.nextInt(20)];
        System.out.println("Array length: " + arr.length);
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);

            System.out.print(arr[i] + " ");

        }
        System.out.print("]");

        Double sum = Arrays.stream(arr).filter(x -> x % 2 == 0).average().getAsDouble();
        System.out.println("\nAverage of even nums: " + sum);

        //Task #3
        System.out.println("\nTask#3");
        String str = "asdfghjklqwertyuiopzxcvbnm";

        StringBuilder sb = new StringBuilder();
        Arrays.stream(str.split("")).forEach(x -> {
            if (x.matches("[h-t]")) {
                sb.append(x.toUpperCase());
            } else {
                sb.append(x);
            }
        });
        System.out.println(sb.toString());

        //Task #4
        System.out.println("\nTask#4 (User Mapping)\n");

        List<User> users = new ArrayList<>();

        users.add(new User("Johanson", 21, 162, 1, "password", "email@gmail.com"));
        users.add(new User("Johnson", 15, 210, 3, "password", "email@gmail.com"));
        users.add(new User("Johnny", 12, 150, 1, "password", "email@gmail.com"));
        users.add(new User("Joshy", 42, 188, 2, "password", "email@gmail.com"));
        users.add(new User("John", 18, 180, 2, "password", "email@gmail.com"));
        users.add(new User("Josh", 19, 181, 3, "password", "email@gmail.com"));

        List<UserDTO> mappedUsers = users.stream().filter(x -> x.getAge() >= 18).map(UserMapper::mapToDTO).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Mapped users: ");
        for (var user :
                mappedUsers) {
            System.out.printf("Name: %s, Age: %s, Email: %s\n", user.getName(), user.getAge(), user.getEmail());
        }
    }
}
