// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor XMoveWindow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XMoveWindow$MH = RuntimeHelper.downcallHandle(
        "XMoveWindow",
        constants$43.XMoveWindow$FUNC, false
    );
    static final FunctionDescriptor XNextEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XNextEvent$MH = RuntimeHelper.downcallHandle(
        "XNextEvent",
        constants$43.XNextEvent$FUNC, false
    );
    static final FunctionDescriptor XNoOp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XNoOp$MH = RuntimeHelper.downcallHandle(
        "XNoOp",
        constants$43.XNoOp$FUNC, false
    );
    static final FunctionDescriptor XParseColor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XParseColor$MH = RuntimeHelper.downcallHandle(
        "XParseColor",
        constants$43.XParseColor$FUNC, false
    );
    static final FunctionDescriptor XParseGeometry$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XParseGeometry$MH = RuntimeHelper.downcallHandle(
        "XParseGeometry",
        constants$43.XParseGeometry$FUNC, false
    );
    static final FunctionDescriptor XPeekEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XPeekEvent$MH = RuntimeHelper.downcallHandle(
        "XPeekEvent",
        constants$43.XPeekEvent$FUNC, false
    );
}


