// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$23 {

    static final FunctionDescriptor XCellsOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCellsOfScreen$MH = RuntimeHelper.downcallHandle(
        "XCellsOfScreen",
        constants$23.XCellsOfScreen$FUNC, false
    );
    static final FunctionDescriptor XChangeActivePointerGrab$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XChangeActivePointerGrab$MH = RuntimeHelper.downcallHandle(
        "XChangeActivePointerGrab",
        constants$23.XChangeActivePointerGrab$FUNC, false
    );
    static final FunctionDescriptor XChangeGC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XChangeGC$MH = RuntimeHelper.downcallHandle(
        "XChangeGC",
        constants$23.XChangeGC$FUNC, false
    );
    static final FunctionDescriptor XChangeKeyboardControl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XChangeKeyboardControl$MH = RuntimeHelper.downcallHandle(
        "XChangeKeyboardControl",
        constants$23.XChangeKeyboardControl$FUNC, false
    );
    static final FunctionDescriptor XChangeKeyboardMapping$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XChangeKeyboardMapping$MH = RuntimeHelper.downcallHandle(
        "XChangeKeyboardMapping",
        constants$23.XChangeKeyboardMapping$FUNC, false
    );
    static final FunctionDescriptor XChangePointerControl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XChangePointerControl$MH = RuntimeHelper.downcallHandle(
        "XChangePointerControl",
        constants$23.XChangePointerControl$FUNC, false
    );
}


