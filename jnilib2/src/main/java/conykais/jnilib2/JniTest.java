package conykais.jnilib2;

/**
 * Created by chen-gui on 18-1-19.
 */

public class JniTest {
    static {
        //当前so的文件名为libjni_test.so,但是加载时要把前后缀去掉，
        System.loadLibrary("jni_test");
    }

    public native static int getIntForJNI();
}
