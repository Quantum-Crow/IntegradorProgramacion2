// Usuario.java
public class Usuario {
    private String auth0Id;
    private String username;
    private Rol rol;

    public Usuario(String auth0Id, String username, Rol rol) {
        this.auth0Id = auth0Id;
        this.username = username;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario[" + username;
    }
}
