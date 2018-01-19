package conykais.jnilib;

/**
 * Created by chen-gui on 18-1-19.
 */

public class JniUtils {

    static {
        System.loadLibrary("jni_hello"); //Loads and links the library with the specified name.
    }

    public native String getString();

    public native int intFromJNI();

    public native int getStringLenght(String str);
}

