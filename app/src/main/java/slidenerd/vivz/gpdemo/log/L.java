package slidenerd.vivz.gpdemo.log;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
/**
 * Created by Advait on 02/05/17.
 */
public class L {
    public static void m(String message) {
        Log.d("VIVZ", message);
    }

    public static void s(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}