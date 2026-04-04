import login.register;

public class App {

    public static void main(String[] args) {
        String username = resolveArg(args, 0, "john_doe");
        String password = resolveArg(args, 1, "password123");
        String email = resolveArg(args, 2, "john@example.com");

        register newUser = new register(username, password, email);

        System.out.println("Registration preview");
        newUser.displayInfo();

        if (newUser.validateRegistration()) {
            System.out.println("Registration accepted.");
        } else {
            System.out.println("Registration rejected.");
        }
    }

    private static String resolveArg(String[] args, int index, String defaultValue) {
        if (args.length > index && args[index] != null && !args[index].trim().isEmpty()) {
            return args[index];
        }

        return defaultValue;
    }
}
