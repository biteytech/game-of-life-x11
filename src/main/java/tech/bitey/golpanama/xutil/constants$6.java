// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$6 {

    static final FunctionDescriptor XSynchronize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XSynchronize$MH = RuntimeHelper.downcallHandle(
        "XSynchronize",
        constants$6.XSynchronize$FUNC, false
    );
    static final FunctionDescriptor XSetAfterFunction$x0$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XSetAfterFunction$x0$MH = RuntimeHelper.downcallHandle(
        constants$6.XSetAfterFunction$x0$FUNC, false
    );
    static final FunctionDescriptor XSetAfterFunction$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XSetAfterFunction$MH = RuntimeHelper.downcallHandle(
        "XSetAfterFunction",
        constants$6.XSetAfterFunction$FUNC, false
    );
    static final FunctionDescriptor XInternAtom$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XInternAtom$MH = RuntimeHelper.downcallHandle(
        "XInternAtom",
        constants$6.XInternAtom$FUNC, false
    );
    static final FunctionDescriptor XInternAtoms$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XInternAtoms$MH = RuntimeHelper.downcallHandle(
        "XInternAtoms",
        constants$6.XInternAtoms$FUNC, false
    );
}


