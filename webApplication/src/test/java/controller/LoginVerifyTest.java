package controller;

import com.mycompany.webapplication.controller.LoginVerify;
import com.mycompany.webapplication.entity.Users;
import com.mycompany.webapplication.model.UserDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LoginVerifyTest {

    @InjectMocks
    LoginVerify loginVerify;

    @Test
    void testCamposVazios() throws Exception {
        String email = "ryanserra@gmail.com";
        String senha = "124";
        Assertions.assertFalse(loginVerify.verificaCampos(email,senha));
    }
}
