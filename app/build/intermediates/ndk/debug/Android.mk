LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := serialtest
LOCAL_LDLIBS := \
	-llog \

LOCAL_SRC_FILES := \
	C:\Users\Administrator\StudioProjects\serialtest\app\src\main\jni\com_topeet_serialtest_serial.c \

LOCAL_C_INCLUDES += C:\Users\Administrator\StudioProjects\serialtest\app\src\main\jni
LOCAL_C_INCLUDES += C:\Users\Administrator\StudioProjects\serialtest\app\src\debug\jni

include $(BUILD_SHARED_LIBRARY)
