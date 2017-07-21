    ResultSet resultado =statement.executeQuery(
            "SELECT ID_USER, "
            + "USER_USERNAME, "
            + "USER_PASS, "
            + "USER_NOMBRE, "
            + "USER_APELLIDO, "
            + "USER_FONO, USER_ROL "
            + "FROM user "
            + "where USER_USERNAME = '"+LoginController.userId+"' "
            + "and USER_PASS = '"+LoginController.password+"'");
