// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$60 {

    static final FunctionDescriptor XUnmapWindow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XUnmapWindow$MH = RuntimeHelper.downcallHandle(
        "XUnmapWindow",
        constants$60.XUnmapWindow$FUNC
    );
    static final FunctionDescriptor XVendorRelease$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XVendorRelease$MH = RuntimeHelper.downcallHandle(
        "XVendorRelease",
        constants$60.XVendorRelease$FUNC
    );
    static final FunctionDescriptor XWarpPointer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XWarpPointer$MH = RuntimeHelper.downcallHandle(
        "XWarpPointer",
        constants$60.XWarpPointer$FUNC
    );
    static final FunctionDescriptor XWidthMMOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XWidthMMOfScreen$MH = RuntimeHelper.downcallHandle(
        "XWidthMMOfScreen",
        constants$60.XWidthMMOfScreen$FUNC
    );
    static final FunctionDescriptor XWidthOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XWidthOfScreen$MH = RuntimeHelper.downcallHandle(
        "XWidthOfScreen",
        constants$60.XWidthOfScreen$FUNC
    );
    static final FunctionDescriptor XWindowEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XWindowEvent$MH = RuntimeHelper.downcallHandle(
        "XWindowEvent",
        constants$60.XWindowEvent$FUNC
    );
}


