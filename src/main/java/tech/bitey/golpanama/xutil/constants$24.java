// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$24 {

    static final FunctionDescriptor XChangeProperty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XChangeProperty$MH = RuntimeHelper.downcallHandle(
        "XChangeProperty",
        constants$24.XChangeProperty$FUNC, false
    );
    static final FunctionDescriptor XChangeSaveSet$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XChangeSaveSet$MH = RuntimeHelper.downcallHandle(
        "XChangeSaveSet",
        constants$24.XChangeSaveSet$FUNC, false
    );
    static final FunctionDescriptor XChangeWindowAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XChangeWindowAttributes$MH = RuntimeHelper.downcallHandle(
        "XChangeWindowAttributes",
        constants$24.XChangeWindowAttributes$FUNC, false
    );
    static final FunctionDescriptor XCheckIfEvent$x0$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCheckIfEvent$x0$MH = RuntimeHelper.downcallHandle(
        constants$24.XCheckIfEvent$x0$FUNC, false
    );
    static final FunctionDescriptor XCheckIfEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCheckIfEvent$MH = RuntimeHelper.downcallHandle(
        "XCheckIfEvent",
        constants$24.XCheckIfEvent$FUNC, false
    );
}

