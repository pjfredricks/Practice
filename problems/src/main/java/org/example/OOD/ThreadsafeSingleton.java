package org.example.OOD;

public class ThreadsafeSingleton {

    private ThreadsafeSingleton() {
    }

    private static class SingletonHelper {
        private static final ThreadsafeSingleton SINGLETON = new ThreadsafeSingleton();
    }

    public static ThreadsafeSingleton getInstance() {
        return SingletonHelper.SINGLETON;
    }
}
