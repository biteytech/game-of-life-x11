// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$35 {

    static final FunctionDescriptor XFreeColors$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XFreeColors$MH = RuntimeHelper.downcallHandle(
        "XFreeColors",
        constants$35.XFreeColors$FUNC, false
    );
    static final FunctionDescriptor XFreeCursor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XFreeCursor$MH = RuntimeHelper.downcallHandle(
        "XFreeCursor",
        constants$35.XFreeCursor$FUNC, false
    );
    static final FunctionDescriptor XFreeExtensionList$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XFreeExtensionList$MH = RuntimeHelper.downcallHandle(
        "XFreeExtensionList",
        constants$35.XFreeExtensionList$FUNC, false
    );
    static final FunctionDescriptor XFreeFont$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XFreeFont$MH = RuntimeHelper.downcallHandle(
        "XFreeFont",
        constants$35.XFreeFont$FUNC, false
    );
    static final FunctionDescriptor XFreeFontInfo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XFreeFontInfo$MH = RuntimeHelper.downcallHandle(
        "XFreeFontInfo",
        constants$35.XFreeFontInfo$FUNC, false
    );
    static final FunctionDescriptor XFreeFontNames$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XFreeFontNames$MH = RuntimeHelper.downcallHandle(
        "XFreeFontNames",
        constants$35.XFreeFontNames$FUNC, false
    );
}

