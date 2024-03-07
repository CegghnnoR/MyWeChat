package org.chengrong.naive.chat.ui;

import javafx.stage.Stage;
import org.chengrong.naive.chat.ui.view.login.ILoginMethod;
import org.chengrong.naive.chat.ui.view.login.LoginController;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        ILoginMethod login = new LoginController((userId, userPassword) -> {
            System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
        });

        login.doShow();
    }

    public static void main(String[] args) {
        launch(args);
    }

}