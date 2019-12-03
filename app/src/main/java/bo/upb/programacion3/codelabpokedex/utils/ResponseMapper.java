package bo.upb.programacion3.codelabpokedex.utils;

import bo.upb.programacion3.codelabpokedex.model.repository.User;
import bo.upb.programacion3.codelabpokedex.model.types.UserType;
import bo.upb.programacion3.codelabpokedex.model.ui.UserLogged;

public class ResponseMapper {

    public static UserLogged mapUserToUserLooged(User user) {
        if (user.getEmail().equals(Constants.USER_EMAIL_PROFESSOROAK)) {
            return new UserLogged(user.getEmail(), UserType.PROFESSOR_OAK);
        } else {
            return new UserLogged(user.getEmail(), UserType.OTHERS);
        }
    }
}