// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$82 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$82() {}
    static final FunctionDescriptor XSetRegion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XSetRegion$MH = RuntimeHelper.downcallHandle(
        "XSetRegion",
        constants$82.XSetRegion$FUNC
    );
    static final FunctionDescriptor XSetStandardColormap$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XSetStandardColormap$MH = RuntimeHelper.downcallHandle(
        "XSetStandardColormap",
        constants$82.XSetStandardColormap$FUNC
    );
    static final FunctionDescriptor XSetZoomHints$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XSetZoomHints$MH = RuntimeHelper.downcallHandle(
        "XSetZoomHints",
        constants$82.XSetZoomHints$FUNC
    );
    static final FunctionDescriptor XShrinkRegion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XShrinkRegion$MH = RuntimeHelper.downcallHandle(
        "XShrinkRegion",
        constants$82.XShrinkRegion$FUNC
    );
    static final FunctionDescriptor XStringListToTextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XStringListToTextProperty$MH = RuntimeHelper.downcallHandle(
        "XStringListToTextProperty",
        constants$82.XStringListToTextProperty$FUNC
    );
    static final FunctionDescriptor XSubtractRegion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XSubtractRegion$MH = RuntimeHelper.downcallHandle(
        "XSubtractRegion",
        constants$82.XSubtractRegion$FUNC
    );
}


