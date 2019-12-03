package bo.upb.programacion3.codelabpokedex.model.ui;

import bo.upb.programacion3.codelabpokedex.model.types.UserType;

public class UserLogged {
    private String email;

    private UserType type;

    public UserLogged(String email, UserType type) {
        this.email = email;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public UserType getType() {
        return type;
    }
}
