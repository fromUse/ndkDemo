LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_C_INCLUDES := com_conykais_normalndkdemo_MainActivity.h
LOCAL_MODULE := jni_hello
LOCAL_SRC_FILES := hello.c
include $(BUILD_SHARED_LIBRARY)