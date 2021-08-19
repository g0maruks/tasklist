package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    public static List<String> validate(Task t) {
        List<String> errors = new ArrayList<String>();

        String content_error = validateTitle(t.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    // 仕事内容の必須入力チェック
    private static String validateTitle(String content) {
        if(content == null || content.equals("")) {
            return "仕事内容を入力してください。";
        }

        return "";
    }


}
