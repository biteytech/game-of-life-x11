// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$10 {

    static final FunctionDescriptor XGetFontPath$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetFontPath$MH = RuntimeHelper.downcallHandle(
        "XGetFontPath",
        constants$10.XGetFontPath$FUNC, false
    );
    static final FunctionDescriptor XListExtensions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListExtensions$MH = RuntimeHelper.downcallHandle(
        "XListExtensions",
        constants$10.XListExtensions$FUNC, false
    );
    static final FunctionDescriptor XListProperties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListProperties$MH = RuntimeHelper.downcallHandle(
        "XListProperties",
        constants$10.XListProperties$FUNC, false
    );
    static final FunctionDescriptor XListHosts$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListHosts$MH = RuntimeHelper.downcallHandle(
        "XListHosts",
        constants$10.XListHosts$FUNC, false
    );
    static final FunctionDescriptor XKeycodeToKeysym$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XKeycodeToKeysym$MH = RuntimeHelper.downcallHandle(
        "XKeycodeToKeysym",
        constants$10.XKeycodeToKeysym$FUNC, false
    );
    static final FunctionDescriptor XLookupKeysym$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XLookupKeysym$MH = RuntimeHelper.downcallHandle(
        "XLookupKeysym",
        constants$10.XLookupKeysym$FUNC, false
    );
}


