//
// Created by chen-gui on 18-1-19.
//
#include <jni.h>
#include <string>
#include "com_conykais_normalndkdemo_MainActivity.h"
JNIEXPORT jstring JNICALL Java_com_conykais_normalndkdemo_MainActivity_stringFromJNI
  (JNIEnv* env, jobject obj){

    return env->NewStringUTF("hello jni");
}
