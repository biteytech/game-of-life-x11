// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$25 {

    static final FunctionDescriptor XCheckMaskEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCheckMaskEvent$MH = RuntimeHelper.downcallHandle(
        "XCheckMaskEvent",
        constants$25.XCheckMaskEvent$FUNC, false
    );
    static final FunctionDescriptor XCheckTypedEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCheckTypedEvent$MH = RuntimeHelper.downcallHandle(
        "XCheckTypedEvent",
        constants$25.XCheckTypedEvent$FUNC, false
    );
    static final FunctionDescriptor XCheckTypedWindowEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCheckTypedWindowEvent$MH = RuntimeHelper.downcallHandle(
        "XCheckTypedWindowEvent",
        constants$25.XCheckTypedWindowEvent$FUNC, false
    );
    static final FunctionDescriptor XCheckWindowEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCheckWindowEvent$MH = RuntimeHelper.downcallHandle(
        "XCheckWindowEvent",
        constants$25.XCheckWindowEvent$FUNC, false
    );
    static final FunctionDescriptor XCirculateSubwindows$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XCirculateSubwindows$MH = RuntimeHelper.downcallHandle(
        "XCirculateSubwindows",
        constants$25.XCirculateSubwindows$FUNC, false
    );
    static final FunctionDescriptor XCirculateSubwindowsDown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XCirculateSubwindowsDown$MH = RuntimeHelper.downcallHandle(
        "XCirculateSubwindowsDown",
        constants$25.XCirculateSubwindowsDown$FUNC, false
    );
}


