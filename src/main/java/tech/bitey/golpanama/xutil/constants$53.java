// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$53 {

    static final FunctionDescriptor XSetFunction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XSetFunction$MH = RuntimeHelper.downcallHandle(
        "XSetFunction",
        constants$53.XSetFunction$FUNC, false
    );
    static final FunctionDescriptor XSetGraphicsExposures$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XSetGraphicsExposures$MH = RuntimeHelper.downcallHandle(
        "XSetGraphicsExposures",
        constants$53.XSetGraphicsExposures$FUNC, false
    );
    static final FunctionDescriptor XSetIconName$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XSetIconName$MH = RuntimeHelper.downcallHandle(
        "XSetIconName",
        constants$53.XSetIconName$FUNC, false
    );
    static final FunctionDescriptor XSetInputFocus$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XSetInputFocus$MH = RuntimeHelper.downcallHandle(
        "XSetInputFocus",
        constants$53.XSetInputFocus$FUNC, false
    );
    static final FunctionDescriptor XSetLineAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XSetLineAttributes$MH = RuntimeHelper.downcallHandle(
        "XSetLineAttributes",
        constants$53.XSetLineAttributes$FUNC, false
    );
    static final FunctionDescriptor XSetModifierMapping$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XSetModifierMapping$MH = RuntimeHelper.downcallHandle(
        "XSetModifierMapping",
        constants$53.XSetModifierMapping$FUNC, false
    );
}


