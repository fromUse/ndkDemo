LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_C_INCLUDES := conykais_jnilib2_JniTest.h
LOCAL_MODULE := jni_test
LOCAL_SRC_FILES := JniTest.c
LOCAL_LDLIBS :=-llog
include $(BUILD_SHARED_LIBRARY)