// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$113 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$113() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(XIMProc.class, "apply", constants$113.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$113.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(XICProc.class, "apply", constants$113.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$113.const$3
    );
}

