package model;

public class Validation {
    public boolean is_valid(String var) {
        int count_dot = 0;
        String new_var = "";
        for (int i = 0; i < var.length(); i++) {
            if (var.charAt(i) == '.') {
                count_dot++;
            }
            new_var += var.charAt(i);
        }
        if(count_dot > 1){
            return false;
        }
        return true;
    }
    public boolean is_valid_operand(String operator) {
        if (operator.length() > 1) {
            return false;
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            return true;
        }
        return false;
    }

    String format_var(String var) {
        return var;
    }


    String format_operator(String operator) {
        return operator;
    }

    public static void main(String[] args) {
        Validation validation = new Validation();
        System.out.println(validation.is_valid("123.45"));
        System.out.println(validation.is_valid("123.45.67"));
        System.out.println(validation.is_valid_operand("+"));
        System.out.println(validation.is_valid_operand("++"));
    }
}
