// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$168 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$168() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "XGetErrorDatabaseText",
        constants$168.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "XGetErrorText",
        constants$168.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "XGetFontProperty",
        constants$149.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "XGetGCValues",
        constants$152.const$0
    );
}


