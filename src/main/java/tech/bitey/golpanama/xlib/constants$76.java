// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$76 {

    static final FunctionDescriptor XGetNormalHints$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetNormalHints$MH = RuntimeHelper.downcallHandle(
        "XGetNormalHints",
        constants$76.XGetNormalHints$FUNC, false
    );
    static final FunctionDescriptor XGetRGBColormaps$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XGetRGBColormaps$MH = RuntimeHelper.downcallHandle(
        "XGetRGBColormaps",
        constants$76.XGetRGBColormaps$FUNC, false
    );
    static final FunctionDescriptor XGetSizeHints$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XGetSizeHints$MH = RuntimeHelper.downcallHandle(
        "XGetSizeHints",
        constants$76.XGetSizeHints$FUNC, false
    );
    static final FunctionDescriptor XGetStandardColormap$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XGetStandardColormap$MH = RuntimeHelper.downcallHandle(
        "XGetStandardColormap",
        constants$76.XGetStandardColormap$FUNC, false
    );
    static final FunctionDescriptor XGetTextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XGetTextProperty$MH = RuntimeHelper.downcallHandle(
        "XGetTextProperty",
        constants$76.XGetTextProperty$FUNC, false
    );
    static final FunctionDescriptor XGetVisualInfo$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetVisualInfo$MH = RuntimeHelper.downcallHandle(
        "XGetVisualInfo",
        constants$76.XGetVisualInfo$FUNC, false
    );
}


