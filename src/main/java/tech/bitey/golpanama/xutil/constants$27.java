// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$27 {

    static final FunctionDescriptor XConvertSelection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XConvertSelection$MH = RuntimeHelper.downcallHandle(
        "XConvertSelection",
        constants$27.XConvertSelection$FUNC, false
    );
    static final FunctionDescriptor XCopyArea$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XCopyArea$MH = RuntimeHelper.downcallHandle(
        "XCopyArea",
        constants$27.XCopyArea$FUNC, false
    );
    static final FunctionDescriptor XCopyGC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCopyGC$MH = RuntimeHelper.downcallHandle(
        "XCopyGC",
        constants$27.XCopyGC$FUNC, false
    );
    static final FunctionDescriptor XCopyPlane$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XCopyPlane$MH = RuntimeHelper.downcallHandle(
        "XCopyPlane",
        constants$27.XCopyPlane$FUNC, false
    );
    static final FunctionDescriptor XDefaultDepth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XDefaultDepth$MH = RuntimeHelper.downcallHandle(
        "XDefaultDepth",
        constants$27.XDefaultDepth$FUNC, false
    );
    static final FunctionDescriptor XDefaultDepthOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XDefaultDepthOfScreen$MH = RuntimeHelper.downcallHandle(
        "XDefaultDepthOfScreen",
        constants$27.XDefaultDepthOfScreen$FUNC, false
    );
}

