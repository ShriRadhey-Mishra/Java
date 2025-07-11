package Basics;

class Keyboard {
    protected int keys;
    protected String color;

    public Keyboard(int keys, String color) {
        this.keys = keys;
        this.color = color;
    }

    public void getKeys() {
        System.out.println(keys);
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public void getColor() {
        System.out.println(color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void pressKey() {
        System.out.println("Key pressed!");
    }

    public void pressKey(int k) {
        System.out.println("Key " + k + " pressed!");
    }

    public void hitSomeone() {
        System.out.println("-5 hp");
        keys -= 5;
    }
}

class AdvancedKeyboard extends Keyboard {
    public AdvancedKeyboard(int keys, String color) {
        super(keys, color);
    }

    @Override
    public void hitSomeone() {
        System.out.println("-10 hp");
        keys -= 10;
    }

    public void showTrueColours() {
        System.out.println(color);
    }
}

public class OOP {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(5, "Red");
        AdvancedKeyboard advancedKeyboard = new AdvancedKeyboard(0, "Black");

        keyboard.getKeys();
        keyboard.getColor();
        keyboard.pressKey();
        keyboard.pressKey(2);
        keyboard.hitSomeone();
        keyboard.getKeys();

        System.out.println("------------------------------------------------------");

        advancedKeyboard.setKeys(100);
        advancedKeyboard.setColor("White");
        advancedKeyboard.getKeys();
        advancedKeyboard.showTrueColours();
        advancedKeyboard.hitSomeone();
        advancedKeyboard.getKeys();
    }
}
