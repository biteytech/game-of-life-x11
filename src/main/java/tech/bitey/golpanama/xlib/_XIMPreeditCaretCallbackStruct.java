// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _XIMPreeditCaretCallbackStruct {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("position"),
        Constants$root.C_INT$LAYOUT.withName("direction"),
        Constants$root.C_INT$LAYOUT.withName("style")
    ).withName("_XIMPreeditCaretCallbackStruct");
    public static MemoryLayout $LAYOUT() {
        return _XIMPreeditCaretCallbackStruct.$struct$LAYOUT;
    }
    static final VarHandle position$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("position"));
    public static VarHandle position$VH() {
        return _XIMPreeditCaretCallbackStruct.position$VH;
    }
    public static int position$get(MemorySegment seg) {
        return (int)_XIMPreeditCaretCallbackStruct.position$VH.get(seg);
    }
    public static void position$set( MemorySegment seg, int x) {
        _XIMPreeditCaretCallbackStruct.position$VH.set(seg, x);
    }
    public static int position$get(MemorySegment seg, long index) {
        return (int)_XIMPreeditCaretCallbackStruct.position$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void position$set(MemorySegment seg, long index, int x) {
        _XIMPreeditCaretCallbackStruct.position$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle direction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("direction"));
    public static VarHandle direction$VH() {
        return _XIMPreeditCaretCallbackStruct.direction$VH;
    }
    public static int direction$get(MemorySegment seg) {
        return (int)_XIMPreeditCaretCallbackStruct.direction$VH.get(seg);
    }
    public static void direction$set( MemorySegment seg, int x) {
        _XIMPreeditCaretCallbackStruct.direction$VH.set(seg, x);
    }
    public static int direction$get(MemorySegment seg, long index) {
        return (int)_XIMPreeditCaretCallbackStruct.direction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void direction$set(MemorySegment seg, long index, int x) {
        _XIMPreeditCaretCallbackStruct.direction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("style"));
    public static VarHandle style$VH() {
        return _XIMPreeditCaretCallbackStruct.style$VH;
    }
    public static int style$get(MemorySegment seg) {
        return (int)_XIMPreeditCaretCallbackStruct.style$VH.get(seg);
    }
    public static void style$set( MemorySegment seg, int x) {
        _XIMPreeditCaretCallbackStruct.style$VH.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)_XIMPreeditCaretCallbackStruct.style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        _XIMPreeditCaretCallbackStruct.style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


