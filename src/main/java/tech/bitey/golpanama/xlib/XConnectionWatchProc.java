// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface XConnectionWatchProc {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static NativeSymbol allocate(XConnectionWatchProc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(XConnectionWatchProc.class, fi, constants$71.XConnectionWatchProc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static XConnectionWatchProc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("XConnectionWatchProc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$71.XConnectionWatchProc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, x2, x3, (jdk.incubator.foreign.Addressable)x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

