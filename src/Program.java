import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class Program {

	public static void main(String[] args) {

		// Gets the default toolkit.
        Toolkit toolkit = Toolkit.getDefaultToolkit(); 

        // Update the locking state for caps lock button to true 
        // will turn the caps lock on.
        toolkit.setLockingKeyState(KeyEvent.VK_CAPS_LOCK, Boolean.TRUE);
	}
}
