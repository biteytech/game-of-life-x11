// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$71 {

    static final FunctionDescriptor Xutf8LookupString$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Xutf8LookupString$MH = RuntimeHelper.downcallHandle(
        "Xutf8LookupString",
        constants$71.Xutf8LookupString$FUNC, false
    );
    static final FunctionDescriptor XVaCreateNestedList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XVaCreateNestedList$MH = RuntimeHelper.downcallHandle(
        "XVaCreateNestedList",
        constants$71.XVaCreateNestedList$FUNC, true
    );
    static final FunctionDescriptor XRegisterIMInstantiateCallback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XRegisterIMInstantiateCallback$MH = RuntimeHelper.downcallHandle(
        "XRegisterIMInstantiateCallback",
        constants$71.XRegisterIMInstantiateCallback$FUNC, false
    );
    static final FunctionDescriptor XUnregisterIMInstantiateCallback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XUnregisterIMInstantiateCallback$MH = RuntimeHelper.downcallHandle(
        "XUnregisterIMInstantiateCallback",
        constants$71.XUnregisterIMInstantiateCallback$FUNC, false
    );
    static final FunctionDescriptor XConnectionWatchProc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XConnectionWatchProc$MH = RuntimeHelper.downcallHandle(
        constants$71.XConnectionWatchProc$FUNC, false
    );
}


