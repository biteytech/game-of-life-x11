// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$44 {

    static final FunctionDescriptor XPeekIfEvent$x0$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XPeekIfEvent$x0$MH = RuntimeHelper.downcallHandle(
        constants$44.XPeekIfEvent$x0$FUNC, false
    );
    static final FunctionDescriptor XPeekIfEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XPeekIfEvent$MH = RuntimeHelper.downcallHandle(
        "XPeekIfEvent",
        constants$44.XPeekIfEvent$FUNC, false
    );
    static final FunctionDescriptor XPending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XPending$MH = RuntimeHelper.downcallHandle(
        "XPending",
        constants$44.XPending$FUNC, false
    );
    static final FunctionDescriptor XPlanesOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XPlanesOfScreen$MH = RuntimeHelper.downcallHandle(
        "XPlanesOfScreen",
        constants$44.XPlanesOfScreen$FUNC, false
    );
    static final FunctionDescriptor XProtocolRevision$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XProtocolRevision$MH = RuntimeHelper.downcallHandle(
        "XProtocolRevision",
        constants$44.XProtocolRevision$FUNC, false
    );
}


