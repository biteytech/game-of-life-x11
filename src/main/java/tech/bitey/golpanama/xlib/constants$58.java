// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$58 {

    static final FunctionDescriptor XTextWidth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XTextWidth$MH = RuntimeHelper.downcallHandle(
        "XTextWidth",
        constants$58.XTextWidth$FUNC, false
    );
    static final FunctionDescriptor XTextWidth16$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XTextWidth16$MH = RuntimeHelper.downcallHandle(
        "XTextWidth16",
        constants$58.XTextWidth16$FUNC, false
    );
    static final FunctionDescriptor XTranslateCoordinates$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XTranslateCoordinates$MH = RuntimeHelper.downcallHandle(
        "XTranslateCoordinates",
        constants$58.XTranslateCoordinates$FUNC, false
    );
    static final FunctionDescriptor XUndefineCursor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XUndefineCursor$MH = RuntimeHelper.downcallHandle(
        "XUndefineCursor",
        constants$58.XUndefineCursor$FUNC, false
    );
    static final FunctionDescriptor XUngrabButton$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XUngrabButton$MH = RuntimeHelper.downcallHandle(
        "XUngrabButton",
        constants$58.XUngrabButton$FUNC, false
    );
    static final FunctionDescriptor XUngrabKey$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XUngrabKey$MH = RuntimeHelper.downcallHandle(
        "XUngrabKey",
        constants$58.XUngrabKey$FUNC, false
    );
}


