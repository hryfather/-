package shopping.model;

import shopping.gui.LoginGui;

public class Main {
	public static void main(String[] args) {java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new LoginGui();
        }
    });
	}
}
