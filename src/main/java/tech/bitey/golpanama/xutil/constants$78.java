// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$78 {

    static final FunctionDescriptor XGetZoomHints$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetZoomHints$MH = RuntimeHelper.downcallHandle(
        "XGetZoomHints",
        constants$78.XGetZoomHints$FUNC, false
    );
    static final FunctionDescriptor XIntersectRegion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XIntersectRegion$MH = RuntimeHelper.downcallHandle(
        "XIntersectRegion",
        constants$78.XIntersectRegion$FUNC, false
    );
    static final FunctionDescriptor XConvertCase$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XConvertCase$MH = RuntimeHelper.downcallHandle(
        "XConvertCase",
        constants$78.XConvertCase$FUNC, false
    );
    static final FunctionDescriptor XLookupString$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XLookupString$MH = RuntimeHelper.downcallHandle(
        "XLookupString",
        constants$78.XLookupString$FUNC, false
    );
    static final FunctionDescriptor XMatchVisualInfo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XMatchVisualInfo$MH = RuntimeHelper.downcallHandle(
        "XMatchVisualInfo",
        constants$78.XMatchVisualInfo$FUNC, false
    );
    static final FunctionDescriptor XOffsetRegion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XOffsetRegion$MH = RuntimeHelper.downcallHandle(
        "XOffsetRegion",
        constants$78.XOffsetRegion$FUNC, false
    );
}

