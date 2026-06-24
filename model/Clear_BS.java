package model;

public class Clear_BS {
    String var;

    void clear() {
        var = "";
    }

    void backspace() {
        var = var.substring(0, var.length() - 1);
    }

    String get_var() {
        return var;
    }

    public static void main(String[] args) {
        Clear_BS clear_bs = new Clear_BS();
        clear_bs.var = "12345";
        clear_bs.clear();
        System.out.println(clear_bs.get_var());
        clear_bs.backspace();
        System.out.println(clear_bs.get_var());
    }
    
}
