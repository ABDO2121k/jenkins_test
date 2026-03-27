package login;

public class register {
    
    // Attributs
    private String username;
    private String password;
    private String email;
    
    // Constructeur
    public register() {
        this.username = "";
        this.password = "";
        this.email = "";
    }
        // Ce commentaire est ajouté pour simuler un conflit de merge

    // Constructeur avec paramètres
    public register(String username, String password, 
        String email) {
        this.username = username;
        this.password = password;



        this.email = email;
    }

     public void setUsername(String username) {
        this.username = username;
    }
            // Ce commentaire est ajouté pour simuler un conflit de merge
    // Méthodes getters et setters
    public String getUsername() {
        return username;
    }
    
 
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Méthode pour afficher les informations (sans le mot de passe)
    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
    
    // Méthode pour valider l'inscription
    public boolean validateRegistration() {
        if (username == null || username.trim().isEmpty()) {
            System.out.println("Le nom d'utilisateur ne peut pas être vide");
            return false;
        }
        if (password == null || password.length() < 6) {
            System.out.println("Le mot de passe doit contenir au moins 6 caractères");
            return false;
        }
        if (email == null || !email.contains("@")) {
            System.out.println("Email invalide");
            return false;
        }
        return true;
    }
    
    // Méthode main pour tester
    public static void main(String[] args) {
        register newUser = new register("john_doe", "password123", "john@example.com");
        
        if (newUser.validateRegistration()) {
            System.out.println("Inscription réussie !");
            newUser.displayInfo();
        } else {
            System.out.println("Échec de l'inscription");
        }
    }
}