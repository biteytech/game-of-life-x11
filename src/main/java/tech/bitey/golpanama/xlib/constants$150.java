// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$150 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$150() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "XAllocNamedColor",
        constants$150.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "XAllowEvents",
        constants$150.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "XAutoRepeatOff",
        constants$11.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "XAutoRepeatOn",
        constants$11.const$0
    );
}

