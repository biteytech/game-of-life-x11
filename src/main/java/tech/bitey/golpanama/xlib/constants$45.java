// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$45 {

    static final FunctionDescriptor XProtocolVersion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XProtocolVersion$MH = RuntimeHelper.downcallHandle(
        "XProtocolVersion",
        constants$45.XProtocolVersion$FUNC
    );
    static final FunctionDescriptor XPutBackEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XPutBackEvent$MH = RuntimeHelper.downcallHandle(
        "XPutBackEvent",
        constants$45.XPutBackEvent$FUNC
    );
    static final FunctionDescriptor XPutImage$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XPutImage$MH = RuntimeHelper.downcallHandle(
        "XPutImage",
        constants$45.XPutImage$FUNC
    );
    static final FunctionDescriptor XQLength$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XQLength$MH = RuntimeHelper.downcallHandle(
        "XQLength",
        constants$45.XQLength$FUNC
    );
    static final FunctionDescriptor XQueryBestCursor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XQueryBestCursor$MH = RuntimeHelper.downcallHandle(
        "XQueryBestCursor",
        constants$45.XQueryBestCursor$FUNC
    );
    static final FunctionDescriptor XQueryBestSize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XQueryBestSize$MH = RuntimeHelper.downcallHandle(
        "XQueryBestSize",
        constants$45.XQueryBestSize$FUNC
    );
}


